package tech.icedlab.advagri;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Logger;
import tech.icedlab.advagri.block.AdvAgriBlocks;
import tech.icedlab.advagri.entities.block.AdvAgriBlockEntities;
import tech.icedlab.advagri.events.AdvAgriEvents;
import tech.icedlab.advagri.item.AdvAgriItems;
import tech.icedlab.advagri.item.AdvAgriToolsAndWeapons;
import tech.icedlab.advagri.item.armors.AdvAgriArmors;
import tech.icedlab.thorium.Thorium;

public class AdvancedAgriculture implements ModInitializer {

    Logger LOGGER = Thorium.getLogger("AdvAgri");

    @Override
    public void onInitialize() {
        LOGGER.info("==========================================");
        LOGGER.info("    _       _        _              _");
        LOGGER.info("   / \\   __| |_   __/ \\   __ _ _ __(_)");
        LOGGER.info("  / _ \\ / _` \\ \\ / / _ \\ / _` | '__| |");
        LOGGER.info(" / ___ \\ (_| |\\ V / ___ \\ (_| | |  | |");
        LOGGER.info("/_/   \\_\\__,_| \\_/_/   \\_\\__, |_|  |_|");
        LOGGER.info("                         |___/");
        LOGGER.info("==========================================");
        LOGGER.info("Powered by AdvancedAgriculture Developers");
        LOGGER.info("==========================================");

        AdvAgriItems advAgriItems = AdvAgriItems.getInstance();
        AdvAgriBlocks advAgriBlocks = AdvAgriBlocks.getInstance();
        AdvAgriArmors advAgriArmors = AdvAgriArmors.getInstance();
        AdvAgriToolsAndWeapons advAgriToolsAndWeapons = AdvAgriToolsAndWeapons.getInstance();


        AdvAgriBlockEntities advAgriBlockEntities = AdvAgriBlockEntities.getInstance();

        AdvAgriEvents advAgriEvents = AdvAgriEvents.getInstance();

        //Todo: 2/3/21 8:33 PM
        // User: suibing
        // Aims: Init items here.
        // Desc: If there need ant functions about init items,code them here.
        // Stat: True
        advAgriItems.registryItem();

        //Todo: 2/3/21 8:32 PM
        // User: suibing
        // Aims: Init blocks and registration ore generation here.
        // Desc: If there need any functions about init blocks,code them here.
        // Stat: True
        advAgriBlocks.registryBlock();
        advAgriBlocks.RegisteredGenOres();

        //Todo: 2/3/21 8:31 PM
        // User: suibing
        // Aims: Init armors here.
        // Desc: If there need any functions about init armors,code them here.
        // Stat: True
        advAgriArmors.InitAllArmors();
        advAgriArmors.RegisteredArmors();

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