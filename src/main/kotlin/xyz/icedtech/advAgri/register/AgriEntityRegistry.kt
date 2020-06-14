package xyz.icedtech.advAgri.register

import net.minecraft.block.entity.BlockEntityType
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.entity.CROP_RACKS_ENTITY
import xyz.icedtech.advAgri.agri.entity.CropRacksEntity
import xyz.icedtech.advAgri.agri.entity.FERMENT_TANK_ENTITY
import xyz.icedtech.advAgri.agri.entity.FermentTankEntity


class AgriEntityRegistry {
    fun registryAllEntity() {
        var itemListOfAgri = AgriBlock()
        FERMENT_TANK_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                "adv_agri:ferment_tank",
                BlockEntityType.Builder.create(FermentTankEntity(), itemListOfAgri.FERMENT_TANK).build(null)
            )
        CROP_RACKS_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                "adv_agri:crop_racks",
                BlockEntityType.Builder.create(CropRacksEntity(), itemListOfAgri.CROP_RACKS).build(null)
            )
    }
}