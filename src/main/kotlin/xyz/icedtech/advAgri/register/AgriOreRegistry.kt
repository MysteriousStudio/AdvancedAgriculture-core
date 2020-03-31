package xyz.icedtech.advAgri.register

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.DefaultBiomeFeatures
import xyz.icedtech.advAgri.ore.AgriAddOre


class AgriOreRegistry {
    fun AddOre() {
        DefaultBiomeFeatures.addMineables()
    }
}

