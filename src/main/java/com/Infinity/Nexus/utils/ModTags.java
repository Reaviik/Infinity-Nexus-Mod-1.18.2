package com.Infinity.Nexus.utils;

import com.Infinity.Nexus.InfinityNexus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> EXPLORAR_PORTAL_FRAME =
            tag("explorar_portal_frame");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(InfinityNexus.MOD_ID, name));
    }
}
