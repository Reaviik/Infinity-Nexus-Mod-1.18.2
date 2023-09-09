package com.Infinity.Nexus.tab;

import com.Infinity.Nexus.block.ModBlocks;
import com.Infinity.Nexus.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab INFINITY_NEXUS = new CreativeModeTab("infinity_nexus_mod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WING.get());
        }
    };
}
