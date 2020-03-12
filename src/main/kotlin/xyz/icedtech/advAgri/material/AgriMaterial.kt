package xyz.icedtech.advAgri.material

import net.minecraft.block.Material
import net.minecraft.block.MaterialColor
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.block.FabricMaterialBuilder


class AgriMaterial {
    val IRON_SHELL =
        FabricMaterialBuilder(MaterialColor.AIR).destroyedByPiston().requiresTool().build()
    val PLANT_CROP =
        FabricMaterialBuilder(MaterialColor.AIR).lightPassesThrough().allowsMovement().burnable().notSolid().build()
}