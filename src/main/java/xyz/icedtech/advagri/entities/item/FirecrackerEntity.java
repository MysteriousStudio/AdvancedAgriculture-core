package xyz.icedtech.advagri.entities.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import xyz.icedtech.advagri.item.AdvAgriItems;

public class FirecrackerEntity extends ThrownItemEntity {

    public FirecrackerEntity(EntityType<? extends Entity> entityType, World world) {
        super(AdvAgriItemEntities.getInstance().FIRECRACKER_ENTITY, world);
    }

    public FirecrackerEntity(World world, LivingEntity owner) {
        super(AdvAgriItemEntities.getInstance().FIRECRACKER_ENTITY, owner, world);
    }

    public FirecrackerEntity(World world, double x, double y, double z) {
        super(AdvAgriItemEntities.getInstance().FIRECRACKER_ENTITY, x, y, z, world);
    }


    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (this.world.isClient()) {
            world.createExplosion(this, this.getX(), this.getY(), this.getZ(), 64F, false, Explosion.DestructionType.BREAK);
        }
    }

    @Override
    protected Item getDefaultItem() {
        return AdvAgriItems.getInstance().FIRECRACKERS;
    }
}
