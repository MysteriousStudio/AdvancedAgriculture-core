package xyz.icedtech.advagri.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemToolAndArmorsGroup;
import xyz.icedtech.advagri.toolitem.*;
import xyz.icedtech.advagri.toolmaterials.*;

public class AdvAgriToolsAndWeapons {
    private static final AdvAgriToolsAndWeapons advAgriToolsAndWeapons = new AdvAgriToolsAndWeapons();

    ///GENERATE START:TOOL
    public ToolItem COPPER_SHOVEL;
    public ToolItem COPPER_PICKAXE;
    public ToolItem COPPER_AXE;
    public ToolItem COPPER_HOE;
    public ToolItem COPPER_SWORD;

    public ToolItem ZINC_SHOVEL;
    public ToolItem ZINC_PICKAXE;
    public ToolItem ZINC_AXE;
    public ToolItem ZINC_HOE;
    public ToolItem ZINC_SWORD;

    public ToolItem TIN_SHOVEL;
    public ToolItem TIN_PICKAXE;
    public ToolItem TIN_AXE;
    public ToolItem TIN_HOE;
    public ToolItem TIN_SWORD;

    public ToolItem BRONZE_SHOVEL;
    public ToolItem BRONZE_PICKAXE;
    public ToolItem BRONZE_AXE;
    public ToolItem BRONZE_HOE;
    public ToolItem BRONZE_SWORD;

    public ToolItem ALUMINUM_SHOVEL;
    public ToolItem ALUMINUM_PICKAXE;
    public ToolItem ALUMINUM_AXE;
    public ToolItem ALUMINUM_HOE;
    public ToolItem ALUMINUM_SWORD;

    public ToolItem LEAD_SHOVEL;
    public ToolItem LEAD_PICKAXE;
    public ToolItem LEAD_AXE;
    public ToolItem LEAD_HOE;
    public ToolItem LEAD_SWORD;

    public ToolItem SILVER_SHOVEL;
    public ToolItem SILVER_PICKAXE;
    public ToolItem SILVER_AXE;
    public ToolItem SILVER_HOE;
    public ToolItem SILVER_SWORD;

    public ToolItem STEEL_SHOVEL;
    public ToolItem STEEL_PICKAXE;
    public ToolItem STEEL_AXE;
    public ToolItem STEEL_HOE;
    public ToolItem STEEL_SWORD;

    public ToolItem NICKEL_SHOVEL;
    public ToolItem NICKEL_PICKAXE;
    public ToolItem NICKEL_AXE;
    public ToolItem NICKEL_HOE;
    public ToolItem NICKEL_SWORD;


    public ToolItem TUNGSTEN_SHOVEL;
    public ToolItem TUNGSTEN_PICKAXE;
    public ToolItem TUNGSTEN_AXE;
    public ToolItem TUNGSTEN_HOE;
    public ToolItem TUNGSTEN_SWORD;

    public ToolItem TITANIUM_SHOVEL;
    public ToolItem TITANIUM_PICKAXE;
    public ToolItem TITANIUM_AXE;
    public ToolItem TITANIUM_HOE;
    public ToolItem TITANIUM_SWORD;

    public ToolItem BAMBOO_DRILL_ROD;

    ///GENERATE END:TOOL


    public final Float BASE_SHOVEL_ATTACK_DAMAGE = 1.5F;
    public final Integer BASE_PICKAXE_ATTACK_DAMAGE = 1;
    public final Float BASE_AXE_ATTACK_DAMAGE = 4F;
    public final Integer BASE_HOE_ATTACK_DAMAGE = -2;
    public final Integer BASE_SWORD_ATTACK_DAMAGE = 3;

    public final Float BASE_SHOVEL_ATTACK_SPEED = -3F;
    public final Float BASE_PICKAXE_ATTACK_SPEED = -2.8F;
    public final Float BASE_AXE_ATTACK_SPEED = -3.2F;
    public final Float BASE_HOE_ATTACK_SPEED = -3F;
    public final Float BASE_SWORD_ATTACK_SPEED = -2.4F;


    private AdvAgriToolsAndWeapons() {

    }

    public void InitAllToolAndWeapons() {

        //Todo: 1/18/21 12:52 PM
        // User: suibing
        // Aims: Redesign all arguments of all tools and weapons
        // Desc: Almost all of them are using the default arguments
        // Stat: False

        COPPER_SHOVEL = new AdvAgriShovelItem(CopperMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_PICKAXE = new AdvAgriPickaxeItem(CopperMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_AXE = new AdvAgriAxeItem(CopperMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_HOE = new AdvAgriHoeItem(CopperMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        COPPER_SWORD = new AdvAgriSwordItem(CopperMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        ZINC_SHOVEL = new AdvAgriShovelItem(ZincMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_PICKAXE = new AdvAgriPickaxeItem(ZincMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_AXE = new AdvAgriAxeItem(ZincMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_HOE = new AdvAgriHoeItem(ZincMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ZINC_SWORD = new AdvAgriSwordItem(ZincMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        TIN_SHOVEL = new AdvAgriShovelItem(TinMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_PICKAXE = new AdvAgriPickaxeItem(TinMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_AXE = new AdvAgriAxeItem(TinMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_HOE = new AdvAgriHoeItem(TinMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TIN_SWORD = new AdvAgriSwordItem(TinMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        BRONZE_SHOVEL = new AdvAgriShovelItem(BronzeMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_PICKAXE = new AdvAgriPickaxeItem(BronzeMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_AXE = new AdvAgriAxeItem(BronzeMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_HOE = new AdvAgriHoeItem(BronzeMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        BRONZE_SWORD = new AdvAgriSwordItem(BronzeMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        ALUMINUM_SHOVEL = new AdvAgriShovelItem(AluminumMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINUM_PICKAXE = new AdvAgriPickaxeItem(AluminumMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINUM_AXE = new AdvAgriAxeItem(AluminumMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED + 0.2F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINUM_HOE = new AdvAgriHoeItem(AluminumMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        ALUMINUM_SWORD = new AdvAgriSwordItem(AluminumMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE - 1, BASE_SWORD_ATTACK_SPEED + 0.3F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        LEAD_SHOVEL = new AdvAgriShovelItem(LeadMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_PICKAXE = new AdvAgriPickaxeItem(LeadMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED - 0.2F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_AXE = new AdvAgriAxeItem(LeadMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 3F, BASE_AXE_ATTACK_SPEED - 0.3F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_HOE = new AdvAgriHoeItem(LeadMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        LEAD_SWORD = new AdvAgriSwordItem(LeadMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        SILVER_SHOVEL = new AdvAgriShovelItem(SilverMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_PICKAXE = new AdvAgriPickaxeItem(SilverMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_AXE = new AdvAgriAxeItem(SilverMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_HOE = new AdvAgriHoeItem(SilverMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        SILVER_SWORD = new AdvAgriSwordItem(SilverMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        STEEL_SHOVEL = new AdvAgriShovelItem(SteelMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_PICKAXE = new AdvAgriPickaxeItem(SteelMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_AXE = new AdvAgriAxeItem(SteelMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_HOE = new AdvAgriHoeItem(SteelMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        STEEL_SWORD = new AdvAgriSwordItem(SteelMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        NICKEL_SHOVEL = new AdvAgriShovelItem(NickelMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_PICKAXE = new AdvAgriPickaxeItem(NickelMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_AXE = new AdvAgriAxeItem(NickelMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_HOE = new AdvAgriHoeItem(NickelMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        NICKEL_SWORD = new AdvAgriSwordItem(NickelMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        TUNGSTEN_SHOVEL = new AdvAgriShovelItem(TungstenMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE, BASE_SHOVEL_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_PICKAXE = new AdvAgriPickaxeItem(TungstenMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_AXE = new AdvAgriAxeItem(TungstenMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 2F, BASE_AXE_ATTACK_SPEED - 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_HOE = new AdvAgriHoeItem(TungstenMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TUNGSTEN_SWORD = new AdvAgriSwordItem(TungstenMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE, BASE_SWORD_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        TITANIUM_SHOVEL = new AdvAgriShovelItem(TitaniumMaterial.INSTANCE, BASE_SHOVEL_ATTACK_DAMAGE + 1, BASE_SHOVEL_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_PICKAXE = new AdvAgriPickaxeItem(TitaniumMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE + 1, BASE_PICKAXE_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_AXE = new AdvAgriAxeItem(TitaniumMaterial.INSTANCE, BASE_AXE_ATTACK_DAMAGE + 3F, BASE_AXE_ATTACK_SPEED + 0.3F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_HOE = new AdvAgriHoeItem(TitaniumMaterial.INSTANCE, BASE_HOE_ATTACK_DAMAGE, BASE_HOE_ATTACK_SPEED + 2, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));
        TITANIUM_SWORD = new AdvAgriSwordItem(TitaniumMaterial.INSTANCE, BASE_SWORD_ATTACK_DAMAGE + 2, BASE_SWORD_ATTACK_SPEED + 0.1F, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

        BAMBOO_DRILL_ROD = new AdvAgriPickaxeItem(ZincMaterial.INSTANCE, BASE_PICKAXE_ATTACK_DAMAGE, BASE_PICKAXE_ATTACK_SPEED, new Item.Settings().group(AdvAgriItemToolAndArmorsGroup.ITEM_GROUP));

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

        RegistrationTool(ALUMINUM_SHOVEL, "aluminum_shovel");
        RegistrationTool(ALUMINUM_PICKAXE, "aluminum_pickaxe");
        RegistrationTool(ALUMINUM_AXE, "aluminum_axe");
        RegistrationTool(ALUMINUM_HOE, "aluminum_hoe");
        RegistrationTool(ALUMINUM_SWORD, "aluminum_sword");

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

        RegistrationTool(BAMBOO_DRILL_ROD, "bamboo_drill_rod");
    }

    private void RegistrationTool(Item ITEM, String PATH) {
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, PATH), ITEM);
    }

    public static AdvAgriToolsAndWeapons getInstance() {
        return advAgriToolsAndWeapons;
    }


}
