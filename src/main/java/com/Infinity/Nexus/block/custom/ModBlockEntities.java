package com.Infinity.Nexus.block.custom;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.block.entity.FoundryBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, InfinityNexus.MOD_ID);

    public static final RegistryObject<BlockEntityType<FoundryBlockEntity>> FOUNDRY_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("foundry_block_entity", () ->
                    BlockEntityType.Builder.of(FoundryBlockEntity::new,
                            ModBlocks.FOUNDRY.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}