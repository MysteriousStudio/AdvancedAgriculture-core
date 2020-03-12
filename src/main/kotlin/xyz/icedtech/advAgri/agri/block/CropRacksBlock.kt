package xyz.icedtech.advAgri.agri.block

import net.minecraft.block.Block
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.EntityContext
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import xyz.icedtech.advAgri.agri.entity.CropRacksEntity

class CropRacksBlock(settings: Settings) : BlockWithEntity(settings) {
    var SHAPE1 = Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0)

    override fun getOutlineShape(
        state: BlockState?,
        view: BlockView?,
        pos: BlockPos?,
        ePos: EntityContext?
    ): VoxelShape {
        return this.SHAPE1
    }

    override fun getRenderType(state: BlockState?): BlockRenderType {
        return BlockRenderType.MODEL
    }

    override fun createBlockEntity(view: BlockView?): BlockEntity? {
       return CropRacksEntity()
    }
}