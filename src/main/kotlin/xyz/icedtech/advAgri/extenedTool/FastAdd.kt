package xyz.icedtech.advAgri.extenedTool

import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup


fun FastAddItem(ItemGroup: ItemGroup, Count: Int): Item {
    return Item(Item.Settings().group(ItemGroup).maxCount(Count))
}

fun FastAddFood(hunger: Int, saturationModifier: Float, isSnake: Boolean, maxCount: Int): Item {
    if (isSnake) {
        return Item(
            Item.Settings().food(
                FoodComponent
                    .Builder()
                    .snack()
                    .hunger(hunger)
                    .saturationModifier(saturationModifier)
                    .build()
            ).maxCount(maxCount)
        )
    }
    return Item(
        Item.Settings().food(
            FoodComponent
                .Builder()
                .hunger(hunger)
                .saturationModifier(saturationModifier)
                .build()
        ).maxCount(maxCount)
    )
}

fun FastAddFood(hunger: Int, saturationModifier: Float, isSnake: Boolean): Item {
    if (isSnake) {
        return Item(
            Item.Settings().food(
                FoodComponent
                    .Builder()
                    .snack()
                    .hunger(hunger)
                    .saturationModifier(saturationModifier)
                    .build()
            ).maxCount(64).group(ItemGroup.FOOD)
        )
    }
    return Item(
        Item.Settings().food(
            FoodComponent
                .Builder()
                .hunger(hunger)
                .saturationModifier(saturationModifier)
                .build()
        ).maxCount(64).group(ItemGroup.FOOD)
    )
}
