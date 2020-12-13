package xyz.icedtech.advagri.block_entity;

import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import xyz.icedtech.advagri.block.AdvancedCraftingTable;

public class BlockEntity {

    public static final BlockEntityType<net.minecraft.block.entity.BlockEntity> ADVANCED_CRAFTING_TABLE_ENTITY = new BlockEntityType<>(AdvancedCraftingTableEntity::new, <> )

    @Override
    public void onInitialize() {
        ADVANCED_CRAFTING_TABLE_ENEITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "adv_agri_core:advanced_crafting_table", BlockEntityType.Builder.create(AdvancedCraftingTableEntity::new, ADVANCED_CRAFTING_TABLE).build(null));
    }

}
