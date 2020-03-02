package xyz.icedtech.advAgri.extendTool

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.modata.Modata


var group: ItemGroup
    get() {
        return group
    }
    set(value) {
        group = value
    }

val modid = Modata().modid
fun Registry<Any?>.registryItemTool(blockName: String, item: Item) {
    Registry.register(
        Registry.ITEM,
        Identifier(modid, blockName),
        item
    )
}

fun Registry<Any?>.registryBlockItemTool(blockName: String, block: Block) {
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

fun Registry<Any?>.registryBlockItemTool(blockName: String, block: Block, maxCount: Int) {
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

