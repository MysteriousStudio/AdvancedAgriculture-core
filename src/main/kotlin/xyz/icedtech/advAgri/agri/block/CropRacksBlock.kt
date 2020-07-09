package xyz.icedtech.advAgri.agri.block

import net.minecraft.block.*
import net.minecraft.block.entity.BlockEntity

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
        ePos: ShapeContext?
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