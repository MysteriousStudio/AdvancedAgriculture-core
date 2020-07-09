package xyz.icedtech.advAgri.material

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricMaterialBuilder
import net.minecraft.block.MaterialColor


class AgriMaterial {
    val IRON_SHELL =
        FabricMaterialBuilder(MaterialColor.LIME).destroyedByPiston().build()
    val PLANT_CROP =
        FabricMaterialBuilder(MaterialColor.LIME).lightPassesThrough().allowsMovement().burnable().notSolid().build()
}