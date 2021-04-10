package tech.icedlab.advagri.itemfuncutil;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import tech.icedlab.advagri.block.AdvAgriBlocks;
import tech.icedlab.advagri.item.AdvAgriItems;

import java.util.HashMap;

public class ForgingHammerUtil {

    private static final ForgingHammerUtil INSTANCE = new ForgingHammerUtil();
    private static HashMap<Block, Integer> blockIntegerHashMap = new HashMap<>();
    private static HashMap<Block, Item> blockItemHashMap = new HashMap<>();

    private ForgingHammerUtil() {
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().ALUMINUM_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().BRONZE_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().COPPER_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().LEAD_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().SILVER_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().NICKEL_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().ZINC_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().STEEL_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().TUNGSTEN_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().TITANIUM_BLOCK, 1);
        blockIntegerHashMap.put(AdvAgriBlocks.getInstance().TIN_BLOCK, 1);

        blockIntegerHashMap.put(Blocks.GOLD_BLOCK, 1);
        blockIntegerHashMap.put(Blocks.IRON_BLOCK, 1);


        blockItemHashMap.put(AdvAgriBlocks.getInstance().ALUMINUM_BLOCK, AdvAgriItems.ALUMINUM_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().BRONZE_BLOCK, AdvAgriItems.BRONZE_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().COPPER_BLOCK, AdvAgriItems.COPPER_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().LEAD_BLOCK, AdvAgriItems.LEAD_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().SILVER_BLOCK, AdvAgriItems.SILVER_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().NICKEL_BLOCK, AdvAgriItems.NICKEL_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().ZINC_BLOCK, AdvAgriItems.ZINC_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().STEEL_BLOCK, AdvAgriItems.STEEL_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().TUNGSTEN_BLOCK, AdvAgriItems.TUNGSTEN_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().TITANIUM_BLOCK, AdvAgriItems.TITANIUM_PLATE);
        blockItemHashMap.put(AdvAgriBlocks.getInstance().TIN_BLOCK, AdvAgriItems.TIN_PLATE);

        blockItemHashMap.put(Blocks.GOLD_BLOCK, AdvAgriItems.GOLD_PLATE);
        blockItemHashMap.put(Blocks.IRON_BLOCK, AdvAgriItems.IRON_PLATE);
    }

    public static boolean isBlockContained(Block block) {
        return blockIntegerHashMap.containsKey(block);
    }

    public static Item getPlate(Block block) {
        return blockItemHashMap.get(block);
    }

    public static ForgingHammerUtil getINSTANCE() {
        return INSTANCE;
    }
}
