package xyz.icedtech.advAgri.register

import xyz.icedtech.advAgri.agri.AgriTool

class AgriToolRegistry : AgriItemRegistry() {
    private val tooList = AgriTool()
    fun registryTool() {
        super.registryItemTool("bamboo_chopper", tooList.BAMBOO_CHOPPER)
        super.registryItemTool("bamboo_drill_rod", tooList.BAMBOO_DRILL_ROD)
    }
}