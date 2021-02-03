package xyz.icedtech.advagri.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import xyz.icedtech.advagri.entities.block.BambooBlockEntity;

public class BambooBlock extends Block implements BlockEntityProvider {
    public BambooBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new BambooBlockEntity();
    }
}
