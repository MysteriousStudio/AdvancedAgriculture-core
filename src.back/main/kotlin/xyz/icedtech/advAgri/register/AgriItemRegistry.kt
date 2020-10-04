package xyz.icedtech.advAgri.register

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriItem
import xyz.icedtech.advAgri.modata.Modata

open class AgriItemRegistry {

    private val modid = Modata().modid
    val itemList = AgriItem
    fun registryAll() {
        registerAgriItem()
    }

    fun registerAgriItem() {
        this.registryItemTool("com_fert", itemList.COM_FERT)
        this.registryItemTool("grass_ash", itemList.GRASS_ASH)
        this.registryItemTool("phos", itemList.PHOS)
        this.registryItemTool("sulfur", itemList.SULFUR)
        this.registryItemTool("zircon", itemList.ZIRCON)
        this.registryItemTool("potassium_salt_powder", itemList.POTASSIUM_SALT_POWDER)
        this.registryItemTool("bamboo_leaves", itemList.BAMBOO_LEAVES)
        this.registryItemTool("bamboo_silk", itemList.BAMBOO_SILK)
        this.registryItemTool("bamboo_silk_scissors", itemList.BAMBOO_SILK_SCISSORS)
        this.registryItemTool("bamboo_charcoal", itemList.BAMBOO_CHARCOAL)
        this.registryItemTool("fine_bamboo_cutter", itemList.FINE_BAMBOO_CUTTER)
        this.registryItemTool("bamboo_silk_board", itemList.BAMBOO_SILK_BOARD)
        this.registryItemTool("indus_oil", itemList.INDUS_OIL)
        this.registryItemTool("firecrackers", itemList.FIRECRACKERS)

        this.registryItemTool("aluminium_ingot", itemList.ALUMINIUM_INGOT)
        this.registryItemTool("copper_ingot", itemList.COPPER_INGOT)
        this.registryItemTool("tin_ingot", itemList.TIN_INGOT)
        this.registryItemTool("zinc_ingot", itemList.ZINC_INGOT)
        this.registryItemTool("bronze_ingot", itemList.BRONZE_INGOT)
        this.registryItemTool("lead_ingot", itemList.LEAD_INGOT)
        this.registryItemTool("silver_ingot", itemList.SILVER_INGOT)
        this.registryItemTool("nickel_ingot", itemList.NICKEL_INGOT)
        this.registryItemTool("tungsten_ingot", itemList.TUNGSTEN_INGOT)
        this.registryItemTool("titanium_ingot", itemList.TITANIUM_INGOT)
        this.registryItemTool("steel_ingot", itemList.STEEL_INGOT)

        this.registryItemTool("aluminium_powder", itemList.ALUMINIUM_POWDER)
        this.registryItemTool("copper_powder", itemList.COPPER_POWDER)
        this.registryItemTool("tin_powder", itemList.TIN_POWDER)
        this.registryItemTool("zinc_powder", itemList.ZINC_POWDER)
        this.registryItemTool("bronze_powder", itemList.BRONZE_POWDER)
        this.registryItemTool("lead_powder", itemList.LEAD_POWDER)
        this.registryItemTool("iron_powder", itemList.IRON_POWDER)
        this.registryItemTool("silver_powder", itemList.SILVER_POWDER)
        this.registryItemTool("steel_powder", itemList.STEEL_POWDER)
        this.registryItemTool("nickel_powder", itemList.NICKEL_POWDER)
        this.registryItemTool("tungsten_powder", itemList.TUNGSTEN_POWDER)
        this.registryItemTool("titanium_powder", itemList.TITANIUM_POWDER)

        this.registryItemTool("copper_gear", itemList.COPPER_GEAR)
        this.registryItemTool("tin_gear", itemList.TIN_GEAR)
        this.registryItemTool("zinc_gear", itemList.ZINC_GEAR)
        this.registryItemTool("bronze_gear", itemList.BRONZE_GEAR)
        this.registryItemTool("silver_gear", itemList.SILVER_GEAR)
        this.registryItemTool("iron_gear", itemList.IRON_GEAR)
        this.registryItemTool("gold_gear", itemList.GOLD_GEAR)
        this.registryItemTool("steel_gear", itemList.STEEL_GEAR)
        this.registryItemTool("titanium_gear", itemList.TITANIUM_GEAR)
        this.registryItemTool("tungsten_gear", itemList.TUNGSTEN_GEAR)

        this.registryItemTool("aluminium_plate", itemList.ALUMINIUM_PLATE)
        this.registryItemTool("copper_plate", itemList.COPPER_PLATE)
        this.registryItemTool("tin_plate", itemList.TIN_PLATE)
        this.registryItemTool("zinc_plate", itemList.ZINC_PLATE)
        this.registryItemTool("bronze_plate", itemList.BRONZE_PLATE)
        this.registryItemTool("iron_plate", itemList.IRON_PLATE)
        this.registryItemTool("silver_plate", itemList.SILVER_PLATE)
        this.registryItemTool("gold_plate", itemList.GOLD_PLATE)
        this.registryItemTool("steel_plate", itemList.STEEL_PLATE)
        this.registryItemTool("titanium_plate", itemList.TITANIUM_PLATE)
        this.registryItemTool("tungsten_plate", itemList.TUNGSTEN_PLATE)

        this.registryItemTool("tin_cable", itemList.TIN_CABLE)
        this.registryItemTool("copper_cable", itemList.COPPER_CABLE)
        this.registryItemTool("silver_cable", itemList.SILVER_CABLE)
        this.registryItemTool("gold_cable", itemList.GOLD_CABLE)

        this.registryItemTool("passive_power_module", itemList.PASSIVE_POWER_MODULE)
        this.registryItemTool("power_module", itemList.POWER_MODULE)
        this.registryItemTool("advanced_power_module", itemList.ADVANCED_POWER_MODULE)

        this.registryItemTool("passive_pump_core", itemList.PASSIVE_PUMP_CORE)
        this.registryItemTool("active_pump_core", itemList.ACTIVE_PUMP_CORE)
        this.registryItemTool("advanced_active_pump_core", itemList.ADVANCED_ACTIVE_PUMP_CORE)

        this.registryItemTool("copper_conductor_core", itemList.COPPER_CONDUCTOR_CORE)
        this.registryItemTool("silver_conductor_core", itemList.SILVER_CONDUCTOR_CORE)
        this.registryItemTool("titanium_conductor_core", itemList.TITANIUM_CONDUCTOR_CORE)
    }

    fun registryItemTool(itemName: String, item: Item) {
        Registry.register(
            Registry.ITEM,
            Identifier(modid, itemName),
            item
        )
    }
}