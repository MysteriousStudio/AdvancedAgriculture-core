package xyz.icedtech.advagri.events;

import com.sun.org.apache.bcel.internal.generic.FADD;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BambooBlock;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Random;


public class GrassBreakEvent implements EventInterface {
    private static GrassBreakEvent grassBreakEvent = new GrassBreakEvent();

    private GrassBreakEvent() {

    }

    public static GrassBreakEvent getInstance() {
        return grassBreakEvent;
    }

    @Override
    public void Init() {

        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, entity) -> {
            if (state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.TALL_GRASS) {
                if (new Random().nextInt(50) == 0) {
                    new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ()).dropItem(Blocks.BAMBOO);
                }
            }
        });

    }
}
