package xyz.icedtech.advAgri.register;

import net.minecraft.block.Block;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import xyz.icedtech.advAgri.agri.AgriBlock;

public class OreConfigure {

    public static final AgriBlock BLOCK_LIST = new AgriBlock();


    public static ConfiguredFeature<?, ?> ORE_ALUMINIUM;

    public OreConfigure() {
        ORE_ALUMINIUM = FastAddConfigure(BLOCK_LIST.ALUMINIUM_BLOCK, 4, 16, 0, 0, 24);
    }


    private ConfiguredFeature<?, ?> FastAddConfigure(Block block, Integer size, Integer count, Integer bottomOffset, Integer topOffset, Integer maximum) {
        return net.minecraft.world.gen.feature.Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, block.getDefaultState(), size)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(count, bottomOffset, topOffset, maximum)));
    }
}
