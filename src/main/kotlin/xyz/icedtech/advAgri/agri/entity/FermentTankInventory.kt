package xyz.icedtech.advAgri.entity

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.inventory.Inventories
import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack
import net.minecraft.util.DefaultedList


interface FermentTankInventory : Inventory {

    val items: DefaultedList<ItemStack?>

    override fun getInvSize(): Int {
        return items.size
    }

    override fun isInvEmpty(): Boolean {
        for (i in 0 until invSize) {
            val stack = getInvStack(i)
            if (!stack.isEmpty) {
                return false
            }
        }
        return true
    }

    override fun getInvStack(slot: Int): ItemStack {
        return items[slot]
    }

    override fun takeInvStack(slot: Int, count: Int): ItemStack {
        val result = Inventories.splitStack(items, slot, count)
        if (!result.isEmpty) {
            this.markDirty()
        }
        return result
    }

    override fun removeInvStack(slot: Int): ItemStack {
        return Inventories.removeStack(items, slot)
    }

    override fun setInvStack(slot: Int, stack: ItemStack) {
        items[slot] = stack
        if (stack.count > invMaxStackAmount) {
            stack.count = invMaxStackAmount
        }
    }

    override fun clear() {
        items.clear()
    }

    override fun canPlayerUseInv(player: PlayerEntity): Boolean {
        return true
    }
}