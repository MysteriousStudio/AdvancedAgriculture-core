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

        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));

        if (hand == Hand.MAIN_HAND) {

            //Todo: 1/18/21 12:50 PM
            // User: suibing
            // Aims: Need to make the firecracker can be throwable and take a explosion at the end of fly
            // Desc: Before this, we have to finished the FirecrackerEntity class. But just use world.Explosion() is OK now (Before 1.18.x).:)
            // Stat: False

            world.createExplosion(
                    playerEntity,
                    playerEntity.getX(),
                    playerEntity.getY(),
                    playerEntity.getZ(),
                    0.1F,
                    false,
                    Explosion.DestructionType.BREAK
            );

        }

        if (!playerEntity.abilities.creativeMode) {
            itemStack.decrement(1);
        }

        return super.use(world, playerEntity, hand);
    }
}
