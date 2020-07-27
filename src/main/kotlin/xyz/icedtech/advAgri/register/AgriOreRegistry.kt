package xyz.icedtech.advAgri.register

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.block.Block
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import xyz.icedtech.advAgri.agri.AgriBlock


class AgriOreRegistry {

    private val blockItemList = AgriBlock()
    fun registryAll() {
        Registry.BIOME.forEach(::registryUnderGroundOre)
        //Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME)
            .register(RegistryEntryAddedCallback { i: Int, identifier: Identifier?, biome: Any? ->
                registryUnderGroundOre(biome as Biome)
            })
    }

    private fun registryUnderGroundOre(biome: Biome) {
        registryOreToMainWorldUnderground(biome, blockItemList.PHOS_ORE, 17, 20, 0, 0, 64)
        registryOreToMainWorldUnderground(biome, blockItemList.SULPHUR_ORE, 8, 10, 0, 0, 32)
    }

    private fun registryOreToMainWorldUnderground(
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
}

