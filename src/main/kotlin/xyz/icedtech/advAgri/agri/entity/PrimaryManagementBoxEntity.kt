package xyz.icedtech.advAgri.agri.entity

import net.minecraft.block.entity.BlockEntity
import java.util.function.Supplier

class PrimaryManagementBoxEntity : BlockEntity(PRIMARY_MANAGEMENT_BOX_ENTITY), Supplier<PrimaryManagementBoxEntity> {
    override fun get(): PrimaryManagementBoxEntity {
        return PrimaryManagementBoxEntity()
    }
}