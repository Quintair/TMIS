package ru.quiara.tmis.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.quiara.tmis.TMIS;

public class ModBlocks {
    private static Block registerBlock(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(TMIS.MOD_ID, id), block);
    }

    private static void registerBlockItem(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(TMIS.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TMIS.LOGGER.debug("Registering Mod Blocks for " + TMIS.MOD_ID);
    }
}
