package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.block.FabricBlockSettings.*
import net.minecraft.block.Block
import net.minecraft.block.Material


class AgriBlock {
    //磷矿
    var PHOS_ORE =
        Block(of(Material.METAL).hardness(3F).breakByHand(false).build())
    //作物架
    var CROP_RACKS =
        Block(of(Material.METAL).hardness(0.1F).breakByHand(true).build())
    //蛭石土
    var QUARRY =
        Block(of(Material.METAL).hardness(0.6F).breakByHand(true).build())
    //发酵罐
    var FERMENT_TANK =
        Block(of(Material.METAL).hardness(0.2F).breakByHand(true).build())
    //淤泥 材质OK
    var SILT =
        Block(of(Material.METAL).hardness(0.6F).breakByHand(true).build())
    //腐殖质 材质OK
    var HUMUS =
        Block(of(Material.METAL).hardness(0.4F).breakByHand(true).build())
    //酸化土
    var ACIDIFIED_SOIL =
        Block(of(Material.METAL).hardness(0.6F).breakByHand(true).build())
    //硬化土
    var HARDENED_SOIL =
        Block(of(Material.METAL).hardness(0.6F).breakByHand(true).build())
    //硫磺矿石 材质OK
    val SULPHUR_ORE =
        Block(of(Material.METAL).hardness(15F).breakByHand(false).build())
    //地狱硫磺矿石 材质OK
    val NETHER_SULPHUR_ORE =
        Block(of(Material.METAL).hardness(15F).breakByHand(false).build())
}