package com.Infinity.Nexus.Mod.item;

import com.Infinity.Nexus.Mod.config.ModCommonConfigs;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier IMPERIAL = new ForgeTier(8,-1, ModCommonConfigs.I_I_T_HARVEST.get(),
            -1f, ModCommonConfigs.I_T_E_VALUE.get(), BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
    public static final ForgeTier INFINITY = new ForgeTier(7,-1, ModCommonConfigs.I_T_HARVEST.get(),
            -1f, ModCommonConfigs.I_I_T_E_VALUE.get(), BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INFINITY_INGOT.get()));
}
