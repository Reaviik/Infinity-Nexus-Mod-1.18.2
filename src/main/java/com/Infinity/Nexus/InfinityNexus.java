package com.Infinity.Nexus;

import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.config.ModCommonConfigs;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.villager.ModPOIs;
import com.Infinity.Nexus.world.dimension.ModDimensions;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InfinityNexus.MOD_ID)
public class InfinityNexus
{

    public static final String MOD_ID = "infinity_nexus_mod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public InfinityNexus()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //teste
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModDimensions.registry();
        ModPOIs.register(eventBus);

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::setup);

        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModCommonConfigs.SPEC, "infinity_nexus_mod-common.toml");


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void clientSetup(final FMLClientSetupEvent event){

        //Empty Basket's
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_BASIC_GEM_BASKET.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_ADVANCED_GEM_BASKET.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_ELITE_GEM_BASKET.get(), RenderType.translucent());

        //Full Basket's
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_BASIC_MIXED_GEM_BASKET.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_BASIC_MIXED_GEM_BASKET_1.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ADVANCED_MIXED_GEM_BASKET.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ADVANCED_MIXED_GEM_BASKET_1.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ELITE_MIXED_GEM_BASKET.get(), RenderType.tripwire());

        //Empty Box's
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_BASIC_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_ADVANCED_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_ELITE_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_ULTIMATE_METAL_BOX.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_LEGENDARY_METAL_BOX.get(), RenderType.tripwire());


        //Full Box's
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_BASIC_MIXED_METAL_BOX.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_BASIC_MIXED_METAL_BOX_1.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ADVANCED_MIXED_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ELITE_MIXED_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ELITE_MIXED_METAL_BOX_1.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ELITE_MIXED_METAL_BOX_2.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ULTIMATE_MIXED_METAL_BOX.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_ULTIMATE_MIXED_METAL_BOX_1.get(), RenderType.tripwire());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_LEGENDARY_MIXED_METAL_BOX.get(), RenderType.translucent());

        //Casing's
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ALUMINUM_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.IRON_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LEAD_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENERGIZED_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STEEL_MACHINE_CASING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.INDUSTRIAL_MACHINE_CASING.get(), RenderType.translucent());

    }
    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("   §4_____§5_   __§9__________§3_   ______§b_______  __");
        LOGGER.info("  §4/_  _§5/ | / §9/ ____/  _§3/ | / /  _§b/_  __| \\/ /");
        LOGGER.info("   §4/ /§5/  |/ §9/ /_   / /§3/  |/ // /  §b/ /   \\  / ");
        LOGGER.info(" §4_/ /§5/ /|  §9/ __/ _/ /§3/ /|  // /  §b/ /    / /  ");
        LOGGER.info("§4/___§5/_/ |_§9/_/   /___§3/_/ |_/___/ §b/_/    /_/   ");
        LOGGER.info("§b          Infinity Nexus Mod");

    }
}
