package com.Infinity.Nexus.villager;

import com.Infinity.Nexus.InfinityNexusMod;
import com.Infinity.Nexus.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {

    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, InfinityNexusMod.MOD_ID);

    public static final RegistryObject<PoiType> EXPLORAR_PORTAL =
            POI.register("explorar_portal", () -> new PoiType("explorar_portal",
                    PoiType.getBlockStates(ModBlocks.EXPLORAR_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
