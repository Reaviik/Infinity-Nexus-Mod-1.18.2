package com.Infinity.Nexus.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //---------------------------------------------//---------------------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Integer> I_T_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_T_HARVEST;
    public static final ForgeConfigSpec.ConfigValue<Float> I_T_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_T_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_S_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_S_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_B_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_B_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_ABSORPTION;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_REGENERATION;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_A_TOUGHNESS;
    public static final ForgeConfigSpec.ConfigValue<Float> I_A_K_RESISTANCE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_H_ARMOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_C_ARMOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_L_ARMOR;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_A_B_ARMOR;

    //---------------------------------------------//---------------------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_T_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_T_HARVEST;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_T_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_T_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_S_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Float> I_I_S_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_B_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_E_VALUE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_B_DAMAGE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_N_VISION;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_D_SPEED;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_D_BOOST;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_LUCK;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_HERO;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_I_A_SPEED;

    //---------------------------------------------//---------------------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_C_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_P_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_P_MIMY;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_O_P_MAXY;

    //---------------------------------------------//---------------------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> I_D_MAGNETISM;
    public static final ForgeConfigSpec.ConfigValue<Integer> I_D_RANGE;
    public static final ForgeConfigSpec.ConfigValue<List<String>> I_D_BLACKLIST;
    static {

        List<String> defaultBlacklist = new ArrayList<>();
        defaultBlacklist.add("minecraft:stone");
        defaultBlacklist.add("minecraft:dirt");
        defaultBlacklist.add("minecraft:gravel");
        defaultBlacklist.add("minecraft:deepslate");
        defaultBlacklist.add("minecraft:cobblestone");
        defaultBlacklist.add("minecraft:cobbled_deepslate");
        defaultBlacklist.add("minecraft:granite");
        defaultBlacklist.add("minecraft:diorite");
        defaultBlacklist.add("minecraft:tuff");
        defaultBlacklist.add("minecraft:dirt");

        BUILDER.push("Infinity Nexus Common Configs");

        //---------------------------------------------//---------------------------------------------//

        //Infinity Set
        I_T_DAMAGE = BUILDER.comment("Damage for Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("I_T_DAMAGE", 25);
        I_T_HARVEST = BUILDER.comment("Harvest speed for Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("I_T_HARVEST", 50f);
        I_T_SPEED = BUILDER.comment("Attack speed for Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("I_T_SPEED", 7f);
        I_T_E_VALUE = BUILDER.comment("Enchantment Value for Infinity Pickaxe/Axe/Shovel/Hoe/Sword")
                .define("I_T_E_VALUE", 70);
        I_S_DAMAGE = BUILDER.comment("Damage for Infinity Sword")
                .define("I_S_DAMAGE", 40);
        I_S_SPEED = BUILDER.comment("Harvest speed for Infinity Sword")
                .define("I_S_SPEED", 7f);
        I_B_DURABILITY = BUILDER.comment("Infinity Bow Durability")
                .define("I_B_DURABILITY", 4500);
        I_A_ABSORPTION = BUILDER.comment("Infinity Armor Absorption Multiplier")
                .define("I_A_ABSORPTION", 0);
        I_A_REGENERATION = BUILDER.comment("Infinity Armor Regeneration Multiplier")
                .define("I_A_REGENERATION", 1);
        I_A_DURABILITY = BUILDER.comment("Infinity Armor Durability")
                .define("I_A_DURABILITY", 1000);
        I_A_E_VALUE = BUILDER.comment("Infinity Armor Enchantment Value")
                .define("I_A_E_VALUE", 80);
        I_A_TOUGHNESS = BUILDER.comment("Infinity Armor Toughness")
                .define("I_A_TOUGHNESS", 8f);
        I_A_K_RESISTANCE = BUILDER.comment("Infinity Armor Knockback Resistance")
                .define("I_A_K_RESISTANCE", 8f);
        I_A_H_ARMOR = BUILDER.comment("Infinity Armor Helmet Armor")
                .define("I_A_H_ARMOR", 12);
        I_A_C_ARMOR = BUILDER.comment("Infinity Armor Chestplate Armor")
                .define("I_A_C_ARMOR", 20);
        I_A_L_ARMOR = BUILDER.comment("Infinity Armor Leggings Armor")
                .define("I_A_L_ARMOR", 15);
        I_A_B_ARMOR = BUILDER.comment("Infinity Armor Boots Armor")
                .define("I_A_B_ARMOR", 13);
        //---------------------------------------------//---------------------------------------------//
        I_B_DAMAGE = BUILDER.comment("Infinity Bow Damage")
                .define("I_B_DAMAGE", 50);
        //---------------------------------------------//---------------------------------------------//

        //Imperial Infinity Set
        I_I_T_DAMAGE = BUILDER.comment("Damage for Imperial Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("I_I_T_DAMAGE", 30);
        I_I_T_HARVEST = BUILDER.comment("Harvest speed for Imperial Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("I_I_T_HARVEST", 100f);
        I_I_T_SPEED = BUILDER.comment("Attack speed for Imperial Infinity Pickaxe/Axe/Shovel/Hoe")
                .define("I_I_T_SPEED", 20f);
        I_I_T_E_VALUE = BUILDER.comment("Enchantment Value for Imperial Infinity Pickaxe/Axe/Shovel/Hoe/Sword")
                .define("I_I_T_E_VALUE", 80);
        I_I_S_DAMAGE = BUILDER.comment("Damage for Imperial Infinity Sword")
                .define("I_I_S_DAMAGE", 50);
        I_I_S_SPEED = BUILDER.comment("Harvest speed for Imperial Infinity Sword")
                .define("I_I_S_SPEED", 10f);
        I_I_B_DURABILITY = BUILDER.comment("Imperial Infinity Bow Durability")
                .define("I_I_B_DURABILITY", -1);
        I_I_B_DAMAGE = BUILDER.comment("Imperial Infinity Bow Damage")
                .define("I_I_B_DAMAGE", 60);
        I_I_A_E_VALUE = BUILDER.comment("Imperial Infinity Armor Enchantment Value")
                .define("I_I_A_E_VALUE", 100);
        I_I_A_N_VISION = BUILDER.comment("Imperial Infinity Armor Night Vision Multiplier")
                .define("I_I_A_N_VISION", 1);
        I_I_A_D_SPEED = BUILDER.comment("Imperial Infinity Armor Dig Speed Multiplier")
                .define("I_I_A_D_SPEED", 2);
        I_I_A_D_BOOST = BUILDER.comment("Imperial Infinity Armor Damage Boost Multiplier")
                .define("I_I_A_D_BOOST", 4);
        I_I_A_LUCK = BUILDER.comment("Imperial Infinity Armor Luck Multiplier")
                .define("I_I_A_LUCK", 4);
        I_I_A_HERO = BUILDER.comment("Imperial Infinity Hero on The Village Multiplier")
                .define("I_I_A_HERO", 4);
        I_I_A_SPEED = BUILDER.comment("Imperial Infinity Walk Speed Multiplier")
                .define("I_I_A_SPEED", 4);

        //---------------------------------------------//---------------------------------------------//
        I_D_MAGNETISM = BUILDER.comment("Item Dislocator can Magnetize Items")
                .define("I_D_MAGNETISM", true);
        I_D_RANGE = BUILDER.comment("Item Dislocator Range to Magnetize Items")
                .define("I_D_RANGE", 10);
        I_D_BLACKLIST = BUILDER.comment("Item Dislocator List of Deleted Items")
                .define("I_D_BLACKLIST", defaultBlacklist);
        //---------------------------------------------//---------------------------------------------//
        //Infinity Ore
        I_O_C_SIZE = BUILDER.comment("Infinity Ore Chunk Size")
                .define("I_O_C_SIZE", 1);
        I_O_P_CHUNK= BUILDER.comment("Infinity Ore Chunk, Per Chunk")
                .define("I_O_P_CHUNK", 1);
        I_O_P_MAXY = BUILDER.comment("Infinity Ore Max Y Placement")
                .define("I_O_P_MAXY", 22);
        I_O_P_MIMY = BUILDER.comment("Infinity Ore Min Y Placement")
                .define("I_O_P_MIMY", -22);
        //---------------------------------------------//---------------------------------------------//
        BUILDER.pop();
        SPEC = BUILDER.build();

    }

}
