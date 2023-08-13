package ru.quiara.tmis;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import ru.quiara.tmis.datagen.*;

public class TMISDataGeneration implements DataGeneratorEntrypoint {

    //Tutorial https://fabricmc.net/wiki/tutorial:datagen_setup

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModAdvancementsGenerator::new);
        pack.addProvider(ModBlockLootTablesGenerator::new);
        pack.addProvider(ModBlockTagGenerator::new);
        pack.addProvider(ModItemTagGenerator::new);
        pack.addProvider(ModModelGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
    }
}
