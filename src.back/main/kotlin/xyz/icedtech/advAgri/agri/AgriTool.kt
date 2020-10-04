package xyz.icedtech.advAgri.agri

import net.minecraft.item.Item
import xyz.icedtech.advAgri.agri.tool.BambooChopperItem
import xyz.icedtech.advAgri.agri.tool.BambooDrillRodItem

class AgriTool {
    val AGRI_ITEM_GROUP = AgriItem.AGRI_ITEM_GROUP

    //砍竹刀
    val BAMBOO_CHOPPER =
        BambooChopperItem(Item.Settings().group(this.AGRI_ITEM_GROUP))

    val BAMBOO_DRILL_ROD =
        BambooDrillRodItem(Item.Settings().group(this.AGRI_ITEM_GROUP))
}