package xyz.icedtech.advAgri.ore


import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.block.Block
import net.minecraft.util.Identifier
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import xyz.icedtech.advAgri.agri.AgriBlock


class AgriAddOre {
    private var agri = AgriBlock()
    fun handleBiome(biome: Biome) {
        this.registryOreInMainWorldNormalBiome(biome, agri.SULPHUR_ORE, 8, 10, 0, 20, 10)
        this.registryOreInMainWorldNormalBiome(biome,agri.PHOS_ORE,8,10,30,90,5)
        this.registryOreInMainWorldNormalBiome(biome, agri.QUARRY, 12, 8, 40, 90, 10)
        this.registryOreInMainWorldNormalBiome(biome, agri.SILT, 30, 2, 40, 70, 5)

    }

    private fun registryOreInMainWorldNormalBiome(
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
