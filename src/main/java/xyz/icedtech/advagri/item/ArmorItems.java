package xyz.icedtech.advagri.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.armormaterials.LeatherBambooMixedArmor;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemArmorsGroup;


public class ArmorItems {
    public static ArmorItems thisArmorItems = new ArmorItems();

    public static String modata = ModAta.ModID;

    //Bamboo armor
    public static final ArmorMaterial BAMBOO = new LeatherBambooMixedArmor();
    public Item BAMBOO_HELMET;
    public Item BAMBOO_CHESTPLATE;
    public Item BAMBOO_LEGGINGS;
    public Item BAMBOO_BOOTS;

    //Leather-bamboo armor
    public ArmorMaterial LEATHER_BAMBOO_MIXED = new LeatherBambooMixedArmor();
    public Item LEATHER_BAMBOO_MIXED_HELMET;
    public Item LEATHER_BAMBOO_MIXED_CHESTPLATE;
    public Item LEATHER_BAMBOO_MIXED_LEGGINGS;
    public Item LEATHER_BAMBOO_MIXED_BOOTS;

    public static ArmorItems getInstance() {
        return thisArmorItems;
    }

    private ArmorItems() {

    }

    public void InitAllArmors() {
        BAMBOO_HELMET = FastAddTool(1, BAMBOO);
        BAMBOO_CHESTPLATE = FastAddTool(2, BAMBOO);
        BAMBOO_LEGGINGS = FastAddTool(3, BAMBOO);
        BAMBOO_BOOTS = FastAddTool(4, BAMBOO);

        LEATHER_BAMBOO_MIXED_HELMET = FastAddTool(1, LEATHER_BAMBOO_MIXED);
        LEATHER_BAMBOO_MIXED_CHESTPLATE = FastAddTool(2, LEATHER_BAMBOO_MIXED);
        LEATHER_BAMBOO_MIXED_LEGGINGS = FastAddTool(3, LEATHER_BAMBOO_MIXED);
        LEATHER_BAMBOO_MIXED_BOOTS = FastAddTool(4, LEATHER_BAMBOO_MIXED);
    }

    public void RegisteredArmors() {
        //Bamboo
        Registry.register(Registry.ITEM, new Identifier(modata, "bamboo_helmet"), BAMBOO_HELMET);
        Registry.register(Registry.ITEM, new Identifier(modata, "bamboo_chestplate"), BAMBOO_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(modata, "bamboo_leggings"), BAMBOO_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(modata, "bamboo_boots"), BAMBOO_BOOTS);

        //Leather-bamboo mixed armor
        Registry.register(Registry.ITEM, new Identifier(modata, "leather_bamboo_mixed_helmet"), LEATHER_BAMBOO_MIXED_HELMET);
        Registry.register(Registry.ITEM, new Identifier(modata, "leather_bamboo_mixed_chestplate"), LEATHER_BAMBOO_MIXED_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(modata, "leather_bamboo_mixed_leggings"), LEATHER_BAMBOO_MIXED_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(modata, "leather_bamboo_mixed_boots"), LEATHER_BAMBOO_MIXED_BOOTS);
    }


    public ArmorItem FastAddTool(Integer Where, ArmorMaterial ArmorMaterial) {
        switch (Where) {
            case 2:
                return new ArmorItem(ArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(AdvAgriItemArmorsGroup.ITEM_GROUP));

            case 3:
                return new ArmorItem(ArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(AdvAgriItemArmorsGroup.ITEM_GROUP));

            case 4:
                return new ArmorItem(ArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(AdvAgriItemArmorsGroup.ITEM_GROUP));
            case 1:
            default:
                return new ArmorItem(ArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(AdvAgriItemArmorsGroup.ITEM_GROUP));
        }
    }
}
