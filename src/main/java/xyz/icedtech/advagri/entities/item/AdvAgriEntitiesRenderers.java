package xyz.icedtech.advagri.entities.item;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class AdvAgriEntitiesRenderers {
    private static AdvAgriEntitiesRenderers advAgriEntitiesRenderers = new AdvAgriEntitiesRenderers();

    private AdvAgriEntitiesRenderers() {

    }

    public void InitAllEntitiesRenderers() {
        EntityRendererRegistry.INSTANCE.register(AdvAgriItemEntities.getInstance().FIRECRACKER_ENTITY, (dispatcher, context) -> {
            return new FirecrackerEntityRender(dispatcher);
        });
    }

    public static AdvAgriEntitiesRenderers getInstance() {
        return advAgriEntitiesRenderers;
    }
}
