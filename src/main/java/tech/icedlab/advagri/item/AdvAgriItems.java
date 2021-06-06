package tech.icedlab.advagri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import tech.icedlab.advagri.ModAta;
import tech.icedlab.advagri.itemgroup.AdvAgriItemCoreGroup;
import tech.icedlab.advagri.itemgroup.AdvAgriItemToolAndArmorsGroup;
import tech.icedlab.advagri.itemgroup.AdvAgriItemWorldGroup;
import tech.icedlab.thorium.registration.RegistrationUtilForItem;


public class AdvAgriItems {
    public static AdvAgriItems thisAdvAgriItems = new AdvAgriItems();

    public static Integer MAX_ITEM_COUNT = 64;

    private RegistrationUtilForItem i = new RegistrationUtilForItem();

    /// GENERATE
// Other
    public static Item COM_FERT;
    public static Item TUNG_OIL;
    public static Item POTASSIUM_SALT_POWDER;
    public static Item PLANT_ASH;
    // Bottle
    public static Item BOTTLE_SMALL;
    public static Item BOTTLE_LARGE;
    // Solarium Bottle
    public static Item SOLARIUM_BOTTLE_LARGE;
    public static Item SOLARIUM_BOTTLE_MEDIUM;
    public static Item SOLARIUM_BOTTLE_SMALL;
    // Bamboo
    public static Item BAMBOO_LEAVES;
    public static Item BAMBOO_SILK;
    public static Item BAMBOO_SILK_BOARD;
    public static Item BAMBOO_CHARCOAL;
    public static Item BAMBOO_SHOOT;
    // Non-metal resources
    public static Item PHOS;
    public static Item ZIRCON;
    public static Item SULFUR;
    // Copper
    public static Item COPPER_SHARD;
    public static Item COPPER_INGOT;
    public static Item COPPER_POWDER;
    public static Item COPPER_GEAR;
    public static Item COPPER_PLATE;
    public static Item COPPER_DISSOLVER;
    public static Item CRUSHED_RAW_COPPER;
    public static Item COPPER_ROD;
    public static Item COPPER_WIRE;
    // Zinc
    public static Item ZINC_SHARD;
    public static Item ZINC_INGOT;
    public static Item ZINC_POWDER;
    public static Item ZINC_GEAR;
    public static Item ZINC_PLATE;
    public static Item ZINC_DISSOLVER;
    public static Item CRUSHED_RAW_ZINC;
    public static Item ZINC_ROD;
    public static Item ZINC_FOIL;
    public static Item RAW_ZINC;
    // Tin
    public static Item TIN_SHARD;
    public static Item TIN_INGOT;
    public static Item TIN_POWDER;
    public static Item TIN_GEAR;
    public static Item TIN_PLATE;
    public static Item TIN_DISSOLVER;
    public static Item CRUSHED_RAW_TIN;
    public static Item TIN_ROD;
    public static Item RAW_TIN;
    // Bronze
    public static Item BRONZE_SHARD;
    public static Item BRONZE_INGOT;
    public static Item BRONZE_POWDER;
    public static Item BRONZE_GEAR;
    public static Item BRONZE_PLATE;
    public static Item BRONZE_ROD;
    // Aluminum
    public static Item ALUMINUM_SHARD;
    public static Item ALUMINUM_INGOT;
    public static Item ALUMINUM_POWDER;
    public static Item ALUMINUM_GEAR;
    public static Item ALUMINUM_PLATE;
    public static Item ALUMINUM_DISSOLVER;
    public static Item CRUSHED_RAW_ALUMINUM;
    public static Item ALUMINUM_ROD;
    public static Item ALUMINUM_FOIL;
    public static Item RAW_ALUMINUM;
    // Lead
    public static Item LEAD_SHARD;
    public static Item LEAD_INGOT;
    public static Item LEAD_POWDER;
    public static Item LEAD_GEAR;
    public static Item LEAD_PLATE;
    public static Item LEAD_DISSOLVER;
    public static Item CRUSHED_RAW_LEAD;
    public static Item RAW_LEAD;
    // Silver
    public static Item SILVER_SHARD;
    public static Item SILVER_INGOT;
    public static Item SILVER_POWDER;
    public static Item SILVER_GEAR;
    public static Item SILVER_PLATE;
    public static Item SILVER_DISSOLVER;
    public static Item CRUSHED_RAW_SILVER;
    public static Item SILVER_ROD;
    public static Item SILVER_FOIL;
    public static Item SILVER_WIRE;
    public static Item RAW_SILVER;
    // Steel
    public static Item STEEL_INGOT;
    public static Item STEEL_POWDER;
    public static Item STEEL_GEAR;
    public static Item STEEL_PLATE;
    public static Item CRUSHED_RAW_HIGH_CARBON_IRON;
    public static Item STEEL_ROD;
    public static Item RAW_HIGH_CARBON_IRON;
    // Nickel
    public static Item NICKEL_SHARD;
    public static Item NICKEL_INGOT;
    public static Item NICKEL_POWDER;
    public static Item NICKEL_GEAR;
    public static Item NICKEL_PLATE;
    public static Item NICKEL_DISSOLVER;
    public static Item CRUSHED_RAW_NICKEL;
    public static Item NICKEL_ROD;
    public static Item NICKEL_FOIL;
    public static Item RAW_NICKEL;
    // Tungsten
    public static Item TUNGSTEN_SHARD;
    public static Item TUNGSTEN_INGOT;
    public static Item TUNGSTEN_POWDER;
    public static Item TUNGSTEN_GEAR;
    public static Item TUNGSTEN_PLATE;
    public static Item TUNGSTEN_DISSOLVER;
    public static Item CRUSHED_RAW_TUNGSTEN;
    public static Item TUNGSTEN_ROD;
    public static Item RAW_TUNGSTEN;
    // Titanium
    public static Item TITANIUM_SHARD;
    public static Item TITANIUM_INGOT;
    public static Item TITANIUM_POWDER;
    public static Item TITANIUM_GEAR;
    public static Item TITANIUM_PLATE;
    public static Item TITANIUM_DISSOLVER;
    public static Item CRUSHED_RAW_TITANIUM;
    public static Item TITANIUM_ROD;
    public static Item RAW_TITANIUM;
    // Iron
    public static Item IRON_SHARD;
    public static Item IRON_POWDER;
    public static Item IRON_GEAR;
    public static Item IRON_PLATE;
    public static Item IRON_DISSOLVER;
    public static Item CRUSHED_RAW_IRON;
    public static Item IRON_ROD;
    // Gold
    public static Item GOLD_SHARD;
    public static Item GOLD_POWDER;
    public static Item GOLD_GEAR;
    public static Item GOLD_PLATE;
    public static Item GOLD_DISSOLVER;
    public static Item CRUSHED_RAW_GOLD;
    public static Item GOLD_ROD;
    public static Item GOLD_FOIL;

    // Firecracker
    public static Firecracker FIRECRACKERS;

    // Conductor Core
    public static Item COPPER_CONDUCTOR_CORE;
    public static Item SILVER_CONDUCTOR_CORE;
    public static Item TITANIUM_CONDUCTOR_CORE;

    //Machine Manufacturing Materials
    public static Item COPPER_COIL;
    public static Item ELECTRIC_MOTOR_SMALL;
    public static Item ELECTRIC_MOTOR_BIG;

    // Ore By-products
    public static Item MINERAL_MUD;
    public static Item CORASE_ORE_POWDER;

    // Tools
    public static Item FORGING_HAMMER;
    public static Item BAMBOO_CHOPPER;
    public static Wench WENCH;

    // Plant "Seed"
    public static Item RICE_SEED_BAG;
    public static Item CHILI_SEED_BAG;
    public static Item CELERY_SEED_BAG;
    public static Item LETTUCE_SEED_BAG;
    public static Item STRAWBERRY_SEED_BAG;
    public static Item CORN_SEED_BAG;
    public static Item SWEET_POTATO_VINE;

    // Farming Product
    public static Item RICE_UNHUSKED;
    public static Item RICE;
    public static Item PLANT_STRAW;
    public static Item SWEET_POTATO;
    public static Item CHILI;
    public static Item CELERY;
    public static Item LETTUCE;
    public static Item STRAWBERRY;
    public static Item GARLIC;
    public static Item CHUFA;

    // Trees

    //Solar Bush
    public static Item SOLAR_BERRY;


    /// GENERATE

    public static ItemGroup ITEM_GROUP;

    private AdvAgriItems() {
        ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
    }

    public static AdvAgriItems getInstance() {
        return thisAdvAgriItems;
    }

    private static Item AddItemTool(ItemGroup itemGroup, Integer maxCount) {
        return new Item(new FabricItemSettings().group(itemGroup).maxCount(maxCount));
    }

    private static Item AddItemTool() {
        return new Item(new FabricItemSettings().group(ITEM_GROUP).maxCount(MAX_ITEM_COUNT));
    }

    private static Item AddItemTool(ItemGroup itemGroup) {
        return new Item(new FabricItemSettings().group(itemGroup).maxCount(MAX_ITEM_COUNT));
    }

    public void InitAllItems() {


        COM_FERT = AddItemTool();
        BAMBOO_LEAVES = AddItemTool();
        BAMBOO_SILK = AddItemTool();
        BAMBOO_SILK_BOARD = AddItemTool();
        BAMBOO_CHARCOAL = AddItemTool();
        PLANT_ASH = AddItemTool();
        POTASSIUM_SALT_POWDER = AddItemTool();
        TUNG_OIL = AddItemTool(AdvAgriItemCoreGroup.getInstance().GetGroup(), 1);
        BAMBOO_SHOOT = AddItemTool();
        ZIRCON = AddItemTool();
        PHOS = AddItemTool();
        SULFUR = AddItemTool();

        BOTTLE_LARGE = AddItemTool();
        BOTTLE_SMALL = AddItemTool();

        SOLARIUM_BOTTLE_LARGE = AddItemTool();
        SOLARIUM_BOTTLE_MEDIUM = AddItemTool();
        SOLARIUM_BOTTLE_SMALL = AddItemTool();

        // Ingot
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

        // Powder
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

        // Gear
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

        // Plate
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

        // Shard
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

        //Rod
        ALUMINUM_ROD = AddItemTool();
        BRONZE_ROD = AddItemTool();
        COPPER_ROD = AddItemTool();
        GOLD_ROD = AddItemTool();
        IRON_ROD = AddItemTool();
        NICKEL_ROD = AddItemTool();
        STEEL_ROD = AddItemTool();
        TIN_ROD = AddItemTool();
        TITANIUM_ROD = AddItemTool();
        TUNGSTEN_ROD = AddItemTool();
        ZINC_ROD = AddItemTool();

        // Foil
        ALUMINUM_FOIL = AddItemTool();
        SILVER_FOIL = AddItemTool();
        GOLD_FOIL = AddItemTool();
        NICKEL_FOIL = AddItemTool();
        ZINC_FOIL = AddItemTool();

        //Wire
        COPPER_WIRE = AddItemTool();
        SILVER_WIRE = AddItemTool();

        // Metal Dissolver
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

        // Crushed Ore
        CRUSHED_RAW_ALUMINUM = AddItemTool();
        CRUSHED_RAW_COPPER = AddItemTool();
        CRUSHED_RAW_GOLD = AddItemTool();
        CRUSHED_RAW_IRON = AddItemTool();
        CRUSHED_RAW_LEAD = AddItemTool();
        CRUSHED_RAW_NICKEL = AddItemTool();
        CRUSHED_RAW_SILVER = AddItemTool();
        CRUSHED_RAW_TIN = AddItemTool();
        CRUSHED_RAW_HIGH_CARBON_IRON = AddItemTool();
        CRUSHED_RAW_TITANIUM = AddItemTool();
        CRUSHED_RAW_TUNGSTEN = AddItemTool();
        CRUSHED_RAW_ZINC = AddItemTool();

        FIRECRACKERS = new Firecracker(new FabricItemSettings().group(ITEM_GROUP).maxCount(MAX_ITEM_COUNT));

        // Conductor Core
        COPPER_CONDUCTOR_CORE = AddItemTool();
        SILVER_CONDUCTOR_CORE = AddItemTool();
        TITANIUM_CONDUCTOR_CORE = AddItemTool();

        //Machine Manufacturing Materials
        COPPER_COIL = AddItemTool();
        ELECTRIC_MOTOR_SMALL = AddItemTool();
        ELECTRIC_MOTOR_BIG = AddItemTool();

        // Ore By-products
        MINERAL_MUD = AddItemTool();
        CORASE_ORE_POWDER = AddItemTool();

        // Metal FORGING
        FORGING_HAMMER = new ForgingHammer(
                new FabricItemSettings().group(ITEM_GROUP).maxCount(1).recipeRemainder(FORGING_HAMMER));

        BAMBOO_CHOPPER = new BambooChopper(ToolMaterials.IRON, 1, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        WENCH = new Wench(new FabricItemSettings().group(ITEM_GROUP).maxCount(1));

        //Plant "Seed"
        RICE_SEED_BAG = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        CHILI_SEED_BAG = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        CELERY_SEED_BAG = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        LETTUCE_SEED_BAG = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        STRAWBERRY_SEED_BAG = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        CORN_SEED_BAG = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        SWEET_POTATO_VINE = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());

        //Plant Product
        RICE_UNHUSKED = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        RICE = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        PLANT_STRAW = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        SWEET_POTATO = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        CHILI = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        CELERY = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        LETTUCE = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        STRAWBERRY = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        GARLIC = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());
        CHUFA = AddItemTool(AdvAgriItemWorldGroup.getInstance().GetGroup());

    }

    public void RegisteredItems() {
        // RegistrationTool( ,"");

        i.setMODID(ModAta.ModID);
        i.add(COM_FERT, "com_fert").
                add(BAMBOO_LEAVES, "bamboo_leaves").
                add(BAMBOO_SILK, "bamboo_silk").
                add(BAMBOO_SILK_BOARD, "bamboo_silk_board").
                add(BAMBOO_CHARCOAL, "bamboo_charcoal").
                add(PLANT_ASH, "plant_ash").
                add(POTASSIUM_SALT_POWDER, "potassium_salt_powder").
                add(ZIRCON, "zircon").
                add(SULFUR, "sulfur").
                add(PHOS, "phos").
                add(BOTTLE_SMALL, "bottle_small").
                add(BOTTLE_LARGE, "bottle_large").
                add(SOLARIUM_BOTTLE_SMALL, "solarium_bottle_small").
                add(SOLARIUM_BOTTLE_MEDIUM, "solarium_bottle").
                add(SOLARIUM_BOTTLE_LARGE, "solarium_bottle_large").
                add(COPPER_INGOT, "copper_ingot").
                add(ZINC_INGOT, "zinc_ingot").
                add(TIN_INGOT, "tin_ingot").
                add(BRONZE_INGOT, "bronze_ingot").
                add(ALUMINUM_INGOT, "aluminum_ingot").
                add(LEAD_INGOT, "lead_ingot").
                add(SILVER_INGOT, "silver_ingot").
                add(STEEL_INGOT, "steel_ingot").
                add(NICKEL_INGOT, "nickel_ingot").
                add(TUNGSTEN_INGOT, "tungsten_ingot").
                add(TITANIUM_INGOT, "titanium_ingot").
                add(COPPER_POWDER, "copper_powder").
                add(ZINC_POWDER, "zinc_powder").
                add(TIN_POWDER, "tin_powder").
                add(BRONZE_POWDER, "bronze_powder").
                add(ALUMINUM_POWDER, "aluminum_powder").
                add(LEAD_POWDER, "lead_powder").
                add(SILVER_POWDER, "silver_powder").
                add(STEEL_POWDER, "steel_powder").
                add(NICKEL_POWDER, "nickel_powder").
                add(TUNGSTEN_POWDER, "tungsten_powder").
                add(TITANIUM_POWDER, "titanium_powder").
                add(IRON_POWDER, "iron_powder").
                add(GOLD_POWDER, "gold_powder").
                add(COPPER_GEAR, "copper_gear").
                add(ZINC_GEAR, "zinc_gear").
                add(TIN_GEAR, "tin_gear").
                add(BRONZE_GEAR, "bronze_gear").
                add(ALUMINUM_GEAR, "aluminum_gear").
                add(LEAD_GEAR, "lead_gear").
                add(SILVER_GEAR, "silver_gear").
                add(STEEL_GEAR, "steel_gear").
                add(NICKEL_GEAR, "nickel_gear").
                add(TUNGSTEN_GEAR, "tungsten_gear").
                add(TITANIUM_GEAR, "titanium_gear").
                add(IRON_GEAR, "iron_gear").
                add(GOLD_GEAR, "gold_gear").
                add(COPPER_PLATE, "copper_plate").
                add(ZINC_PLATE, "zinc_plate").
                add(TIN_PLATE, "tin_plate").
                add(BRONZE_PLATE, "bronze_plate").
                add(ALUMINUM_PLATE, "aluminum_plate").
                add(LEAD_PLATE, "lead_plate").
                add(SILVER_PLATE, "silver_plate").
                add(STEEL_PLATE, "steel_plate").
                add(NICKEL_PLATE, "nickel_plate").
                add(TUNGSTEN_PLATE, "tungsten_plate").
                add(TITANIUM_PLATE, "titanium_plate").
                add(IRON_PLATE, "iron_plate").
                add(GOLD_PLATE, "gold_plate").
                add(COPPER_SHARD, "copper_shard").
                add(ZINC_SHARD, "zinc_shard").
                add(TIN_SHARD, "tin_shard").
                add(BRONZE_SHARD, "bronze_shard").
                add(ALUMINUM_SHARD, "aluminum_shard").
                add(LEAD_SHARD, "lead_shard").
                add(SILVER_SHARD, "silver_shard").
                add(NICKEL_SHARD, "nickel_shard").
                add(TUNGSTEN_SHARD, "tungsten_shard").
                add(TITANIUM_SHARD, "titanium_shard").
                add(IRON_SHARD, "iron_shard").
                add(GOLD_SHARD, "gold_shard").
                add(COPPER_DISSOLVER, "copper_dissolver").
                add(ZINC_DISSOLVER, "zinc_dissolver").
                add(TIN_DISSOLVER, "tin_dissolver").
                add(ALUMINUM_DISSOLVER, "aluminum_dissolver").
                add(LEAD_DISSOLVER, "lead_dissolver").
                add(SILVER_DISSOLVER, "silver_dissolver").
                add(NICKEL_DISSOLVER, "nickel_dissolver").
                add(TUNGSTEN_DISSOLVER, "tungsten_dissolver").
                add(TITANIUM_DISSOLVER, "titanium_dissolver").
                add(IRON_DISSOLVER, "iron_dissolver").
                add(GOLD_DISSOLVER, "gold_dissolver").
                add(CRUSHED_RAW_ALUMINUM, "crushed_raw_aluminum").
                add(CRUSHED_RAW_COPPER, "crushed_raw_copper").
                add(CRUSHED_RAW_GOLD, "crushed_raw_gold").
                add(CRUSHED_RAW_IRON, "crushed_raw_iron").
                add(CRUSHED_RAW_LEAD, "crushed_raw_lead").
                add(CRUSHED_RAW_NICKEL, "crushed_raw_nickel").
                add(CRUSHED_RAW_SILVER, "crushed_raw_silver").
                add(CRUSHED_RAW_TIN, "crushed_raw_tin").
                add(CRUSHED_RAW_TITANIUM, "crushed_raw_titanium").
                add(CRUSHED_RAW_TUNGSTEN, "crushed_raw_tungsten").
                add(CRUSHED_RAW_ZINC, "crushed_raw_zinc").
                add(CRUSHED_RAW_HIGH_CARBON_IRON, "crushed_raw_high_carbon_iron").
                add(ALUMINUM_ROD, "aluminum_rod").
                add(BRONZE_ROD, "bronze_rod").
                add(COPPER_ROD, "copper_rod").
                add(GOLD_ROD, "gold_rod").
                add(IRON_ROD, "iron_rod").
                add(NICKEL_ROD, "nickel_rod").
                add(STEEL_ROD, "steel_rod").
                add(TIN_ROD, "tin_rod").
                add(TUNGSTEN_ROD, "tungsten_rod").
                add(TITANIUM_ROD, "titanium_rod").
                add(ZINC_ROD, "zinc_rod").
                add(ALUMINUM_FOIL, "aluminum_foil").
                add(GOLD_FOIL, "gold_foil").
                add(SILVER_FOIL, "silver_foil").
                add(NICKEL_FOIL, "nickel_foil").
                add(ZINC_FOIL, "zinc_foil").
                add(COPPER_WIRE, "copper_wire").
                add(SILVER_WIRE, "silver_wire").
                add(COPPER_COIL, "copper_coil").
                add(ELECTRIC_MOTOR_SMALL, "electric_motor_small").
                add(ELECTRIC_MOTOR_BIG, "electric_motor_big").
                add(FIRECRACKERS, "firecrackers").
                add(COPPER_CONDUCTOR_CORE, "copper_conductor_core").
                add(SILVER_CONDUCTOR_CORE, "silver_conductor_core").
                add(TITANIUM_CONDUCTOR_CORE, "titanium_conductor_core").
                add(CORASE_ORE_POWDER, "corase_ore_powder").
                add(MINERAL_MUD, "mineral_mud").
                add(FORGING_HAMMER, "forging_hammer").
                add(BAMBOO_CHOPPER, "bamboo_chopper").
                add(WENCH, "wench").
                add(RICE_SEED_BAG, "rice_seed_bag").
                add(CHILI_SEED_BAG, "chili_seed_bag").
                add(CELERY_SEED_BAG, "celery_seed_bag").
                add(LETTUCE_SEED_BAG, "lettuce_seed_bag").
                add(STRAWBERRY_SEED_BAG, "strawberry_seed_bag").
                add(CORN_SEED_BAG, "corn_seed_bag").
                add(SWEET_POTATO_VINE, "sweet_potato_vine").
                add(RICE_UNHUSKED, "rice_unhusked").
                add(RICE, "rice").
                add(PLANT_STRAW, "plant_straw").
                add(SWEET_POTATO, "sweet_potato").
                add(CHILI, "chili").
                add(CELERY, "celery").
                add(LETTUCE, "lettuce").
                add(STRAWBERRY, "strawberry").
                add(GARLIC, "garlic").
                add(CHUFA, "chufa").
//                add(SOLAR_BERRY, "solar_berry").
        registration();


        //Trees

    }
}
