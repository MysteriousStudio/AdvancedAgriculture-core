package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.Biomes
import xyz.icedtech.advAgri.ore.AgriAddOre
import xyz.icedtech.advAgri.register.AgriBlockRegistry
import xyz.icedtech.advAgri.register.RegistryEntity


class Main : ModInitializer {
    override fun onInitialize() {
        var agriRegister = AgriBlockRegistry()
        agriRegister.RegistryAllAgriBlockItem()

        var registryEntity = RegistryEntity()
        registryEntity.registryAllEntity()

        AgriAddOre().GenerateMainWorldOre(Biomes.DEFAULT)
    }
}
