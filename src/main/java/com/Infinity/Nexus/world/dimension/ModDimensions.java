package com.Infinity.Nexus.world.dimension;

import com.Infinity.Nexus.InfinityNexus;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;


public class ModDimensions {
    public static final ResourceKey<Level> EXPLORAR_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(InfinityNexus.MOD_ID, "explorar"));

    public static final ResourceKey<DimensionType> EXPLORAR_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, EXPLORAR_KEY.getRegistryName());


    public static void registry() {
        System.out.println("Registrando ModDimensions For " + InfinityNexus.MOD_ID);
    }

}
