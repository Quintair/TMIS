package ru.quiara.tmis;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.quiara.tmis.block.ModBlocks;
import ru.quiara.tmis.item.ModItems;

public class TMIS implements ModInitializer {

    public static final String MOD_ID = "tmis";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        LOGGER.info("The mod is launched!");
    }
}
