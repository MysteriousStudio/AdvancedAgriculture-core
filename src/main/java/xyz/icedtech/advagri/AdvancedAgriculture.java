package xyz.icedtech.advagri;

import net.fabricmc.api.ModInitializer;
import xyz.icedtech.advagri.block.AdvAgriBlocks;
import xyz.icedtech.advagri.enchantments.AdvAgriEnchantments;
import xyz.icedtech.advagri.entities.item.AdvAgriItemEntities;
import xyz.icedtech.advagri.entities.item.AdvAgriEntitiesRenderers;
import xyz.icedtech.advagri.events.AdvAgriEvents;
import xyz.icedtech.advagri.item.AdvAgriArmorItems;
import xyz.icedtech.advagri.item.AdvAgriItems;
import xyz.icedtech.advagri.item.AdvAgriToolsAndWeapons;

public class AdvancedAgriculture implements ModInitializer {
    @Override
    public void onInitialize() {
        AdvAgriItems advAgriItems = AdvAgriItems.getInstance();
        AdvAgriBlocks advAgriBlocks = AdvAgriBlocks.getInstance();
        AdvAgriArmorItems advAgriArmorItems = AdvAgriArmorItems.getInstance();
        AdvAgriToolsAndWeapons advAgriToolsAndWeapons = AdvAgriToolsAndWeapons.getInstance();

        AdvAgriEntitiesRenderers advAgriEntitiesRenderers = AdvAgriEntitiesRenderers.getInstance();
        AdvAgriItemEntities advAgriItemEntities = AdvAgriItemEntities.getInstance();

//        AdvAgriEnchantments advAgriEnchantments = AdvAgriEnchantments.getINSTANCE();

        AdvAgriEvents advAgriEvents = AdvAgriEvents.getInstance();

        advAgriItems.InitAllItems();
        advAgriItems.RegisteredItems();

        advAgriBlocks.InitAllBlocks();
        advAgriBlocks.RegisteredGenOres();

        advAgriArmorItems.InitAllArmors();
        advAgriArmorItems.RegisteredArmors();

        advAgriToolsAndWeapons.InitAllToolAndWeapons();
        advAgriToolsAndWeapons.RegisteredAllToolAndWeapons();

        advAgriEvents.InitAllEvents();

        advAgriItemEntities.InitAllEntity();
        advAgriEntitiesRenderers.InitAllEntitiesRenderers();

//        advAgriEnchantments.InitAllEnchantment();
    }
}
