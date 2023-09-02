package com.Infinity.Nexus.item;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.Tab.ModTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityNexus.MOD_ID);

    //Custom

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

    //Bars
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
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
