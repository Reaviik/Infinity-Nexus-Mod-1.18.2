package com.Infinity.Nexus.block;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.block.custom.*;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.tab.ModTabs;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityNexus.MOD_ID);

    //Custom

    public static final RegistryObject<Block> COPPER_MACHINE_CASING = registerBlock("copper_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(1f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.COMMON,"tooltip.infinity_nexus_mod.copper_machine_casing");
    public static final RegistryObject<Block> LEAD_MACHINE_CASING = registerBlock("lead_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(2f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.COMMON,"tooltip.infinity_nexus_mod.lead_machine_casing");
    public static final RegistryObject<Block> ALUMINUM_MACHINE_CASING = registerBlock("aluminum_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(2f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.COMMON,"tooltip.infinity_nexus_mod.aluminum_machine_casing");
    public static final RegistryObject<Block> IRON_MACHINE_CASING = registerBlock("iron_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(3f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.RARE,"tooltip.infinity_nexus_mod.iron_machine_casing");
    public static final RegistryObject<Block> GOLD_MACHINE_CASING = registerBlock("gold_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(3f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.RARE,"tooltip.infinity_nexus_mod.gold_machine_casing");
    public static final RegistryObject<Block> STEEL_MACHINE_CASING = registerBlock("steel_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(4f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,"tooltip.infinity_nexus_mod.steel_machine_casing");
    public static final RegistryObject<Block> MAGIC_MACHINE_CASING = registerBlock("magic_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(4f).lightLevel(LUZ -> {return 12;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,"tooltip.infinity_nexus_mod.magic_machine_casing");
    public static final RegistryObject<Block> ENERGIZED_MACHINE_CASING = registerBlock("energized_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).noOcclusion()
                    .strength(4f).lightLevel(LUZ -> {return 12;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.EPIC,"tooltip.infinity_nexus_mod.energized_machine_casing");
    public static final RegistryObject<Block> INDUSTRIAL_MACHINE_CASING = registerBlock("industrial_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).noOcclusion()
                    .strength(6f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.EPIC, "tooltip.infinity_nexus_mod.industrial_machine_casing");

    public static final RegistryObject<Block> INFINITY_BLOCK = registerBlock("infinity_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).noOcclusion()
                    .strength(2f).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.EPIC, "tooltip.infinity_nexus_mod.infinity_block");
    public static final RegistryObject<Block> INFINITY_ORE = registerBlock("infinity_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()
                    .strength(1f).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.EPIC, "tooltip.infinity_nexus_mod.infinity_ore");
    public static final RegistryObject<Block> DEEPSLATE_INFINITY_ORE = registerBlock("deepslate_infinity_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()
                    .strength(1f).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.EPIC, "tooltip.infinity_nexus_mod.deepslate_infinity_ore");

    //Empty Cases
            //Metal
                    //Basic
    public static final RegistryObject<Block> EMPTY_BASIC_METAL_BOX = registerBlock("empty_basic_metal_box",
            () -> new BaseMixedMetalStorage(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.COMMON,
            "tooltip.infinity_nexus_mod:empty_basic_metal_box");
                    //Advanced
    public static final RegistryObject<Block> EMPTY_ADVANCED_METAL_BOX = registerBlock("empty_advanced_metal_box",
            () -> new BaseAdvancedMixedGemStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,
            "tooltip.infinity_nexus_mod:empty_advanced_metal_box");
                    //Elite
    public static final RegistryObject<Block> EMPTY_ELITE_METAL_BOX = registerBlock("empty_elite_metal_box",
            () -> new BaseEliteMixedMetalStorage(BlockBehaviour.Properties.of(Material.WEB).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:empty_elite_metal_box");
                    //Ultimate
    public static final RegistryObject<Block> EMPTY_ULTIMATE_METAL_BOX = registerBlock("empty_ultimate_metal_box",
            () -> new BaseUltimateMixedMetalStorage(BlockBehaviour.Properties.of(Material.WEB).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f).lightLevel(LUZ -> {return 4;})),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:empty_ultimate_metal_box");
                    //Legendary
    public static final RegistryObject<Block> EMPTY_LEGENDARY_METAL_BOX = registerBlock("empty_legendary_metal_box",
            () -> new BaseLegendaryMixedGemStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.EPIC,
            "tooltip.infinity_nexus_mod:empty_legendary_metal_box");
            //Gem
                    //Basic
    public static final RegistryObject<Block> EMPTY_BASIC_GEM_BASKET = registerBlock("empty_basic_gem_basket",
            () -> new BaseMixedGemStorage(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.COMMON,
            "tooltip.infinity_nexus_mod:empty_basic_mixed_metal_box");
                    //Advanced
    public static final RegistryObject<Block> EMPTY_ADVANCED_GEM_BASKET = registerBlock("empty_advanced_gem_basket",
            () -> new BaseAdvancedMixedGemStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,
            "tooltip.infinity_nexus_mod:empty_advanced_mixed_metal_box");
                    //Elite
    public static final RegistryObject<Block> EMPTY_ELITE_GEM_BASKET = registerBlock("empty_elite_gem_basket",
            () -> new BaseEliteMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:empty_elite_mixed_metal_box");
                    //Legendary

    //Full Cases
            //Metal
                    //Basic
    public static final RegistryObject<Block> FULL_BASIC_MIXED_METAL_BOX = registerBlock("full_basic_mixed_metal_box",
            () -> new BaseMixedMetalStorage(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.COMMON,
            "tooltip.infinity_nexus_mod:full_basic_mixed_metal_box");
    public static final RegistryObject<Block> FULL_BASIC_MIXED_METAL_BOX_1 = registerBlock("full_basic_mixed_metal_box_1",
            () -> new BaseMixedMetalStorage(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.COMMON,
            "tooltip.infinity_nexus_mod:full_basic_mixed_metal_box_1");
                    //Advanced
    public static final RegistryObject<Block> FULL_ADVANCED_MIXED_METAL_BOX = registerBlock("full_advanced_mixed_metal_box",
            () -> new BaseMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,
            "tooltip.infinity_nexus_mod:full_advanced_mixed_metal_box");
                    //Elite
    public static final RegistryObject<Block> FULL_ELITE_MIXED_METAL_BOX = registerBlock("full_elite_mixed_metal_box",
            () -> new BaseEliteMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:full_elite_mixed_metal_box");
    public static final RegistryObject<Block> FULL_ELITE_MIXED_METAL_BOX_1 = registerBlock("full_elite_mixed_metal_box_1",
            () -> new BaseEliteMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:full_elite_mixed_metal_box_1");
    public static final RegistryObject<Block> FULL_ELITE_MIXED_METAL_BOX_2 = registerBlock("full_elite_mixed_metal_box_2",
            () -> new BaseEliteMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:full_elite_mixed_metal_box_2");
                    //Ultimate
    public static final RegistryObject<Block> FULL_ULTIMATE_MIXED_METAL_BOX = registerBlock("full_ultimate_mixed_metal_box",
            () -> new BaseUltimateMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:full_ultimate_mixed_metal_box");
    public static final RegistryObject<Block> FULL_ULTIMATE_MIXED_METAL_BOX_1 = registerBlock("full_ultimate_mixed_metal_box_1",
            () -> new BaseUltimateMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:full_ultimate_mixed_metal_box_1");
                    //Legendary
    public static final RegistryObject<Block> FULL_LEGENDARY_MIXED_METAL_BOX = registerBlock("full_legendary_mixed_metal_box",
            () -> new BaseLegendaryMixedGemStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.EPIC,
            "tooltip.infinity_nexus_mod:full_legendary_mixed_metal_box");

            //Gem
                    //Basic
    public static final RegistryObject<Block> FULL_BASIC_MIXED_GEM_BASKET = registerBlock("full_basic_mixed_gem_basket",
            () -> new BaseMixedGemStorage(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.COMMON,
            "tooltip.infinity_nexus_mod:full_basic_mixed_gem_basket");
    public static final RegistryObject<Block> FULL_BASIC_MIXED_GEM_BASKET_1 = registerBlock("full_basic_mixed_gem_basket_1",
            () -> new BaseMixedGemStorage(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.COMMON,
            "tooltip.infinity_nexus_mod:full_basic_mixed_gem_basket_1");
                    //Advanced
    public static final RegistryObject<Block> FULL_ADVANCED_MIXED_GEM_BASKET = registerBlock("full_advanced_mixed_gem_basket",
            () -> new BaseAdvancedMixedGemStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,
            "tooltip.infinity_nexus_mod:full_advanced_mixed_gem_basket");
    public static final RegistryObject<Block> FULL_ADVANCED_MIXED_GEM_BASKET_1 = registerBlock("full_advanced_mixed_gem_basket_1",
            () -> new BaseAdvancedMixedGemStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,
            "tooltip.infinity_nexus_mod:full_advanced_mixed_gem_basket_1");
                    //Elite
    public static final RegistryObject<Block> FULL_ELITE_MIXED_GEM_BASKET = registerBlock("full_elite_mixed_gem_basket",
            () -> new BaseEliteMixedMetalStorage(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(10f)),ModTabs.INFINITY_NEXUS, Rarity.RARE,
            "tooltip.infinity_nexus_mod:full_elite_mixed_gem_basket");
                    //Legendary
    //Misc
        //Portal
    public static final RegistryObject<Block> EXPLORAR_PORTAL = registerBlockWithoutBlockItem("explorar_portal",
     ExplorarPortal::new);
    public static final RegistryObject<Block> EXPLORAR_PORTAL_FRAME = registerBlock("explorar_portal_frame",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID).noOcclusion().requiresCorrectToolForDrops()
                    .strength(15f)),ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON,
            "tooltip.infinity_nexus_mod:explorar_portal_frame");


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
     private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab,Rarity rarity,String tooltip) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, rarity,tooltip);
        return toReturn;
    }


    //Tooltip
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> blocks, CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name, blocks);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }
//New
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),  new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent("tooltip.infinity_nexus.pressShift"));
                if(Screen.hasShiftDown()) {
                    pTooltip.remove(1);
                    pTooltip.add(new TranslatableComponent(tooltipKey));
                }
            }
        });
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, Rarity rarity, String tooltip) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab).rarity(rarity)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
