package xyz.icedtech.advAgri.bamboo

import net.fabricmc.fabric.api.block.FabricBlockSettings.of
import net.minecraft.block.Material
import xyz.icedtech.advAgri.bamboo.block.BambooFenceBlock

class BambooBlock {

    //竹篱笆
    var BAMBOO_FENCE =
        BambooFenceBlock(of(Material.PACKED_ICE).hardness(0.1F).breakByHand(true).build())


}

