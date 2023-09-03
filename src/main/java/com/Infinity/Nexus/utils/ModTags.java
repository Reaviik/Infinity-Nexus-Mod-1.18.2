package com.Infinity.Nexus.utils;


import com.Infinity.Nexus.InfinityNexus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> BLACK_HOLE = tag("black_hole");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(InfinityNexus.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public  static final TagKey<Item> CAPSULE = tag("capsules");
        public  static final TagKey<Item> EMPTY_CAPSULE = tag("empty_capsules");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(InfinityNexus.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}