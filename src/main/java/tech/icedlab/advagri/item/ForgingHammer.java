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
import tech.icedlab.advagri.block.AdvAgriBlocks;
import tech.icedlab.advagri.itemfuncutil.ForgingHammerStorage;

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
        return block == AdvAgriBlocks.getInstance().ALUMINUM_BLOCK
                || block == AdvAgriBlocks.getInstance().BRONZE_BLOCK
                || block == AdvAgriBlocks.getInstance().COPPER_BLOCK
                || block == AdvAgriBlocks.getInstance().LEAD_BLOCK
                || block == AdvAgriBlocks.getInstance().SILVER_BLOCK
                || block == AdvAgriBlocks.getInstance().NICKEL_BLOCK
                || block == AdvAgriBlocks.getInstance().ZINC_BLOCK
                || block == AdvAgriBlocks.getInstance().STEEL_BLOCK
                || block == AdvAgriBlocks.getInstance().TUNGSTEN_BLOCK
                || block == AdvAgriBlocks.getInstance().TITANIUM_BLOCK
                || block == AdvAgriBlocks.getInstance().TIN_BLOCK
                || block == Blocks.GOLD_BLOCK
                || block == Blocks.IRON_BLOCK;
    }

    public ItemStack dropPlate(Block block) {
        AdvAgriBlocks advAgriBlocks = AdvAgriBlocks.getInstance();

        if (Objects.equals(advAgriBlocks.ALUMINUM_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.ALUMINUM_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.BRONZE_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.BRONZE_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.COPPER_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.COPPER_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.LEAD_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.LEAD_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.SILVER_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.SILVER_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.NICKEL_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.NICKEL_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.ZINC_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.ZINC_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.STEEL_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.STEEL_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.TUNGSTEN_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.TUNGSTEN_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.TITANIUM_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.TITANIUM_PLATE, 18);
        } else if (Objects.equals(advAgriBlocks.TIN_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.TITANIUM_PLATE, 18);
        } else if (Objects.equals(Blocks.IRON_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.IRON_PLATE, 18);
        } else if (Objects.equals(Blocks.GOLD_BLOCK, block)) {
            return new ItemStack(AdvAgriItems.GOLD_PLATE, 18);
        } else {
            throw new IllegalStateException("Unexpected value: " + block.toString());
        }
    }

    public boolean isUnderBlockAnvil(BlockPos blockPos, World world) {
        Block getBlock = world.getBlockState(new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).getBlock();
        if (getBlock.equals(Blocks.ANVIL) || getBlock.equals(Blocks.CHIPPED_ANVIL) || getBlock.equals(Blocks.DAMAGED_ANVIL))
            return true;
        return false;
    }
}