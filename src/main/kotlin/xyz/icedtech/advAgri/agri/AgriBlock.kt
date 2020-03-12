package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.block.FabricBlockSettings.of
import net.minecraft.block.Block
import net.minecraft.block.Material
import xyz.icedtech.advAgri.agri.block.CropRacksBlock
import xyz.icedtech.advAgri.agri.block.FermentTankBlock
import xyz.icedtech.advAgri.material.AgriMaterial


class AgriBlock {
    //磷矿
    private var AM = AgriMaterial()
    var PHOS_ORE =
        Block(of(Material.STONE).hardness(3F).breakByHand(false).build())
    //作物架 材质&模型OK
    var CROP_RACKS =
        CropRacksBlock(of(AM.PLANT_CROP).hardness(0.1F).breakByHand(true).nonOpaque().noCollision().build())
    //蛭石土 材质OK
    var QUARRY =
        Block(of(Material.SAND).hardness(0.6F).breakByHand(true).build())
    //发酵罐 材质&模型OK
    var FERMENT_TANK =
        FermentTankBlock(of(Material.WOOD).hardness(0.2F).breakByHand(true).build())
    //淤泥 材质OK
    var SILT =
        Block(of(Material.STONE).hardness(0.6F).breakByHand(true).build())
    //腐殖质 材质OK
    var HUMUS =
        Block(of(Material.SAND).hardness(0.4F).breakByHand(true).build())
    //酸化土 材质OK
    var ACIDIFIED_SOIL =
        Block(of(Material.STONE).hardness(0.6F).breakByHand(true).build())
    //硬化土 材质OK
    var HARDENED_SOIL =
        Block(of(Material.STONE).hardness(0.6F).breakByHand(true).build())
    //硫磺矿石 材质OK
    val SULPHUR_ORE =
        Block(of(Material.STONE).hardness(15F).breakByHand(false).build())
    //地狱硫磺矿石 材质OK
    val NETHER_SULPHUR_ORE =
        Block(of(Material.STONE).hardness(15F).breakByHand(false).build())
}