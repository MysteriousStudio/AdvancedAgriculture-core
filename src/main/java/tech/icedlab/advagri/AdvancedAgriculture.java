package tech.icedlab.advagri;

import net.fabricmc.api.ModInitializer;
import tech.icedlab.advagri.block.AdvAgriBlocks;
import tech.icedlab.advagri.entities.block.AdvAgriBlockEntities;
import tech.icedlab.advagri.entities.item.AdvAgriItemEntities;
import tech.icedlab.advagri.events.AdvAgriEvents;
import tech.icedlab.advagri.item.AdvAgriArmorItems;
import tech.icedlab.advagri.item.AdvAgriItems;
import tech.icedlab.advagri.item.AdvAgriToolsAndWeapons;

public class AdvancedAgriculture implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("==========================================");
        System.out.println("    _       _        _              _");
        System.out.println("   / \\   __| |_   __/ \\   __ _ _ __(_)");
        System.out.println("  / _ \\ / _` \\ \\ / / _ \\ / _` | '__| |");
        System.out.println(" / ___ \\ (_| |\\ V / ___ \\ (_| | |  | |");
        System.out.println("/_/   \\_\\__,_| \\_/_/   \\_\\__, |_|  |_|");
        System.out.println("                         |___/");
        System.out.println("==========================================");
        System.out.println("Powered by AdvancedAgriculture Developers");
        System.out.println("==========================================");

        AdvAgriItems advAgriItems = AdvAgriItems.getInstance();
        AdvAgriBlocks advAgriBlocks = AdvAgriBlocks.getInstance();
        AdvAgriArmorItems advAgriArmorItems = AdvAgriArmorItems.getInstance();
        AdvAgriToolsAndWeapons advAgriToolsAndWeapons = AdvAgriToolsAndWeapons.getInstance();

        AdvAgriItemEntities advAgriItemEntities = AdvAgriItemEntities.getInstance();

        AdvAgriBlockEntities advAgriBlockEntities = AdvAgriBlockEntities.getInstance();

        //AdvAgriEnchantments advAgriEnchantments = AdvAgriEnchantments.getINSTANCE();

        AdvAgriEvents advAgriEvents = AdvAgriEvents.getInstance();

        //Todo: 2/3/21 8:33 PM
        // User: suibing
        // Aims: Init items here.
        // Desc: If there need ant functions about init items,code them here.
        // Stat: True
        advAgriItems.InitAllItems();
        advAgriItems.RegisteredItems();

        //Todo: 2/3/21 8:32 PM
        // User: suibing
        // Aims: Init blocks and registration ore generation here.
        // Desc: If there need any functions about init blocks,code them here.
        // Stat: True
        advAgriBlocks.InitAllBlocks();
        advAgriBlocks.RegisteredGenOres();

        //Todo: 2/3/21 8:31 PM
        // User: suibing
        // Aims: Init armors here.
        // Desc: If there need any functions about init armors,code them here.
        // Stat: True
        advAgriArmorItems.InitAllArmors();
        advAgriArmorItems.RegisteredArmors();

        //Todo: 2/3/21 8:30 PM
        // User: suibing
        // Aims: Init tools and weapons here.
        // Desc: If there need any functions about init tools and weapons,code them here.
        // Stat: True
        advAgriToolsAndWeapons.InitAllToolAndWeapons();
        advAgriToolsAndWeapons.RegisteredAllToolAndWeapons();

        //Todo: 2/3/21 8:28 PM
        // User: suibing
        // Aims: Init events function here
        // Desc: If there need any functions about init events,code them here.
        // Stat: True
        advAgriEvents.InitAllEvents();

        //Todo: 2/3/21 8:27 PM
        // User: suibing
        // Aims: Init item entities here.
        // Desc: If there need any functions about init item entities,code them here.
        // Stat: True
        advAgriItemEntities.InitAllItemEntity();

        //Todo: 2/3/21 8:25 PM
        // User: suibing
        // Aims: Init block entities here.
        // Desc: If there need any functions about init block entities,code them here.
        // Stat: True
        advAgriBlockEntities.InitAllBlockEntities();

        //Todo: 2/3/21 8:29 PM
        // User: suibing
        // Aims: Init all enchantments here.
        // Desc: If there need any functions about init enchantments,code them here.
        // Stat: False

        //        advAgriEnchantments.InitAllEnchantment();

    }
}