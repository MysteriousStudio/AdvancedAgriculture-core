package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.block.Blocks
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.AgriItem
import xyz.icedtech.advAgri.register.*


open class Main : ModInitializer {


    override fun onInitialize() {

        //注册物品
        AgriItemRegistry().registryAll()
        //注册方块
        AgriBlockRegistry(AgriItemRegistry().itemList).registryAllAgriBlockItem()
        //注册食物
        AgriFoodRegistry().registryAllFood()
        //注册工具
        AgriToolRegistry().registryTool()
        //注册实体
        AgriEntityRegistry().registryAllEntity()

        Registry.BIOME.forEach(::handleBiome)

        RegistryEntryAddedCallback.event<Biome>(Registry.BIOME)
            .register(RegistryEntryAddedCallback { i: Int, identifier: Identifier?, biome: Biome ->
                handleBiome(
                    biome
                )
            })
    }

    open fun handleBiome(biome: Biome) {
        if (biome.category != Biome.Category.NETHER && biome.category != Biome.Category.THEEND) {
            addFeature(biome)
        }
    }

    fun addFeature(biome: Biome) {
        val blockItemList = AgriBlock()

        return biome.addFeature(
            GenerationStep.Feature.UNDERGROUND_ORES,
            Feature.ORE.configure(
                OreFeatureConfig(
                    OreFeatureConfig.Target.NATURAL_STONE,
                    blockItemList.ALUMINIUM_ORE.defaultState,
                    8 //Ore vein size
                )
            ).createDecoratedFeature(
                Decorator.COUNT_RANGE.configure(
                    RangeDecoratorConfig(
                        8,  //Number of veins per chunk
                        0,  //Bottom Offset
                        0,  //Min y level
                        64 //Max y level
                    )
                )
            )
        )
    }
}
