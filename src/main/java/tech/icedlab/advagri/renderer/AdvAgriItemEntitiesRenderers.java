package tech.icedlab.advagri.renderer;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import tech.icedlab.advagri.entities.item.AdvAgriItemEntities;

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
