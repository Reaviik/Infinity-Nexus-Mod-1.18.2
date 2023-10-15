package com.Infinity.Nexus.Mod.item.custom;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class AxeItems extends AxeItem {

    public AxeItems(Tier tier, float damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
