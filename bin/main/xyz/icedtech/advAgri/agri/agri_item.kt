package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import xyz.icedtech.advAgri.modata.Modata

class AgriGroupItem {
    var modid = Modata().modid

    var AGRI_ITEM_GROUP =
        FabricItemGroupBuilder.create(Identifier(modid, "agriculture"))
            .icon { ItemStack(Items.BONE_MEAL) }.build()
    //镰刀
    var SICKLE =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP))
    //蛭石
    var ZIRCON =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))
    //复合肥
    var COM_FERT =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))
    //草木灰
    var GRASS_ASH =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))
    //磷
    var PHOS =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))
    //硫
    var SULFUR =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

}