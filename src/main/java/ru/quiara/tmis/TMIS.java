package ru.quiara.tmis;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.quiara.tmis.block.ModBlocks;
import ru.quiara.tmis.item.ModItems;
import ru.quiara.tmis.item.itemgroup.ModItemGroups;
import ru.quiara.tmis.util.ModLootTableModifiers;

public class TMIS implements ModInitializer {

    public static final String MOD_ID = "tmis";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModLootTableModifiers.modifyLootTables();

        LOGGER.info("The mod is launched!");
    }
}
