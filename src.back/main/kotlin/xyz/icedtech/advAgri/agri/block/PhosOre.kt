package xyz.icedtech.advAgri.agri.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.state.StateManager
import net.minecraft.state.property.BooleanProperty
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView
import net.minecraft.world.World


class PhosOre : Block {
    private val HARDENED = BooleanProperty.of("hardened")

    constructor(settings: Settings?) : super(settings) {
        defaultState = getStateManager().defaultState.with(HARDENED, false)
    }

    override fun appendProperties(stateManager: StateManager.Builder<Block?, BlockState?>) {
        stateManager.add(HARDENED)
    }

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos?,
        player: PlayerEntity?,
        hand: Hand?,
        hit: BlockHitResult?
    ): ActionResult? {
        world.setBlockState(pos, state.with(HARDENED, true))
        return ActionResult.SUCCESS
    }

    fun getHardness(state: BlockState?, world: BlockView?, pos: BlockPos?): Float {
        val hardened = state?.get(HARDENED)
        return if (hardened!!) 2.0f else 0.5f
    }

}