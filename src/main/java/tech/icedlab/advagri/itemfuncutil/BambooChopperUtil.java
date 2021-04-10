package tech.icedlab.advagri.itemfuncutil;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import java.util.ArrayList;

public class BambooChopperUtil {
    private static final BambooChopperUtil INSTANCE = new BambooChopperUtil();

    private final ArrayList<Block> blocksArrayList = new ArrayList<>();

    private BambooChopperUtil() {
        blocksArrayList.add(Blocks.BAMBOO);
        blocksArrayList.add(Blocks.TALL_GRASS);
        blocksArrayList.add(Blocks.GRASS);
        blocksArrayList.add(Blocks.SEAGRASS);
        blocksArrayList.add(Blocks.TALL_SEAGRASS);
        blocksArrayList.add(Blocks.FERN);
        blocksArrayList.add(Blocks.LARGE_FERN);
        blocksArrayList.add(Blocks.SUGAR_CANE);
        blocksArrayList.add(Blocks.VINE);
        blocksArrayList.add(Blocks.WEEPING_VINES_PLANT);
        blocksArrayList.add(Blocks.TWISTING_VINES_PLANT);
        blocksArrayList.add(Blocks.WEEPING_VINES);
        blocksArrayList.add(Blocks.TWISTING_VINES);
        blocksArrayList.add(Blocks.KELP);
        blocksArrayList.add(Blocks.KELP_PLANT);
    }

    public boolean findElement(BlockState blockState) {
        return blocksArrayList.contains(blockState.getBlock());
    }

    public static BambooChopperUtil getInstance() {
        return INSTANCE;
    }


}
