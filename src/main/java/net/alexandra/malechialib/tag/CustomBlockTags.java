package net.alexandra.malechialib.tag;

import net.alexandra.malechialib.MalechiaLib;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class CustomBlockTags {
    public static final TagKey<Block> NEEDS_MALECHIA_TOOL = register("needs_malechia_tool");
    public static final TagKey<Block> NEEDS_NETHERITE_TOOL = register("needs_netherite_tool");

    private CustomBlockTags() {
    }

    private static TagKey<Block> register(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(id));
    }
    public static void registerBlockTags() {
        MalechiaLib.LOGGER.info("registering mod items for " + MalechiaLib.MOD_ID);
    }
}

