package ru.quiara.tmis;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMIS implements ModInitializer {

    public static final String MOD_ID = "tmis";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {


        LOGGER.info("The mod is launched!");
    }
}
