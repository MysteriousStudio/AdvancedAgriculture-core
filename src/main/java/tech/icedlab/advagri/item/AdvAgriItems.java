package tech.icedlab.advagri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import tech.icedlab.advagri.annotation.ItemR;
import tech.icedlab.advagri.groups.AdvAgriItemCoreGroup;
import tech.icedlab.advagri.groups.AdvAgriItemToolsAndArmorsGroup;
import tech.icedlab.advagri.item.itemclass.BambooChopper;
import tech.icedlab.advagri.item.itemclass.ForgingHammer;
import tech.icedlab.advagri.item.itemclass.Wench;
import tech.icedlab.thorium.registration.RegistrationMetaData;

import java.lang.reflect.Field;
import java.util.LinkedList;


public class AdvAgriItems {
    private static final AdvAgriItems Instance = new AdvAgriItems();

    public static ItemGroup ITEM_GROUP;
    public static Integer MAX_ITEM_COUNT = 64;

    @ItemR(Path = AdvAgriItemsEnum.COM_FERT)
    public Item COM_FERT;
    @ItemR(Path = AdvAgriItemsEnum.TUNG_OIL)
    public Item TUNG_OIL;
    @ItemR(Path = AdvAgriItemsEnum.POTASSIUM_SALT_POWDER)
    public Item POTASSIUM_SALT_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.PLANT_ASH)
    public Item PLANT_ASH;
    @ItemR(Path = AdvAgriItemsEnum.BOTTLE_SMALL)
    public Item BOTTLE_SMALL;
    @ItemR(Path = AdvAgriItemsEnum.BOTTLE_LARGE)
    public Item BOTTLE_LARGE;
    @ItemR(Path = AdvAgriItemsEnum.SOLARIUM_BOTTLE_LARGE)
    public Item SOLARIUM_BOTTLE_LARGE;
    @ItemR(Path = AdvAgriItemsEnum.SOLARIUM_BOTTLE_MEDIUM)
    public Item SOLARIUM_BOTTLE_MEDIUM;
    @ItemR(Path = AdvAgriItemsEnum.SOLARIUM_BOTTLE_MEDIUM)
    public Item SOLARIUM_BOTTLE_SMALL;
    @ItemR(Path = AdvAgriItemsEnum.BAMBOO_LEAVES)
    public Item BAMBOO_LEAVES;
    @ItemR(Path = AdvAgriItemsEnum.BAMBOO_SILK)
    public Item BAMBOO_SILK;
    @ItemR(Path = AdvAgriItemsEnum.BAMBOO_SILK_BOARD)
    public Item BAMBOO_SILK_BOARD;
    @ItemR(Path = AdvAgriItemsEnum.BAMBOO_CHARCOAL)
    public Item BAMBOO_CHARCOAL;
    @ItemR(Path = AdvAgriItemsEnum.BAMBOO_SHOOT)
    public Item BAMBOO_SHOOT;
    @ItemR(Path = AdvAgriItemsEnum.PHOS)
    public Item PHOS;
    @ItemR(Path = AdvAgriItemsEnum.ZIRCON)
    public Item ZIRCON;
    @ItemR(Path = AdvAgriItemsEnum.SULFUR)
    public Item SULFUR;

    @ItemR(Path = AdvAgriItemsEnum.COPPER_SHARD)
    public Item COPPER_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_INGOT)
    public Item COPPER_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_POWDER)
    public Item COPPER_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_GEAR)
    public Item COPPER_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_PLATE)
    public Item COPPER_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_DISSOLVER)
    public Item COPPER_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_ROD)
    public Item COPPER_ROD;
    @ItemR(Path = AdvAgriItemsEnum.COPPER_WIRE)
    public Item COPPER_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.ZINC_SHARD)
    public Item ZINC_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_INGOT)
    public Item ZINC_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_POWDER)
    public Item ZINC_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_GEAR)
    public Item ZINC_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_PLATE)
    public Item ZINC_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_DISSOLVER)
    public Item ZINC_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_ROD)
    public Item ZINC_ROD;
    @ItemR(Path = AdvAgriItemsEnum.ZINC_WIRE)
    public Item ZINC_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.TIN_SHARD)
    public Item TIN_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.TIN_INGOT)
    public Item TIN_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.TIN_POWDER)
    public Item TIN_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.TIN_GEAR)
    public Item TIN_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.TIN_PLATE)
    public Item TIN_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.TIN_DISSOLVER)
    public Item TIN_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.TIN_ROD)
    public Item TIN_ROD;
    @ItemR(Path = AdvAgriItemsEnum.TIN_WIRE)
    public Item TIN_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.BRONZE_SHARD)
    public Item BRONZE_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_INGOT)
    public Item BRONZE_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_POWDER)
    public Item BRONZE_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_GEAR)
    public Item BRONZE_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_PLATE)
    public Item BRONZE_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_DISSOLVER)
    public Item BRONZE_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_ROD)
    public Item BRONZE_ROD;
    @ItemR(Path = AdvAgriItemsEnum.BRONZE_WIRE)
    public Item BRONZE_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_SHARD)
    public Item ALUMINUM_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_INGOT)
    public Item ALUMINUM_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_POWDER)
    public Item ALUMINUM_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_GEAR)
    public Item ALUMINUM_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_PLATE)
    public Item ALUMINUM_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_DISSOLVER)
    public Item ALUMINUM_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_ROD)
    public Item ALUMINUM_ROD;
    @ItemR(Path = AdvAgriItemsEnum.ALUMINUM_WIRE)
    public Item ALUMINUM_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.LEAD_SHARD)
    public Item LEAD_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_INGOT)
    public Item LEAD_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_POWDER)
    public Item LEAD_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_GEAR)
    public Item LEAD_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_PLATE)
    public Item LEAD_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_DISSOLVER)
    public Item LEAD_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_ROD)
    public Item LEAD_ROD;
    @ItemR(Path = AdvAgriItemsEnum.LEAD_WIRE)
    public Item LEAD_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.SILVER_SHARD)
    public Item SILVER_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_INGOT)
    public Item SILVER_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_POWDER)
    public Item SILVER_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_GEAR)
    public Item SILVER_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_PLATE)
    public Item SILVER_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_DISSOLVER)
    public Item SILVER_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_ROD)
    public Item SILVER_ROD;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_WIRE)
    public Item SILVER_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.STEEL_INGOT)
    public Item STEEL_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.STEEL_POWDER)
    public Item STEEL_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.STEEL_GEAR)
    public Item STEEL_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.STEEL_PLATE)
    public Item STEEL_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.STEEL_ROD)
    public Item STEEL_ROD;

    @ItemR(Path = AdvAgriItemsEnum.NICKEL_SHARD)
    public Item NICKEL_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.NICKEL_INGOT)
    public Item NICKEL_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.NICKEL_POWDER)
    public Item NICKEL_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.NICKEL_GEAR)
    public Item NICKEL_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.NICKEL_PLATE)
    public Item NICKEL_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.NICKEL_DISSOLVER)
    public Item NICKEL_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.NICKEL_ROD)
    public Item NICKEL_ROD;


    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_SHARD)
    public Item TUNGSTEN_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_INGOT)
    public Item TUNGSTEN_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_POWDER)
    public Item TUNGSTEN_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_GEAR)
    public Item TUNGSTEN_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_PLATE)
    public Item TUNGSTEN_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_DISSOLVER)
    public Item TUNGSTEN_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_ROD)
    public Item TUNGSTEN_ROD;
    @ItemR(Path = AdvAgriItemsEnum.TUNGSTEN_WIRE)
    public Item TUNGSTEN_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_SHARD)
    public Item TITANIUM_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_INGOT)
    public Item TITANIUM_INGOT;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_POWDER)
    public Item TITANIUM_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_GEAR)
    public Item TITANIUM_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_PLATE)
    public Item TITANIUM_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_DISSOLVER)
    public Item TITANIUM_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_ROD)
    public Item TITANIUM_ROD;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_WIRE)
    public Item TITANIUM_WIRE;

    @ItemR(Path = AdvAgriItemsEnum.IRON_SHARD)
    public Item IRON_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.IRON_POWDER)
    public Item IRON_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.IRON_GEAR)
    public Item IRON_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.IRON_PLATE)
    public Item IRON_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.IRON_DISSOLVER)
    public Item IRON_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.IRON_ROD)
    public Item IRON_ROD;

    @ItemR(Path = AdvAgriItemsEnum.GOLD_SHARD)
    public Item GOLD_SHARD;
    @ItemR(Path = AdvAgriItemsEnum.GOLD_POWDER)
    public Item GOLD_POWDER;
    @ItemR(Path = AdvAgriItemsEnum.GOLD_GEAR)
    public Item GOLD_GEAR;
    @ItemR(Path = AdvAgriItemsEnum.GOLD_PLATE)
    public Item GOLD_PLATE;
    @ItemR(Path = AdvAgriItemsEnum.GOLD_DISSOLVER)
    public Item GOLD_DISSOLVER;
    @ItemR(Path = AdvAgriItemsEnum.GOLD_ROD)
    public Item GOLD_ROD;
    @ItemR(Path = AdvAgriItemsEnum.GOLD_FOIL)
    public Item GOLD_FOIL;

    // Conductor Core
    @ItemR(Path = AdvAgriItemsEnum.COPPER_CONDUCTOR_CORE)
    public Item COPPER_CONDUCTOR_CORE;
    @ItemR(Path = AdvAgriItemsEnum.SILVER_CONDUCTOR_CORE)
    public Item SILVER_CONDUCTOR_CORE;
    @ItemR(Path = AdvAgriItemsEnum.TITANIUM_CONDUCTOR_CORE)
    public Item TITANIUM_CONDUCTOR_CORE;

    //Machine Manufacturing Materials
    @ItemR(Path = AdvAgriItemsEnum.COPPER_COIL)
    public Item COPPER_COIL;
    @ItemR(Path = AdvAgriItemsEnum.ELECTRIC_MOTOR_SMALL)
    public Item ELECTRIC_MOTOR_SMALL;
    @ItemR(Path = AdvAgriItemsEnum.ELECTRIC_MOTOR_BIG)
    public Item ELECTRIC_MOTOR_BIG;

    // Ore By-products
    @ItemR(Path = AdvAgriItemsEnum.MINERAL_MUD)
    public Item MINERAL_MUD;
    @ItemR(Path = AdvAgriItemsEnum.CORASE_ORE_POWDER)
    public Item CORASE_ORE_POWDER;

    // Tools
    @ItemR(Path = AdvAgriItemsEnum.FORGING_HAMMER)
    public ForgingHammer FORGING_HAMMER = new ForgingHammer(new FabricItemSettings().group(ITEM_GROUP).maxCount(1).recipeRemainder(this.FORGING_HAMMER));
    @ItemR(Path = AdvAgriItemsEnum.BAMBOO_CHOPPER)
    public BambooChopper BAMBOO_CHOPPER = new BambooChopper(ToolMaterials.IRON, 1, 0F, new FabricItemSettings().group(AdvAgriItemToolsAndArmorsGroup.ITEM_GROUP));
    @ItemR(Path = AdvAgriItemsEnum.WENCH)
    public Wench WENCH = new Wench(new FabricItemSettings().group(ITEM_GROUP).maxCount(1));

    // Plant "Seed"
    @ItemR(Path = AdvAgriItemsEnum.RICE_SEED_BAG)
    public Item RICE_SEED_BAG;
    @ItemR(Path = AdvAgriItemsEnum.CHILI_SEED_BAG)
    public Item CHILI_SEED_BAG;
    @ItemR(Path = AdvAgriItemsEnum.CELERY_SEED_BAG)
    public Item CELERY_SEED_BAG;
    @ItemR(Path = AdvAgriItemsEnum.LETTUCE_SEED_BAG)
    public Item LETTUCE_SEED_BAG;
    @ItemR(Path = AdvAgriItemsEnum.STRAWBERRY_SEED_BAG)
    public Item STRAWBERRY_SEED_BAG;
    @ItemR(Path = AdvAgriItemsEnum.CORN_SEED_BAG)
    public Item CORN_SEED_BAG;
    @ItemR(Path = AdvAgriItemsEnum.SWEET_POTATO_VINE)
    public Item SWEET_POTATO_VINE;

    // Farming Product
    @ItemR(Path = AdvAgriItemsEnum.RICE_UNHUSKED)
    public Item RICE_UNHUSKED;
    @ItemR(Path = AdvAgriItemsEnum.RICE)
    public Item RICE;
    @ItemR(Path = AdvAgriItemsEnum.PLANT_STRAW)
    public Item PLANT_STRAW;
    @ItemR(Path = AdvAgriItemsEnum.SWEET_POTATO)
    public Item SWEET_POTATO;
    @ItemR(Path = AdvAgriItemsEnum.CHILI)
    public Item CHILI;
    @ItemR(Path = AdvAgriItemsEnum.CELERY)
    public Item CELERY;
    @ItemR(Path = AdvAgriItemsEnum.LETTUCE)
    public Item LETTUCE;
    @ItemR(Path = AdvAgriItemsEnum.STRAWBERRY)
    public Item STRAWBERRY;
    @ItemR(Path = AdvAgriItemsEnum.GARLIC)
    public Item GARLIC;
    @ItemR(Path = AdvAgriItemsEnum.CHUFA)
    public Item CHUFA;

    //Solar Bush
    @ItemR(Path = AdvAgriItemsEnum.SOLAR_BERRY)
    public Item SOLAR_BERRY;


    private AdvAgriItems() {
        ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
        Field[] fields = AdvAgriItems.class.getFields();
        LinkedList<RegistrationMetaData<net.minecraft.item.Item>> itemLinkedList = new LinkedList<>();
        Class<?> clazz = Item.class;
        for (Field f : fields) {
            ItemR a = f.getAnnotation(ItemR.class);
            if (a != null) {
                f.setAccessible(true);
                try {
                    if (f.getName() == null) {

                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static AdvAgriItems getInstance() {
        return Instance;
    }

}
