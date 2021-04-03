package xyz.icedtech.advagri.entities.block;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.block.AdvAgriBlocks;

public class AdvAgriBlockEntities {

    @NotNull
    public static BlockEntityType<BambooBlockEntity> BAMBOO_BLOCK_ENTITY;
    public static BlockEntityType<FermentTankEntity> FERMENT_TANK_ENTITY;
    public static BlockEntityType<BurningTankEntity> BURNING_TANK_ENTITY;
    public static BlockEntityType<SolarHighTemperatureElectrolyzeMachineEntity> SHTE_ENTITY;
    public static BlockEntityType<SunshineLiquefiesMachineEntity> SL_ENTITY;

    private static final AdvAgriBlockEntities INSTANCE = new AdvAgriBlockEntities();

    public static AdvAgriBlockEntities getInstance() {
        return INSTANCE;
    }

    AdvAgriBlockEntities() {
    }

    public void InitAllBlockEntities() {
        BAMBOO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, ModAta.ModID + ":bamboo_block", BlockEntityType.Builder.create(BambooBlockEntity::new, AdvAgriBlocks.getInstance().BAMBOO_BLOCK).build(null));
        FERMENT_TANK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, ModAta.ModID + ":ferment_tank", BlockEntityType.Builder.create(FermentTankEntity::new, AdvAgriBlocks.getInstance().FERMENT_TANK).build(null));
        BURNING_TANK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, ModAta.ModID + ":burning_tank", BlockEntityType.Builder.create(BurningTankEntity::new, AdvAgriBlocks.getInstance().BURNING_TANK).build(null));
        SHTE_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, ModAta.ModID + ":shte", BlockEntityType.Builder.create(SolarHighTemperatureElectrolyzeMachineEntity::new, AdvAgriBlocks.getInstance().SOLAR_HIGH_TEMPERATURE_ELECTROLYZE_MACHINE).build(null));
        SL_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, ModAta.ModID + ":sl", BlockEntityType.Builder.create(SunshineLiquefiesMachineEntity::new, AdvAgriBlocks.getInstance().SUNSHINE_LIQUEFIES_MACHINE).build(null));
    }

}
