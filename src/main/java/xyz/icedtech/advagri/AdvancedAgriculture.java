package xyz.icedtech.advagri;

import net.fabricmc.api.ModInitializer;
import xyz.icedtech.advagri.block.AdvAgriBlocks;
import xyz.icedtech.advagri.entities.item.AdvAgriItemEntities;
import xyz.icedtech.advagri.entities.item.EntitiesRenderers;
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

        EntitiesRenderers entitiesRenderers = EntitiesRenderers.getInstance();
        AdvAgriItemEntities advAgriItemEntities = AdvAgriItemEntities.getInstance();

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

        //entitiesRenderers.InitAllEntitiesRenderers();
        //entities.InitAllEntity();
    }
}
