package com.Infinity.Nexus.utils;

import com.Infinity.Nexus.InfinityNexus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> EXPLORAR_PORTAL_FRAME
                = tag("explorar_portal_frame");

        public static final TagKey<Block> MINEABLE_WITH_PAXEL = BlockTags.create(new ResourceLocation(InfinityNexus.MOD_ID, "mineable_paxel"));

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(InfinityNexus.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> INFINITY_HELMET = tag("infinity_helmet");
        public static final TagKey<Item> PICKUP = tag("pickup");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(InfinityNexus.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}