package xyz.icedtech.advAgri.register

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata


class AgriBlockRegistry(agi: AgriGroupItem) {

    private val modid = Modata().modid
    private var itemList: AgriGroupItem = agi
    private val blockItemList = AgriBlock()
    fun registryAllAgriBlockItem() {
        this.registerAgriBlockItem()
    }

    private fun registerAgriBlockItem() {
        this.registryBlockItemTool("acidified_soil", blockItemList.ACIDIFIED_SOIL)
        this.registryBlockItemTool("crop_racks", blockItemList.CROP_RACKS)
        this.registryBlockItemTool("ferment_tank", blockItemList.FERMENT_TANK)
        this.registryBlockItemTool("hardened_soil", blockItemList.HARDENED_SOIL)
        this.registryBlockItemTool("humus", blockItemList.HUMUS)
        this.registryBlockItemTool("sulphur_ore", blockItemList.SULPHUR_ORE)
        this.registryBlockItemTool("quarry", blockItemList.QUARRY)
        this.registryBlockItemTool("silt", blockItemList.SILT)

        this.registryBlockItemTool("bamboo_fence", blockItemList.BAMBOO_FENCE)
        this.registryBlockItemTool("bamboo_block", blockItemList.BAMBOO_BLOCK)
        this.registryBlockItemTool("ceramic_jars", blockItemList.CERAMIC_JARS)

        this.registryBlockItemTool("phos_ore", blockItemList.PHOS_ORE)
        this.registryBlockItemTool("nether_sulphur_ore", blockItemList.NETHER_SULPHUR_ORE)
        this.registryBlockItemTool("copper_ore", blockItemList.COPPER_ORE)
        this.registryBlockItemTool("tin_ore", blockItemList.TIN_ORE)
        this.registryBlockItemTool("zinc_ore", blockItemList.ZINC_ORE)
        this.registryBlockItemTool("lead_ore", blockItemList.LEAD_ORE)
        this.registryBlockItemTool("tungsten_ore", blockItemList.TUNGSTEN_ORE)
        this.registryBlockItemTool("aluminium_ore", blockItemList.ALUMINIUM_ORE)
        this.registryBlockItemTool("silver_ore", blockItemList.SILVER_ORE)

        this.registryBlockItemTool("copper_block", blockItemList.COPPER_BLOCK)
        this.registryBlockItemTool("tin_block", blockItemList.TIN_BLOCK)
        this.registryBlockItemTool("zinc_block", blockItemList.ZINC_BLOCK)
        this.registryBlockItemTool("bronze_block", blockItemList.BRONZE_BLOCK)
        this.registryBlockItemTool("lead_block", blockItemList.LEAD_BLOCK)
        this.registryBlockItemTool("tungsten_block", blockItemList.TUNGSTEN_BLOCK)
        this.registryBlockItemTool("nickel_block", blockItemList.NICKEL_BLOCK)
        this.registryBlockItemTool("aluminium_block", blockItemList.ALUMINIUM_BLOCK)
        this.registryBlockItemTool("silver_block", blockItemList.SILVER_BLOCK)
        this.registryBlockItemTool("steel_block", blockItemList.STEEL_BLOCK)

        this.registryBlockItemTool(
            "high_temperature_electrolytic_furnace",
            blockItemList.HIGH_TEMPERATURE_ELECTROLYTIC_FURNACE
        )
        this.registryBlockItemTool("primary_well_block", blockItemList.PRIMARY_WELL_BLOCK)
        this.registryBlockItemTool("primary_pumps", blockItemList.PRIMARY_PUMPS)
        this.registryBlockItemTool("primary_management_box", blockItemList.PRIMARY_MANAGEMENT_BLOCK)

    }


    private fun registryBlockItemTool(blockName: String, block: Block) {
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, blockName),
            block
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, blockName),
            BlockItem(
                block,
                Item.Settings().group(itemList.AGRI_ITEM_GROUP).maxCount(64)
            )
        )
    }

}