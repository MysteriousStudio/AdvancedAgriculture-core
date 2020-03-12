package xyz.icedtech.advAgri.register

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata

class AgriItemRegistry {
    private val itemList = AgriGroupItem()
    private val modid = Modata().modid

    fun RegistryAll() {

    }

    fun registerAgriItem(): ItemGroup {
        this.registryItemTool("com_fert", itemList.COM_FERT)
        this.registryItemTool("grass_ash", itemList.GRASS_ASH)
        this.registryItemTool("phos", itemList.PHOS)
        this.registryItemTool("sulfur", itemList.SULFUR)
        this.registryItemTool("zircon", itemList.ZIRCON)
        return itemList.AGRI_ITEM_GROUP
    }

    private fun registryItemTool(blockName: String, item: Item) {
        Registry.register(
            Registry.ITEM,
            Identifier(modid, blockName),
            item
        )
    }
}