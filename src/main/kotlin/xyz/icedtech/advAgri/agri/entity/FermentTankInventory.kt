package xyz.icedtech.advAgri.agri.entity

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.inventory.Inventories
import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack
import net.minecraft.util.collection.DefaultedList


interface FermentTankInventory : Inventory {

    val items: DefaultedList<ItemStack?>

    override fun size(): Int {
        return items.size
    }

    override fun isEmpty(): Boolean {
        for (i in 0 until size()) {
            val stack = getStack(i)
            if (!stack.isEmpty) {
                return false
            }
        }
        return true
    }

    override fun getStack(slot: Int): ItemStack {
        return items[slot]
    }

    /*  override fun takeInvStack(slot: Int, count: Int): ItemStack {
          val result = Inventories.splitStack(items, slot, count)
          if (!result.isEmpty) {
              this.markDirty()
          }
          return result
      }*/

    override fun removeStack(slot: Int): ItemStack {
        return Inventories.removeStack(items, slot)
    }

    override fun setStack(slot: Int, stack: ItemStack) {
        items[slot] = stack
        if (stack.count > items.size) {
            stack.count = items.size
        }
    }

    override fun clear() {
        items.clear()
    }

    override fun canPlayerUse(player: PlayerEntity): Boolean {
        return true
    }
}