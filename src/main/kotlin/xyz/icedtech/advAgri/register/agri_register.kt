package xyz.icedtech.advAgri.register

import com.sun.corba.se.spi.ior.IdentifiableFactory
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import xyz.icedtech.advAgri.blocks.AgriBlock
import xyz.icedtech.advAgri.item.AgriGroupItem
import xyz.icedtech.advAgri.modata.Modata


class AgriRegister {
    fun registerAgriItem() {
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

    }

    fun registerAgriBlockItem() {
        val modid = Modata().modid
        val blockItemList = AgriBlock()
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "acidified_soil"),
            blockItemList.ACIDIFIED_SOIL
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "crop_racks"),
            blockItemList.CROP_RACKS
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "ferment_tank"),
            blockItemList.FERMENT_TANK
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "hardened_soil"),
            blockItemList.HARDENED_SOIL
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "humus"),
            blockItemList.HUMUS
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "sulphur_ore"),
            blockItemList.SULPHUR_ORE
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "nether_sulphur_ore"),
            blockItemList.NETHER_SULPHUR_ORE
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "quarry"),
            blockItemList.QUARRY
        )
        Registry.register(
            Registry.BLOCK,
            Identifier(modid, "silt"),
            blockItemList.SILT
        )
    }
}