package xyz.icedtech.advagri.block.machines;

import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class SolarHighTemperatureElectrolyzeMachine extends BlockWithEntity {
    protected SolarHighTemperatureElectrolyzeMachine(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return null;
    }
}
