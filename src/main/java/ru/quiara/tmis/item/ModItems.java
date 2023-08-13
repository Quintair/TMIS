package ru.quiara.tmis.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ru.quiara.tmis.TMIS;

public class ModItems {



    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TMIS.MOD_ID, id), item);
    }

    public static void registerModItems() {
        TMIS.LOGGER.debug("Registering Mod Items for " + TMIS.MOD_ID);
    }
}
