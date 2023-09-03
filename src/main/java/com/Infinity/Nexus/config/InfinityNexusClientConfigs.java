package com.Infinity.Nexus.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class InfinityNexusClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    //Defina suas configurações aqui
    static {
        BUILDER.push("Configs for Mechanica");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}