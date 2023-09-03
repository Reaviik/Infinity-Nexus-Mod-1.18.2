package com.Infinity.Nexus.screen.slot;

import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.utils.ModTags;
import com.Infinity.Nexus.utils.TagsProvider;
import net.minecraft.world.item.ItemStack;
        import net.minecraftforge.items.IItemHandler;
        import net.minecraftforge.items.SlotItemHandler;

public class ModInputSlot extends SlotItemHandler {
    public ModInputSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return stack != ModItems.STRENGTH_UPGRADE.get().getDefaultInstance() || stack !== ModItems.SPEED_UPGRADE.get().getDefaultInstance();
    }


    @Override
    public int getMaxStackSize() {
        return 64;
    }
}