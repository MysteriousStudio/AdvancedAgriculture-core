package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import xyz.icedtech.advAgri.agri.item.FireCrackers
import xyz.icedtech.advAgri.agri.item.Sulfur
import xyz.icedtech.advAgri.extenedTool.FastAddItem
import xyz.icedtech.advAgri.modata.Modata

object AgriItem {
    private val modid = Modata().modid

    val AGRI_ITEM_GROUP =
        FabricItemGroupBuilder.create(Identifier(modid, "agriculture"))
            .icon { ItemStack(Items.BAMBOO) }.build()


    //复合肥
    val COM_FERT =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //竹叶
    val BAMBOO_LEAVES =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //竹编
    val BAMBOO_SILK =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //竹编板
    val BAMBOO_SILK_BOARD =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //桐油
    val INDUS_OIL =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(32))

    //竹炭
    val BAMBOO_CHARCOAL =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //爆竹
    val FIRECRACKERS =
        FireCrackers(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //竹编剪
    val BAMBOO_SILK_SCISSORS =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxDamage(356))

    //细致竹编切割器
    val FINE_BAMBOO_CUTTER =
        Item(Item.Settings().group(this.AGRI_ITEM_GROUP).maxDamage(540))


    //钾盐
    val POTASSIUM_SALT_POWDER =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)


    //草木灰
    val GRASS_ASH =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //磷
    val PHOS =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    //硫
    val SULFUR =
        Sulfur(Item.Settings().group(this.AGRI_ITEM_GROUP).maxCount(64))

    //蛭石
    val ZIRCON =
        FastAddItem(this.AGRI_ITEM_GROUP, 64)

    private const val INGOT = 64
    private const val POWDER = 64

    //钨锭
    val TUNGSTEN_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val TUNGSTEN_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //铜锭
    val COPPER_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val COPPER_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //锌锭
    val ZINC_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val ZINC_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //锡锭
    val TIN_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val TIN_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //铝锭
    val ALUMINIUM_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val ALUMINIUM_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //铅锭
    val LEAD_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val LEAD_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //镍锭
    val NICKEL_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val NICKEL_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    //钢锭
    val STEEL_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val STEEL_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)

    //银锭
    val SILVER_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val SILVER_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)

    //青铜
    val BRONZE_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val BRONZE_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)

    //钛
    val TITANIUM_INGOT = FastAddItem(this.AGRI_ITEM_GROUP, INGOT)
    val TITANIUM_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)


    val IRON_POWDER = FastAddItem(this.AGRI_ITEM_GROUP, POWDER)

    private const val CORES = 64

    val COPPER_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)
    val SILVER_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)
    val TITANIUM_CONDUCTOR_CORE = FastAddItem(this.AGRI_ITEM_GROUP, CORES)


    private const val GEAR = 64

    val TIN_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val ZINC_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val COPPER_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val BRONZE_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val IRON_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val STEEL_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val SILVER_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val GOLD_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val TITANIUM_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)
    val TUNGSTEN_GEAR = FastAddItem(this.AGRI_ITEM_GROUP, GEAR)

    private const val PLATE = 64

    val ALUMINIUM_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val TIN_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val ZINC_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val COPPER_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val BRONZE_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val IRON_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val STEEL_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val SILVER_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val GOLD_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val TITANIUM_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)
    val TUNGSTEN_PLATE = FastAddItem(this.AGRI_ITEM_GROUP, PLATE)

    private const val CABLE = 64

    val TIN_CABLE = FastAddItem(this.AGRI_ITEM_GROUP, CABLE)
    val COPPER_CABLE = FastAddItem(this.AGRI_ITEM_GROUP, CABLE)
    val SILVER_CABLE = FastAddItem(this.AGRI_ITEM_GROUP, CABLE)
    val GOLD_CABLE = FastAddItem(this.AGRI_ITEM_GROUP, CABLE)

    private const val POWER_MODULE_COUNT = 64

    val PASSIVE_POWER_MODULE = FastAddItem(this.AGRI_ITEM_GROUP, POWER_MODULE_COUNT)
    val POWER_MODULE = FastAddItem(this.AGRI_ITEM_GROUP, POWER_MODULE_COUNT)
    val ADVANCED_POWER_MODULE = FastAddItem(this.AGRI_ITEM_GROUP, POWER_MODULE_COUNT)

    val PUMP_CORE = 1

    val PASSIVE_PUMP_CORE = FastAddItem(this.AGRI_ITEM_GROUP, PUMP_CORE)
    val ACTIVE_PUMP_CORE = FastAddItem(this.AGRI_ITEM_GROUP, PUMP_CORE)
    val ADVANCED_ACTIVE_PUMP_CORE = FastAddItem(this.AGRI_ITEM_GROUP, PUMP_CORE)
}