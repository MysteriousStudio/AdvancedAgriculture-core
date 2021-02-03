package xyz.icedtech.advagri.entities.item;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

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
