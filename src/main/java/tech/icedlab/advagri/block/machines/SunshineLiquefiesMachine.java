package tech.icedlab.advagri.block.machines;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import tech.icedlab.advagri.entities.block.SunshineLiquefiesMachineEntity;

public class SunshineLiquefiesMachine extends Machine implements BlockEntityProvider {
    public SunshineLiquefiesMachine(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new SunshineLiquefiesMachineEntity();
    }
}
