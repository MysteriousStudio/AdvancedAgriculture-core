package xyz.icedtech.advagri.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;


public class Firecracker extends Item {
    public Firecracker(Settings settings) {
        super(settings.maxCount(64));
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            world.createExplosion(playerEntity, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), 10F, true, Explosion.DestructionType.BREAK);
        }
        return super.use(world, playerEntity, hand);
    }
}
