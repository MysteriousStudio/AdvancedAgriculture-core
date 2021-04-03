package xyz.icedtech.advagri.block.machines;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import xyz.icedtech.advagri.entities.block.CrusherEntity;

public class Crusher extends Machine implements BlockEntityProvider {
    public Crusher(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new CrusherEntity();
    }
}
