package ru.quiara.tmis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import ru.quiara.tmis.advancement.ModAdvancements;

import java.util.function.Consumer;

public class ModAdvancementsGenerator extends FabricAdvancementProvider {

    //Tutorial https://fabricmc.net/wiki/tutorial:datagen_advancements

    public ModAdvancementsGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        new ModAdvancements().accept(consumer);
    }
}
