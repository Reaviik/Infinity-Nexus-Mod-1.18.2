package com.Infinity.Nexus.entity.client.armor;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.item.custom.ImperialArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ImperialArmorModel extends AnimatedGeoModel<ImperialArmorItem> {
    @Override
    public ResourceLocation getModelLocation(ImperialArmorItem object) {
        return new ResourceLocation(InfinityNexus.MOD_ID, "geo/3d_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ImperialArmorItem object) {
        return new ResourceLocation(InfinityNexus.MOD_ID, "textures/models/armor/infinity_3d_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ImperialArmorItem animatable) {
        return new ResourceLocation(InfinityNexus.MOD_ID, "animations/imperial_armor_animation.json");
    }
}
