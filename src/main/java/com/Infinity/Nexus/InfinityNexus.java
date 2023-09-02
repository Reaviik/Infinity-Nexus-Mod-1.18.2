package com.Infinity.Nexus;

import com.Infinity.Nexus.blocks.ModBlocks;
import com.Infinity.Nexus.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("§x§9§0§0§0§9§dI§x§8§6§0§0§9§3n§x§7§d§0§0§8§8f§x§7§3§0§0§7§ei§x§6§a§0§0§7§3n§x§6§0§0§0§6§9i§x§5§6§0§0§5§et§x§4§d§0§0§5§4y §x§4§3§0§0§4§9N§x§3§a§0§0§3§fe§x§3§0§0§0§3§4x§x§2§6§0§0§2§au§x§1§d§0§0§1§fs §x§1§3§0§0§1§5M§x§0§a§0§0§0§ao§x§0§0§0§0§0§0d: §fMod carregado.");
    }
}
