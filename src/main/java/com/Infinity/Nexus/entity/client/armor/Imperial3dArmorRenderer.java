package com.Infinity.Nexus.entity.client.armor;

import com.Infinity.Nexus.item.custom.ImperialInfinity3dArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class Imperial3dArmorRenderer extends GeoArmorRenderer<ImperialInfinity3dArmorItem> {
    public Imperial3dArmorRenderer() {
        super(new Imperial3dArmorModel());

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
