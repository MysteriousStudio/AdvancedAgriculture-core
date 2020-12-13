package xyz.icedtech.advagri;

import net.fabricmc.api.ModInitializer;
import xyz.icedtech.advagri.block.AdvAgriBlocks;
import xyz.icedtech.advagri.entities.item.AdvAgriItemEntities;
import xyz.icedtech.advagri.entities.item.EntitiesRenderers;
import xyz.icedtech.advagri.events.AdvAgriEvents;
import xyz.icedtech.advagri.item.ArmorItems;
import xyz.icedtech.advagri.item.AdvAgriItems;

public class AdvancedAgriculture implements ModInitializer {
    @Override
    public void onInitialize() {
        AdvAgriItems advAgriItems = AdvAgriItems.getInstance();
        AdvAgriBlocks advAgriBlocks = AdvAgriBlocks.getInstance();
        ArmorItems armorItems = ArmorItems.getInstance();

        EntitiesRenderers entitiesRenderers = EntitiesRenderers.getInstance();
        AdvAgriItemEntities advAgriItemEntities = AdvAgriItemEntities.getInstance();

        AdvAgriEvents advAgriEvents = AdvAgriEvents.getInstance();

        advAgriItems.InitAllItems();
        advAgriItems.RegisteredItems();
        advAgriBlocks.InitAllBlocks();
        advAgriBlocks.RegistryGenOres();
        armorItems.InitAllArmors();
        armorItems.RegisteredArmors();

        advAgriEvents.InitAllEvents();

        //entitiesRenderers.InitAllEntitiesRenderers();
        //entities.InitAllEntity();
    }
}
