package xyz.icedtech.advagri.renderer;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import xyz.icedtech.advagri.entities.item.AdvAgriItemEntities;

public class AdvAgriItemEntitiesRenderers {
    private static AdvAgriItemEntitiesRenderers advAgriItemEntitiesRenderers = new AdvAgriItemEntitiesRenderers();

    private AdvAgriItemEntitiesRenderers() {

    }

    public void InitAllItemEntitiesRenderers() {
        EntityRendererRegistry.INSTANCE.register(AdvAgriItemEntities.getInstance().FIRECRACKER_ENTITY, (dispatcher, context) -> {
            return new FirecrackerEntityRender(dispatcher);
        });
    }

    public static AdvAgriItemEntitiesRenderers getInstance() {
        return advAgriItemEntitiesRenderers;
    }
}
