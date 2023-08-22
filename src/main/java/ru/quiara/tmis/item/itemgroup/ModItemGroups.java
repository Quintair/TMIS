package ru.quiara.tmis.item.itemgroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ru.quiara.tmis.TMIS;
import ru.quiara.tmis.item.ModItems;

public class ModItemGroups {

    public static final ItemGroup ANCIENT_ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP, new Identifier(TMIS.MOD_ID, "ancient_item_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ANCIENT_INGOT))
                    .displayName(Text.translatable("itemGroup.tmis.ancient_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ANCIENT_SHARD);
                        entries.add(ModItems.ANCIENT_INGOT);
                    })
                    .build());

    public static void registerItemGroups() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.addAfter(Items.NETHERITE_SWORD, ModItems.ANCIENT_SWORD);
            content.addAfter(Items.NETHERITE_AXE, ModItems.ANCIENT_AXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.NETHERITE_HOE, ModItems.ANCIENT_SHOVEL);
            content.addAfter(ModItems.ANCIENT_SHOVEL, ModItems.ANCIENT_PICKAXE);
            content.addAfter(ModItems.ANCIENT_PICKAXE, ModItems.ANCIENT_AXE);
            content.addAfter(ModItems.ANCIENT_AXE, ModItems.ANCIENT_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(Items.RABBIT_STEW, ModItems.ANCIENT_SOUP);
        });

        TMIS.LOGGER.info("Registering Item Groups for " + TMIS.MOD_ID);
    }
}
