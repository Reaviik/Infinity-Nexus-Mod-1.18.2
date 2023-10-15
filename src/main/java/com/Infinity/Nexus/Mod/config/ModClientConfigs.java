package com.Infinity.Nexus.Mod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Infinity Nexus Client Configs");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
