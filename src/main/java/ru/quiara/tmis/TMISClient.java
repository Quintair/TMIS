package ru.quiara.tmis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class TMISClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger(TMIS.MOD_ID);

    @Override
    public void onInitializeClient() {



        LOGGER.info("The clientside mod is launched!");
    }
}
