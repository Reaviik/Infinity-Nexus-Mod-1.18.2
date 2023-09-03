package com.Infinity.Nexus.screen.slot;

import com.Infinity.Nexus.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModSpeedSlot extends SlotItemHandler {
    public ModSpeedSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return ModItems.SPEED_UPGRADE.get() == stack.getItem();
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}