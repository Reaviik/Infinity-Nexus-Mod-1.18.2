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
    public static final ForgeConfigSpec.ConfigValue<Integer> I_B_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_B_DAMAGE;

    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_T_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_T_HARVEST;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_T_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_T_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_S_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_S_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_B_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_B_DAMAGE;

    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_C_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_P_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_P_MIMY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_P_MAXY;

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
        I_B_DURABILITY = BUILDER.comment("Infinity Bow Durability")
                .define("Infinity Bow Durability, Default 4500", 4500);
        I_B_DAMAGE = BUILDER.comment("Infinity Bow Damage")
                .define("Infinity Bow Damage, Default 50", 50);

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
        I_I_B_DURABILITY = BUILDER.comment("Imperial Infinity Bow Durability")
                .define("Imperial Infinity Bow Durability, Default -1", -1);
        I_I_B_DAMAGE = BUILDER.comment("Imperial Infinity Bow Damage")
                .define("Imperial Infinity Bow Damage, Default 60", 60);


        I_I_T_E_MAGNETISM = BUILDER.comment("Imperial Infinity Armor Can Magnetize Items")
                        .define("Atract Items", true);

        I_O_C_SIZE = BUILDER.comment("Infinity Ore Chunk Size")
                .define("Infinity ore chunk size, Default 9", 9);
        I_O_P_CHUNK= BUILDER.comment("Infinity Ore Chunk, Per Chunk")
                .define("Infinity Ore Placed Per Chunk Default 7", 7);
        I_O_P_MAXY = BUILDER.comment("Infinity Ore Max Y Placement")
                .define("Infinity Ore Placed Max Y, Default 22", 22);
        I_O_P_MIMY = BUILDER.comment("Infinity Ore Min Y Placement")
                .define("Infinity Ore Placed Min Y, Default -22", -22);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
