package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.config.ModCommonConfigs;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

import static net.minecraft.world.item.Items.DIRT;

public class ItemDislocator extends Item {
        private static boolean mag = false;
    public ItemDislocator(Properties p_41383_) {
        super(p_41383_);
    }
    List<String> blacklist = ModCommonConfigs.I_D_BLACKLIST.get();
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.infinity_nexus_mod.item_dislocator"));
        pTooltipComponents.add(new TextComponent("" + ModCommonConfigs.I_D_RANGE.get()));
        for (String tag : blacklist) {
            ResourceLocation itemLocation = new ResourceLocation(tag);
            Item item = ForgeRegistries.ITEMS.getValue(itemLocation);
            if (item != null) {
                ItemStack itemStack = new ItemStack(item);
                String displayName = itemStack.getDisplayName().getString().replace("["," ").replace("]"," ");
                pTooltipComponents.add(new TextComponent(displayName));
            }
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int p_41407_, boolean p_41408_) {
        if(entity instanceof Player) {
            if (!Screen.hasShiftDown() && ModCommonConfigs.I_D_MAGNETISM.get() && mag) {
                int range = ModCommonConfigs.I_D_RANGE.get();
                assert entity != null;
                BlockPos pos = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
                List<ItemEntity> entities = entity.level.getEntitiesOfClass(ItemEntity.class, new AABB(pos.getX() + range, pos.getY() + range, pos.getZ() + range, pos.getX() - range, pos.getY() - range, pos.getZ() - range));
                for (ItemEntity item : entities) {
                    if (item.isAlive() && !item.hasPickUpDelay()) {
                                item.playerTouch((Player) entity);
                    }
                }
            }
        }
    }
    @Override
    public boolean isFoil(ItemStack pStack) {
        return mag;
    }
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
            player.playSound(SoundEvents.PLAYER_LEVELUP,1,1);
            mag = !mag;
            if(mag){
                player.sendMessage(new TranslatableComponent("chat.infinity_nexus_mod.item_dislocator_on"), Util.NIL_UUID);
            }else{
                player.sendMessage(new TranslatableComponent("chat.infinity_nexus_mod.item_dislocator_off"), Util.NIL_UUID);
            }
         }
        return super.useOn(pContext);
    }
}
