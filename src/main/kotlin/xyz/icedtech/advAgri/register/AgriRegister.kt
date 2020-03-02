package xyz.icedtech.advAgri.register

import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.agri.AgriBlock
import xyz.icedtech.advAgri.agri.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata


class AgriRegister {
    fun RegistAll() {
        var group = this.registerAgriItem()
        this.registerAgriBlockItem(group)
    }

    fun registerAgriItem(): ItemGroup {
        val modid = Modata().modid
        val itemList = AgriGroupItem()
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "com_fert"),
            itemList.COM_FERT
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "grass_ash"),
            itemList.GRASS_ASH
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "phos"),
            itemList.PHOS
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "sulfur"),
            itemList.SULFUR
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "zircon"),
            itemList.ZIRCON
        )
        return itemList.AGRI_ITEM_GROUP
    }

    fun registerAgriBlockItem(group: ItemGroup) {
        val modid = Modata().modid
        val blockItemList = AgriBlock()
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "acidified_soil"),
            blockItemList.ACIDIFIED_SOIL
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "acidified_soil"),
            BlockItem(
                blockItemList.ACIDIFIED_SOIL,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "crop_racks"),
            blockItemList.CROP_RACKS
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "crop_racks"),
            BlockItem(
                blockItemList.CROP_RACKS,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "ferment_tank"),
            blockItemList.FERMENT_TANK
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "ferment_tank"),
            BlockItem(
                blockItemList.FERMENT_TANK,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "hardened_soil"),
            blockItemList.HARDENED_SOIL
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "hardened_soil"),
            BlockItem(
                blockItemList.HARDENED_SOIL,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "humus"),
            blockItemList.HUMUS
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "humus"),
            BlockItem(
                blockItemList.HUMUS,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "sulphur_ore"),
            blockItemList.SULPHUR_ORE
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "sulphur_ore"),
            BlockItem(
                blockItemList.SULPHUR_ORE,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "nether_sulphur_ore"),
            blockItemList.NETHER_SULPHUR_ORE
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "nether_sulphur_ore"),
            BlockItem(
                blockItemList.NETHER_SULPHUR_ORE,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "quarry"),
            blockItemList.QUARRY
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "quarry"),
            BlockItem(
                blockItemList.QUARRY,
                Item.Settings().group(group).maxCount(64)
            )
        )

        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "silt"),
            blockItemList.SILT
        )
        Registry.register(
            Registry.ITEM,
            Identifier(modid, "silt"),
            BlockItem(
                blockItemList.SILT,
                Item.Settings().group(group).maxCount(64)
            )
        )

    }


}