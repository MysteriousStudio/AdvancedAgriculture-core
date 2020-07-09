package xyz.icedtech.advAgri.agri.entity

import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.CompoundTag
import net.minecraft.util.collection.DefaultedList
import java.util.function.Supplier

class FermentTankEntity : BlockEntity(FERMENT_TANK_ENTITY),
    FermentTankInventory, Supplier<FermentTankEntity> {
    override var items: DefaultedList<ItemStack?> = DefaultedList.ofSize(8, ItemStack.EMPTY)
    override fun removeStack(slot: Int, amount: Int): ItemStack {
        val itemStack = Inventories.splitStack(items, slot, amount)
        if (!itemStack.isEmpty) {
            markDirty()
        }

        return itemStack
    }

    private var process = 0

    override fun toTag(tag: CompoundTag): CompoundTag? {
        Inventories.toTag(tag, items)
        tag.putInt("process", process)
        return tag
    }

    override fun fromTag(state: BlockState?, tag: CompoundTag?) {
        process = tag?.getInt("process") ?: 0
        Inventories.fromTag(tag, items)
    }

    override fun get(): FermentTankEntity {
        return this
    }
}


