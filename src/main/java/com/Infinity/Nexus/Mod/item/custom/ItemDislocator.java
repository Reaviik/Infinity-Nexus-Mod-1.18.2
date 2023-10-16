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
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
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
import java.util.List;
import java.util.Objects;

public class ItemDislocator extends Item {
    private static final boolean magOn = ModCommonConfigs.I_D_MAGNETISM.get();
    private static final Integer magRange = ModCommonConfigs.I_D_RANGE.get();
    private static ListTag tagList = new ListTag();
    List<String> displayList = new ArrayList<>();

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

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int p_41407_, boolean p_41408_) {
        if (entity instanceof Player && magOn) {
            try {
                List<ItemEntity> entities = entity.level.getEntitiesOfClass(ItemEntity.class, new AABB(entity.getX() + magRange, entity.getY() + magRange, entity.getZ() + magRange, entity.getX() - magRange, entity.getY() - magRange, entity.getZ() - magRange));
                for(ItemEntity item: entities){
                    if (item.isAlive() && !item.hasPickUpDelay() && tagList != null) {
                        if (tagList.contains(item.getItem().getItem().getRegistryName())) {
                            item.playerTouch((Player) entity);
                        }
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

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
            ItemStack heldItemStack = player.getMainHandItem();
            if (!heldItemStack.isEmpty() && pContext.getPlayer() != null) {
                TextComponent itemNames = new TextComponent("§5Your List: ");
                CompoundTag itemNBT = heldItemStack.getOrCreateTag();
                if (!Screen.hasShiftDown()) {
                    onofre(player);
                    player.sendMessage(new TranslatableComponent(itemNBT.getBoolean("onofre")
                            ? "chat.infinity_nexus_mod.item_dislocator_on"
                            : "chat.infinity_nexus_mod.item_dislocator_off"), Util.NIL_UUID);
                    itemNames.append("§6" + player.getMainHandItem().getOrCreateTag().getBoolean("onofre") + " ");
                } else {
                    itemNames.append("§6" + player.getMainHandItem().getOrCreateTag().getBoolean("onofre") + " ");
                    BlockPos blockPos = pContext.getClickedPos();
                    BlockState blockState = pContext.getLevel().getBlockState(blockPos);
                    ResourceLocation registryName = blockState.getBlock().getRegistryName();
                    if (registryName != null) {
                        String registryNameStr = registryName.toString();
                        String name = blockState.getBlock().asItem().getDefaultInstance().getDisplayName().getString();
                        ListTag listTags = itemNBT.getList("listTags", 8);
                        // Verifica se registryNameStr já existe na lista
                        boolean alreadyExists = false;
                        int indexToRemove = -1;
                        for (int i = 0; i < listTags.size(); i++) {
                            String existingTag = listTags.getString(i);
                            if (existingTag.equals(registryNameStr)) {
                                alreadyExists = true;
                                indexToRemove = i;
                                break;
                            }
                        }
                        if (alreadyExists) {
                            // Remove registryNameStr da lista
                            listTags.remove(indexToRemove);
                            player.sendMessage(new TextComponent("§bRemoved: §c" + name), Util.NIL_UUID);
                            displayList.remove(name);
                        } else {
                            // Adiciona registryNameStr à lista
                            listTags.add(StringTag.valueOf(registryNameStr));
                            player.sendMessage(new TextComponent("§bAdd: §2" + name), Util.NIL_UUID);
                            displayList.add(name);
                        }

                        // Define a lista atualizada no item
                        itemNBT.put("listTags", listTags);
                        heldItemStack.setTag(itemNBT);
                        tagList = listTags;
                    }
                }
                for (int i = 0; i < displayList.size(); i++) {
                    String itemName = displayList.get(i);
                    if (i > 0) {
                        itemNames.append(", "); // Adicione uma vírgula entre os nomes dos itens
                    }
                    itemNames.append("§b" + itemName);
                }
                // Anexe o texto ao item
                itemNBT.putString("listTagsDisplay", TextComponent.Serializer.toJson(itemNames));
                heldItemStack.setHoverName(itemNames);
            }
            player.getInventory().setChanged();
        }
        return super.useOn(pContext);
    }

}
