package xyz.icedtech.advAgri.register;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import xyz.icedtech.advAgri.agri.AgriBlock;

public class AgriOreRegistryJava {
    private static AgriBlock blockList;

    public void registryAll() {
        //Loop over existing biomes
        Registry.BIOME.forEach(this::registry);

        //Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> registry(biome));
    }

    private void registry(Biome biome) {
        registryOre(biome, blockList.getSULPHUR_ORE(), 8, 10, 0, 0, 32);

    }

    private void registryOre(Biome biome, Block block, int size, int count, int bottomOffset, int topOffset, int maximum) {
        if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                            new OreFeatureConfig(
                                    OreFeatureConfig.Target.NATURAL_STONE,
                                    block.getDefaultState(),
                                    size //Ore vein size
                            )).createDecoratedFeature(
                            Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                                    count, //Number of veins per chunk
                                    bottomOffset, //Bottom Offset
                                    topOffset, //Min y level
                                    maximum //Max y level
                            ))));
        }
    }
}
