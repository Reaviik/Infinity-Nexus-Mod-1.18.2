package com.Infinity.Nexus.screen.slot;

import com.Infinity.Nexus.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModStrengthSlot extends SlotItemHandler {
    public ModStrengthSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return ModItems.STRENGTH_UPGRADE.get() == stack.getItem();
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}