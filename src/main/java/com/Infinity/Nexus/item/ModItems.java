package com.Infinity.Nexus.item;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.item.custom.CatalystItem;
import com.Infinity.Nexus.tab.ModTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
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
    public static final RegistryObject<Item> MEASMIR_SWORD = ITEMS.register("measmir_sword",
            () -> new SwordItem(ModTiers.INFINITY, 35,9f,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1)));

    //Armor
    public static final RegistryObject<Item> INFINITY_HELMET = ITEMS.register("infinity_helmet",
            () -> new ArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> INFINITY_CHESTPLATE = ITEMS.register("infinity_chestplate",
            () -> new ArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> INFINITY_LEGGINGS = ITEMS.register("infinity_leggings",
            () -> new ArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> INFINITY_BOOTS = ITEMS.register("infinity_boots",
            () -> new ArmorItem(ModArmorMaterials.INFINITY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModTabs.INFINITY_NEXUS).stacksTo(1).rarity(Rarity.EPIC)));

    //Misc
        //Catalyst
    public static final RegistryObject<Item> CATALIST = ITEMS.register("catalyst", CatalystItem::new);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
