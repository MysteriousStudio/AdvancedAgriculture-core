package xyz.icedtech.advagri.events;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;

import java.util.Random;


public class GrassBrokenEvent implements EventInterface {
    private static GrassBrokenEvent grassBrokenEvent = new GrassBrokenEvent();

    private GrassBrokenEvent() {

    }

    public static GrassBrokenEvent getInstance() {
        return grassBrokenEvent;
    }

    @Override
    public void Init() {

        //Todo: 1/18/21 1:01 PM 
        // User: suibing
        // Aims: For getting bamboo from grass, only can take the bamboo from BREAKING grass by hand. Not any plan to add some way to get bamboo by using water to get the bamboo.
        // Desc: The new way to get bamboo.
        // Stat: True
        
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, entity) -> {
            if (state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.TALL_GRASS) {
                //ADD ANY EVENTS ABOUT BREAKING GRASS
                if (new Random().nextInt(50) == 0) {
                    new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ()).dropItem(Blocks.BAMBOO);
                }
            }
        });

    }
}
