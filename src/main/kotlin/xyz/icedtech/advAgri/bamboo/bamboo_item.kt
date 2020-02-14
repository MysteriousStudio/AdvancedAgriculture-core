package xyz.icedtech.advAgri.bamboo

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import xyz.icedtech.advAgri.modata.Modata


class BambooItem {

    var modid = Modata().modid

    var BAMBOO_ITEM_GROUP =
        FabricItemGroupBuilder.create(Identifier(modid, "bamboo"))
            .icon { ItemStack(Items.BAMBOO) }.build()
    //竹叶
    var BAMBOO_LEAVES =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxCount(64))
    //竹编
    var BAMBOO_SILK =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxCount(64))
    //竹编板
    var BAMBOO_SILK_BOARD =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxCount(64))
    //桐油
    var INDUS_OIL =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxCount(32))
    //竹炭
    var BAMBOO_CHARCOAL =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxCount(64))
    //爆竹
    var FIRECRACKERS =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxCount(64))
    //竹编剪
    var BAMBOO_SILK_SCISSORS =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxDamage(356))
    //细致竹编切割器
    var FINE_BAMBOO_CUTTER =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxDamage(540))
    //砍竹刀
    var BAMBOO_KNIFE =
        Item(Item.Settings().group(this.BAMBOO_ITEM_GROUP).maxDamage(340))

}