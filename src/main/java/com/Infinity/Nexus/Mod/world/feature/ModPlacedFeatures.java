package com.Infinity.Nexus.Mod.world.feature;

import com.Infinity.Nexus.Mod.config.ModCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> INFINITY_ORE_PLACED = PlacementUtils.register("infinity_ore_placed",
            ModConfiguredFeatures.INFINITY_ORE, ModOrePlacement.commonOrePlacement(ModCommonConfigs.I_O_P_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(ModCommonConfigs.I_O_P_MIMY.get()), VerticalAnchor.aboveBottom(ModCommonConfigs.I_O_P_MAXY.get()))));
    public static final Holder<PlacedFeature> DEEPSLATE_INFINITY_ORE_PLACED = PlacementUtils.register("deepslate_infinity_ore_placed",
            ModConfiguredFeatures.INFINITY_ORE, ModOrePlacement.rareOrePlacement(ModCommonConfigs.I_O_P_CHUNK.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(ModCommonConfigs.I_O_P_MIMY.get()), VerticalAnchor.aboveBottom(ModCommonConfigs.I_O_P_MAXY.get()))));

}
