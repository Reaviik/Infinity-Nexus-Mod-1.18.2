package com.Infinity.Nexus.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class InfinityNexusServerConfigs {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_ENERGY_REQUIRED;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_ENERGY_STORAGE;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_ENERGY_TRANSFER;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_PROCESS_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_SPEED_UPGRADE;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_FIRST_OUTPUT_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_SECONDARY_OUTPUT_CHANCE;
    public static final ForgeConfigSpec.ConfigValue<Integer> FOUNDRY_STRENGTH_UPGRADE;

    static {
        BUILDER.push("Foundry Config");

        FOUNDRY_ENERGY_REQUIRED = BUILDER
                .comment("Consumo de energia por operação\nPadrão 100")
                .define("radioestabilizer_energy_required", 100);

        FOUNDRY_ENERGY_STORAGE= BUILDER
                .comment("Capacidade de armazenamento de energia\nPadrão 64000")
                .define("radioestabilizer_energy_storage", 64000);

        FOUNDRY_ENERGY_TRANSFER = BUILDER
                .comment("Capacidade de transferencia de energia por tick\nPadrão 256")
                .define("radioestabilizer_energy_transfer", 256);

        FOUNDRY_PROCESS_SPEED = BUILDER
                .comment("Velocidade de processamento\nPadrão 180")
                .define("radioestabilizer_process_speed", 180);

        FOUNDRY_SPEED_UPGRADE = BUILDER
                .comment("Velocidade agregada por cada lente de speed\nNão pode ser maior que 80\nPadrão 45")
                .define("radioestabilizer_speed_lens_process_speed_subtraction", 45);

        FOUNDRY_FIRST_OUTPUT_CHANCE = BUILDER
                .comment("Chance de obter a saida primaria\nPadrão 100%")
                .define("radioestabilizer_first_output", 100);

        FOUNDRY_SECONDARY_OUTPUT_CHANCE = BUILDER
                .comment("Chance de Obter saidas secundarias\nPadrão 50%")
                .define("radioestabilizer_secondary_output", 50);

        FOUNDRY_STRENGTH_UPGRADE = BUILDER
                .comment("Chance de obter mais uma vez o recurso para cada lente de força\nPadrão 50%")
                .define("radioestabilizer_strength_lens_output_chance", 50);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}