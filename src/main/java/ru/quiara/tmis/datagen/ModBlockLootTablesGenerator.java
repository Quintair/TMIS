package ru.quiara.tmis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTablesGenerator extends FabricBlockLootTableProvider{

    //Tutorial https://fabricmc.net/wiki/tutorial:datagen_loot

    public ModBlockLootTablesGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

    }
}
