package xyz.icedtech.advagri.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.omg.PortableServer.THREAD_POLICY_ID;
import xyz.icedtech.advagri.ModAta;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

public class Items {

    public static Integer MAX_ITEM_COUNT = 64;
    public Item COM_FERT;
    public Item BAMBOO_LEAVES;
    public Item BAMBOO_SILK;
    public Item BAMBOO_BOARD;
    public Item BAMBOO_CHARCOAL;
    public Item TUNG_OIL;
    public Item FIRECRACKER;
    public Item POTASSIUM_SALT_POWDER;
    public Item PLANT_ASH;
    public Item BAMBOO_SHOOT;
    public Item PHOS;
    public Item ZIRCON;
    public Item SULFUR;

    //Copper
    public Item COPPER_SHARD;
    public Item COPPER_INGOT;
    public Item COPPER_POWDER;
    public Item COPPER_GEAR;
    public Item COPPER_PLATE;
    //Zinc
    public Item ZINC_SHARD;
    public Item ZINC_INGOT;
    public Item ZINC_POWDER;
    public Item ZINC_GEAR;
    public Item ZINC_PLATE;
    //Tin
    public Item TIN_SHARD;
    public Item TIN_INGOT;
    public Item TIN_POWDER;
    public Item TIN_GEAR;
    public Item TIN_PLATE;
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
    //Lead
    public Item LEAD_SHARD;
    public Item LEAD_INGOT;
    public Item LEAD_POWDER;
    public Item LEAD_GEAR;
    public Item LEAD_PLATE;
    //Silver
    public Item SILVER_SHARD;
    public Item SILVER_INGOT;
    public Item SILVER_POWDER;
    public Item SILVER_GEAR;
    public Item SILVER_PLATE;
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
    //Tungsten
    public Item TUNGSTEN_SHARD;
    public Item TUNGSTEN_INGOT;
    public Item TUNGSTEN_POWDER;
    public Item TUNGSTEN_GEAR;
    public Item TUNGSTEN_PLATE;
    //Titanium
    public Item TITANIUM_SHARD;
    public Item TITANIUM_INGOT;
    public Item TITANIUM_POWDER;
    public Item TITANIUM_GEAR;
    public Item TITANIUM_PLATE;


    public ItemGroup ITEM_GROUP;

    public Items(ItemGroup ig) {
        ITEM_GROUP = ig;
        InitAllItems();
        RegisteredItems();
    }

    private Item FastAddItem(Integer maxCount) {
        return new Item(new FabricItemSettings().group(this.ITEM_GROUP).maxCount(maxCount));
    }

    private Item FastAddItem() {
        return new Item(new FabricItemSettings().group(this.ITEM_GROUP).maxCount(MAX_ITEM_COUNT));
    }

    private void InitAllItems() {
        this.COM_FERT = this.FastAddItem();
        this.BAMBOO_LEAVES = this.FastAddItem();
        this.BAMBOO_SILK = this.FastAddItem();
        this.BAMBOO_BOARD = this.FastAddItem();
        this.BAMBOO_CHARCOAL = this.FastAddItem();
        this.PLANT_ASH = this.FastAddItem();
        this.POTASSIUM_SALT_POWDER = this.FastAddItem();
        this.TUNG_OIL = this.FastAddItem(1);
        this.BAMBOO_SHOOT = this.FastAddItem();
        this.ZIRCON = this.FastAddItem();
        this.PHOS = this.FastAddItem();
        this.SULFUR = this.FastAddItem();

        //Ingot
        this.COPPER_INGOT = this.FastAddItem();
        this.ZINC_INGOT = this.FastAddItem();
        this.TIN_INGOT = this.FastAddItem();
        this.BRONZE_INGOT = this.FastAddItem();
        this.ALUMINIUM_INGOT = this.FastAddItem();
        this.LEAD_INGOT = this.FastAddItem();
        this.SILVER_INGOT = this.FastAddItem();
        this.STEEL_INGOT = this.FastAddItem();
        this.NICKEL_INGOT = this.FastAddItem();
        this.TUNGSTEN_INGOT = this.FastAddItem();
        this.TITANIUM_INGOT = this.FastAddItem();

        //Powder
        this.COPPER_POWDER = this.FastAddItem();
        this.ZINC_POWDER = this.FastAddItem();
        this.TIN_POWDER = this.FastAddItem();
        this.BRONZE_POWDER = this.FastAddItem();
        this.ALUMINIUM_POWDER = this.FastAddItem();
        this.LEAD_POWDER = this.FastAddItem();
        this.SILVER_POWDER = this.FastAddItem();
        this.STEEL_POWDER = this.FastAddItem();
        this.NICKEL_POWDER = this.FastAddItem();
        this.TUNGSTEN_POWDER = this.FastAddItem();
        this.TITANIUM_POWDER = this.FastAddItem();

        //Gear
        this.COPPER_GEAR = this.FastAddItem();
        this.ZINC_GEAR = this.FastAddItem();
        this.TIN_GEAR = this.FastAddItem();
        this.BRONZE_GEAR = this.FastAddItem();
        this.ALUMINIUM_GEAR = this.FastAddItem();
        this.LEAD_GEAR = this.FastAddItem();
        this.SILVER_GEAR = this.FastAddItem();
        this.STEEL_GEAR = this.FastAddItem();
        this.NICKEL_GEAR = this.FastAddItem();
        this.TUNGSTEN_GEAR = this.FastAddItem();
        this.TITANIUM_GEAR = this.FastAddItem();

        //Plate
        this.COPPER_PLATE = this.FastAddItem();
        this.ZINC_PLATE = this.FastAddItem();
        this.TIN_PLATE = this.FastAddItem();
        this.BRONZE_PLATE = this.FastAddItem();
        this.ALUMINIUM_PLATE = this.FastAddItem();
        this.LEAD_PLATE = this.FastAddItem();
        this.SILVER_PLATE = this.FastAddItem();
        this.STEEL_PLATE = this.FastAddItem();
        this.NICKEL_PLATE = this.FastAddItem();
        this.TUNGSTEN_PLATE = this.FastAddItem();
        this.TITANIUM_PLATE = this.FastAddItem();

        //Shard
        this.COPPER_SHARD = this.FastAddItem();
        this.ZINC_SHARD = this.FastAddItem();
        this.TIN_SHARD = this.FastAddItem();
        this.BRONZE_SHARD = this.FastAddItem();
        this.ALUMINIUM_SHARD = this.FastAddItem();
        this.LEAD_SHARD = this.FastAddItem();
        this.SILVER_SHARD = this.FastAddItem();
        this.STEEL_SHARD = this.FastAddItem();
        this.NICKEL_SHARD = this.FastAddItem();
        this.TUNGSTEN_SHARD = this.FastAddItem();
        this.TITANIUM_SHARD = this.FastAddItem();
    }

    private void RegisteredItems() {
        this.RegistrationTool(this.COM_FERT, "com_fert");
        this.RegistrationTool(this.BAMBOO_LEAVES, "bamboo_leaves");
        this.RegistrationTool(this.BAMBOO_SILK, "bamboo_silk");
        this.RegistrationTool(this.BAMBOO_BOARD, "bamboo_board");
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
    }

    private void RegistrationTool(Item ITEM, String PATH) {
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, PATH), ITEM);
    }
}
