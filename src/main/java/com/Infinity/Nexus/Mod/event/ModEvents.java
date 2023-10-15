package com.Infinity.Nexus.Mod.event;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
import com.Infinity.Nexus.Mod.command.ChatItem;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfinityNexusMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event){
        ChatItem.register(event.getDispatcher());
    }
}
