package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
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
    }
}
