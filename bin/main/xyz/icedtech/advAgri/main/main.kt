package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
<<<<<<< HEAD
import xyz.icedtech.advAgri.entity.RegistryEntity
=======
>>>>>>> master
import xyz.icedtech.advAgri.register.AgriRegister
import xyz.icedtech.advAgri.register.BambooRegister


class Main : ModInitializer {
    override fun onInitialize() {
        var agriRegister = AgriRegister()
        agriRegister.RegistAll()

        var bambooRegister = BambooRegister()
        bambooRegister.registerBambooItem()
        bambooRegister.registerBambooFood()
<<<<<<< HEAD

        var registryEntity = RegistryEntity()
        registryEntity.RegisterAll()
=======
>>>>>>> master
    }
}
