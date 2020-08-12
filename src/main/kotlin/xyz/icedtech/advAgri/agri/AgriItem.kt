package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import xyz.icedtech.advAgri.agri.item.FireCrackers
import xyz.icedtech.advAgri.agri.item.Sulfur
import xyz.icedtech.advAgri.modata.Modata
import xyz.icedtech.advAgri.extenedTool.FastAddItem
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver

class AgriGroupItem {
    var modid = Modata().modid

    var AGRI_ITEM_GROUP =
        FabricItemGroupBuilder.create(Identifier(modid, "agriculture"))
            .icon { ItemStack(Items.BAMBOO) }.build()


    //复合肥
    var COM_FERT =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //竹叶
    var BAMBOO_LEAVES =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //竹编
    var BAMBOO_SILK =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //竹编板
    var BAMBOO_SILK_BOARD =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //桐油
    var INDUS_OIL =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(32))

    //竹炭
    var BAMBOO_CHARCOAL =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

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
        FastAddItem(this.AGRI_ITEM_GROUP, 64)


    //草木灰
    var GRASS_ASH =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //磷
    var PHOS =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //硫
    var SULFUR =
        Sulfur(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //蛭石
    var ZIRCON =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    var INGOT = 64
    var DUST = 128

    //钨锭
    var TUNGSTEN_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var TUNGSTEN_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //铜锭
    var COPPER_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var COPPER_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //锌锭
    var ZINC_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var ZINC_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //锡锭
    var TIN_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var TIN_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //铝锭
    var ALUMINIUM_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var ALUMINIUM_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //铅锭
    var LEAD_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var LEAD_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //镍锭
    var NICKEL_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var NICKEL_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)


    //钢锭
    var STEEL_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var STEEL_DUST = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)

    //银锭
    var SILVER_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var SILVER_DUST = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)

    //青铜
    var BRONZE_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    var BRONZE_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)

    var IRON_DUST = FastAddItem(this.AGRI_ITEM_GROUP, DUST)

    var CORES = 64

    var COPPER_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)
    var IRON_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)
    var SILVER_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)
    var TITAN_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)
    var TUNGSTEN_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)

    var GEAR = 64

    var TIN_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var ZINC_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var COPPER_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var BRONZE_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var IRON_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var STEEL_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var SILVER_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var GOLD_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var TITAN_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    var TUNGSTEN_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)

    var BROAD = 64

    var TIN_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var ZINC_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var COPPER_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var BRONZE_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var IRON_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var STEEL_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var SILVER_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var GOLD_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var TITAN_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)
    var TUNGSTEN_BROAD = FastAddItem(this.AGRI_ITEM_GROUP, BROAD)

    var POWER_MODULE = 64

    var PASSIVE_POWER_MODULE = FastAddItem(this.AGRI_ITEM_GROUP, POWER_MODULE)
    var ACTIVE_POWER_MODULE = FastAddItem(this.AGRI_ITEM_GROUP, POWER_MODULE)
    var ADVANCED_ACTIVE_POWER_MODULE = FastAddItem(this.AGRI_ITEM_GROUP, POWER_MODULE)

    var PUMP_CORE = 1

    var PASSIVE_PUMP_CORE = FastAddItem(this.AGRI_ITEM_GROUP, PUMP_CORE)
    var ACTIVE_PUMP_CORE = FastAddItem(this.AGRI_ITEM_GROUP, PUMP_CORE)
    var ADVANCED_ACTIVE_PUMP_CORE = FastAddItem(this.AGRI_ITEM_GROUP, PUMP_CORE)
}