package xyz.icedtech.advAgri.register

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata


class AgriBlockRegistry {
    private val modid = Modata().modid
    private val itemList = AgriGroupItem()
    private val blockItemList = AgriBlock()

    fun RegistryAllAgriBlockItem() {
        this.registerAgriBlockItem()
    }

    private fun registerAgriBlockItem() {
        this.registryBlockItemTool("acidified_soil", blockItemList.ACIDIFIED_SOIL)
        this.registryBlockItemTool("crop_racks", blockItemList.CROP_RACKS)
        this.registryBlockItemTool("ferment_tank", blockItemList.FERMENT_TANK)
        this.registryBlockItemTool("hardened_soil", blockItemList.HARDENED_SOIL)
        this.registryBlockItemTool("humus", blockItemList.HUMUS)
        this.registryBlockItemTool("sulphur_ore", blockItemList.SULPHUR_ORE)
        this.registryBlockItemTool("nether_sulphur_ore", blockItemList.NETHER_SULPHUR_ORE)
        this.registryBlockItemTool("quarry", blockItemList.QUARRY)
        this.registryBlockItemTool("silt", blockItemList.SILT)
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

    private fun registryBlockItemTool(blockName: String, block: Block, maxCount: Int) {
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
                Item.Settings().group(itemList.AGRI_ITEM_GROUP).maxCount(maxCount)
            )
        )
    }
}