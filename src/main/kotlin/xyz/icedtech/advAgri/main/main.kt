package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
import xyz.icedtech.advAgri.register.AgriBlockRegistry
import xyz.icedtech.advAgri.register.AgriEntityRegistry
import xyz.icedtech.advAgri.register.AgriItemRegistry
import xyz.icedtech.advAgri.register.AgriOreRegistry


class Main : ModInitializer {
    private val addOre = AgriOreRegistry()
    override fun onInitialize() {
        //注册物品
        var agriItemRegistry = AgriItemRegistry()
        agriItemRegistry.registryAll()
        //注册方块
        var agriBlockRegister = AgriBlockRegistry(agriItemRegistry.itemList)
        agriBlockRegister.registryAllAgriBlockItem()
        //注册实体
        var agriEntityRegister = AgriEntityRegistry()
        agriEntityRegister.registryAllEntity()
        //注册矿物
        var agriOreRegister = AgriOreRegistry()
        agriOreRegister.registryAll()
    }
}
