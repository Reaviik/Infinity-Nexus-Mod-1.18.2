package com.Infinity.Nexus.utils;

import com.Infinity.Nexus.InfinityNexus;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = InfinityNexus.MOD_ID, value = Dist.CLIENT)
public class KeyInputHandler {

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        if (event.getKey() == GLFW.GLFW_KEY_LEFT) {
            System.out.println("dawdawdawdaw");
            //TODO Deletar se não for usar
        }
    }
}