package xyz.icedtech.advAgri.bamboo

import net.fabricmc.fabric.api.block.FabricBlockSettings.*
import net.minecraft.block.Block
import net.minecraft.block.Material
import xyz.icedtech.advAgri.bamboo.block.BambooFence

class BambooBlock {

    //竹篱笆
    var BAMBOO_FENCE =
        BambooFence(of(Material.PACKED_ICE).hardness(0.1F).breakByHand(true).build())


}

