package com.Infinity.Nexus.blocks;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.tab.ModTabs;
import com.Infinity.Nexus.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityNexus.MOD_ID);

    //Custom

    public static final RegistryObject<Block> COPPER_MACHINE_CASING = registerBlock("copper_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(3f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.COMMON);
    public static final RegistryObject<Block> ALUMINUM_MACHINE_CASING = registerBlock("aluminum_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(3f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.COMMON);
    public static final RegistryObject<Block> IRON_MACHINE_CASING = registerBlock("iron_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(3f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.RARE);
    public static final RegistryObject<Block> GOLD_MACHINE_CASING = registerBlock("gold_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(3f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.RARE);
    public static final RegistryObject<Block> STEEL_MACHINE_CASING = registerBlock("steel_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(4f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON);
    public static final RegistryObject<Block> MAGIC_MACHINE_CASING = registerBlock("magic_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(4f).lightLevel(LUZ -> {return 12;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.UNCOMMON);
    public static final RegistryObject<Block> INDUSTRIAL_MACHINE_CASING = registerBlock("industrial_machine_casing",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(6f).lightLevel(LUZ -> {return 2;}).requiresCorrectToolForDrops()), ModTabs.INFINITY_NEXUS, Rarity.EPIC);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab,Rarity rarity) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, rarity);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, Rarity rarity) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab).rarity(rarity)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
