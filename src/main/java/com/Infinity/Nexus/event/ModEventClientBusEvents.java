package com.Infinity.Nexus.event;


import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.entity.client.armor.Imperial3dArmorRenderer;
import com.Infinity.Nexus.entity.client.armor.Infinity3dArmorRenderer;
import com.Infinity.Nexus.item.custom.ImperialInfinity3dArmorItem;
import com.Infinity.Nexus.item.custom.Infinity3dArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = InfinityNexus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ImperialInfinity3dArmorItem.class, new Imperial3dArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(Infinity3dArmorItem.class, new Infinity3dArmorRenderer());
    }

//    @SubscribeEvent
//    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
//        event.registerBlockEntityRenderer(ModBlockEntities.ANIMATED_BLOCK_ENTITY.get(), AnimatedBlockRenderer::new);
//    }
}
