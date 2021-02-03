package xyz.icedtech.advagri.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import xyz.icedtech.advagri.item.AdvAgriToolsAndWeapons;

import java.util.Random;

public class SulphurOre extends Block {

    public Integer max = 15;

    public void setMax(Integer max) {
        this.max = max;
    }

    public SulphurOre(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        super.onBreak(world, pos, state, player);
        int rad = new Random().nextInt(100);

        if (!player.isCreative()) {
            if (rad <= max) {
                if (!player.getMainHandStack().isItemEqual(new ItemStack(AdvAgriToolsAndWeapons.getInstance().BAMBOO_DRILL_ROD))) {
                    world.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 2F, Explosion.DestructionType.BREAK);
                }
            }
        }
    }
}
