package com.Infinity.Nexus.item;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.item.custom.*;
import com.Infinity.Nexus.tab.ModTabs;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityNexus.MOD_ID);

    //Casts
    public static final RegistryObject<Item> GOLD_WIRE_CAST = ITEMS.register("gold_wire_cast",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GOLD_SCREW_CAST = ITEMS.register("gold_screw_cast",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GOLD_SHEET_CAST = ITEMS.register("gold_sheet_cast",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> GOLD_ROD_CAST = ITEMS.register("gold_rod_cast",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));

    //Models
    public static final RegistryObject<Item> RAW_WIRE_CLAY_MODEL = ITEMS.register("raw_wire_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SCREW_CLAY_MODEL = ITEMS.register("raw_screw_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_SHEET_CLAY_MODEL = ITEMS.register("raw_sheet_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> RAW_ROD_CLAY_MODEL = ITEMS.register("raw_rod_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> WIRE_CLAY_MODEL = ITEMS.register("wire_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SCREW_CLAY_MODEL = ITEMS.register("screw_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> SHEET_CLAY_MODEL = ITEMS.register("sheet_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ROD_CLAY_MODEL = ITEMS.register("rod_clay_model",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));


    //Wires
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ALUMINUM_WIRE = ITEMS.register("aluminum_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRON_WIRE = ITEMS.register("iron_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLD_WIRE = ITEMS.register("gold_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> STEEL_WIRE = ITEMS.register("steel_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MAGIC_WIRE = ITEMS.register("magic_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> INDUSTRIAL_WIRE = ITEMS.register("industrial_wire",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.EPIC)));

    //Screws
    public static final RegistryObject<Item> COPPER_SCREW = ITEMS.register("copper_screw",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ALUMINUM_SCREW = ITEMS.register("aluminum_screw",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> IRON_SCREW = ITEMS.register("iron_screw",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> STEEL_SCREW = ITEMS.register("steel_screw",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MAGIC_SCREW = ITEMS.register("magic_screw",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> INDUSTRIAL_SCREW = ITEMS.register("industrial_screw",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.EPIC)));

    //Rods
    public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ALUMINUM_ROD = ITEMS.register("aluminum_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLD_ROD = ITEMS.register("gold_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> STEEL_ROD = ITEMS.register("steel_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MAGIC_ROD = ITEMS.register("magic_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> INDUSTRIAL_ROD = ITEMS.register("industrial_rod",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.EPIC)));

    //Sheets
    public static final RegistryObject<Item> COPPER_SHEET = ITEMS.register("copper_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> ALUMINUM_SHEET = ITEMS.register("aluminum_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> IRON_SHEET = ITEMS.register("iron_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLD_SHEET = ITEMS.register("gold_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MAGIC_SHEET = ITEMS.register("magic_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> INDUSTRIAL_SHEET = ITEMS.register("industrial_sheet",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> RAW_INGOT = ITEMS.register("raw_infinity",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> INFINITY_INGOT = ITEMS.register("infinity_ingot",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> WING = ITEMS.register("wing",
            () -> new Item(new Item.Properties().tab(ModTabs.INFINITY_NEXUS).rarity(Rarity.EPIC)));

    //Tools
    public static final RegistryObject<Item> IMPERIAL_INFINITY_SWORD = ITEMS.register("imperial_infinity_sword",
            () -> new ModSword(ModTiers.IMPERIAL, 50,10f,//+4
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1),
                    new TranslatableComponent("tooltip.infinity_nexus_mod.imperial_infinity_sword"),
                    new MobEffectInstance[]{
                    new MobEffectInstance(MobEffects.WEAKNESS, 200,3),
                    new MobEffectInstance(MobEffects.WITHER, 200,3)
            }));
    public static final RegistryObject<Item> INFINITY_SWORD = ITEMS.register("infinity_sword",
            () -> new ModSword(ModTiers.INFINITY, 40,10f,//+4
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1),
                    new TranslatableComponent("tooltip.infinity_nexus_mod.infinity_sword"),
                    new MobEffectInstance[]{
                            //TODO
                    new MobEffectInstance(MobEffects.WEAKNESS, 200,2),
                    new MobEffectInstance(MobEffects.WITHER, 200,2)
            }));

    public static final RegistryObject<Item> PURPLE_INFINITY_SWORD = ITEMS.register("purple_infinity_sword",
            () -> new ModSword(ModTiers.INFINITY, 40,10f,//+4
                    new Item.Properties().stacksTo(1),
                    new TranslatableComponent("tooltip.infinity_nexus_mod.purple_infinity_sword"),
                    new MobEffectInstance[]{
                            //TODO
                    new MobEffectInstance(MobEffects.WEAKNESS, 200,2),
                    new MobEffectInstance(MobEffects.WITHER, 200,2)

            }));


    //Armor

    public static final RegistryObject<Item> BLUE_INFINITY_HELMET = ITEMS.register("blue_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.BLUE, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BLUE_INFINITY_CHESTPLATE = ITEMS.register("blue_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.BLUE, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BLUE_INFINITY_LEGGINGS = ITEMS.register("blue_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.BLUE, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> BLUE_INFINITY_BOOTS = ITEMS.register("blue_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.BLUE, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> GOLD_INFINITY_HELMET = ITEMS.register("gold_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLD_INFINITY_CHESTPLATE = ITEMS.register("gold_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLD_INFINITY_LEGGINGS = ITEMS.register("gold_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GOLD_INFINITY_BOOTS = ITEMS.register("gold_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.GOLD, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> GREEN_INFINITY_HELMET = ITEMS.register("green_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GREEN_INFINITY_CHESTPLATE = ITEMS.register("green_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GREEN_INFINITY_LEGGINGS = ITEMS.register("green_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> GREEN_INFINITY_BOOTS = ITEMS.register("green_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.GREEN, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> PINK_INFINITY_HELMET = ITEMS.register("pink_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.PINK, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PINK_INFINITY_CHESTPLATE = ITEMS.register("pink_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.PINK, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PINK_INFINITY_LEGGINGS = ITEMS.register("pink_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.PINK, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PINK_INFINITY_BOOTS = ITEMS.register("pink_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.PINK, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> PURPLE_INFINITY_HELMET = ITEMS.register("purple_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.PURPLE, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PURPLE_INFINITY_CHESTPLATE = ITEMS.register("purple_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.PURPLE, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PURPLE_INFINITY_LEGGINGS = ITEMS.register("purple_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.PURPLE, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> PURPLE_INFINITY_BOOTS = ITEMS.register("purple_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.PURPLE, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RED_INFINITY_HELMET = ITEMS.register("red_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.RED, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> RED_INFINITY_CHESTPLATE = ITEMS.register("red_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.RED, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> RED_INFINITY_LEGGINGS = ITEMS.register("red_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.RED, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> RED_INFINITY_BOOTS = ITEMS.register("red_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.RED, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));


    public static final RegistryObject<Item> SILVER_INFINITY_HELMET = ITEMS.register("silver_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SILVER_INFINITY_CHESTPLATE = ITEMS.register("silver_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SILVER_INFINITY_LEGGINGS = ITEMS.register("silver_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> SILVER_INFINITY_BOOTS = ITEMS.register("silver_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));


    public static final RegistryObject<Item> YELLOW_INFINITY_HELMET = ITEMS.register("yellow_infinity_helmet",
            () -> new CommonArmorItem(ModArmorMaterials.YELLOW, EquipmentSlot.HEAD,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> YELLOW_INFINITY_CHESTPLATE = ITEMS.register("yellow_infinity_chestplate",
            () -> new CommonArmorItem(ModArmorMaterials.YELLOW, EquipmentSlot.CHEST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> YELLOW_INFINITY_LEGGINGS = ITEMS.register("yellow_infinity_leggings",
            () -> new CommonArmorItem(ModArmorMaterials.YELLOW, EquipmentSlot.LEGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> YELLOW_INFINITY_BOOTS = ITEMS.register("yellow_infinity_boots",
            () -> new CommonArmorItem(ModArmorMaterials.YELLOW, EquipmentSlot.FEET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
            //Infinity


    public static final RegistryObject<Item> INFINITY_INFINITY_HELMET = ITEMS.register("infinity_helmet",
            () -> new InfinityArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> INFINITY_INFINITY_CHESTPLATE = ITEMS.register("infinity_chestplate",
            () -> new InfinityArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> INFINITY_INFINITY_LEGGINGS = ITEMS.register("infinity_leggings",
            () -> new InfinityArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> INFINITY_INFINITY_BOOTS = ITEMS.register("infinity_boots",
            () -> new InfinityArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.RARE)));
            //Imperial
    public static final RegistryObject<Item> IMPERIAL_INFINITY_HELMET = ITEMS.register("imperial_infinity_helmet",
            () -> new ImperialArmorItem(ModArmorMaterials.IMPERIAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> IMPERIAL_INFINITY_CHESTPLATE = ITEMS.register("imperial_infinity_chestplate",
            () -> new ImperialArmorItem(ModArmorMaterials.IMPERIAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> IMPERIAL_INFINITY_LEGGINGS = ITEMS.register("imperial_infinity_leggings",
            () -> new ImperialArmorItem(ModArmorMaterials.IMPERIAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> IMPERIAL_INFINITY_BOOTS = ITEMS.register("imperial_infinity_boots",
            () -> new ImperialArmorItem(ModArmorMaterials.IMPERIAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));

    //Misc
        //Catalyst
    public static final RegistryObject<Item> CATALYST = ITEMS.register("catalyst", CatalystItem::new);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
