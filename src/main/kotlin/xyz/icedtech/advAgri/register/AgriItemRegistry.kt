package xyz.icedtech.advAgri.register

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata

class AgriItemRegistry {

    private val modid = Modata().modid
    val itemList = AgriGroupItem()
    fun registryAll() {
        registerAgriItem()
    }

    fun registerAgriItem() {
        this.registryItemTool("com_fert", itemList.COM_FERT)
        this.registryItemTool("grass_ash", itemList.GRASS_ASH)
        this.registryItemTool("phos", itemList.PHOS)
        this.registryItemTool("sulfur", itemList.SULFUR)
        this.registryItemTool("zircon", itemList.ZIRCON)
        this.registryItemTool("potassium_salt_powder", itemList.POTASSIUM_SALT_POWDER)
        this.registryItemTool("bamboo_leaves", itemList.BAMBOO_LEAVES)
        this.registryItemTool("bamboo_silk", itemList.BAMBOO_SILK)
        this.registryItemTool("bamboo_silk_scissors", itemList.BAMBOO_SILK_SCISSORS)
        this.registryItemTool("bamboo_charcoal", itemList.BAMBOO_CHARCOAL)
        this.registryItemTool("bamboo_knife", itemList.BAMBOO_KNIFE)
        this.registryItemTool("fine_bamboo_cutter", itemList.FINE_BAMBOO_CUTTER)
        this.registryItemTool("bamboo_silk_board", itemList.BAMBOO_SILK_BOARD)
        this.registryItemTool("indus_oil", itemList.INDUS_OIL)
        this.registryItemTool("firecrackers", itemList.FIRECRACKERS)

        this.registryItemTool("copper_ingot", itemList.COPPER_INGOT)
        this.registryItemTool("tin_ingot", itemList.TIN_INGOT)
        this.registryItemTool("zinc_ingot", itemList.ZINC_INGOT)
        this.registryItemTool("lead_ingot", itemList.LEAD_INGOT)
        this.registryItemTool("aluminium_ingot", itemList.ALUMINIUM_INGOT)
        this.registryItemTool("nickel_ingot", itemList.NICKEL_INGOT)
        this.registryItemTool("tungsten_ingot", itemList.TUNGSTEN_INGOT)
        this.registryItemTool("steel_ingot", itemList.STEEL_INGOT)
        this.registryItemTool("silver_ingot", itemList.SILVER_INGOT)
        this.registryItemTool("copper_dust", itemList.COPPER_DUST)

        this.registryItemTool("tin_dust", itemList.TIN_DUST)
        this.registryItemTool("zinc_dust", itemList.ZINC_DUST)
        this.registryItemTool("lead_dust", itemList.LEAD_DUST)
        this.registryItemTool("aluminium_dust", itemList.ALUMINIUM_DUST)
        this.registryItemTool("nickel_dust", itemList.NICKEL_DUST)
        this.registryItemTool("tungsten_dust", itemList.TUNGSTEN_DUST)
        this.registryItemTool("silver_dust", itemList.SILVER_DUST)
        this.registryItemTool("steel_dust", itemList.STEEL_DUST)

    }

    private fun registryItemTool(blockName: String, item: Item) {
        Registry.register(
            Registry.ITEM,
            Identifier(modid, blockName),
            item
        )
    }
}