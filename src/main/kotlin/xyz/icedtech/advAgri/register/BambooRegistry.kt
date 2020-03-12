package xyz.icedtech.advAgri.register

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.bamboo.BambooItem
import xyz.icedtech.advAgri.modata.Modata


class BambooRegistry {
    private var itemList = BambooItem()
    private var modid = Modata().modid
    fun RegistryBambooItem() {
        this.registryItemTool("bamboo_leaves", itemList.BAMBOO_LEAVES)
        this.registryItemTool("bamboo_silk", itemList.BAMBOO_SILK)
        this.registryItemTool("bamboo_silk_board", itemList.BAMBOO_SILK_BOARD)
        this.registryItemTool("indus_oil", itemList.INDUS_OIL)
        this.registryItemTool("bamboo_charcoal", itemList.BAMBOO_CHARCOAL)
        this.registryItemTool("firecrackers", itemList.FIRECRACKERS)
        this.registryItemTool("bamboo_silk_scissors", itemList.BAMBOO_SILK_SCISSORS)
        this.registryItemTool("fine_bamboo_cutter", itemList.FINE_BAMBOO_CUTTER)
        this.registryItemTool("bamboo_knife", itemList.BAMBOO_KNIFE)
    }

    fun RegistryBambooFood() {

    }

    private fun registryItemTool(itemName: String, item: Item) {
        Registry.register(
            Registry.ITEM,
            Identifier(modid, itemName),
            item
        )
    }
}