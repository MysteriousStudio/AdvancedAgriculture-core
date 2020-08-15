package xyz.icedtech.advAgri.extenedTool

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import xyz.icedtech.advAgri.modata.Modata


var group: ItemGroup
    get() {
        return group
    }
    set(value) {
        group = value
    }

val modid = Modata().modid
fun <T> Registry<Any?>.registryItemTool(blockName: String, item: Item) {
    Registry.register(
        Registry.ITEM,
        Identifier(modid, blockName),
        item
    )
}

fun Registry<Any?>.registryBlockItemTool(blockName: String, block: Block) {
    Registry.register(
        Registry.BLOCK,
        Identifier(modid, blockName),
        block
    )
    Registry.register(
        Registry.ITEM,
        Identifier(modid, blockName),
        BlockItem(
            block,
            Item.Settings().group(group).maxCount(64)
        )
    )
}

fun Registry<Any?>.registryBlockItemTool(blockName: String, block: Block, maxCount: Int) {
    Registry.register(
        Registry.BLOCK,
        Identifier(modid, blockName),
        block
    )
    Registry.register(
        Registry.ITEM,
        Identifier(modid, blockName),
        BlockItem(
            block,
            Item.Settings().group(group).maxCount(maxCount)
        )
    )
}

fun Registry<Any?>.registryOreToMainWorldUnderground(
    biome: Biome,
    block: Block,
    size: Int,
    count: Int,
    bottomOffset: Int,
    topOffset: Int,
    maximum: Int
) {
    if (biome.category != Biome.Category.NETHER && biome.category != Biome.Category.THEEND) {
        biome.addFeature(
            GenerationStep.Feature.UNDERGROUND_ORES,
            Feature.ORE.configure(
                OreFeatureConfig(
                    OreFeatureConfig.Target.NATURAL_STONE,
                    block.defaultState,
                    size

                )
            ).createDecoratedFeature(
                Decorator.COUNT_RANGE.configure(
                    RangeDecoratorConfig(
                        count,
                        bottomOffset,
                        topOffset,
                        maximum
                    )
                )
            )
        )
    }
}

