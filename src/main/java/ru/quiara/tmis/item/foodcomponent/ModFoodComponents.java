package ru.quiara.tmis.item.foodcomponent;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent ANCIENT_SOUP = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.6f)
            .build();
}
