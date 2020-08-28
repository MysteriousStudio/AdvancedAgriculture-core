package xyz.icedtech.advAgri.main

import net.fabricmc.api.ModInitializer
import xyz.icedtech.advAgri.register.*


class Main : ModInitializer {
    private val addOre = AgriOreRegistry()
    override fun onInitialize() {
        //注册物品
        AgriItemRegistry().registryAll()
        //注册食物
        AgriFoodRegistry().registryAllFood()
        //注册工具
        AgriToolRegistry().registryTool()
        //注册方块
        AgriBlockRegistry(AgriItemRegistry().itemList).registryAllAgriBlockItem()
        //注册实体
        AgriEntityRegistry().registryAllEntity()
        //注册矿物
        AgriOreRegistry().registryAll()
    }
}
