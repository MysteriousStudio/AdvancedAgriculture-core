package xyz.icedtech.advAgri.agri.entity

import net.minecraft.block.entity.BlockEntity
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.CompoundTag
import net.minecraft.util.DefaultedList
import java.util.function.Supplier

open class FermentTankEntity : BlockEntity(FERMENT_TANK_ENTITY),
    FermentTankInventory, Supplier<FermentTankEntity> {
    override var items: DefaultedList<ItemStack?> = DefaultedList.ofSize(8, ItemStack.EMPTY)
    var process = 0

    override fun toTag(tag: CompoundTag): CompoundTag? {
        Inventories.toTag(tag, items)
        tag.putInt("process", process)
        return tag
    }

    override fun fromTag(tag: CompoundTag?) {
        process = tag?.getInt("process") ?: 0
        Inventories.fromTag(tag, items)
    }

    override fun get(): FermentTankEntity {
        return this
    }
}


