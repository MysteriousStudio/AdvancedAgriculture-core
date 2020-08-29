package xyz.icedtech.advAgri.register

import net.minecraft.block.Block
import net.minecraft.util.Identifier
import net.minecraft.util.registry.BuiltinRegistries
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.modata.Modata


class AgriOreRegistry {

    private val modid = Modata().modid

    private val blockItemList = AgriBlock()

    var ALUMINIUM_ORE = registryOreToMainWorldUnderground(blockItemList.ALUMINIUM_ORE, 8, 20, 0, 0, 64)
    var LEAD_ORE = registryOreToMainWorldUnderground(blockItemList.LEAD_ORE, 4, 15, 0, 0, 32)
    var COPPER_ORE = registryOreToMainWorldUnderground(blockItemList.COPPER_ORE, 16, 20, 0, 0, 64)
    var ZINC_ORE = registryOreToMainWorldUnderground(blockItemList.ZINC_ORE, 8, 20, 0, 0, 32)
    var TIN_ORE = registryOreToMainWorldUnderground(blockItemList.TIN_ORE, 16, 15, 0, 0, 64)
    var SILVER_ORE = registryOreToMainWorldUnderground(blockItemList.SILVER_ORE, 6, 5, 0, 0, 16)
    var PHOS_ORE = registryOreToMainWorldUnderground(blockItemList.PHOS_ORE, 16, 15, 0, 0, 64)
    var SULPHUR_ORE = registryOreToMainWorldUnderground(blockItemList.SULPHUR_ORE, 8, 10, 0, 0, 32)
    var TUNGSTEN_ORE = registryOreToMainWorldUnderground(blockItemList.TUNGSTEN_ORE, 4, 2, 0, 0, 16)


    fun registryAll() {
        registryTool("ore_aluminium", ALUMINIUM_ORE)
        registryTool("ore_lead", LEAD_ORE)
        registryTool("ore_copper", COPPER_ORE)
        registryTool("ore_zinc", ZINC_ORE)
        registryTool("ore_tin", TIN_ORE)
        registryTool("ore_silver", SILVER_ORE)
        registryTool("ore_phos", PHOS_ORE)
        registryTool("ore_sulphur", SULPHUR_ORE)
        registryTool("ore_tungsten", TUNGSTEN_ORE)
    }

    private fun registryTool(
        path: String,
        configuredFeature: ConfiguredFeature<*, *>?
    ) {
        Registry.register(
            BuiltinRegistries.CONFIGURED_FEATURE,
            Identifier(modid, path),
            configuredFeature
        )
    }


    private fun registryOreToMainWorldUnderground(
        block: Block,
        size: Int,
        count: Int,
        bottomOffset: Int,
        topOffset: Int,
        maximum: Int
    ): ConfiguredFeature<*, *>? {
        return Feature.ORE
            .configure(
                OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    block.defaultState,
                    size
                )
            )
            .decorate(
                Decorator.RANGE.configure(RangeDecoratorConfig(bottomOffset, topOffset, maximum))
                    .spreadHorizontally()
                    .repeat(count)
            )
    }
}

