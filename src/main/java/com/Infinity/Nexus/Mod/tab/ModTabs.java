package com.Infinity.Nexus.Mod.tab;

import com.Infinity.Nexus.Mod.block.ModBlocks;
import com.Infinity.Nexus.Mod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab INFINITY_NEXUS = new CreativeModeTab("infinity_nexus_mod_addition") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INFINITY_SINGULARITY.get());
        }
    };
    public static final CreativeModeTab INFINITY_NEXUS_PROGRESSION = new CreativeModeTab("infinity_nexus_mod_progression") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.INDUSTRIAL_MACHINE_CASING.get());
        }
    };
    public static final CreativeModeTab INFINITY_NEXUS_ECONOMY = new CreativeModeTab("infinity_nexus_mod_economy") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FULL_LEGENDARY_MIXED_METAL_BOX.get());
        }
    };
}
