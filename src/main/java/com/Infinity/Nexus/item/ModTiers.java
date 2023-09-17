package com.Infinity.Nexus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INFINITY = new ForgeTier(8,14000,17f,
            5f,70, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.GOLD_ROD.get()));
}