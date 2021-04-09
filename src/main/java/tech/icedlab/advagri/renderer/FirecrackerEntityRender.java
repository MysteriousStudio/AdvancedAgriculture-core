package tech.icedlab.advagri.renderer;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.util.Identifier;
import tech.icedlab.advagri.entities.item.FirecrackerEntity;

public class FirecrackerEntityRender extends EntityRenderer<FirecrackerEntity> {
    protected FirecrackerEntityRender(EntityRenderDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public Identifier getTexture(FirecrackerEntity entity) {
        return new Identifier("adv_agri_core", "textures/entity/item/firecracker.png");
    }
}
