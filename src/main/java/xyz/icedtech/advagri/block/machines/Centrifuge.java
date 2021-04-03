package xyz.icedtech.advagri.block.machines;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class Centrifuge extends Machine implements BlockEntityProvider {
    public Centrifuge(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return null;
    }
}
