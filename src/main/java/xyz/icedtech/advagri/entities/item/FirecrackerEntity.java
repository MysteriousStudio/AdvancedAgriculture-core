package xyz.icedtech.advagri.entities.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
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
    protected Item getDefaultItem() {
        return AdvAgriItems.getInstance().FIRECRACKERS;
    }


    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
            Entity entity = entityHitResult.getEntity(); 
            int i = entity instanceof LivingEntity ? 1 : 0; 
            entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), (float)i); 
            entity.playSound(SoundEvents.ENTITY_FIREWORK_ROCKET_BLAST, 0.5F, 1F);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
            if (this.world.isClient()) {
                world.createExplosion(this, this.getX(), this.getY(), this.getZ(), 0.5F, false, Explosion.DestructionType.NONE);
            };
            playSound(SoundEvents.ENTITY_FIREWORK_ROCKET_BLAST, 1F, 1F);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte) 3);
            this.remove();
        }
    }


}
