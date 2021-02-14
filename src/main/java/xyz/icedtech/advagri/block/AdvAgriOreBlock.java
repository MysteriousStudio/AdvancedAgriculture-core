package xyz.icedtech.advagri.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.WorldAccess;

import java.util.Random;

public class AdvAgriOreBlock extends OreBlock {
    public AdvAgriOreBlock(Settings settings) {
        super(settings);
    }

    //Todo: 1/18/21 1:26 PM
    // User: suibing
    // Aims: When break SulphurOre,WeatheredOre, there should be some ExperienceBall spawned.
    // Desc: Like Minecraft's CalOre,DiamondOre and so on.
    // Stat: True
    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
    }

    @Override
    protected int getExperienceWhenMined(Random random) {
        if (this == AdvAgriBlocks.getInstance().SULPHUR_ORE || this == AdvAgriBlocks.getInstance().NETHER_SULPHUR_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == AdvAgriBlocks.getInstance().PHOS_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else {
            return 0;
        }
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int expCount = this.getExperienceWhenMined(world.random);
            if (expCount >= 0) {
                this.dropExperience(world, pos, expCount);
            }
        }
    }
}
