package tech.icedlab.advagri.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tech.icedlab.advagri.itemfuncutil.ForgingHammerStorage;
import tech.icedlab.advagri.itemfuncutil.ForgingHammerUtil;

import java.util.Objects;


public class ForgingHammer extends Item {



    public ForgingHammer(Settings settings) {
        super(settings);
    }


    //Todo: 2/4/21 11:34 PM
    // User: suibing
    // Aims: Use forging hammer 9 times,then the block will change into 18 plates
    // Desc: As aims
    // Stat: False
    @Override
    @Environment(EnvType.CLIENT)
    public ActionResult useOnBlock(ItemUsageContext context) {

        if (!context.getWorld().isClient) {

            ForgingHammerStorage blockList = ForgingHammerStorage.getINSTANCE();
            Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
            BlockPos blockPos = context.getBlockPos();

            if (!isUnderBlockAnvil(blockPos, context.getWorld()) && matchMetalBlock(block)) {
                return ActionResult.PASS;
            }

            if (matchMetalBlock(block)) {
                Objects.requireNonNull(context.getPlayer()).playSound(SoundEvents.BLOCK_ANVIL_LAND, 0.7F, 1F);
                if (!blockList.containsKey(context.getBlockPos())) {//不存在但是是可敲打方块
                    blockList.put(context.getBlockPos(), 1);
                    return ActionResult.SUCCESS;
                } else if (blockList.get(context.getBlockPos()) > 8) {//存在但是敲打次数超过了9次
                    blockList.remove(blockPos);
                    if (matchMetalBlock(block)) {
                        dropPlate(block, context.getBlockPos(), context.getWorld());
                        context.getPlayer().playSound(SoundEvents.BLOCK_ANVIL_DESTROY, 0.7F, 1F);
                    }
                    return ActionResult.SUCCESS;
                } else {//敲打累增
                    blockList.put(blockPos, blockList.get(context.getBlockPos()) + 1);
                    System.out.println(blockList.get(context.getBlockPos()));
                    return ActionResult.SUCCESS;
                }
            }
        }
        return ActionResult.PASS;
    }

    public boolean matchMetalBlock(Block block) {
        return ForgingHammerUtil.getINSTANCE().isBlockContained(block);
    }

    public void dropPlate(Block block, BlockPos blockPos, World world) {
        if (!world.isClient) {
            world.breakBlock(blockPos, false);
            new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ()).dropStack(new ItemStack(ForgingHammerUtil.getINSTANCE().getPlate(block), 18));
        }
    }

    public boolean isUnderBlockAnvil(BlockPos blockPos, World world) {
        Block getBlock = world.getBlockState(new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).getBlock();
        if (getBlock.equals(Blocks.ANVIL) || getBlock.equals(Blocks.CHIPPED_ANVIL) || getBlock.equals(Blocks.DAMAGED_ANVIL))
            return true;
        return false;
    }
}