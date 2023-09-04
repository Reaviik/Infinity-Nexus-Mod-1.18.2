package com.Infinity.Nexus;

import com.Infinity.Nexus.networking.ModMessages;
import com.Infinity.Nexus.screen.ModMenuTypes;
import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.block.custom.ModBlockEntities;
import com.Infinity.Nexus.config.InfinityNexusClientConfigs;
import com.Infinity.Nexus.config.InfinityNexusCommonConfigs;
import com.Infinity.Nexus.config.InfinityNexusServerConfigs;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.recipes.ModRecipes;
import com.Infinity.Nexus.screen.foundry.FoundryScreen;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
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

        eventBus.addListener(this::setup);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::commonSetup);


        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, InfinityNexusClientConfigs.SPEC,"infinitynexus-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, InfinityNexusCommonConfigs.SPEC,"infinitynexus-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, InfinityNexusServerConfigs.SPEC,"infinitynexus-server.toml");


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModMessages.register();
        });
    }
    public void clientSetup(final FMLClientSetupEvent event){
        MenuScreens.register(ModMenuTypes.FOUNDRY_MENU.get(), FoundryScreen::new);

    }
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code

               LOGGER.info("§b      __ ");
               LOGGER.info("§b   /\\ \\ \\_____  ___   _ ___ ");
               LOGGER.info("§b  /  \\/ / _ \\ \\/ / | | / __|");
               LOGGER.info("§b / /\\  /  __/>  <| |_| \\__ \\");
               LOGGER.info("§b \\_\\ \\/ \\___/_/\\_\\__,_|___/");
               LOGGER.info("§b       Infinity Nexus Mod");
    }
}
