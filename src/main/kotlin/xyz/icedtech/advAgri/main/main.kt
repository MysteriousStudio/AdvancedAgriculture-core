package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.Biomes
import xyz.icedtech.advAgri.ore.AgriAddOre
import xyz.icedtech.advAgri.register.AgriBlockRegistry
import xyz.icedtech.advAgri.register.BambooRegistry
import xyz.icedtech.advAgri.register.RegistryEntity


class Main : ModInitializer {
    override fun onInitialize() {
        var agriRegister = AgriBlockRegistry()
        agriRegister.RegistryAllAgriBlockItem()

        var bambooRegister = BambooRegistry()
        bambooRegister.RegistryBambooItem()
        bambooRegister.RegistryBambooFood()

        var registryEntity = RegistryEntity()
        registryEntity.RegistryAll()

        AgriAddOre().GenerateMainWorldOre(Biomes.DEFAULT)
        RegistryEntryAddedCallback.event(Registry.BIOME).register(
            RegistryEntryAddedCallback { _: Int, _: Identifier?, biome: Biome? ->
                if (biome != null) {
                    AgriAddOre().GenerateMainWorldOre(
                        biome
                    )
                }

            }
        )
    }


}
