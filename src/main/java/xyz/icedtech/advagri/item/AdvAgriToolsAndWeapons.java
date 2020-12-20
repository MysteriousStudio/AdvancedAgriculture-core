package xyz.icedtech.advagri.item;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemToolAndArmorsGroup;
import xyz.icedtech.advagri.toolitem.*;
import xyz.icedtech.advagri.toolmaterials.*;

public class AdvAgriToolsAndWeapons {
    private static final AdvAgriToolsAndWeapons advAgriToolsAndWeapons = new AdvAgriToolsAndWeapons();

    public static ToolItem COPPER_SHOVEL;
    public static ToolItem COPPER_PICKAXE;
    public static ToolItem COPPER_AXE;
    public static ToolItem COPPER_HOE;
    public static ToolItem COPPER_SWORD;

    public static ToolItem ZINC_SHOVEL;
    public static ToolItem ZINC_PICKAXE;
    public static ToolItem ZINC_AXE;
    public static ToolItem ZINC_HOE;
    public static ToolItem ZINC_SWORD;

    public static ToolItem TIN_SHOVEL;
    public static ToolItem TIN_PICKAXE;
    public static ToolItem TIN_AXE;
    public static ToolItem TIN_HOE;
    public static ToolItem TIN_SWORD;

    public static ToolItem BRONZE_SHOVEL;
    public static ToolItem BRONZE_PICKAXE;
    public static ToolItem BRONZE_AXE;
    public static ToolItem BRONZE_HOE;
    public static ToolItem BRONZE_SWORD;

    public static ToolItem ALUMINIUM_SHOVEL;
    public static ToolItem ALUMINIUM_PICKAXE;
    public static ToolItem ALUMINIUM_AXE;
    public static ToolItem ALUMINIUM_HOE;
    public static ToolItem ALUMINIUM_SWORD;

    public static ToolItem LEAD_SHOVEL;
    public static ToolItem LEAD_PICKAXE;
    public static ToolItem LEAD_AXE;
    public static ToolItem LEAD_HOE;
    public static ToolItem LEAD_SWORD;

    public static ToolItem SILVER_SHOVEL;
    public static ToolItem SILVER_PICKAXE;
    public static ToolItem SILVER_AXE;
    public static ToolItem SILVER_HOE;
    public static ToolItem SILVER_SWORD;

    public static ToolItem STEEL_SHOVEL;
    public static ToolItem STEEL_PICKAXE;
    public static ToolItem STEEL_AXE;
    public static ToolItem STEEL_HOE;
    public static ToolItem STEEL_SWORD;

    public static ToolItem NICKEL_SHOVEL;
    public static ToolItem NICKEL_PICKAXE;
    public static ToolItem NICKEL_AXE;
    public static ToolItem NICKEL_HOE;
    public static ToolItem NICKEL_SWORD;


    public static ToolItem TUNGSTEN_SHOVEL;
    public static ToolItem TUNGSTEN_PICKAXE;
    public static ToolItem TUNGSTEN_AXE;
    public static ToolItem TUNGSTEN_HOE;
    public static ToolItem TUNGSTEN_SWORD;

    public static ToolItem TITANIUM_SHOVEL;
    public static ToolItem TITANIUM_PICKAXE;
    public static ToolItem TITANIUM_AXE;
    public static ToolItem TITANIUM_HOE;
    public static ToolItem TITANIUM_SWORD;

    private AdvAgriToolsAndWeapons() {

    }

    public void InitAllToolAndWeapons() {
        COPPER_SHOVEL = new AdvAgriShovelItem(CopperMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_PICKAXE = new AdvAgriPickaxeItem(CopperMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_AXE = new AdvAgriAxeItem(CopperMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_HOE = new AdvAgriHoeItem(CopperMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_SWORD = new AdvAgriSwordItem(CopperMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        ZINC_SHOVEL = new AdvAgriShovelItem(ZincMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_PICKAXE = new AdvAgriPickaxeItem(ZincMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_AXE = new AdvAgriAxeItem(ZincMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_HOE = new AdvAgriHoeItem(ZincMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_SWORD = new AdvAgriSwordItem(ZincMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        TIN_SHOVEL = new AdvAgriShovelItem(TinMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_PICKAXE = new AdvAgriPickaxeItem(TinMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_AXE = new AdvAgriAxeItem(TinMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_HOE = new AdvAgriHoeItem(TinMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_SWORD = new AdvAgriSwordItem(TinMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        BRONZE_SHOVEL = new AdvAgriShovelItem(BronzeMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_PICKAXE = new AdvAgriPickaxeItem(BronzeMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_AXE = new AdvAgriAxeItem(BronzeMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_HOE = new AdvAgriHoeItem(BronzeMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_SWORD = new AdvAgriSwordItem(BronzeMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        ALUMINIUM_SHOVEL = new AdvAgriShovelItem(AluminiumMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINIUM_PICKAXE = new AdvAgriPickaxeItem(AluminiumMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINIUM_AXE = new AdvAgriAxeItem(AluminiumMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINIUM_HOE = new AdvAgriHoeItem(AluminiumMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINIUM_SWORD = new AdvAgriSwordItem(AluminiumMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        LEAD_SHOVEL = new AdvAgriShovelItem(LeadMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_PICKAXE = new AdvAgriPickaxeItem(LeadMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_AXE = new AdvAgriAxeItem(LeadMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_HOE = new AdvAgriHoeItem(LeadMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_SWORD = new AdvAgriSwordItem(LeadMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        SILVER_SHOVEL = new AdvAgriShovelItem(SilverMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_PICKAXE = new AdvAgriPickaxeItem(SilverMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_AXE = new AdvAgriAxeItem(SilverMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_HOE = new AdvAgriHoeItem(SilverMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_SWORD = new AdvAgriSwordItem(SilverMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        STEEL_SHOVEL = new AdvAgriShovelItem(SteelMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_PICKAXE = new AdvAgriPickaxeItem(SteelMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_AXE = new AdvAgriAxeItem(SteelMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_HOE = new AdvAgriHoeItem(SteelMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_SWORD = new AdvAgriSwordItem(SteelMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        NICKEL_SHOVEL = new AdvAgriShovelItem(NickelMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_PICKAXE = new AdvAgriPickaxeItem(NickelMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_AXE = new AdvAgriAxeItem(NickelMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_HOE = new AdvAgriHoeItem(NickelMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_SWORD = new AdvAgriSwordItem(NickelMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        TUNGSTEN_SHOVEL = new AdvAgriShovelItem(TungstenMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_PICKAXE = new AdvAgriPickaxeItem(TungstenMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_AXE = new AdvAgriAxeItem(TungstenMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_HOE = new AdvAgriHoeItem(TungstenMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_SWORD = new AdvAgriSwordItem(TungstenMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        TITANIUM_SHOVEL = new AdvAgriShovelItem(TitaniumMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_PICKAXE = new AdvAgriPickaxeItem(TitaniumMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_AXE = new AdvAgriAxeItem(TitaniumMaterial.INSTANCE, 0F, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_HOE = new AdvAgriHoeItem(TitaniumMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_SWORD = new AdvAgriSwordItem(TitaniumMaterial.INSTANCE, 0, 0F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

    }

    public void RegisteredAllToolAndWeapons() {
        RegistrationTool(COPPER_SHOVEL, "copper_shovel");
        RegistrationTool(COPPER_PICKAXE, "copper_pickaxe");
        RegistrationTool(COPPER_AXE, "copper_axe");
        RegistrationTool(COPPER_HOE, "copper_hoe");
        RegistrationTool(COPPER_SWORD, "copper_sword");

        RegistrationTool(ZINC_SHOVEL, "zinc_shovel");
        RegistrationTool(ZINC_PICKAXE, "zinc_pickaxe");
        RegistrationTool(ZINC_AXE, "zinc_axe");
        RegistrationTool(ZINC_HOE, "zinc_hoe");
        RegistrationTool(ZINC_SWORD, "zinc_sword");

        RegistrationTool(TIN_SHOVEL, "tin_shovel");
        RegistrationTool(TIN_PICKAXE, "tin_pickaxe");
        RegistrationTool(TIN_AXE, "tin_axe");
        RegistrationTool(TIN_HOE, "tin_hoe");
        RegistrationTool(TIN_SWORD, "tin_sword");

        RegistrationTool(BRONZE_SHOVEL, "bronze_shovel");
        RegistrationTool(BRONZE_PICKAXE, "bronze_pickaxe");
        RegistrationTool(BRONZE_AXE, "bronze_axe");
        RegistrationTool(BRONZE_HOE, "bronze_hoe");
        RegistrationTool(BRONZE_SWORD, "bronze_sword");

        RegistrationTool(ALUMINIUM_SHOVEL, "aluminium_shovel");
        RegistrationTool(ALUMINIUM_PICKAXE, "aluminium_pickaxe");
        RegistrationTool(ALUMINIUM_AXE, "aluminium_axe");
        RegistrationTool(ALUMINIUM_HOE, "aluminium_hoe");
        RegistrationTool(ALUMINIUM_SWORD, "aluminium_sword");

        RegistrationTool(LEAD_SHOVEL, "lead_shovel");
        RegistrationTool(LEAD_PICKAXE, "lead_pickaxe");
        RegistrationTool(LEAD_AXE, "lead_axe");
        RegistrationTool(LEAD_HOE, "lead_hoe");
        RegistrationTool(LEAD_SWORD, "lead_sword");

        RegistrationTool(SILVER_SHOVEL, "silver_shovel");
        RegistrationTool(SILVER_PICKAXE, "silver_pickaxe");
        RegistrationTool(SILVER_AXE, "silver_axe");
        RegistrationTool(SILVER_HOE, "silver_hoe");
        RegistrationTool(SILVER_SWORD, "silver_sword");

        RegistrationTool(STEEL_SHOVEL, "steel_shovel");
        RegistrationTool(STEEL_PICKAXE, "steel_pickaxe");
        RegistrationTool(STEEL_AXE, "steel_axe");
        RegistrationTool(STEEL_HOE, "steel_hoe");
        RegistrationTool(STEEL_SWORD, "steel_sword");

        RegistrationTool(NICKEL_SHOVEL, "nickel_shovel");
        RegistrationTool(NICKEL_PICKAXE, "nickel_pickaxe");
        RegistrationTool(NICKEL_AXE, "nickel_axe");
        RegistrationTool(NICKEL_HOE, "nickel_hoe");
        RegistrationTool(NICKEL_SWORD, "nickel_sword");

        RegistrationTool(TUNGSTEN_SHOVEL, "tungsten_shovel");
        RegistrationTool(TUNGSTEN_PICKAXE, "tungsten_pickaxe");
        RegistrationTool(TUNGSTEN_AXE, "tungsten_axe");
        RegistrationTool(TUNGSTEN_HOE, "tungsten_hoe");
        RegistrationTool(TUNGSTEN_SWORD, "tungsten_sword");

        RegistrationTool(TITANIUM_SHOVEL, "titanium_shovel");
        RegistrationTool(TITANIUM_PICKAXE, "titanium_pickaxe");
        RegistrationTool(TITANIUM_AXE, "titanium_axe");
        RegistrationTool(TITANIUM_HOE, "titanium_hoe");
        RegistrationTool(TITANIUM_SWORD, "titanium_sword");
    }

    private void RegistrationTool(Item ITEM, String PATH) {
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, PATH), ITEM);
    }

    public static AdvAgriToolsAndWeapons getInstance() {
        return advAgriToolsAndWeapons;
    }


}
