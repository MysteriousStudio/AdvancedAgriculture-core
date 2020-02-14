package xyz.icedtech.advAgri.AgriMain

import net.fabricmc.api.ModInitializer
import xyz.icedtech.advAgri.register.AgriRegister
import xyz.icedtech.advAgri.register.BambooRegister


class Main : ModInitializer {
    override fun onInitialize() {
        var agriRegister = AgriRegister()
        agriRegister.registerAgriItem()
        agriRegister.registerAgriBlockItem()

        var bambooRegister = BambooRegister()
        bambooRegister.registerBambooItem()
        bambooRegister.registerBambooFood()
    }
}
