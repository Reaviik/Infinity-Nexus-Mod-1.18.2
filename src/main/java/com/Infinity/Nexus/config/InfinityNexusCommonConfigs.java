package com.Infinity.Nexus.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class InfinityNexusCommonConfigs {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    static {
        BUILDER.push("Configs for Mechanica");
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}