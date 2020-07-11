package xyz.icedtech.advAgri.agri.entity

import net.minecraft.block.entity.BlockEntity
import java.util.function.Supplier

class PrimaryPumpsEntity : BlockEntity(PRIMARY_PUMPS_ENTITY), Supplier<PrimaryPumpsEntity> {
    override fun get(): PrimaryPumpsEntity {
        return PrimaryPumpsEntity()
    }
}