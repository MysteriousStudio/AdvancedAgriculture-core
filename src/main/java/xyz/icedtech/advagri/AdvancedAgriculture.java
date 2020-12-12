package xyz.icedtech.advagri;

import net.fabricmc.api.ModInitializer;
import xyz.icedtech.advagri.block.Blocks;
import xyz.icedtech.advagri.entities.Entities;
import xyz.icedtech.advagri.entities.EntitiesRenderers;
import xyz.icedtech.advagri.item.ArmorItems;
import xyz.icedtech.advagri.item.Items;

public class AdvancedAgriculture implements ModInitializer {
    @Override
    public void onInitialize() {
        Items items = Items.getInstance();
        Blocks blocks = Blocks.getInstance();
        ArmorItems armorItems = ArmorItems.getInstance();
        EntitiesRenderers entitiesRenderers = EntitiesRenderers.getInstance();
        Entities entities = Entities.getInstance();
        items.InitAllItems();
        items.RegisteredItems();
        blocks.InitAllBlocks();
        blocks.RegistryGenOres();
        armorItems.InitAllArmors();
        armorItems.RegisteredArmors();
        entitiesRenderers.InitAllEntitiesRenderers();
        entities.InitAllEntity();
    }
}
