package xyz.icedtech.advagri.events;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import xyz.icedtech.advagri.item.AdvAgriItems;

import java.util.Random;

public class BambooBrokenEvent implements EventInterface {

    private BambooBrokenEvent Instance = new BambooBrokenEvent();

    private BambooBrokenEvent() {
    }

    public BambooBrokenEvent getInstance() {
        return Instance;
    }

    @Override
    public void Init() {
        dropBambooLeaves();
    }

    static void dropBambooLeaves() {
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, entity) -> {
            int randomNumber = new Random().nextInt(100);
            //ADD ANY EVENTS ABOUT BREAKING BAMBOO
            if (state.getBlock() == Blocks.BAMBOO) {
                if (randomNumber < 20) {
                    new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ()).dropItem(AdvAgriItems.getInstance().BAMBOO_LEAVES);
                } else if (randomNumber < 50) {
                    for (int i = 1; i < 3; i++) {
                        new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ()).dropItem(AdvAgriItems.getInstance().BAMBOO_LEAVES);
                    }
                } else if (randomNumber < 70) {
                    for (int i = 1; i < 4; i++) {
                        new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ()).dropItem(AdvAgriItems.getInstance().BAMBOO_LEAVES);
                    }
                } else {
                    for (int i = 1; i < 5; i++) {
                        new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ()).dropItem(AdvAgriItems.getInstance().BAMBOO_LEAVES);
                    }
                }
            }
        });
    }
}
