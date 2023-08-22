package ru.quiara.tmis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import ru.quiara.tmis.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    //Tutorial https://fabricmc.net/wiki/tutorial:datagen_recipe

    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.ANCIENT_SHARD), RecipeCategory.MISC,
                ModItems.ANCIENT_INGOT, 5f, 200, "ancient_shard");
        offerBlasting(exporter, List.of(ModItems.ANCIENT_SHARD), RecipeCategory.MISC,
                ModItems.ANCIENT_INGOT, 5f, 100, "ancient_shard");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_SWORD)
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .input('I', ModItems.ANCIENT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ANCIENT_INGOT), conditionsFromItem(ModItems.ANCIENT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCIENT_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANCIENT_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.ANCIENT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ANCIENT_INGOT), conditionsFromItem(ModItems.ANCIENT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCIENT_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ANCIENT_AXE)
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .input('I', ModItems.ANCIENT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ANCIENT_INGOT), conditionsFromItem(ModItems.ANCIENT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCIENT_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_SHOVEL)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('I', ModItems.ANCIENT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ANCIENT_INGOT), conditionsFromItem(ModItems.ANCIENT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCIENT_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ANCIENT_HOE)
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .input('I', ModItems.ANCIENT_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ANCIENT_INGOT), conditionsFromItem(ModItems.ANCIENT_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ANCIENT_HOE)));


    }
}
