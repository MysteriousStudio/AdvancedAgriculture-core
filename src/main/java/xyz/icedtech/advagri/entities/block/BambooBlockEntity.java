package xyz.icedtech.advagri.entities.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Tickable;

import java.util.Random;

public class BambooBlockEntity extends BlockEntity implements Tickable {
    public BambooBlockEntity() {
        super(AdvAgriBlockEntities.BAMBOO_BLOCK_ENTITY);
    }

    public static int age = 1;
    public static int life = 0;


    //Todo: 2/3/21 8:38 PM
    // User: suibing
    // Aims: Make the Bamboo Block change it's color with the time pass by.
    // Desc: The Bamboo Block has 3 stage(age),stage1 is the default,and to be stage2, stage3.
    // Stat: False
    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);

        tag.putInt("age", age);
        tag.putInt("life", life);

        return tag;
    }

    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        age = tag.getInt("age");
        life = tag.getInt("life");
        super.fromTag(state, tag);
    }

    @Override
    public void tick() {

        if (life >= 3) {
            return;
        }
        if (age >= 100000) {
            age = 0;
            life += 1;
            return;
        }
        if (new Random().nextInt(10) == 0) {
            age += 1;
        }
    }


}
