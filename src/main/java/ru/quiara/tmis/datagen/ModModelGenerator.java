package ru.quiara.tmis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import ru.quiara.tmis.item.ModItems;

public class ModModelGenerator extends FabricModelProvider {

    //Tutorial https://fabricmc.net/wiki/tutorial:datagen_model

    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ANCIENT_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANCIENT_SOUP, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANCIENT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCIENT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCIENT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCIENT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ANCIENT_HOE, Models.HANDHELD);
    }
}
