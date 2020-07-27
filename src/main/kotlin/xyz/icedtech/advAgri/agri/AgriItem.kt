package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import xyz.icedtech.advAgri.agri.item.FireCrackers
import xyz.icedtech.advAgri.modata.Modata

class AgriGroupItem {
    var modid = Modata().modid

    var AGRI_ITEM_GROUP =
        FabricItemGroupBuilder.create(Identifier(modid, "agriculture"))
            .icon { ItemStack(Items.BAMBOO) }.build()


    //复合肥
    var COM_FERT =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //竹叶
    var BAMBOO_LEAVES =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //竹编
    var BAMBOO_SILK =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //竹编板
    var BAMBOO_SILK_BOARD =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //桐油
    var INDUS_OIL =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(32))

    //竹炭
    var BAMBOO_CHARCOAL =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //爆竹
    var FIRECRACKERS =
        FireCrackers(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //竹编剪
    var BAMBOO_SILK_SCISSORS =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxDamage(356))

    //细致竹编切割器
    var FINE_BAMBOO_CUTTER =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxDamage(540))

    //砍竹刀
    var BAMBOO_KNIFE =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxDamage(340))

    //钾盐
    var POTASSIUM_SALT_POWDER =
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

    //蛭石
    var ZIRCON =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    var INGOT = 64
    var DUST = 128

    //钨锭
    var TUNGSTEN_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var TUNGSTEN_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //铜锭
    var COPPER_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var COPPER_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //锌锭
    var ZINC_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var ZINC_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //锡锭
    var TIN_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var TIN_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //铝锭
    var ALUMINIUM_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var ALUMINIUM_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //铅锭
    var LEAD_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var LEAD_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //镍锭
    var NICKEL_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var NICKEL_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(DUST))


    //钢锭
    var STEEL_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var STEEL_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))

    //银锭
    var SILVER_INGOT = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
    var SILVER_DUST = Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(INGOT))
}