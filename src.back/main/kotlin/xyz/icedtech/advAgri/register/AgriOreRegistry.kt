package xyz.icedtech.advAgri.register

import net.minecraft.block.Blocks
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig


/*
class AgriOreRegistry {
    var ORE_WOOL_OVERWORLD: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                Blocks.WHITE_WOOL.defaultState,
                9
            )
        ) // vein size
        .decorate(
            Decorator.RANGE.configure(
                RangeDecoratorConfig(
                    0,  // bottom offset
                    0,  // min y level
                    64
                )
            )
        ) // max y level
        .spreadHorizontally()
        .repeat(20) // number of veins per chunk

    fun AgriOreRegistry() {

    }

}*/
