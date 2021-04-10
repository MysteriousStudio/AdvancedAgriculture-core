package tech.icedlab.advagri.itemfuncutil;

import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

public class ForgingHammerStorage {
    private static ForgingHammerStorage INSTANCE = new ForgingHammerStorage();

    private static HashMap<BlockPos, Integer> blockPosIntegerHashMap = new HashMap<>(64);

    private ForgingHammerStorage() {
    }

    public static ForgingHammerStorage getINSTANCE() {
        return INSTANCE;
    }

    public void put(BlockPos blockPos, Integer count) {
        blockPosIntegerHashMap.put(blockPos, count);
    }

    public void remove(BlockPos blockPos) {
        blockPosIntegerHashMap.remove(blockPos);
    }

    public boolean containsKey(BlockPos blockPos) {
        return blockPosIntegerHashMap.containsKey(blockPos);
    }

    public Integer get(BlockPos blockPos) {
        return blockPosIntegerHashMap.get(blockPos);
    }

}
