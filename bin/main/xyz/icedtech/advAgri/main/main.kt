package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
import xyz.icedtech.advAgri.entity.RegistryEntity
import xyz.icedtech.advAgri.register.AgriRegister
import xyz.icedtech.advAgri.register.BambooRegister


class Main : ModInitializer {
    override fun onInitialize() {
        var agriRegister = AgriRegister()
        agriRegister.RegistAll()

        var bambooRegister = BambooRegister()
        bambooRegister.registerBambooItem()
        bambooRegister.registerBambooFood()

        var registryEntity = RegistryEntity()
        registryEntity.RegisterAll()
    }
}
