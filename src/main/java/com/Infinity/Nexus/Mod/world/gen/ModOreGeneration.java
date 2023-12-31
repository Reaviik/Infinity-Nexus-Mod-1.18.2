package com.Infinity.Nexus.Mod.world.gen;

import com.Infinity.Nexus.Mod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.INFINITY_ORE_PLACED);
        base.add(ModPlacedFeatures.DEEPSLATE_INFINITY_ORE_PLACED);
    }
}