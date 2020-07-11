package xyz.icedtech.advAgri.agri.block

import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.world.BlockView
import xyz.icedtech.advAgri.agri.entity.HighTemperatureElectrolyticFurnaceEntity


class HighTemperatureElectrolyticFurnace : BlockWithEntity {
    constructor(settings: Settings) : super(settings)

    override fun createBlockEntity(world: BlockView?): BlockEntity? {
        return HighTemperatureElectrolyticFurnaceEntity()
    }
}