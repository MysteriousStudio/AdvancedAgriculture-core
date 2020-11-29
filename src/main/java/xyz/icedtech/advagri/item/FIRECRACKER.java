package xyz.icedtech.advagri.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class FIRECRACKER extends Item {
    public FIRECRACKER(Settings settings ) {
        super(settings .maxCount(64) .group(ItemGroup.COMBAT));
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (hand == Hand.MAIN_HAND) {
            //Set a TNT, located in player's position
            TntEntity tntEntity = EntityType.TNT.create(world);
            assert tntEntity != null;
            tntEntity.setFuse(40);
            tntEntity.setPos(playerEntity.getX(), playerEntity.getY(), playerEntity.getZ());
            //Summon the TNT
            world.spawnEntity(tntEntity);
        }
        return super.use(world, playerEntity, hand);
    }
}
