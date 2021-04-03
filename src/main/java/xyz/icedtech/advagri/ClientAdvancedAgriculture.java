package xyz.icedtech.advagri;

import net.fabricmc.api.ClientModInitializer;
import xyz.icedtech.advagri.renderer.AdvAgriItemEntitiesRenderers;

public class ClientAdvancedAgriculture implements ClientModInitializer {

    public void onInitializeClient() {

        AdvAgriItemEntitiesRenderers advAgriItemEntitiesRenderers = AdvAgriItemEntitiesRenderers.getInstance();

        advAgriItemEntitiesRenderers.InitAllItemEntitiesRenderers();

    }
}