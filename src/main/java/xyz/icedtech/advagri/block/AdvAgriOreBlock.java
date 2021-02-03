package xyz.icedtech.advagri.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

import java.util.Random;

public class AdvAgriOreBlock extends OreBlock {
    public AdvAgriOreBlock(Settings settings) {
        super(settings);
    }


    //Todo: 1/18/21 1:07 PM 
    // User: suibing
    // Aims: For broken the SulphurOre block, there are 15% taking a explosion.If the block is in the nether, the chance increase to 50%.
    // Desc: Make the SulphurOre explosion.
    // Stat: False

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {

        Integer randomNum = new Random().nextInt(100);


        super.onBroken(world, pos, state);
        if (state.getBlock() == AdvAgriBlocks.getInstance().SULPHUR_ORE) {
            if (randomNum <= 15) {

            }
        } else if (state.getBlock() == AdvAgriBlocks.getInstance().NETHER_SULPHUR_ORE) {
            if (randomNum <= 50) {

            }
        }
    }

    //Todo: 1/18/21 1:26 PM 
    // User: suibing
    // Aims: When break SulphurOre,WeatheredOre, there should be some ExperienceBall spawned.
    // Desc: Like Minecraft's CalOre,DiamondOre and so on.
    // Stat: False

    @Override
    protected int getExperienceWhenMined(Random random) {
        return super.getExperienceWhenMined(random);
    }
}
