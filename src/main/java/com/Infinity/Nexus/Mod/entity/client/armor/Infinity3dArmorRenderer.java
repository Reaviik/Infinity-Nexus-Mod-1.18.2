package com.Infinity.Nexus.Mod.entity.client.armor;

import com.Infinity.Nexus.Mod.item.custom.Infinity3dArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class Infinity3dArmorRenderer extends GeoArmorRenderer<Infinity3dArmorItem> {
    public Infinity3dArmorRenderer() {
        super(new Infinity3dArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";

    }

}
