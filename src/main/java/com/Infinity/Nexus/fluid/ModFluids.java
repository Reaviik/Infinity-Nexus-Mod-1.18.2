package com.Infinity.Nexus.fluid;

import com.Infinity.Nexus.InfinityNexusMod;
import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation LAVA_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation LAVA_FLOWING_RL = new ResourceLocation("block/lava_flow");
    public static final ResourceLocation LAVA_OVERLAY_RL = new ResourceLocation("block/lava_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, InfinityNexusMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> MOLTEN_TINKERS
            = FLUIDS.register("molten_tinkers", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TINKERS_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_TINKERS_FLOWING
            = FLUIDS.register("molten_tinkers_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TINKERS_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MOLTEN_TINKERS_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_TINKERS.get(), () -> MOLTEN_TINKERS_FLOWING.get(), FluidAttributes.builder(LAVA_STILL_RL, LAVA_FLOWING_RL)
            .density(35).luminosity(5).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(LAVA_OVERLAY_RL)
            .color(0xbfFF0000)).slopeFindDistance(2).levelDecreasePerBlock(6)
            .block(() -> ModFluids.MOLTEN_TINKERS_BLOCK.get()).bucket(() -> ModItems.TINKERS_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_TINKERS_BLOCK = ModBlocks.BLOCKS.register("molten_tinkers_block",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_TINKERS.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}