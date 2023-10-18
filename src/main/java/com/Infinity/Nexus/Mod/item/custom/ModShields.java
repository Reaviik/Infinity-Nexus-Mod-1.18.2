package com.Infinity.Nexus.Mod.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModShields extends ShieldItem {
    private final TranslatableComponent translation;
    public ModShields(Properties pProperties,
                    TranslatableComponent tooltip) {
        super(pProperties);

        this.translation = tooltip;
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(translation);
        } else {
            components.add(new TranslatableComponent("tooltip.infinity_nexus.wipe"));
        }

        super.appendHoverText(stack, level, components, flag);
    }


    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.BLOCK;
    }
    @Override
    public int getUseDuration(ItemStack p_43107_) {
        return 7200;
    }

    @Override
    public int getEnchantmentValue() {
        return 80;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level p_43099_, Player player, InteractionHand p_43101_) {
        //TODO dash

        return super.use(p_43099_, player, p_43101_);
    }


    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}
