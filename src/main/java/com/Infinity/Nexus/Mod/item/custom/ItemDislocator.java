package com.Infinity.Nexus.Mod.item.custom;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
import com.Infinity.Nexus.Mod.config.ModCommonConfigs;
import net.minecraft.Util;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ItemDislocator extends Item {

    TextComponent listText = new TextComponent("");
    private static final boolean magOn = ModCommonConfigs.I_D_MAGNETISM.get();
    private static final Integer magRange = ModCommonConfigs.I_D_RANGE.get();

    public ItemDislocator(Properties p_41383_) {
        super(p_41383_);
    }


    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.infinity_nexus_mod.item_dislocator"));
        pTooltipComponents.add(new TextComponent("Range: " + ModCommonConfigs.I_D_RANGE.get()));
        StringBuilder items = new StringBuilder();
        pTooltipComponents.add(new TextComponent(items.toString()));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
    //-----------------------------------------------------------------//-----------------------------------------------------------------//
    //TODO Refactor


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand ihand) {
        if (level.isClientSide() && !Screen.hasShiftDown()) {
            CompoundTag itemNBT = player.getMainHandItem().getOrCreateTag();
            onofre(player);
            player.sendMessage(new TranslatableComponent(itemNBT.getBoolean("onofre")
                    ? "chat.infinity_nexus_mod.item_dislocator_on"
                    : "chat.infinity_nexus_mod.item_dislocator_off"), Util.NIL_UUID);
        }
        return super.use(level, player, ihand);
    }

    @Override
    public boolean overrideOtherStackedOnMe(ItemStack targetItemStack, ItemStack sourceItemStack, Slot targetSlot, ClickAction clickAction, Player player, SlotAccess slotAccess) {
        if (!sourceItemStack.isEmpty() && player != null) {
            CompoundTag itemNBT = targetItemStack.getOrCreateTag();
            TextComponent listText = new TextComponent("§5Your List: ");
            List<String> displayList = new ArrayList<>(Arrays.stream(targetItemStack.getDisplayName().getString().split(",")).toList());

                listText.append("§6" + targetItemStack.getOrCreateTag().getBoolean("onofre") + " ");
                ResourceLocation sourceItemRegistryName = sourceItemStack.getItem().getRegistryName();

                if (sourceItemRegistryName != null) {
                    String sourceItemRegistryNameStr = sourceItemRegistryName.toString();
                    ListTag listTags = itemNBT.getList("listTags", 8);

                    boolean alreadyExists = false;
                    int indexToRemove = -1;
                    for (int i = 0; i < listTags.size(); i++) {
                        String existingTag = listTags.getString(i);
                        if (existingTag.equals(sourceItemRegistryNameStr)) {
                            alreadyExists = true;
                            indexToRemove = i;
                            break;
                        }
                    }

                    if (alreadyExists) {
                        listTags.remove(indexToRemove);
                        player.sendMessage(new TextComponent("§bRemoved: §c" + sourceItemStack.getDisplayName().getString()), Util.NIL_UUID);
                        displayList.remove(sourceItemStack.getDisplayName().getString());
                    } else {
                        listTags.add(StringTag.valueOf(sourceItemRegistryNameStr));
                        player.sendMessage(new TextComponent("§bAdd: §2" + sourceItemStack.getDisplayName().getString()), Util.NIL_UUID);
                        displayList.add(sourceItemStack.getDisplayName().getString());
                    }

                    for (int i = 0; i < displayList.size(); i++) {
                        String itemName = displayList.get(i);
                        if (i > 0) {
                            listText.append(", "); // Adicione uma vírgula entre os nomes dos itens
                        }
                        listText.append("§b" + itemName);
                    }
                    itemNBT.put("listTags", listTags);
                    targetItemStack.setTag(itemNBT);
                }
            itemNBT.putString("listTagsDisplay", TextComponent.Serializer.toJson(listText));
            targetItemStack.setHoverName(new TextComponent("§3"+listText.getString()));
        }

        player.getInventory().setChanged();
        return false;
    }
    //-----------------------------------------------------------------//-----------------------------------------------------------------//
    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int p_41407_, boolean p_41408_) {
        if (entity instanceof Player && magOn) {
            try {
                List<ItemEntity> entities = entity.level.getEntitiesOfClass(ItemEntity.class, new AABB(entity.getX() + magRange, entity.getY() + magRange, entity.getZ() + magRange, entity.getX() - magRange, entity.getY() - magRange, entity.getZ() - magRange));
                for(ItemEntity item: entities){
                    if (item.isAlive() && !item.hasPickUpDelay()) {
                        //Todo Refactor
                    }
                }
            }catch (Exception e){
                System.out.println("\nInfinity Item Dislocator\n"+e+"\n\n");
            }
        }
    }

    public void onofre(Player player) {
        player.playSound(SoundEvents.PLAYER_LEVELUP, 1, 1);
        CompoundTag itemNBT = player.getMainHandItem().getOrCreateTag();
        boolean onofre = !itemNBT.getBoolean("onofre");
        itemNBT.putBoolean("onofre", onofre);
        player.getInventory().setChanged();
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return pStack.getOrCreateTag().getBoolean("onofre");
    }


}
