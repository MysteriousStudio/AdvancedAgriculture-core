package tech.icedlab.advagri.itemfuncutil;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import tech.icedlab.advagri.block.AdvAgriBlocks;
import tech.icedlab.advagri.item.AdvAgriItems;

import java.util.HashMap;
import java.util.HashSet;

public class ForgingHammerUtil {

    private static final ForgingHammerUtil INSTANCE = new ForgingHammerUtil();
    private final HashSet<Block> blockHashSet = new HashSet<>();
    private final HashMap<Block, Item> blockItemHashMap = new HashMap<>();

    private ForgingHammerUtil() {
        blockHashSet.add(AdvAgriBlocks.getInstance().ALUMINUM_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().BRONZE_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().COPPER_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().LEAD_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().SILVER_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().NICKEL_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().ZINC_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().STEEL_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().TUNGSTEN_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().TITANIUM_BLOCK);
        blockHashSet.add(AdvAgriBlocks.getInstance().TIN_BLOCK);

        blockHashSet.add(Blocks.GOLD_BLOCK);
        blockHashSet.add(Blocks.IRON_BLOCK);


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

    public boolean isBlockContained(Block block) {
        return blockHashSet.contains(block);
    }

    public Item getPlate(Block block) {
        return blockItemHashMap.get(block);
    }

    public static ForgingHammerUtil getINSTANCE() {
        return INSTANCE;
    }
}
