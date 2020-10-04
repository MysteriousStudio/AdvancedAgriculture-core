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

//fun FastAddOre(path: String, configuredFeature: ConfiguredFeature<*, *>?) {
//    Registry.register(
//        BuiltinRegistries.CONFIGURED_FEATURE,
//        Identifier("adv_agri", path),
//        configuredFeature
//    )
//}

/*
fun FastAddConfiguredFeature(): ConfiguredFeature<*, *>? {
    return Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                Blocks.WHITE_WOOL.defaultState,
                9
            )
        ) // vein size
        .decorate(
            Decorator.RANGE.configure(
                RangeDecoratorConfig(
                    0,  // bottom offset
                    0,  // min y level
                    64
                )
            )
        ) // max y level
        .spreadHorizontally()
        .repeat(20) // number of veins per chunk
}*/
