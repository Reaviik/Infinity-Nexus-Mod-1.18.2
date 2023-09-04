package com.Infinity.Nexus.block.entity;

import com.Infinity.Nexus.block.custom.ModBlockEntities;
import com.Infinity.Nexus.config.InfinityNexusServerConfigs;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.networking.ModMessages;
import com.Infinity.Nexus.networking.packet.EnergySyncS2CPacket;
import com.Infinity.Nexus.recipes.Foundry.FoundryRecipe;
import com.Infinity.Nexus.screen.foundry.FoundryMenu;
import com.Infinity.Nexus.screen.foundry.FoundryScreen;
import com.Infinity.Nexus.utils.ModEnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


public class FoundryBlockEntity extends BlockEntity implements MenuProvider{
    private final ItemStackHandler itemHandler = new ItemStackHandler(8) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<ItemStackHandler> lazyItemHandler = LazyOptional.empty();
    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();
    private static final int ENERGY_REQUIRED = InfinityNexusServerConfigs.FOUNDRY_ENERGY_REQUIRED.get();
    private static final int ENERGY_STORAGE = InfinityNexusServerConfigs.FOUNDRY_ENERGY_STORAGE.get();
    private static final int ENERGY_TRANSFER = InfinityNexusServerConfigs.FOUNDRY_ENERGY_TRANSFER.get();
    private int maxProgress = InfinityNexusServerConfigs.FOUNDRY_PROCESS_SPEED.get();
    protected final ContainerData data;
    private int progress = 0;
    private int strength = 0;
    public FoundryBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.FOUNDRY_BLOCK_ENTITY.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> FoundryBlockEntity.this.progress;
                    case 1 -> FoundryBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> FoundryBlockEntity.this.progress = pValue;
                    case 1 -> FoundryBlockEntity.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }
    private final ModEnergyStorage FOUNDRY_ENERGY_STORAGE = new ModEnergyStorage(ENERGY_STORAGE, ENERGY_TRANSFER) {
        @Override
        public void onEnergyChanged() {
            setChanged();
            ModMessages.sendToClients(new EnergySyncS2CPacket(this.getEnergyStored(), getBlockPos()));
        }
    };
    @Override
    public Component getDisplayName() {
        return new TextComponent("Foundry");
    }
    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new FoundryMenu(id, inventory, this, this.data);
    }
    public IEnergyStorage getEnergyStorage() {
        return FOUNDRY_ENERGY_STORAGE;
    }
    public void setEnergyLevel(int energy) {
        this.FOUNDRY_ENERGY_STORAGE.setEnergy(energy);
    }
    @Nullable
    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side) {
        if(cap == CapabilityEnergy.ENERGY){
            return lazyEnergyHandler.cast();
        }
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }
    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyEnergyHandler = LazyOptional.of(() -> FOUNDRY_ENERGY_STORAGE);
    }
    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyEnergyHandler.invalidate();
    }
    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("foundry.progress", this.progress);
        tag.putInt("foundry.energy", FOUNDRY_ENERGY_STORAGE.getEnergyStored());
        super.saveAdditional(tag);
    }
    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("foundry.progress");
        FOUNDRY_ENERGY_STORAGE.setEnergy(nbt.getInt("foundry.energy"));
    }
    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public void hasSpeedUP(FoundryBlockEntity entity) {
        //TODO recipe
        int speed = InfinityNexusServerConfigs.FOUNDRY_PROCESS_SPEED.get();
        if (entity.itemHandler.getStackInSlot(4).getItem() == ModItems.SPEED_UPGRADE.get()) {
            speed = speed - InfinityNexusServerConfigs.FOUNDRY_SPEED_UPGRADE.get();
        }
        if(entity.itemHandler.getStackInSlot(5).getItem() == ModItems.SPEED_UPGRADE.get()) {
            speed = speed - InfinityNexusServerConfigs.FOUNDRY_SPEED_UPGRADE.get();
        }
        this.maxProgress = speed;
    }
    public void hasStrengthUP(FoundryBlockEntity entity) {
        //todo display
        int strength_lens = 0;
        for (int i = 6; i <= 7; i++) {
            //TODO
            if (entity.itemHandler.getStackInSlot(i).getItem() == ModItems.STRENGTH_UPGRADE.get()) {
                strength_lens = strength_lens + 1;
            }
        }
        this.strength = strength_lens;
    }
    public static void craft(FoundryBlockEntity entity){
        int FirstChance = InfinityNexusServerConfigs.FOUNDRY_FIRST_OUTPUT_CHANCE.get();
        int SecondChance = InfinityNexusServerConfigs.FOUNDRY_SECONDARY_OUTPUT_CHANCE.get();
        int StrengthDropChance = InfinityNexusServerConfigs.FOUNDRY_STRENGTH_UPGRADE.get();

        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for(int i = 0; i < entity.itemHandler.getSlots(); i++){
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }
        Optional<FoundryRecipe> match = level.getRecipeManager()
                .getRecipeFor(FoundryRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            FoundryScreen.energy = "§aOk§r";
            int slot = getFreeSlot(entity, match.get().getResultItem());
            int random = new Random().nextInt(100);
            int StrengthChance = new Random().nextInt(StrengthDropChance);

            //Padrão 100%
            if (random < FirstChance){
                entity.itemHandler.extractItem(0, 1, false);
                entity.itemHandler.insertItem(slot, new ItemStack(match.get().getResultItem().getItem()), false);
            }

            for(int i = 0; i < match.get().getSecondary().size(); i++){
                //Padrão 50%
                if(random < SecondChance){
                    slot = getFreeSlot(entity,match.get().getSecondary().get(i));
                    entity.itemHandler.insertItem(slot, new ItemStack(match.get().getSecondary().get(i).getItem().asItem()), false);
                    for(int s = 0; s < entity.strength; s++) {
                        if (random < StrengthChance) {
                            slot = getFreeSlot(entity, match.get().getSecondary().get(i));
                            entity.itemHandler.insertItem(slot, new ItemStack(match.get().getSecondary().get(i).getItem().asItem()), false);
                        }
                    }
                }
            }
        }else{
            FoundryScreen.energy = "§cLow§r";}
    }
    public static int getFreeSlot(BlockEntity entity, ItemStack output){
        BlockPos pPos = entity.getBlockPos();
        Level level = entity.getLevel();
        BlockEntity inv = level.getBlockEntity(pPos);


        AtomicInteger slot = new AtomicInteger(1);

        inv.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
            if (capability instanceof IItemHandlerModifiable) {
                for (int i = 2; i <= 3; i++) {
                    ItemStack item = capability.getStackInSlot(i);
                    if (item.isEmpty() || ((item.getItem() == output.getItem()) && (item.getCount() < item.getMaxStackSize()))) {
                        slot.set(i);
                        break;
                    }
                }
            }
        });
        return slot.get();
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, FoundryBlockEntity pBlockEntity) {
        if(pLevel.isClientSide()){
            return;
        }

        if (pBlockEntity.progress > pBlockEntity.maxProgress) {
            pBlockEntity.resetProgress();
            if(hasRecipe(pBlockEntity)) {
                setChanged(pLevel, pPos, pState);
                pBlockEntity.hasSpeedUP(pBlockEntity);
                pBlockEntity.hasStrengthUP(pBlockEntity);
                craft(pBlockEntity);
            }else{
            }
        }else{
            if(hasRecipe(pBlockEntity)) {
                pBlockEntity.progress++;
                extractEnergy(pBlockEntity);
                setChanged(pLevel, pPos, pState);
            }
        }
    }
    private static boolean hasRecipe(FoundryBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }
        Optional<FoundryRecipe> recipe = level.getRecipeManager().getRecipeFor(FoundryRecipe.Type.INSTANCE, inventory, level);
        return recipe.isPresent()  && hasEnergy(entity) &&
                canInsertItemIntoOutputSlot(inventory, entity);
    }
    private static boolean hasEnergy(FoundryBlockEntity entity) {
        return entity.FOUNDRY_ENERGY_STORAGE.getEnergyStored() >= ENERGY_REQUIRED * (entity.maxProgress - entity.progress);
    }
    private static void extractEnergy(FoundryBlockEntity entity) {
        entity.FOUNDRY_ENERGY_STORAGE.extractEnergy(ENERGY_REQUIRED, false);
    }
    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory,BlockEntity entity) {
        BlockPos pPos = entity.getBlockPos();
        Level level = entity.getLevel();
        BlockEntity inv = level.getBlockEntity(pPos);

        Optional<FoundryRecipe> match = level.getRecipeManager()
                .getRecipeFor(FoundryRecipe.Type.INSTANCE, inventory, level);

        AtomicBoolean canInsert = new AtomicBoolean(false);

        inv.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
            if (capability instanceof IItemHandlerModifiable) {
                for (int i = 1; i <= 2; i++) {
                    ItemStack item = capability.getStackInSlot(i);
                    if (item.isEmpty() || (item.getItem() == match.get().getResultItem().getItem() && item.getCount() < capability.getSlotLimit(i))) {
                        canInsert.set(true);
                        break;
                    }
                }
            }
        });
        return canInsert.get();
    }
    private void resetProgress() {
        this.progress = 0;
    }

}