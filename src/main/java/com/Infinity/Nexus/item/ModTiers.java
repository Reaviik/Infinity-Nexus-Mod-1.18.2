package com.Infinity.Nexus.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier INFINITY = new ForgeTier(8,-1, 0,
            -1f,70, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
    public static final ForgeTier LEGENDARY = new ForgeTier(7,-1, 0,
            -1f,60, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
    public static final ForgeTier EPIC = new ForgeTier(6,-1, 0,
            -1f,50, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
    public static final ForgeTier RARE = new ForgeTier(5,-1, 0,
            -1f,40, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
}
