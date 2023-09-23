package com.Infinity.Nexus.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBow extends BowItem {
    private final int damage;

    public ModBow(Properties properties, int damage) {
        super(properties);
        this.damage = damage;
    }

    @Override
    public @NotNull AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(damage);
        return arrow;
    }
    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> tooltip, @NotNull TooltipFlag flag) {
        tooltip.add(new TextComponent(""));
        tooltip.add(new TextComponent("§7When in any hand"));
        tooltip.add(new TextComponent("§2"+this.damage+" Attack Damage"));
    }
    @Override
    public int getEnchantmentValue() {
        return super.getEnchantmentValue();
    }

    @Override
    public boolean isEnchantable(@NotNull ItemStack stack) {
        return true;
    }
}


