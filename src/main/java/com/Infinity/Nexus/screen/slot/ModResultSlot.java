package com.Infinity.Nexus.screen.slot;

import com.Infinity.Nexus.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ModResultSlot extends SlotItemHandler {
    public ModResultSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        if (stack.getItem() == ModItems.STRENGTH_UPGRADE.get() || stack.getItem() == ModItems.SPEED_UPGRADE.get()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int getMaxStackSize() {
        return 64;
    }
}