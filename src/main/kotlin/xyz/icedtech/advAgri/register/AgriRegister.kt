package xyz.icedtech.advAgri.register

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata
import xyz.icedtech.advAgri.extendTool.registryBlockItemTool


class AgriRegister {
    private val modid = Modata().modid
    private val itemList = AgriGroupItem()
    private var group = registerAgriItem()
    private val blockItemList = AgriBlock()

    fun RegistAll() {
        this.registerAgriBlockItem()
    }

    private fun registerAgriItem(): ItemGroup {
        this.registryItemTool("com_fert", itemList.COM_FERT)
        this.registryItemTool("grass_ash", itemList.GRASS_ASH)
        this.registryItemTool("phos", itemList.PHOS)
        this.registryItemTool("sulfur", itemList.SULFUR)
        this.registryItemTool("zircon", itemList.ZIRCON)
        return itemList.AGRI_ITEM_GROUP
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

    private fun registryItemTool(blockName: String, item: Item) {
        Registry.register(
            Registry.ITEM,
            Identifier(modid, blockName),
            item
        )
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
                Item.Settings().group(group).maxCount(64)
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
                Item.Settings().group(group).maxCount(maxCount)
            )
        )
    }
}