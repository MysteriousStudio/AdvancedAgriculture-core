package tech.icedlab.advagri.item;

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
    public ActionResult useOnBlock(ItemUsageContext context) {

        ForgingHammerStorage blockHashMap = ForgingHammerStorage.getINSTANCE();

        Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();
        BlockPos blockPos = context.getBlockPos();

        if (!isUnderBlockAnvil(blockPos, context.getWorld()) && matchMetalBlock(block)) {
            return ActionResult.PASS;
        }

        if (matchMetalBlock(block)) {

            Objects.requireNonNull(context.getPlayer()).playSound(SoundEvents.BLOCK_ANVIL_LAND, 0.7F, 1F);

            if (!blockHashMap.containsKey(context.getBlockPos())) {//不存在但是是可敲打方块
                blockHashMap.put(context.getBlockPos(), 1);
                return ActionResult.SUCCESS;
            } else if (blockHashMap.get(context.getBlockPos()) > 18) {//存在但是敲打次数超过了9次
                blockHashMap.remove(blockPos);
                if (matchMetalBlock(block)) {
                    new ItemEntity(context.getWorld(), blockPos.getX(), blockPos.getY(), blockPos.getZ()).dropStack(dropPlate(block));
                    context.getWorld().breakBlock(blockPos, false);
                    context.getPlayer().playSound(SoundEvents.BLOCK_ANVIL_DESTROY, 1F, 1F);
                }
                return ActionResult.SUCCESS;
            } else {//敲打累增
                blockHashMap.put(blockPos, blockHashMap.get(context.getBlockPos()) + 1);
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }

    public boolean matchMetalBlock(Block block) {
        return ForgingHammerUtil.getINSTANCE().isBlockContained(block);
    }

    public ItemStack dropPlate(Block block) {
        return new ItemStack(ForgingHammerUtil.getINSTANCE().getPlate(block), 18);
    }

    public boolean isUnderBlockAnvil(BlockPos blockPos, World world) {
        Block getBlock = world.getBlockState(new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).getBlock();
        if (getBlock.equals(Blocks.ANVIL) || getBlock.equals(Blocks.CHIPPED_ANVIL) || getBlock.equals(Blocks.DAMAGED_ANVIL))
            return true;
        return false;
    }
}