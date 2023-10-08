package com.Infinity.Nexus.world.feature;

import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.config.ModCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_INFINITY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.INFINITY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_INFINITY_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> INFINITY_ORE = FeatureUtils.register("infinity_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_INFINITY_ORES, ModCommonConfigs.I_O_C_SIZE.get()));

}
