package com.Infinity.Nexus.entity.client.armor;

import com.Infinity.Nexus.InfinityNexusMod;
import com.Infinity.Nexus.item.custom.Infinity3dArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Infinity3dArmorModel extends AnimatedGeoModel<Infinity3dArmorItem> {
    @Override
    public ResourceLocation getModelLocation(Infinity3dArmorItem object) {
        return new ResourceLocation(InfinityNexusMod.MOD_ID, "geo/infinity_3d_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Infinity3dArmorItem object) {
        return new ResourceLocation(InfinityNexusMod.MOD_ID, "textures/models/armor/infinity_3d_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Infinity3dArmorItem animatable) {
        return new ResourceLocation(InfinityNexusMod.MOD_ID, "animations/infinity_3d_armor_animation.json");
    }
}
