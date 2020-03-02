package xyz.icedtech.advAgri.agri.block


import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView
import net.minecraft.world.World
import xyz.icedtech.advAgri.entity.FermentTankEntity


class FermentTankBlock(settings: Settings) : BlockWithEntity(settings) {
    override fun onBlockAction(
        blockState: BlockState?,
        world: World?,
        blockPos: BlockPos?,
        type: Int,
        data: Int
    ): Boolean {
        return true
    }

    override fun getRenderType(state: BlockState?): BlockRenderType {
        return BlockRenderType.MODEL
    }

    override fun createBlockEntity(view: BlockView?): BlockEntity? {
        return FermentTankEntity()
    }
}