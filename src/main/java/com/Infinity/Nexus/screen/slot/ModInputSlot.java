package com.Infinity.Nexus.screen.slot;

import net.minecraft.world.item.ItemStack;
        import net.minecraftforge.items.IItemHandler;
        import net.minecraftforge.items.SlotItemHandler;

public class ModInputSlot extends SlotItemHandler {
    public ModInputSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return true;
                //ModItems.SPEED_UPGRADE_LENS.get().asItem() == stack.getItem();
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}