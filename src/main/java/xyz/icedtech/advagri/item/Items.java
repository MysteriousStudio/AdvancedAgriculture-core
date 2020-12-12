package xyz.icedtech.advagri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemCoreGroup;

public class Items {
    public static Items thisItems = new Items();

    public static Integer MAX_ITEM_COUNT = 64;
    //Other
    public Item COM_FERT;
    public Item TUNG_OIL;
    public Item POTASSIUM_SALT_POWDER;
    public Item PLANT_ASH;
    //Bamboo
    public Item BAMBOO_LEAVES;
    public Item BAMBOO_SILK;
    public Item BAMBOO_SILK_BOARD;
    public Item BAMBOO_CHARCOAL;
    public Item BAMBOO_SHOOT;
    //Non-metal resources
    public Item PHOS;
    public Item ZIRCON;
    public Item SULFUR;
    //Copper
    public Item COPPER_SHARD;
    public Item COPPER_INGOT;
    public Item COPPER_POWDER;
    public Item COPPER_GEAR;
    public Item COPPER_PLATE;
    public Item COPPER_DISSLOVER;
    //Zinc
    public Item ZINC_SHARD;
    public Item ZINC_INGOT;
    public Item ZINC_POWDER;
    public Item ZINC_GEAR;
    public Item ZINC_PLATE;
    public Item ZINC_DISSLOVER;
    //Tin
    public Item TIN_SHARD;
    public Item TIN_INGOT;
    public Item TIN_POWDER;
    public Item TIN_GEAR;
    public Item TIN_PLATE;
    public Item TIN_DISSLOVER;
    //Bronze
    public Item BRONZE_SHARD;
    public Item BRONZE_INGOT;
    public Item BRONZE_POWDER;
    public Item BRONZE_GEAR;
    public Item BRONZE_PLATE;
    //Aluminium
    public Item ALUMINIUM_SHARD;
    public Item ALUMINIUM_INGOT;
    public Item ALUMINIUM_POWDER;
    public Item ALUMINIUM_GEAR;
    public Item ALUMINIUM_PLATE;
    public Item ALUMINIUM_DISSLOVER;
    //Lead
    public Item LEAD_SHARD;
    public Item LEAD_INGOT;
    public Item LEAD_POWDER;
    public Item LEAD_GEAR;
    public Item LEAD_PLATE;
    public Item LEAD_DISSLOVER;
    //Silver
    public Item SILVER_SHARD;
    public Item SILVER_INGOT;
    public Item SILVER_POWDER;
    public Item SILVER_GEAR;
    public Item SILVER_PLATE;
    public Item SILVER_DISSLOVER;
    //Steel
    public Item STEEL_SHARD;
    public Item STEEL_INGOT;
    public Item STEEL_POWDER;
    public Item STEEL_GEAR;
    public Item STEEL_PLATE;
    //Nickel
    public Item NICKEL_SHARD;
    public Item NICKEL_INGOT;
    public Item NICKEL_POWDER;
    public Item NICKEL_GEAR;
    public Item NICKEL_PLATE;
    public Item NICKEL_DISSLOVER;
    //Tungsten
    public Item TUNGSTEN_SHARD;
    public Item TUNGSTEN_INGOT;
    public Item TUNGSTEN_POWDER;
    public Item TUNGSTEN_GEAR;
    public Item TUNGSTEN_PLATE;
    public Item TUNGSTEN_DISSLOVER;
    //Titanium
    public Item TITANIUM_SHARD;
    public Item TITANIUM_INGOT;
    public Item TITANIUM_POWDER;
    public Item TITANIUM_GEAR;
    public Item TITANIUM_PLATE;
    public Item TITANIUM_DISSLOVER;

    //Firecracker
    public Firecracker FIRECRACKERS;

    public ItemGroup ITEM_GROUP;

    private Items() {
        ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
    }

    public static Items getInstance() {
        return thisItems;
    }

    private Item AddItemTool(Integer maxCount) {
        return new Item(new FabricItemSettings().group(this.ITEM_GROUP).maxCount(maxCount));
    }

    private Item AddItemTool() {
        return new Item(new FabricItemSettings().group(this.ITEM_GROUP).maxCount(MAX_ITEM_COUNT));
    }

    public void InitAllItems() {
        this.COM_FERT = this.AddItemTool();
        this.BAMBOO_LEAVES = this.AddItemTool();
        this.BAMBOO_SILK = this.AddItemTool();
        this.BAMBOO_SILK_BOARD = this.AddItemTool();
        this.BAMBOO_CHARCOAL = this.AddItemTool();
        this.PLANT_ASH = this.AddItemTool();
        this.POTASSIUM_SALT_POWDER = this.AddItemTool();
        this.TUNG_OIL = this.AddItemTool(1);
        this.BAMBOO_SHOOT = this.AddItemTool();
        this.ZIRCON = this.AddItemTool();
        this.PHOS = this.AddItemTool();
        this.SULFUR = this.AddItemTool();

        //Ingot
        this.COPPER_INGOT = this.AddItemTool();
        this.ZINC_INGOT = this.AddItemTool();
        this.TIN_INGOT = this.AddItemTool();
        this.BRONZE_INGOT = this.AddItemTool();
        this.ALUMINIUM_INGOT = this.AddItemTool();
        this.LEAD_INGOT = this.AddItemTool();
        this.SILVER_INGOT = this.AddItemTool();
        this.STEEL_INGOT = this.AddItemTool();
        this.NICKEL_INGOT = this.AddItemTool();
        this.TUNGSTEN_INGOT = this.AddItemTool();
        this.TITANIUM_INGOT = this.AddItemTool();

        //Powder
        this.COPPER_POWDER = this.AddItemTool();
        this.ZINC_POWDER = this.AddItemTool();
        this.TIN_POWDER = this.AddItemTool();
        this.BRONZE_POWDER = this.AddItemTool();
        this.ALUMINIUM_POWDER = this.AddItemTool();
        this.LEAD_POWDER = this.AddItemTool();
        this.SILVER_POWDER = this.AddItemTool();
        this.STEEL_POWDER = this.AddItemTool();
        this.NICKEL_POWDER = this.AddItemTool();
        this.TUNGSTEN_POWDER = this.AddItemTool();
        this.TITANIUM_POWDER = this.AddItemTool();

        //Gear
        this.COPPER_GEAR = this.AddItemTool();
        this.ZINC_GEAR = this.AddItemTool();
        this.TIN_GEAR = this.AddItemTool();
        this.BRONZE_GEAR = this.AddItemTool();
        this.ALUMINIUM_GEAR = this.AddItemTool();
        this.LEAD_GEAR = this.AddItemTool();
        this.SILVER_GEAR = this.AddItemTool();
        this.STEEL_GEAR = this.AddItemTool();
        this.NICKEL_GEAR = this.AddItemTool();
        this.TUNGSTEN_GEAR = this.AddItemTool();
        this.TITANIUM_GEAR = this.AddItemTool();

        //Plate
        this.COPPER_PLATE = this.AddItemTool();
        this.ZINC_PLATE = this.AddItemTool();
        this.TIN_PLATE = this.AddItemTool();
        this.BRONZE_PLATE = this.AddItemTool();
        this.ALUMINIUM_PLATE = this.AddItemTool();
        this.LEAD_PLATE = this.AddItemTool();
        this.SILVER_PLATE = this.AddItemTool();
        this.STEEL_PLATE = this.AddItemTool();
        this.NICKEL_PLATE = this.AddItemTool();
        this.TUNGSTEN_PLATE = this.AddItemTool();
        this.TITANIUM_PLATE = this.AddItemTool();

        //Shard
        this.COPPER_SHARD = this.AddItemTool();
        this.ZINC_SHARD = this.AddItemTool();
        this.TIN_SHARD = this.AddItemTool();
        this.BRONZE_SHARD = this.AddItemTool();
        this.ALUMINIUM_SHARD = this.AddItemTool();
        this.LEAD_SHARD = this.AddItemTool();
        this.SILVER_SHARD = this.AddItemTool();
        this.STEEL_SHARD = this.AddItemTool();
        this.NICKEL_SHARD = this.AddItemTool();
        this.TUNGSTEN_SHARD = this.AddItemTool();
        this.TITANIUM_SHARD = this.AddItemTool();

        //Metal Dissolver
        this.COPPER_DISSLOVER = this.AddItemTool();
        this.ZINC_DISSLOVER = this.AddItemTool();
        this.TIN_DISSLOVER = this.AddItemTool();
        this.ALUMINIUM_DISSLOVER = this.AddItemTool();
        this.LEAD_DISSLOVER = this.AddItemTool();
        this.SILVER_DISSLOVER = this.AddItemTool();
        this.NICKEL_DISSLOVER = this.AddItemTool();
        this.TUNGSTEN_DISSLOVER = this.AddItemTool();
        this.TITANIUM_DISSLOVER = this.AddItemTool();

        this.FIRECRACKERS = new Firecracker(new FabricItemSettings().group(this.ITEM_GROUP).maxCount(MAX_ITEM_COUNT));
    }

    public void RegisteredItems() {
        this.RegistrationTool(this.COM_FERT, "com_fert");
        this.RegistrationTool(this.BAMBOO_LEAVES, "bamboo_leaves");
        this.RegistrationTool(this.BAMBOO_SILK, "bamboo_silk");
        this.RegistrationTool(this.BAMBOO_SILK_BOARD, "bamboo_silk_board");
        this.RegistrationTool(this.BAMBOO_CHARCOAL, "bamboo_charcoal");
        this.RegistrationTool(this.PLANT_ASH, "plant_ash");
        this.RegistrationTool(this.POTASSIUM_SALT_POWDER, "potassium_salt_powder");
        this.RegistrationTool(this.ZIRCON, "zircon");
        this.RegistrationTool(this.SULFUR, "sulfur");
        this.RegistrationTool(this.PHOS, "phos");

        //Ingot
        this.RegistrationTool(this.COPPER_INGOT, "copper_ingot");
        this.RegistrationTool(this.ZINC_INGOT, "zinc_ingot");
        this.RegistrationTool(this.TIN_INGOT, "tin_ingot");
        this.RegistrationTool(this.BRONZE_INGOT, "bronze_ingot");
        this.RegistrationTool(this.ALUMINIUM_INGOT, "aluminium_ingot");
        this.RegistrationTool(this.LEAD_INGOT, "lead_ingot");
        this.RegistrationTool(this.SILVER_INGOT, "silver_ingot");
        this.RegistrationTool(this.STEEL_INGOT, "steel_ingot");
        this.RegistrationTool(this.NICKEL_INGOT, "nickel_ingot");
        this.RegistrationTool(this.TUNGSTEN_INGOT, "tungsten_ingot");
        this.RegistrationTool(this.TITANIUM_INGOT, "titanium_ingot");

        //Powder
        this.RegistrationTool(this.COPPER_POWDER, "copper_powder");
        this.RegistrationTool(this.ZINC_POWDER, "zinc_powder");
        this.RegistrationTool(this.TIN_POWDER, "tin_powder");
        this.RegistrationTool(this.BRONZE_POWDER, "bronze_powder");
        this.RegistrationTool(this.ALUMINIUM_POWDER, "aluminium_powder");
        this.RegistrationTool(this.LEAD_POWDER, "lead_powder");
        this.RegistrationTool(this.SILVER_POWDER, "silver_powder");
        this.RegistrationTool(this.STEEL_POWDER, "steel_powder");
        this.RegistrationTool(this.NICKEL_POWDER, "nickel_powder");
        this.RegistrationTool(this.TUNGSTEN_POWDER, "tungsten_powder");
        this.RegistrationTool(this.TITANIUM_POWDER, "titanium_powder");

        //Gear
        this.RegistrationTool(this.COPPER_GEAR, "copper_gear");
        this.RegistrationTool(this.ZINC_GEAR, "zinc_gear");
        this.RegistrationTool(this.TIN_GEAR, "tin_gear");
        this.RegistrationTool(this.BRONZE_GEAR, "bronze_gear");
        this.RegistrationTool(this.ALUMINIUM_GEAR, "aluminium_gear");
        this.RegistrationTool(this.LEAD_GEAR, "lead_gear");
        this.RegistrationTool(this.SILVER_GEAR, "silver_gear");
        this.RegistrationTool(this.STEEL_GEAR, "steel_gear");
        this.RegistrationTool(this.NICKEL_GEAR, "nickel_gear");
        this.RegistrationTool(this.TUNGSTEN_GEAR, "tungsten_gear");
        this.RegistrationTool(this.TITANIUM_GEAR, "titanium_gear");

        //Plate
        this.RegistrationTool(this.COPPER_PLATE, "copper_plate");
        this.RegistrationTool(this.ZINC_PLATE, "zinc_plate");
        this.RegistrationTool(this.TIN_PLATE, "tin_plate");
        this.RegistrationTool(this.BRONZE_PLATE, "bronze_plate");
        this.RegistrationTool(this.ALUMINIUM_PLATE, "aluminium_plate");
        this.RegistrationTool(this.LEAD_PLATE, "lead_plate");
        this.RegistrationTool(this.SILVER_PLATE, "silver_plate");
        this.RegistrationTool(this.STEEL_PLATE, "steel_plate");
        this.RegistrationTool(this.NICKEL_PLATE, "nickel_plate");
        this.RegistrationTool(this.TUNGSTEN_PLATE, "tungsten_plate");
        this.RegistrationTool(this.TITANIUM_PLATE, "titanium_plate");

        //Shard
        this.RegistrationTool(this.COPPER_SHARD, "copper_shard");
        this.RegistrationTool(this.ZINC_SHARD, "zinc_shard");
        this.RegistrationTool(this.TIN_SHARD, "tin_shard");
        this.RegistrationTool(this.BRONZE_SHARD, "bronze_shard");
        this.RegistrationTool(this.ALUMINIUM_SHARD, "aluminium_shard");
        this.RegistrationTool(this.LEAD_SHARD, "lead_shard");
        this.RegistrationTool(this.SILVER_SHARD, "silver_shard");
        this.RegistrationTool(this.STEEL_SHARD, "steel_shard");
        this.RegistrationTool(this.NICKEL_SHARD, "nickel_shard");
        this.RegistrationTool(this.TUNGSTEN_SHARD, "tungsten_shard");
        this.RegistrationTool(this.TITANIUM_SHARD, "titanium_shard");

        //Metal Disslover
        this.RegistrationTool(this.COPPER_DISSLOVER, "copper_disslover");
        this.RegistrationTool(this.ZINC_DISSLOVER, "zinc_disslover");
        this.RegistrationTool(this.TIN_DISSLOVER, "tin_disslover");
        this.RegistrationTool(this.ALUMINIUM_DISSLOVER, "aluminium_disslover");
        this.RegistrationTool(this.LEAD_DISSLOVER, "lead_disslover");
        this.RegistrationTool(this.SILVER_DISSLOVER, "silver_disslover");
        this.RegistrationTool(this.NICKEL_DISSLOVER, "nickel_disslover");
        this.RegistrationTool(this.TUNGSTEN_DISSLOVER, "tungsten_disslover");
        this.RegistrationTool(this.TITANIUM_DISSLOVER, "titanium_disslover");

        this.RegistrationTool(this.FIRECRACKERS, "firecrackers");
    }


    private void RegistrationTool(Item ITEM, String PATH) {
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, PATH), ITEM);
    }
}
