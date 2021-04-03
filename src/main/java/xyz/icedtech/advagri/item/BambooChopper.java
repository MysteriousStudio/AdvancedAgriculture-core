package xyz.icedtech.advagri.item;

import net.fabricmc.fabric.api.tag.FabricTag;
import net.fabricmc.fabric.impl.tag.extension.FabricTagHooks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BambooChopper extends Item {
    public BambooChopper(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        Direction minerFacing = miner.getHorizontalFacing();
        if (minerFacing.equals(Direction.EAST)) {
            //Z-2,X
            breakIfEAST(pos, state, world);
        } else if (minerFacing.equals(Direction.NORTH)) {
            //X-2,Z
            breakIfNORTH(pos, state, world);
        } else if (minerFacing.equals(Direction.SOUTH)) {
            //X+2,Z
            breakIfSOUTH(pos, state, world);
        } else if (minerFacing.equals(Direction.WEST)) {
            //Z+2,X
            breakIfWEST(pos, state, world);
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    private void breakIfEAST(BlockPos blockPos, BlockState state, World world) {
        for (int X = 0; X <= 4; X++) {
            for (int Z = -2; Z <= 2; Z++) {
                if (matchBlock(state))
                    world.breakBlock(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z), true);
            }
        }
    }

    private void breakIfNORTH(BlockPos blockPos, BlockState state, World world) {
        for (int X = -2; X <= 2; X++) {
            for (int Z = 0; Z >= -4; Z--) {
                if (matchBlock(state))
                    world.breakBlock(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z), true);
            }
        }
    }

    private void breakIfSOUTH(BlockPos blockPos, BlockState state, World world) {
        for (int X = 2; X >= -2; X--) {
            for (int Z = 0; Z <= 4; Z++) {
                if (matchBlock(state))
                    world.breakBlock(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z), true);
            }
        }
    }

    private void breakIfWEST(BlockPos blockPos, BlockState state, World world) {
        for (int X = 0; X >= -4; X--) {
            for (int Z = 2; Z >= -2; Z--) {
                if (matchBlock(state))
                    world.breakBlock(new BlockPos(blockPos.getX() + X, blockPos.getY(), blockPos.getZ() + Z), true);
            }
        }
    }

    private boolean matchBlock(BlockState blockState) {
        if (blockState.getBlock().toString().equals(Blocks.BAMBOO.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.TALL_GRASS.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.GRASS.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.FERN.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.LARGE_FERN.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.SUGAR_CANE.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.VINE.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.WEEPING_VINES_PLANT.toString())) return true;
        if (blockState.getBlock().toString().equals(Blocks.TWISTING_VINES_PLANT.toString())) return true;

        return false;
    }
}
