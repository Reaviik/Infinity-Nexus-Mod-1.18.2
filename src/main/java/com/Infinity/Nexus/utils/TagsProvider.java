package com.Infinity.Nexus.utils;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TagsProvider {
    public static class Blocks extends BlockTagsProvider {
        public Blocks(DataGenerator generatorIn, String modId, ExistingFileHelper existingFileHelper) {
            super(generatorIn, modId, existingFileHelper);
        }

        @Override
        protected void addTags() {
            //tag(ModTags.Blocks.CONVEYOR_BELT).get());
        }
    }

    public static class Items extends ItemTagsProvider {
        public Items(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, String modId, ExistingFileHelper existingFileHelper) {
            super(dataGenerator, blockTagProvider, modId, existingFileHelper);
        }

        @Override
        protected void addTags() {

            //tag(ModTags.Items.CAPSULE)
            //        .add(ModItems.ALLOY_CAPSULE.get().asItem())
            //        .add(ModItems.LEAD_CAPSULE.get().asItem())
            //        .add(ModItems.CADMIUM_CAPSULE.get().asItem())
            //        .add(ModItems.TUNGSTEN_CAPSULE.get().asItem())
            //        .add(ModItems.CONCRETE_CAPSULE.get().asItem())
            //        .add(ModItems.STEEL_CAPSULE.get().asItem())
            //        .add(ModItems.ALUMINUM_CAPSULE.get().asItem());

            //tag(ModTags.Items.EMPTY_CAPSULE)
            //        .add(ModItems.EMPTY_ALLOY_CAPSULE.get().asItem())
            //        .add(ModItems.EMPTY_LEAD_CAPSULE.get().asItem())
            //        .add(ModItems.EMPTY_CADMIUM_CAPSULE.get().asItem())
            //        .add(ModItems.EMPTY_TUNGSTEN_CAPSULE.get().asItem())
            //        .add(ModItems.EMPTY_CONCRETE_CAPSULE.get().asItem())
            //        .add(ModItems.EMPTY_STEEL_CAPSULE.get().asItem())
            //        .add(ModItems.EMPTY_ALUMINUM_CAPSULE.get().asItem());
        }
    }
}