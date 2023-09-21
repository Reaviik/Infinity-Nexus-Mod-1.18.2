package com.Infinity.Nexus.tab;

import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab INFINITY_NEXUS = new CreativeModeTab("infinity_nexus_mod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INFINITY_SINGULARITY.get());
        }
    };
    public static final CreativeModeTab INFINITY_NEXUS_ADDITIONS = new CreativeModeTab("infinity_nexus_mod_additions") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FULL_LEGENDARY_MIXED_METAL_BOX.get());
        }
    };
    public static final CreativeModeTab INFINITY_NEXUS_PROGRESSION = new CreativeModeTab("infinity_nexus_mod_progression") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.INDUSTRIAL_MACHINE_CASING.get());
        }
    };
}
