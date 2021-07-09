package tech.icedlab.advagri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import tech.icedlab.advagri.ModAta;
import tech.icedlab.advagri.groups.AdvAgriItemCoreGroup;
import tech.icedlab.advagri.groups.AdvAgriItemToolsAndArmorsGroup;
import tech.icedlab.advagri.item.itemclass.BambooChopper;
import tech.icedlab.advagri.item.itemclass.ForgingHammer;
import tech.icedlab.advagri.item.itemclass.Wench;
import tech.icedlab.thorium.registration.RegistrationUtil;

import java.lang.reflect.Field;


public class AdvAgriItems {
    private static final AdvAgriItems Instance = new AdvAgriItems();

    public static ItemGroup ITEM_GROUP = AdvAgriItemCoreGroup.ITEM_GROUP;
    public static Integer MAX_ITEM_COUNT = 64;

    @AutoItem(Path = AdvAgriItemsEnum.COM_FERT)
    public Item COM_FERT;
    @AutoItem(Path = AdvAgriItemsEnum.TUNG_OIL)
    public Item TUNG_OIL;
    @AutoItem(Path = AdvAgriItemsEnum.POTASSIUM_SALT_POWDER)
    public Item POTASSIUM_SALT_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.PLANT_ASH)
    public Item PLANT_ASH;
    @AutoItem(Path = AdvAgriItemsEnum.BOTTLE_SMALL)
    public Item BOTTLE_SMALL;
    @AutoItem(Path = AdvAgriItemsEnum.BOTTLE_LARGE)
    public Item BOTTLE_LARGE;
    @AutoItem(Path = AdvAgriItemsEnum.SOLARIUM_BOTTLE_LARGE)
    public Item SOLARIUM_BOTTLE_LARGE;
    @AutoItem(Path = AdvAgriItemsEnum.SOLARIUM_BOTTLE_MEDIUM)
    public Item SOLARIUM_BOTTLE_MEDIUM;
    @AutoItem(Path = AdvAgriItemsEnum.SOLARIUM_BOTTLE_SMALL)
    public Item SOLARIUM_BOTTLE_SMALL;
    @AutoItem(Path = AdvAgriItemsEnum.BAMBOO_LEAVES)
    public Item BAMBOO_LEAVES;
    @AutoItem(Path = AdvAgriItemsEnum.BAMBOO_SILK)
    public Item BAMBOO_SILK;
    @AutoItem(Path = AdvAgriItemsEnum.BAMBOO_SILK_BOARD)
    public Item BAMBOO_SILK_BOARD;
    @AutoItem(Path = AdvAgriItemsEnum.BAMBOO_CHARCOAL)
    public Item BAMBOO_CHARCOAL;
    @AutoItem(Path = AdvAgriItemsEnum.BAMBOO_SHOOT)
    public Item BAMBOO_SHOOT;
    @AutoItem(Path = AdvAgriItemsEnum.PHOS)
    public Item PHOS;
    @AutoItem(Path = AdvAgriItemsEnum.ZIRCON)
    public Item ZIRCON;
    @AutoItem(Path = AdvAgriItemsEnum.SULFUR)
    public Item SULFUR;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_COPPER_ORE)
    public Item CRUSHED_COPPER_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_INGOT)
    public Item COPPER_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_POWDER)
    public Item COPPER_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_GEAR)
    public Item COPPER_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_PLATE)
    public Item COPPER_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_DISSOLVER)
    public Item COPPER_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_ROD)
    public Item COPPER_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_WIRE)
    public Item COPPER_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_ZINC_ORE)
    public Item CRUSHED_ZINC_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_INGOT)
    public Item ZINC_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_POWDER)
    public Item ZINC_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_GEAR)
    public Item ZINC_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_PLATE)
    public Item ZINC_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_DISSOLVER)
    public Item ZINC_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_ROD)
    public Item ZINC_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.ZINC_WIRE)
    public Item ZINC_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_TIN_ORE)
    public Item CRUSHED_TIN_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_INGOT)
    public Item TIN_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_POWDER)
    public Item TIN_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_GEAR)
    public Item TIN_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_PLATE)
    public Item TIN_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_DISSOLVER)
    public Item TIN_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_ROD)
    public Item TIN_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.TIN_WIRE)
    public Item TIN_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_SHARD)
    public Item BRONZE_SHARD;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_INGOT)
    public Item BRONZE_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_POWDER)
    public Item BRONZE_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_GEAR)
    public Item BRONZE_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_PLATE)
    public Item BRONZE_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_DISSOLVER)
    public Item BRONZE_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_ROD)
    public Item BRONZE_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.BRONZE_WIRE)
    public Item BRONZE_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_ALUMINUM_ORE)
    public Item CRUSHED_ALUMINUM_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_INGOT)
    public Item ALUMINUM_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_POWDER)
    public Item ALUMINUM_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_GEAR)
    public Item ALUMINUM_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_PLATE)
    public Item ALUMINUM_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_DISSOLVER)
    public Item ALUMINUM_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_ROD)
    public Item ALUMINUM_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.ALUMINUM_WIRE)
    public Item ALUMINUM_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_LEAD_ORE)
    public Item CRUSHED_LEAD_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_INGOT)
    public Item LEAD_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_POWDER)
    public Item LEAD_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_GEAR)
    public Item LEAD_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_PLATE)
    public Item LEAD_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_DISSOLVER)
    public Item LEAD_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_ROD)
    public Item LEAD_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.LEAD_WIRE)
    public Item LEAD_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_SILVER_ORE)
    public Item CRUSHED_SILVER_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_INGOT)
    public Item SILVER_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_POWDER)
    public Item SILVER_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_GEAR)
    public Item SILVER_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_PLATE)
    public Item SILVER_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_DISSOLVER)
    public Item SILVER_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_ROD)
    public Item SILVER_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_WIRE)
    public Item SILVER_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.STEEL_INGOT)
    public Item STEEL_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.STEEL_POWDER)
    public Item STEEL_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.STEEL_GEAR)
    public Item STEEL_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.STEEL_PLATE)
    public Item STEEL_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.STEEL_ROD)
    public Item STEEL_ROD;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_NICKEL_ORE)
    public Item CRUSHED_NICKEL_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.NICKEL_INGOT)
    public Item NICKEL_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.NICKEL_POWDER)
    public Item NICKEL_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.NICKEL_GEAR)
    public Item NICKEL_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.NICKEL_PLATE)
    public Item NICKEL_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.NICKEL_DISSOLVER)
    public Item NICKEL_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.NICKEL_ROD)
    public Item NICKEL_ROD;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_TUNGSTEN_ORE)
    public Item CRUSHED_TUNGSTEN_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_INGOT)
    public Item TUNGSTEN_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_POWDER)
    public Item TUNGSTEN_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_GEAR)
    public Item TUNGSTEN_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_PLATE)
    public Item TUNGSTEN_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_DISSOLVER)
    public Item TUNGSTEN_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_ROD)
    public Item TUNGSTEN_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.TUNGSTEN_WIRE)
    public Item TUNGSTEN_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.CRUSHED_TITANIUM_ORE)
    public Item CRUSHED_TITANIUM_ORE;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_INGOT)
    public Item TITANIUM_INGOT;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_POWDER)
    public Item TITANIUM_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_GEAR)
    public Item TITANIUM_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_PLATE)
    public Item TITANIUM_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_DISSOLVER)
    public Item TITANIUM_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_ROD)
    public Item TITANIUM_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_WIRE)
    public Item TITANIUM_WIRE;

    @AutoItem(Path = AdvAgriItemsEnum.IRON_SHARD)
    public Item IRON_SHARD;
    @AutoItem(Path = AdvAgriItemsEnum.IRON_POWDER)
    public Item IRON_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.IRON_GEAR)
    public Item IRON_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.IRON_PLATE)
    public Item IRON_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.IRON_DISSOLVER)
    public Item IRON_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.IRON_ROD)
    public Item IRON_ROD;

    @AutoItem(Path = AdvAgriItemsEnum.GOLD_SHARD)
    public Item GOLD_SHARD;
    @AutoItem(Path = AdvAgriItemsEnum.GOLD_POWDER)
    public Item GOLD_POWDER;
    @AutoItem(Path = AdvAgriItemsEnum.GOLD_GEAR)
    public Item GOLD_GEAR;
    @AutoItem(Path = AdvAgriItemsEnum.GOLD_PLATE)
    public Item GOLD_PLATE;
    @AutoItem(Path = AdvAgriItemsEnum.GOLD_DISSOLVER)
    public Item GOLD_DISSOLVER;
    @AutoItem(Path = AdvAgriItemsEnum.GOLD_ROD)
    public Item GOLD_ROD;
    @AutoItem(Path = AdvAgriItemsEnum.GOLD_FOIL)
    public Item GOLD_FOIL;

    // Conductor Core
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_CONDUCTOR_CORE)
    public Item COPPER_CONDUCTOR_CORE;
    @AutoItem(Path = AdvAgriItemsEnum.SILVER_CONDUCTOR_CORE)
    public Item SILVER_CONDUCTOR_CORE;
    @AutoItem(Path = AdvAgriItemsEnum.TITANIUM_CONDUCTOR_CORE)
    public Item TITANIUM_CONDUCTOR_CORE;

    //Machine Manufacturing Materials
    @AutoItem(Path = AdvAgriItemsEnum.COPPER_COIL)
    public Item COPPER_COIL;
    @AutoItem(Path = AdvAgriItemsEnum.ELECTRIC_MOTOR_SMALL)
    public Item ELECTRIC_MOTOR_SMALL;
    @AutoItem(Path = AdvAgriItemsEnum.ELECTRIC_MOTOR_BIG)
    public Item ELECTRIC_MOTOR_BIG;

    // Ore By-products
    @AutoItem(Path = AdvAgriItemsEnum.MINERAL_MUD)
    public Item MINERAL_MUD;
    @AutoItem(Path = AdvAgriItemsEnum.CORASE_ORE_POWDER)
    public Item CORASE_ORE_POWDER;

    // Tools
    @AutoItem(Path = AdvAgriItemsEnum.FORGING_HAMMER)
    public ForgingHammer FORGING_HAMMER = new ForgingHammer(new FabricItemSettings().group(ITEM_GROUP).maxCount(1).recipeRemainder(this.FORGING_HAMMER));
    @AutoItem(Path = AdvAgriItemsEnum.BAMBOO_CHOPPER)
    public BambooChopper BAMBOO_CHOPPER = new BambooChopper(ToolMaterials.IRON, 1, 0F, new FabricItemSettings().group(AdvAgriItemToolsAndArmorsGroup.ITEM_GROUP));
    @AutoItem(Path = AdvAgriItemsEnum.WENCH)
    public Wench WENCH = new Wench(new FabricItemSettings().group(ITEM_GROUP).maxCount(1));

    // Plant "Seed"
    @AutoItem(Path = AdvAgriItemsEnum.RICE_SEED_BAG)
    public Item RICE_SEED_BAG;
    @AutoItem(Path = AdvAgriItemsEnum.CHILI_SEED_BAG)
    public Item CHILI_SEED_BAG;
    @AutoItem(Path = AdvAgriItemsEnum.CELERY_SEED_BAG)
    public Item CELERY_SEED_BAG;
    @AutoItem(Path = AdvAgriItemsEnum.LETTUCE_SEED_BAG)
    public Item LETTUCE_SEED_BAG;
    @AutoItem(Path = AdvAgriItemsEnum.STRAWBERRY_SEED_BAG)
    public Item STRAWBERRY_SEED_BAG;
    @AutoItem(Path = AdvAgriItemsEnum.CORN_SEED_BAG)
    public Item CORN_SEED_BAG;
    @AutoItem(Path = AdvAgriItemsEnum.SWEET_POTATO_VINE)
    public Item SWEET_POTATO_VINE;

    // Farming Product
    @AutoItem(Path = AdvAgriItemsEnum.RICE_UNHUSKED)
    public Item RICE_UNHUSKED;
    @AutoItem(Path = AdvAgriItemsEnum.RICE)
    public Item RICE;
    @AutoItem(Path = AdvAgriItemsEnum.PLANT_STRAW)
    public Item PLANT_STRAW;
    @AutoItem(Path = AdvAgriItemsEnum.SWEET_POTATO)
    public Item SWEET_POTATO;
    @AutoItem(Path = AdvAgriItemsEnum.CHILI)
    public Item CHILI;
    @AutoItem(Path = AdvAgriItemsEnum.CELERY)
    public Item CELERY;
    @AutoItem(Path = AdvAgriItemsEnum.LETTUCE)
    public Item LETTUCE;
    @AutoItem(Path = AdvAgriItemsEnum.STRAWBERRY)
    public Item STRAWBERRY;
    @AutoItem(Path = AdvAgriItemsEnum.GARLIC)
    public Item GARLIC;
    @AutoItem(Path = AdvAgriItemsEnum.CHUFA)
    public Item CHUFA;

    //Solar Bush
    @AutoItem(Path = AdvAgriItemsEnum.SOLAR_BERRY)
    public Item SOLAR_BERRY;


    private AdvAgriItems() {
        ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
    }

    public void registryItem() {
        Field[] fields = AdvAgriItems.class.getFields();
        for (Field f : fields) {
            try {
                f.setAccessible(true);
                if (f.isAnnotationPresent(AutoItem.class) && f.get(AdvAgriItems.getInstance()) == null) {
                    f.set(AdvAgriItems.getInstance(), new Item(new FabricItemSettings().group(ITEM_GROUP)));
                    new RegistrationUtil().reg(((Item) f.get(AdvAgriItems.getInstance())), f.getAnnotation(AutoItem.class).Path().toString().toLowerCase(), ModAta.ModID);
                } else if (f.isAnnotationPresent(AutoItem.class))
                    new RegistrationUtil().reg(((Item) f.get(AdvAgriItems.getInstance())), f.getAnnotation(AutoItem.class).Path().toString().toLowerCase(), ModAta.ModID);
                f.setAccessible(false);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static AdvAgriItems getInstance() {
        return Instance;
    }

}
