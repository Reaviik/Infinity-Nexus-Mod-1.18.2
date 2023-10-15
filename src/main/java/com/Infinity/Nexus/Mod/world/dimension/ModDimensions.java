package com.Infinity.Nexus.Mod.world.dimension;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;


public class ModDimensions {
    public static final ResourceKey<Level> EXPLORAR_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(InfinityNexusMod.MOD_ID, "explorar"));
    public static final ResourceKey<Level> ADMIN_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(InfinityNexusMod.MOD_ID, "admin"));

    public static final ResourceKey<DimensionType> EXPLORAR_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, EXPLORAR_KEY.getRegistryName());
    public static final ResourceKey<DimensionType> ADMIN_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, ADMIN_KEY.getRegistryName());


    public static void registry() {
        System.out.println("Registrando ModDimensions For " + InfinityNexusMod.MOD_ID);
    }

}
