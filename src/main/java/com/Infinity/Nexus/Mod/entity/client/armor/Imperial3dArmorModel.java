package com.Infinity.Nexus.Mod.entity.client.armor;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
import com.Infinity.Nexus.Mod.item.custom.ImperialInfinity3dArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Imperial3dArmorModel extends AnimatedGeoModel<ImperialInfinity3dArmorItem> {
    @Override
    public ResourceLocation getModelLocation(ImperialInfinity3dArmorItem object) {
        return new ResourceLocation(InfinityNexusMod.MOD_ID, "geo/imperial_infinity_3d_armor.geo.json");
    }
    @Override
    public ResourceLocation getTextureLocation(ImperialInfinity3dArmorItem object) {
        return new ResourceLocation(InfinityNexusMod.MOD_ID, "textures/models/armor/imperial_infinity_3d_armor.png");
    }
    @Override
    public ResourceLocation getAnimationFileLocation(ImperialInfinity3dArmorItem animatable) {
        return new ResourceLocation(InfinityNexusMod.MOD_ID, "animations/imperial_infinity_3d_armor_animation.json");
    }
}
