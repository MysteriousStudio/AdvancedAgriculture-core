package xyz.icedtech.advAgri.agri.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.EntityContext
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView

class CropRacksBlock(settings: Settings) : Block(settings) {
    var SHAPE1 = Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0)


    override fun getOutlineShape(
        state: BlockState?,
        view: BlockView?,
        pos: BlockPos?,
        ePos: EntityContext?
    ): VoxelShape {
        return this.SHAPE1
    }
}