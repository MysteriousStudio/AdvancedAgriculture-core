package xyz.icedtech.advAgri.agri.block

import net.minecraft.block.AbstractBlock
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.world.BlockView

class PrimaryManagementBox : BlockWithEntity {
    constructor(settings: AbstractBlock.Settings?) : super(settings)

    override fun createBlockEntity(world: BlockView?): BlockEntity? {
        TODO("Not yet implemented")
    }
}