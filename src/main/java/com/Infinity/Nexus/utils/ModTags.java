package com.Infinity.Nexus.utils;

import com.Infinity.Nexus.InfinityNexusMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> EXPLORAR_PORTAL_FRAME
                = tag("explorar_portal_frame");
        public static final TagKey<Block> END_BASE_STONE
                = tag("end_base_stone");

        public static final TagKey<Block> MINEABLE_WITH_PAXEL = BlockTags.create(new ResourceLocation(InfinityNexusMod.MOD_ID, "mineable_paxel"));

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(InfinityNexusMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        //---------------------------------------------//---------------------------------------------//

        public static final TagKey<Item> INFINITY_HELMET = tag("infinity_helmet");
        public static final TagKey<Item> INFINITY_CHESTPLATE = tag("infinity_chestplate");
        public static final TagKey<Item> INFINITY_LEGGINGS = tag("infinity_leggings");
        public static final TagKey<Item> INFINITY_BOOTS = tag("infinity_boots");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> PICKUP = tag("pickup");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> INFINITY_ORE = forgeTag("infinity_ore");
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(InfinityNexusMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Fluids {

        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Fluid> MOLTEN_TINKERS = tag("molten_tinkers.json");
        //---------------------------------------------//---------------------------------------------//
        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation(InfinityNexusMod.MOD_ID, name));
        }

        private static TagKey<Fluid> forgeTag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }
}