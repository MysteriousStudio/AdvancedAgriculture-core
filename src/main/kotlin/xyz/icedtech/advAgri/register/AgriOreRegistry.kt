package xyz.icedtech.advAgri.register

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import xyz.icedtech.advAgri.ore.AgriAddOre


class AgriOreRegistry {
    fun onInitialize() {
        // Registry.BIOME.forEach(
        //   AgriAddOre().handleBiome(Biome)
        //)
        //RegistryEntryAddedCallback.event<Biome>(Registry.BIOME)
        //  .register(RegistryEntryAddedCallback { i: Int, identifier: Identifier?, biome: Any? ->
        //    AgriAddOre().handleBiome(biome as Biome)
        //})
    }
}

