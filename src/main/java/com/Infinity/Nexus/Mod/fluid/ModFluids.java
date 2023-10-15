package com.Infinity.Nexus.Mod.fluid;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
import com.Infinity.Nexus.Mod.block.ModBlocks;
import com.Infinity.Nexus.Mod.item.ModItems;
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


    public static final ResourceLocation STARLIQUID_STILL_RL = new ResourceLocation(InfinityNexusMod.MOD_ID, "fluid/starliquid_still");
    public static final ResourceLocation STARLIQUID_FLOWING_RL = new ResourceLocation(InfinityNexusMod.MOD_ID, "fluid/starliquid_flow");
    public static final ResourceLocation INFINITY_STILL_RL = new ResourceLocation(InfinityNexusMod.MOD_ID, "fluid/infinity_still");
    public static final ResourceLocation INFINITY_FLOWING_RL = new ResourceLocation(InfinityNexusMod.MOD_ID, "fluid/infinity_flow");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, InfinityNexusMod.MOD_ID);

    //----------------------------------------------------------//----------------------------------------------------------//
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
    //----------------------------------------------------------//----------------------------------------------------------//
    public static final RegistryObject<FlowingFluid> MOLTEN_STARLIQUID_FLOWING
            = FLUIDS.register("molten_staliquid_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TINKERS_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_STARLIQUID
            = FLUIDS.register("molten_starliquid", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_STARLIQUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_STARLIQUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_STARLIQUID.get(), () -> MOLTEN_STARLIQUID_FLOWING.get(), FluidAttributes.builder(STARLIQUID_STILL_RL, STARLIQUID_FLOWING_RL)
            .density(35).luminosity(5).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(LAVA_OVERLAY_RL))
            .slopeFindDistance(2).levelDecreasePerBlock(6)
            .block(() -> ModFluids.MOLTEN_STARLIQUID_BLOCK.get()).bucket(() -> ModItems.MOLTEN_STARLIQUID_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_STARLIQUID_BLOCK = ModBlocks.BLOCKS.register("molten_starliquid_block",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_STARLIQUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));
    //----------------------------------------------------------//----------------------------------------------------------//

    public static final RegistryObject<FlowingFluid> MOLTEN_INFINITY_FLOWING
            = FLUIDS.register("molten_infinity_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_INFINITY_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_INFINITY
            = FLUIDS.register("molten_infinity", () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_INFINITY_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_INFINITY_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_INFINITY.get(), () -> MOLTEN_INFINITY_FLOWING.get(), FluidAttributes.builder(INFINITY_STILL_RL, INFINITY_FLOWING_RL)
            .density(35).luminosity(5).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(LAVA_OVERLAY_RL))
            .slopeFindDistance(2).levelDecreasePerBlock(6)
            .block(() -> ModFluids.MOLTEN_INFINITY_BLOCK.get()).bucket(() -> ModItems.MOLTEN_INFINITY_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_INFINITY_BLOCK = ModBlocks.BLOCKS.register("molten_infinity_block",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_INFINITY.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));
    //----------------------------------------------------------//----------------------------------------------------------//




    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}