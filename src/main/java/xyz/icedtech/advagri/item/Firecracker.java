package xyz.icedtech.advagri.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;


public class Firecracker extends Item {
    public Firecracker(Settings settings) {
        super(settings.maxCount(64));
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        ItemStack itemStack = playerEntity.getStackInHand(hand);

        world.playSound((PlayerEntity) null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));
        /*
        if (!world.isClient) {
            FirecrackerEntity fireCrackerEntity = new FirecrackerEntity(world, playerEntity);
            fireCrackerEntity.setItem(itemStack);
            fireCrackerEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 0.0F, 1.5F, 1.0F);
            world.spawnEntity(fireCrackerEntity);
        }
        */
        if (hand == Hand.MAIN_HAND) {
            world.createExplosion(playerEntity, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), 64F, false, Explosion.DestructionType.BREAK);
        }

        if (!playerEntity.abilities.creativeMode) {
            itemStack.decrement(1);
        }

        return super.use(world, playerEntity, hand);
    }
}
