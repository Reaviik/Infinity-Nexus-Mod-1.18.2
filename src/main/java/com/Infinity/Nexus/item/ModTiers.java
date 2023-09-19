package com.Infinity.Nexus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier IMPERIAL = new ForgeTier(8,-1, 0,
            -1f,70, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
    public static final ForgeTier INFINITY = new ForgeTier(7,-1, 0,
            -1f,60, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
}
