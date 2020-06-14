package xyz.icedtech.advAgri.agri.entity

import net.minecraft.block.entity.BlockEntity
import java.util.function.Supplier

class HighTemperatureElectrolyticFurnaceEntity :
    BlockEntity(HIGH_TEMPERATURE_ELECTROLYTIC_FURNACE_ENTITY),
    Supplier<HighTemperatureElectrolyticFurnaceEntity> {

    override fun get(): HighTemperatureElectrolyticFurnaceEntity {
        return this
    }
}