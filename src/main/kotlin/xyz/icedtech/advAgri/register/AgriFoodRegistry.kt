package xyz.icedtech.advAgri.register

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriFood
import xyz.icedtech.advAgri.modata.Modata

class AgriFoodRegistry {

    private val modid = Modata().modid
    private val foodList = AgriFood()
    fun registryAllFood() {
        this.registryFoodTool("strawberry", foodList.STRAWBERRY)
        this.registryFoodTool("yam_bean", foodList.YAM_BEAN)
        this.registryFoodTool("water_chestnut", foodList.WATER_CHESTNUT)
        this.registryFoodTool("romaine_lettuce", foodList.ROMAINE_LETTUCE)
        this.registryFoodTool("raspberry", foodList.RASPBERRY)
    }

    private fun registryFoodTool(foodName: String, foodItem: Item) {
        Registry.register(
            Registry.ITEM,
            Identifier(modid, foodName),
            foodItem
        )
    }
}