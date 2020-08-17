package xyz.icedtech.advAgri.agri

import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import xyz.icedtech.advAgri.extenedTool.FastAddFood

class AgriFood {
    var STRAWBERRY = FastAddFood(2, 0.1F, true)
    var YAM_BEAN = FastAddFood(3, 0.15F, true)
    var WATER_CHESTNUT = FastAddFood(1, 0.05F, true)
    var ROMAINE_LETTUCE = FastAddFood(1, 0.1F, true)
    var RASPBERRY=FastAddFood(2, 0.1F, true)
    val GREEN_APPLE_FOOD = Item(
        Item.Settings().food(
                FoodComponent
                    .Builder()
                    .hunger(4)
                    .saturationModifier(0.3f)
                    .build()
            ).maxCount(64)
    )
}