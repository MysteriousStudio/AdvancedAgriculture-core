package xyz.icedtech.advAgri.entity

import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock


class RegistryEntity {
    fun RegisterAll() {
        var itemListOfAgri = AgriBlock()
        FERMENT_TANK_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY,
                "adv_agri:ferment_tank",
                BlockEntityType.Builder.create(FermentTankEntity(), itemListOfAgri.FERMENT_TANK).build(null)
            )
        CROP_RACKS_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY,
                "adv_agri:crop_racks",
                BlockEntityType.Builder.create(CropRacksEntity(), itemListOfAgri.CROP_RACKS).build(null)
            )
    }
}