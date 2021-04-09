package tech.icedlab.advagri.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import tech.icedlab.advagri.entities.item.FirecrackerEntity;


public class Firecracker extends Item {
    public Firecracker(Settings settings) {
        super(settings.maxCount(64));
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        world.playSound(null, playerEntity.getX(), playerEntity.getY(), playerEntity.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));

        if (!world.isClient) {
            FirecrackerEntity snowballEntity = new FirecrackerEntity(world, playerEntity);
            snowballEntity.setItem(itemStack);
            snowballEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 0.0F, 1.5F, 0F);
            world.spawnEntity(snowballEntity); // spawns entity
        }

        playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!playerEntity.abilities.creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
