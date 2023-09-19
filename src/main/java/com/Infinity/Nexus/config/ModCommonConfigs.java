package com.Infinity.Nexus.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_T_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_T_HARVEST;
    public static final ForgeConfigSpec.ConfigValue<Float> I_T_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_T_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_S_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_S_SPEED;

    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_T_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_T_HARVEST;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_T_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_T_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_S_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_S_SPEED;


    public static final ForgeConfigSpec.ConfigValue<Boolean> I_I_T_E_MAGNETISM;
    static {

        BUILDER.push("Infinity Nexus Common Configs");

        I_T_DAMAGE = BUILDER.comment("Damage for Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("Infinity Tools Damage, Default 25", 25);
        I_T_HARVEST = BUILDER.comment("Harvest speed for Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("Infinity Tools Harvest Speed, Default 50", 50f);
        I_T_SPEED = BUILDER.comment("Attack speed for Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("Infinity Tools Attack Speed, Default 7", 7f);
        I_T_E_VALUE = BUILDER.comment("Enchantment Value for Infinity Pickaxe/Axe/Shovel/Hoe/Sword")
                .define("Infinity Tools Enchantment Value, Default 70", 70);
        I_S_DAMAGE = BUILDER.comment("Damage for Infinity Sword")
                .define("Infinity Sword Damage, Default 40", 40);
        I_S_SPEED = BUILDER.comment("Harvest speed for Infinity Sword")
                .define("Infinity Sword Attack Speed, Default 7", 7f);

        I_I_T_DAMAGE = BUILDER.comment("Damage for Imperial Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("Imperial Infinity Tools Damage, Default 30", 30);
        I_I_T_HARVEST = BUILDER.comment("Harvest speed for Imperial Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("Imperial Infinity Tools Speed, Default 100", 100f);
        I_I_T_SPEED = BUILDER.comment("Attack speed for Imperial Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("Imperial Infinity Tools Attack Speed, Default 20", 20f);
        I_I_T_E_VALUE = BUILDER.comment("Enchantment Value for Imperial Infinity Pickaxe/Axe/Shovel/Hoe/Sword")
                .define("Imperial Infinity Tools Enchantment Value, Default 80", 80);
        I_I_S_DAMAGE = BUILDER.comment("Damage for Imperial Infinity Sword")
                .define("Imperial Infinity Sword Damage, Default 50", 50);
        I_I_S_SPEED = BUILDER.comment("Harvest speed for Imperial Infinity Sword")
                .define("Imperial Infinity Sword Attack Speed, Default 10", 10f);


        I_I_T_E_MAGNETISM = BUILDER.comment("Imperial Infinity Armor Can Magnetize Items")
                        .define("Atract Items", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
