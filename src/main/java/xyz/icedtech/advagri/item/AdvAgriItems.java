package xyz.icedtech.advagri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemCoreGroup;

public class AdvAgriItems {
    public static AdvAgriItems thisAdvAgriItems = new AdvAgriItems();

    public static Integer MAX_ITEM_COUNT = 64;

    ///GENERATE START:ITEM
    //Other
    public static Item COM_FERT;
    public static Item TUNG_OIL;
    public static Item POTASSIUM_SALT_POWDER;
    public static Item PLANT_ASH;
    //Bottle
    public static Item BOTTLE_SMALL;
    public static Item BOTTLE_LARGE;
    //Solarium Bottle
    public static Item SOLARIUM_BOTTLE_LARGE;
    public static Item SOLARIUM_BOTTLE_MEDIUM;
    public static Item SOLARIUM_BOTTLE_SMALL;
    //Bamboo
    public static Item BAMBOO_LEAVES;
    public static Item BAMBOO_SILK;
    public static Item BAMBOO_SILK_BOARD;
    public static Item BAMBOO_CHARCOAL;
    public static Item BAMBOO_SHOOT;
    //Non-metal resources
    public static Item PHOS;
    public static Item ZIRCON;
    public static Item SULFUR;
    //Copper
    public static Item COPPER_SHARD;
    public static Item COPPER_INGOT;
    public static Item COPPER_POWDER;
    public static Item COPPER_GEAR;
    public static Item COPPER_PLATE;
    public static Item COPPER_DISSOLVER;
    public static Item CRUSHED_COPPER_ORE;
    //Zinc
    public static Item ZINC_SHARD;
    public static Item ZINC_INGOT;
    public static Item ZINC_POWDER;
    public static Item ZINC_GEAR;
    public static Item ZINC_PLATE;
    public static Item ZINC_DISSOLVER;
    public static Item CRUSHED_ZINC_ORE;
    //Tin
    public static Item TIN_SHARD;
    public static Item TIN_INGOT;
    public static Item TIN_POWDER;
    public static Item TIN_GEAR;
    public static Item TIN_PLATE;
    public static Item TIN_DISSOLVER;
    public static Item CRUSHED_TIN_ORE;
    //Bronze
    public static Item BRONZE_SHARD;
    public static Item BRONZE_INGOT;
    public static Item BRONZE_POWDER;
    public static Item BRONZE_GEAR;
    public static Item BRONZE_PLATE;
    //Aluminum
    public static Item ALUMINUM_SHARD;
    public static Item ALUMINUM_INGOT;
    public static Item ALUMINUM_POWDER;
    public static Item ALUMINUM_GEAR;
    public static Item ALUMINUM_PLATE;
    public static Item ALUMINUM_DISSOLVER;
    public static Item CRUSHED_ALUMINUM_ORE;
    //Lead
    public static Item LEAD_SHARD;
    public static Item LEAD_INGOT;
    public static Item LEAD_POWDER;
    public static Item LEAD_GEAR;
    public static Item LEAD_PLATE;
    public static Item LEAD_DISSOLVER;
    public static Item CRUSHED_LEAD_ORE;
    //Silver
    public static Item SILVER_SHARD;
    public static Item SILVER_INGOT;
    public static Item SILVER_POWDER;
    public static Item SILVER_GEAR;
    public static Item SILVER_PLATE;
    public static Item SILVER_DISSOLVER;
    public static Item CRUSHED_SILVER_ORE;
    //Steel
    public static Item STEEL_INGOT;
    public static Item STEEL_POWDER;
    public static Item STEEL_GEAR;
    public static Item STEEL_PLATE;
    //Nickel
    public static Item NICKEL_SHARD;
    public static Item NICKEL_INGOT;
    public static Item NICKEL_POWDER;
    public static Item NICKEL_GEAR;
    public static Item NICKEL_PLATE;
    public static Item NICKEL_DISSOLVER;
    public static Item CRUSHED_NICKEL_ORE;
    //Tungsten
    public static Item TUNGSTEN_SHARD;
    public static Item TUNGSTEN_INGOT;
    public static Item TUNGSTEN_POWDER;
    public static Item TUNGSTEN_GEAR;
    public static Item TUNGSTEN_PLATE;
    public static Item TUNGSTEN_DISSOLVER;
    public static Item CRUSHED_TUNGSTEN_ORE;
    //Titanium
    public static Item TITANIUM_SHARD;
    public static Item TITANIUM_INGOT;
    public static Item TITANIUM_POWDER;
    public static Item TITANIUM_GEAR;
    public static Item TITANIUM_PLATE;
    public static Item TITANIUM_DISSOLVER;
    public static Item CRUSHED_TITANIUM_ORE;
    //Iron
    public static Item IRON_SHARD;
    public static Item IRON_POWDER;
    public static Item IRON_GEAR;
    public static Item IRON_PLATE;
    public static Item IRON_DISSOLVER;
    public static Item CRUSHED_IRON_ORE;
    //Gold
    public static Item GOLD_SHARD;
    public static Item GOLD_POWDER;
    public static Item GOLD_GEAR;
    public static Item GOLD_PLATE;
    public static Item GOLD_DISSOLVER;
    public static Item CRUSHED_GOLD_ORE;

    //Firecracker
    public static Firecracker FIRECRACKERS;

    //Conductor Core
    public static Item COPPER_CONDUCTOR_CORE;
    public static Item SILVER_CONDUCTOR_CORE;
    public static Item TITANIUM_CONDUCTOR_CORE;

    //Power Module
    //public Item PASSIVE_POWER_MODULE;
    //public Item POWER_MODULE_L1;
    //public Item POWER_MODULE_L2;
    //public Item POWER_MODULE_L3;
    //public Item POWER_MODULE_L4;
    //public Item POWER_MODULE_L5;

    //Ore By-products
    public static Item MINERAL_MUD;
    public static Item CORASE_ORE_POWDER;

    //Metal Forging
    public static Item FORGING_HAMMER;

    public static Item BAMBOO_CHOPPER;

    ///GENERATE END:ITEM

    public static ItemGroup ITEM_GROUP;

    private AdvAgriItems() {
        ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
    }

    public static AdvAgriItems getInstance() {
        return thisAdvAgriItems;
    }

    private static Item AddItemTool(Integer maxCount) {
        return new Item(new FabricItemSettings().group(ITEM_GROUP).maxCount(maxCount));
    }

    private static Item AddItemTool() {
        return new Item(new FabricItemSettings().group(ITEM_GROUP).maxCount(MAX_ITEM_COUNT));
    }

    public void InitAllItems() {
        COM_FERT = AddItemTool();
        BAMBOO_LEAVES = AddItemTool();
        BAMBOO_SILK = AddItemTool();
        BAMBOO_SILK_BOARD = AddItemTool();
        BAMBOO_CHARCOAL = AddItemTool();
        PLANT_ASH = AddItemTool();
        POTASSIUM_SALT_POWDER = AddItemTool();
        TUNG_OIL = AddItemTool(1);
        BAMBOO_SHOOT = AddItemTool();
        ZIRCON = AddItemTool();
        PHOS = AddItemTool();
        SULFUR = AddItemTool();

        BOTTLE_LARGE = AddItemTool();
        BOTTLE_SMALL = AddItemTool();

        SOLARIUM_BOTTLE_LARGE = AddItemTool();
        SOLARIUM_BOTTLE_MEDIUM = AddItemTool();
        SOLARIUM_BOTTLE_SMALL = AddItemTool();


        //Ingot
        COPPER_INGOT = AddItemTool();
        ZINC_INGOT = AddItemTool();
        TIN_INGOT = AddItemTool();
        BRONZE_INGOT = AddItemTool();
        ALUMINUM_INGOT = AddItemTool();
        LEAD_INGOT = AddItemTool();
        SILVER_INGOT = AddItemTool();
        STEEL_INGOT = AddItemTool();
        NICKEL_INGOT = AddItemTool();
        TUNGSTEN_INGOT = AddItemTool();
        TITANIUM_INGOT = AddItemTool();

        //Powder
        COPPER_POWDER = AddItemTool();
        ZINC_POWDER = AddItemTool();
        TIN_POWDER = AddItemTool();
        BRONZE_POWDER = AddItemTool();
        ALUMINUM_POWDER = AddItemTool();
        LEAD_POWDER = AddItemTool();
        SILVER_POWDER = AddItemTool();
        STEEL_POWDER = AddItemTool();
        NICKEL_POWDER = AddItemTool();
        TUNGSTEN_POWDER = AddItemTool();
        TITANIUM_POWDER = AddItemTool();
        IRON_POWDER = AddItemTool();
        GOLD_POWDER = AddItemTool();

        //Gear
        COPPER_GEAR = AddItemTool();
        ZINC_GEAR = AddItemTool();
        TIN_GEAR = AddItemTool();
        BRONZE_GEAR = AddItemTool();
        ALUMINUM_GEAR = AddItemTool();
        LEAD_GEAR = AddItemTool();
        SILVER_GEAR = AddItemTool();
        STEEL_GEAR = AddItemTool();
        NICKEL_GEAR = AddItemTool();
        TUNGSTEN_GEAR = AddItemTool();
        TITANIUM_GEAR = AddItemTool();
        IRON_GEAR = AddItemTool();
        GOLD_GEAR = AddItemTool();

        //Plate
        COPPER_PLATE = AddItemTool();
        ZINC_PLATE = AddItemTool();
        TIN_PLATE = AddItemTool();
        BRONZE_PLATE = AddItemTool();
        ALUMINUM_PLATE = AddItemTool();
        LEAD_PLATE = AddItemTool();
        SILVER_PLATE = AddItemTool();
        STEEL_PLATE = AddItemTool();
        NICKEL_PLATE = AddItemTool();
        TUNGSTEN_PLATE = AddItemTool();
        TITANIUM_PLATE = AddItemTool();
        IRON_PLATE = AddItemTool();
        GOLD_PLATE = AddItemTool();

        //Shard
        COPPER_SHARD = AddItemTool();
        ZINC_SHARD = AddItemTool();
        TIN_SHARD = AddItemTool();
        BRONZE_SHARD = AddItemTool();
        ALUMINUM_SHARD = AddItemTool();
        LEAD_SHARD = AddItemTool();
        SILVER_SHARD = AddItemTool();
        NICKEL_SHARD = AddItemTool();
        TUNGSTEN_SHARD = AddItemTool();
        TITANIUM_SHARD = AddItemTool();
        IRON_SHARD = AddItemTool();
        GOLD_SHARD = AddItemTool();

        //Metal Dissolver
        COPPER_DISSOLVER = AddItemTool();
        ZINC_DISSOLVER = AddItemTool();
        TIN_DISSOLVER = AddItemTool();
        ALUMINUM_DISSOLVER = AddItemTool();
        LEAD_DISSOLVER = AddItemTool();
        SILVER_DISSOLVER = AddItemTool();
        NICKEL_DISSOLVER = AddItemTool();
        TUNGSTEN_DISSOLVER = AddItemTool();
        TITANIUM_DISSOLVER = AddItemTool();
        GOLD_DISSOLVER = AddItemTool();
        IRON_DISSOLVER = AddItemTool();

        //Crushed Ore
        CRUSHED_ALUMINUM_ORE = AddItemTool();
        CRUSHED_COPPER_ORE = AddItemTool();
        CRUSHED_GOLD_ORE = AddItemTool();
        CRUSHED_IRON_ORE = AddItemTool();
        CRUSHED_LEAD_ORE = AddItemTool();
        CRUSHED_NICKEL_ORE = AddItemTool();
        CRUSHED_SILVER_ORE = AddItemTool();
        CRUSHED_TIN_ORE = AddItemTool();
        CRUSHED_TITANIUM_ORE = AddItemTool();
        CRUSHED_TUNGSTEN_ORE = AddItemTool();
        CRUSHED_ZINC_ORE = AddItemTool();

        FIRECRACKERS = new Firecracker(new FabricItemSettings().group(ITEM_GROUP).maxCount(MAX_ITEM_COUNT));

        //Conductor Core
        COPPER_CONDUCTOR_CORE = AddItemTool();
        SILVER_CONDUCTOR_CORE = AddItemTool();
        TITANIUM_CONDUCTOR_CORE = AddItemTool();

        //        Power Module
        //        PASSIVE_POWER_MODULE = AddItemTool();
        //        POWER_MODULE_L1 = AddItemTool();
        //        POWER_MODULE_L2 = AddItemTool();
        //        POWER_MODULE_L3 = AddItemTool();
        //        POWER_MODULE_L4 = AddItemTool();
        //        POWER_MODULE_L5 = AddItemTool();

        //Ore By-products
        MINERAL_MUD = AddItemTool();
        CORASE_ORE_POWDER = AddItemTool();

        //Metal FORGING
        FORGING_HAMMER = new ForgingHammer(new FabricItemSettings().group(ITEM_GROUP).maxCount(1).recipeRemainder(FORGING_HAMMER));

        BAMBOO_CHOPPER = new BambooChopper(new FabricItemSettings().group(ITEM_GROUP).maxCount(1));

    }

    public void RegisteredItems() {
        //RegistrationTool( ,"");
        RegistrationTool(COM_FERT, "com_fert");
        RegistrationTool(BAMBOO_LEAVES, "bamboo_leaves");
        RegistrationTool(BAMBOO_SILK, "bamboo_silk");
        RegistrationTool(BAMBOO_SILK_BOARD, "bamboo_silk_board");
        RegistrationTool(BAMBOO_CHARCOAL, "bamboo_charcoal");
        RegistrationTool(PLANT_ASH, "plant_ash");
        RegistrationTool(POTASSIUM_SALT_POWDER, "potassium_salt_powder");
        RegistrationTool(ZIRCON, "zircon");
        RegistrationTool(SULFUR, "sulfur");
        RegistrationTool(PHOS, "phos");

        RegistrationTool(BOTTLE_SMALL, "bottle_small");
        RegistrationTool(BOTTLE_LARGE, "bottle_large");

        RegistrationTool(SOLARIUM_BOTTLE_LARGE, "solarium_bottle_large");
        RegistrationTool(SOLARIUM_BOTTLE_MEDIUM, "solarium_bottle");
        RegistrationTool(SOLARIUM_BOTTLE_SMALL, "solarium_bottle_small");


        //Ingot
        RegistrationTool(COPPER_INGOT, "copper_ingot");
        RegistrationTool(ZINC_INGOT, "zinc_ingot");
        RegistrationTool(TIN_INGOT, "tin_ingot");
        RegistrationTool(BRONZE_INGOT, "bronze_ingot");
        RegistrationTool(ALUMINUM_INGOT, "aluminum_ingot");
        RegistrationTool(LEAD_INGOT, "lead_ingot");
        RegistrationTool(SILVER_INGOT, "silver_ingot");
        RegistrationTool(STEEL_INGOT, "steel_ingot");
        RegistrationTool(NICKEL_INGOT, "nickel_ingot");
        RegistrationTool(TUNGSTEN_INGOT, "tungsten_ingot");
        RegistrationTool(TITANIUM_INGOT, "titanium_ingot");

        //Powder
        RegistrationTool(COPPER_POWDER, "copper_powder");
        RegistrationTool(ZINC_POWDER, "zinc_powder");
        RegistrationTool(TIN_POWDER, "tin_powder");
        RegistrationTool(BRONZE_POWDER, "bronze_powder");
        RegistrationTool(ALUMINUM_POWDER, "aluminum_powder");
        RegistrationTool(LEAD_POWDER, "lead_powder");
        RegistrationTool(SILVER_POWDER, "silver_powder");
        RegistrationTool(STEEL_POWDER, "steel_powder");
        RegistrationTool(NICKEL_POWDER, "nickel_powder");
        RegistrationTool(TUNGSTEN_POWDER, "tungsten_powder");
        RegistrationTool(TITANIUM_POWDER, "titanium_powder");
        RegistrationTool(IRON_POWDER, "iron_powder");
        RegistrationTool(GOLD_POWDER, "gold_powder");

        //Gear
        RegistrationTool(COPPER_GEAR, "copper_gear");
        RegistrationTool(ZINC_GEAR, "zinc_gear");
        RegistrationTool(TIN_GEAR, "tin_gear");
        RegistrationTool(BRONZE_GEAR, "bronze_gear");
        RegistrationTool(ALUMINUM_GEAR, "aluminum_gear");
        RegistrationTool(LEAD_GEAR, "lead_gear");
        RegistrationTool(SILVER_GEAR, "silver_gear");
        RegistrationTool(STEEL_GEAR, "steel_gear");
        RegistrationTool(NICKEL_GEAR, "nickel_gear");
        RegistrationTool(TUNGSTEN_GEAR, "tungsten_gear");
        RegistrationTool(TITANIUM_GEAR, "titanium_gear");
        RegistrationTool(IRON_GEAR, "iron_gear");
        RegistrationTool(GOLD_GEAR, "gold_gear");

        //Plate
        RegistrationTool(COPPER_PLATE, "copper_plate");
        RegistrationTool(ZINC_PLATE, "zinc_plate");
        RegistrationTool(TIN_PLATE, "tin_plate");
        RegistrationTool(BRONZE_PLATE, "bronze_plate");
        RegistrationTool(ALUMINUM_PLATE, "aluminum_plate");
        RegistrationTool(LEAD_PLATE, "lead_plate");
        RegistrationTool(SILVER_PLATE, "silver_plate");
        RegistrationTool(STEEL_PLATE, "steel_plate");
        RegistrationTool(NICKEL_PLATE, "nickel_plate");
        RegistrationTool(TUNGSTEN_PLATE, "tungsten_plate");
        RegistrationTool(TITANIUM_PLATE, "titanium_plate");
        RegistrationTool(IRON_PLATE, "iron_plate");
        RegistrationTool(GOLD_PLATE, "gold_plate");


        //Shard
        RegistrationTool(COPPER_SHARD, "copper_shard");
        RegistrationTool(ZINC_SHARD, "zinc_shard");
        RegistrationTool(TIN_SHARD, "tin_shard");
        RegistrationTool(BRONZE_SHARD, "bronze_shard");
        RegistrationTool(ALUMINUM_SHARD, "aluminum_shard");
        RegistrationTool(LEAD_SHARD, "lead_shard");
        RegistrationTool(SILVER_SHARD, "silver_shard");
        RegistrationTool(NICKEL_SHARD, "nickel_shard");
        RegistrationTool(TUNGSTEN_SHARD, "tungsten_shard");
        RegistrationTool(TITANIUM_SHARD, "titanium_shard");
        RegistrationTool(IRON_SHARD, "iron_shard");
        RegistrationTool(GOLD_SHARD, "gold_shard");

        //Metal Disslover
        RegistrationTool(COPPER_DISSOLVER, "copper_dissolver");
        RegistrationTool(ZINC_DISSOLVER, "zinc_dissolver");
        RegistrationTool(TIN_DISSOLVER, "tin_dissolver");
        RegistrationTool(ALUMINUM_DISSOLVER, "aluminum_dissolver");
        RegistrationTool(LEAD_DISSOLVER, "lead_dissolver");
        RegistrationTool(SILVER_DISSOLVER, "silver_dissolver");
        RegistrationTool(NICKEL_DISSOLVER, "nickel_dissolver");
        RegistrationTool(TUNGSTEN_DISSOLVER, "tungsten_dissolver");
        RegistrationTool(TITANIUM_DISSOLVER, "titanium_dissolver");
        RegistrationTool(IRON_DISSOLVER, "iron_dissolver");
        RegistrationTool(GOLD_DISSOLVER, "gold_dissolver");

        //Crushed Ore
        RegistrationTool(CRUSHED_ALUMINUM_ORE, "crushed_aluminum_ore");
        RegistrationTool(CRUSHED_COPPER_ORE, "crushed_copper_ore");
        RegistrationTool(CRUSHED_GOLD_ORE, "crushed_gold_ore");
        RegistrationTool(CRUSHED_IRON_ORE, "crushed_iron_ore");
        RegistrationTool(CRUSHED_LEAD_ORE, "crushed_lead_ore");
        RegistrationTool(CRUSHED_NICKEL_ORE, "crushed_nickel_ore");
        RegistrationTool(CRUSHED_SILVER_ORE, "crushed_silver_ore");
        RegistrationTool(CRUSHED_TIN_ORE, "crushed_tin_ore");
        RegistrationTool(CRUSHED_TITANIUM_ORE, "crushed_titanium_ore");
        RegistrationTool(CRUSHED_TUNGSTEN_ORE, "crushed_tungsten_ore");
        RegistrationTool(CRUSHED_ZINC_ORE, "crushed_zinc_ore");

        RegistrationTool(FIRECRACKERS, "firecrackers");

        //Machine-making
        RegistrationTool(COPPER_CONDUCTOR_CORE, "copper_conductor_core");
        RegistrationTool(SILVER_CONDUCTOR_CORE, "silver_conductor_core");
        RegistrationTool(TITANIUM_CONDUCTOR_CORE, "titanium_conductor_core");
        //RegistrationTool(PASSIVE_POWER_MODULE, "passive_power_module");
        //RegistrationTool(POWER_MODULE_L1, "power_module_lv1");
        //RegistrationTool(POWER_MODULE_L2, "power_module_lv2");
        //RegistrationTool(POWER_MODULE_L3, "power_module_lv3");


        //Ore By-products
        RegistrationTool(CORASE_ORE_POWDER, "corase_ore_powder");
        RegistrationTool(MINERAL_MUD, "mineral_mud");

        //Metal Forging
        RegistrationTool(FORGING_HAMMER, "forging_hammer");
        RegistrationTool(BAMBOO_CHOPPER, "bamboo_chopper");

    }


    private void RegistrationTool(Item ITEM, String PATH) {
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, PATH), ITEM);
    }
}
