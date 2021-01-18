package xyz.icedtech.advagri.entities.item;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class EntitiesRenderers {
    private static EntitiesRenderers entitiesRenderers = new EntitiesRenderers();

    private EntitiesRenderers() {

    }

    public void InitAllEntitiesRenderers() {
        EntityRendererRegistry.INSTANCE.register(AdvAgriItemEntities.getInstance().FIRECRACKER_ENTITY, (dispatcher, context) -> {
            return new FirecrackerEntityRender(dispatcher);
        });
    }

    public static EntitiesRenderers getInstance() {
        return entitiesRenderers;
    }
}
