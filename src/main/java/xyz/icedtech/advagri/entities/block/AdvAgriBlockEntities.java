package xyz.icedtech.advagri.entities.block;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.block.AdvAgriBlocks;

public class AdvAgriBlockEntities {

    @NotNull
    public static BlockEntityType<BambooBlockEntity> BAMBOO_BLOCK_ENTITY;

    private static final AdvAgriBlockEntities INSTANCE = new AdvAgriBlockEntities();

    public static AdvAgriBlockEntities getInstance() {
        return INSTANCE;
    }

    AdvAgriBlockEntities() {
    }

    public void InitAllBlockEntities() {
        BAMBOO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, ModAta.ModID + ":bamboo_block", BlockEntityType.Builder.create(BambooBlockEntity::new, AdvAgriBlocks.getInstance().BAMBOO_BLOCK).build(null));
    }

}
