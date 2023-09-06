package com.Infinity.Nexus;

import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::setup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_BASIC_MIXED_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_BASIC_METAL_BOX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FULL_BASIC_MIXED_GEM_BASKET.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_BASIC_GEM_BASKET.get(), RenderType.translucent());

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
               LOGGER.info("§b      __ ");
               LOGGER.info("§b   /\\ \\ \\_____  ___   _ ___ ");
               LOGGER.info("§b  /  \\/ / _ \\ \\/ / | | / __|");
               LOGGER.info("§b / /\\  /  __/>  <| |_| \\__ \\");
               LOGGER.info("§b \\_\\ \\/ \\___/_/\\_\\__,_|___/");
               LOGGER.info("§b       Infinity Nexus Mod");
    }
}
