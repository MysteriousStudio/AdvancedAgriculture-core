package xyz.icedtech.advagri.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.armor_materials.LEATHER_BAMBOO_MIXED;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemGroup;

public class ArmorItems {
    //Bamboo armor
    public static final ArmorMaterial BAMBOO = new LEATHER_BAMBOO_MIXED();
    public static final Item BAMBOO_HELMET = new ArmorItem(BAMBOO, EquipmentSlot.HEAD, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));
    public static final Item BAMBOO_CHESTPLATE = new ArmorItem(BAMBOO, EquipmentSlot.CHEST, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));
    public static final Item BAMBOO_LEGGINGS = new ArmorItem(BAMBOO, EquipmentSlot.LEGS, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));
    public static final Item BAMBOO_BOOTS = new ArmorItem(BAMBOO, EquipmentSlot.FEET, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));

    //Leather-bamboo armor
    public static final ArmorMaterial LEATHER_BAMBOO_MIXED = new LEATHER_BAMBOO_MIXED();
    public static final Item LEATHER_BAMBOO_MIXED_HELMET = new ArmorItem(LEATHER_BAMBOO_MIXED, EquipmentSlot.HEAD, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));
    public static final Item LEATHER_BAMBOO_MIXED_CHESTPLATE = new ArmorItem(LEATHER_BAMBOO_MIXED, EquipmentSlot.CHEST, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));
    public static final Item LEATHER_BAMBOO_MIXED_LEGGINGS = new ArmorItem(LEATHER_BAMBOO_MIXED, EquipmentSlot.LEGS, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));
    public static final Item LEATHER_BAMBOO_MIXED_BOOTS = new ArmorItem(LEATHER_BAMBOO_MIXED, EquipmentSlot.FEET, new Item.Settings().group(AdvAgriItemGroup.ITEM_GROUP));

    public static void RegisteredArmor() {
        //Bamboo
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "bamboo_helmet"), BAMBOO_HELMET);
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "bamboo_chestplate"), BAMBOO_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "bamboo_leggings"), BAMBOO_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "bamboo_boots"), BAMBOO_BOOTS);

        //Leather-bamboo mixed armor
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "leather_bamboo_mixed_helmet"), LEATHER_BAMBOO_MIXED_HELMET);
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "leather_bamboo_mixed_chestplate"), LEATHER_BAMBOO_MIXED_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "leather_bamboo_mixed_leggings"), LEATHER_BAMBOO_MIXED_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("adv_agri_core", "leather_bamboo_mixed_boots"), LEATHER_BAMBOO_MIXED_BOOTS);
    }


}
