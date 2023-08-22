package ru.quiara.tmis.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.quiara.tmis.TMIS;
import ru.quiara.tmis.item.foodcomponent.ModFoodComponents;
import ru.quiara.tmis.util.ModToolMaterials;

public class ModItems {

    // Items
    public static final Item ANCIENT_SHARD = registerItem("ancient_shard",
            new Item(new FabricItemSettings()));

    public static final Item ANCIENT_INGOT = registerItem("ancient_ingot",
            new Item(new FabricItemSettings()));

    // Foods

    public static final Item ANCIENT_SOUP = registerItem("ancient_soup",
            new StewItem(new FabricItemSettings().food(ModFoodComponents.ANCIENT_SOUP).maxCount(1)));

    // Tools And Weapons

    public static final Item ANCIENT_SWORD = registerItem("ancient_sword",
            new SwordItem(ModToolMaterials.ANCIENT, 3, -2.4f, new FabricItemSettings()));

    public static final Item ANCIENT_PICKAXE = registerItem("ancient_pickaxe",
            new PickaxeItem(ModToolMaterials.ANCIENT, 1, -2.8f, new FabricItemSettings()));

    public static final Item ANCIENT_AXE = registerItem("ancient_axe",
            new AxeItem(ModToolMaterials.ANCIENT, 5.0f, -3.0f, new FabricItemSettings()));

    public static final Item ANCIENT_SHOVEL = registerItem("ancient_shovel",
            new ShovelItem(ModToolMaterials.ANCIENT, 1.5f, -3.0f, new FabricItemSettings()));

    public static final Item ANCIENT_HOE = registerItem("ancient_hoe",
            new HoeItem(ModToolMaterials.ANCIENT, -4, 0.0f, new FabricItemSettings()));

    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TMIS.MOD_ID, id), item);
    }

    public static void registerModItems() {
        TMIS.LOGGER.debug("Registering Mod Items for " + TMIS.MOD_ID);
    }
}
