package com.Infinity.Nexus.Mod.utils;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
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
        public static final TagKey<Block> INFINITY_ORE
                = forgeTag("ores");
        public static final TagKey<Block> DEEPSLATE_INFINITY_ORE
                = forgeTag("ores");
        public static final TagKey<Block> INFINITY_BLOCK
                = forgeTag("storage_blocks");

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
        public static final TagKey<Item> CASTS = tinkersTag("tags/items/casts");
        public static final TagKey<Item> THERMAL_DIES = thermalTag("tags/crafting/dies");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> PICKUP = tag("pickup");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> FORGE_ORES = forgeTag("tags/ores");
        public static final TagKey<Item> FORGE_ORES_INFINITY = forgeTag("tags/ores/");
        public static final TagKey<Item> FORGE_RAW_MATERIALS = forgeTag("tags/raw_infinity");
        public static final TagKey<Item> FORGE_INGOT = forgeTag("tags/ingots");
        public static final TagKey<Item> FORGE_DUSTS = forgeTag("tags/dusts");
        public static final TagKey<Item> FORGE_STORAGE_BLOCK = forgeTag("tags/storage_blocks");
        public static final TagKey<Item> FORGE_STORAGE_BLOCKS = forgeTag("tags/storage_blocks/infinity");
        public static final TagKey<Item> FORGE_NUGGET = forgeTag("tags/nuggets/infinity");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> FORGE_SWORD = forgeTag("tags/swords");
        public static final TagKey<Item> FORGE_BOWS = forgeTag("tags/bows");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> FORGE_PICKAXE = forgeTag("tags/pickaxes");
        public static final TagKey<Item> FORGE_TOOLS_PICKAXE = forgeTag("tags/tools/pickaxes");
        public static final TagKey<Item> FORGE_AXE = forgeTag("tags/axes");
        public static final TagKey<Item> FORGE_TOOLS_AXE = forgeTag("tags/axes");
        public static final TagKey<Item> FORGE_SHOVEL = forgeTag("tags/shovels");
        public static final TagKey<Item> FORGE_TOOLS_SHOVEL = forgeTag("tags/shovels");
        public static final TagKey<Item> FORGE_HOE = forgeTag("tags/hoes");
        public static final TagKey<Item> FORGE_PAXEL = forgeTag("tags/paxels");
        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Item> FORGE_HELMETS = forgeTag("tags/helmets");
        public static final TagKey<Item> FORGE_CHESTPLATES = forgeTag("tags/chestplates");
        public static final TagKey<Item> FORGE_LEGGINGS = forgeTag("tags/leggings");
        public static final TagKey<Item> FORGE_BOOTS = forgeTag("tags/boots");
        //---------------------------------------------//---------------------------------------------//
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(InfinityNexusMod.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        private static TagKey<Item> tinkersTag(String name) {
            return ItemTags.create(new ResourceLocation("tconstruct", name));
        }
        private static TagKey<Item> thermalTag(String name) {
            return ItemTags.create(new ResourceLocation("thermal", name));
        }
    }
    public static class Fluids {

        //---------------------------------------------//---------------------------------------------//
        public static final TagKey<Fluid> MOLTEN_TINKERS = tag("molten_tinkers");
        //---------------------------------------------//---------------------------------------------//
        private static TagKey<Fluid> tag(String name) {
            return FluidTags.create(new ResourceLocation(InfinityNexusMod.MOD_ID, name));
        }

        private static TagKey<Fluid> forgeTag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }
}