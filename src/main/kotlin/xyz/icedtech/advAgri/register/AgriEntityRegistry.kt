package xyz.icedtech.advAgri.register

import net.minecraft.block.entity.BlockEntityType
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.entity.*


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
        HIGH_TEMPERATURE_ELECTROLYTIC_FURNACE_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                "adv_agri:high_temperature_electrolytic_furnace",
                BlockEntityType.Builder.create(
                    HighTemperatureElectrolyticFurnaceEntity(),
                    itemListOfAgri.HIGH_TEMPERATURE_ELECTROLYTIC_FURNACE
                ).build(null)
            )
        PRIMARY_MANAGEMENT_BOX_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                "adv_agri:primary_management_box",
                BlockEntityType.Builder.create(PrimaryManagementBoxEntity(), itemListOfAgri.PRIMARY_MANAGEMENT_BLOCK)
                    .build(null)
            )
        PRIMARY_PUMPS_ENTITY =
            Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                "adv_agri:primary_pumps",
                BlockEntityType.Builder.create(PrimaryPumpsEntity(), itemListOfAgri.PRIMARY_PUMPS).build(null)
            )
    }
}