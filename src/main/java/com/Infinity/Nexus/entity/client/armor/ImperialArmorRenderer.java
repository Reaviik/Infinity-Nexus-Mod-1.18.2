package com.Infinity.Nexus.entity.client.armor;

import com.Infinity.Nexus.item.custom.ImperialArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ImperialArmorRenderer extends GeoArmorRenderer<ImperialArmorItem> {
    public ImperialArmorRenderer() {
        super(new ImperialArmorModel());

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
