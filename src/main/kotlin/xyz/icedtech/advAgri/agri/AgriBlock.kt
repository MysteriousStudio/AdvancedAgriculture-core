package xyz.icedtech.advAgri.agri

import net.fabricmc.fabric.api.block.FabricBlockSettings.of
import net.minecraft.block.Block
import net.minecraft.block.Material
import xyz.icedtech.advAgri.agri.block.*
import xyz.icedtech.advAgri.material.AgriMaterial


class AgriBlock {
    //磷矿
    private var AM = AgriMaterial()
    var PHOS_ORE =
        Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())

    //作物架 材质&模型OK
    var CROP_RACKS =
        CropRacksBlock(of(AM.PLANT_CROP).hardness(0.1F).breakByHand(true).nonOpaque().noCollision().build())

    //蛭石土 材质OK
    var QUARRY =
        Block(of(Material.SOIL).hardness(0.7F).breakByHand(true).build())

    //发酵罐 材质&模型OK
    var FERMENT_TANK =
        FermentTankBlock(of(Material.WOOD).hardness(2.0F).breakByHand(true).build())

    //淤泥 材质OK
    var SILT =
        Block(of(Material.STONE).hardness(0.7F).breakByHand(true).build())

    //腐殖质 材质OK
    var HUMUS =
        Block(of(Material.SOIL).hardness(0.7F).breakByHand(true).build())

    //酸化土 材质OK
    var ACIDIFIED_SOIL =
        Block(of(Material.STONE).hardness(1.2F).breakByHand(true).build())

    //硬化土 材质OK
    var HARDENED_SOIL =
        Block(of(Material.STONE).hardness(1.2F).breakByHand(true).build())

    //硫磺矿石 材质OK
    val SULPHUR_ORE =
        Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())

    //地狱硫磺矿石 材质OK
    val NETHER_SULPHUR_ORE =
        Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())

    //竹篱笆
    var BAMBOO_FENCE =
        BambooFence(of(Material.BAMBOO).hardness(2.0F).breakByHand(true).build())

    var BAMBOO_BLOCK =
        BambooBlock(of(Material.BAMBOO).hardness(2.0F).breakByHand(true).build())

    var CERAMIC_JARS =
        CeramicJars(of(Material.STONE).hardness(2.0F).breakByHand(true).build())

    var COPPER_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var TUNGSTEN_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var ZINC_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var TIN_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var LEAD_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var NICKEL_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var ALUMINIUM_ORE = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())


    var COPPER_BLOCK = Block(of(Material.STONE).hardness(4.0F).breakByHand(false).build())
    var TUNGSTEN_BLOCK = Block(of(Material.STONE).hardness(4.0F).breakByHand(false).build())
    var ZINC_BLOCK = Block(of(Material.STONE).hardness(4.0F).breakByHand(false).build())
    var TIN_BLOCK = Block(of(Material.STONE).hardness(4.0F).breakByHand(false).build())
    var LEAD_BLOCK = Block(of(Material.STONE).hardness(4.0F).breakByHand(false).build())
    var NICKEL_BLOCK = Block(of(Material.STONE).hardness(4.0F).breakByHand(false).build())
    var ALUMINIUM_BLOCK = Block(of(Material.STONE).hardness(3.5F).breakByHand(false).build())


    var HIGH_TEMPERATURE_ELECTROLYTIC_FURNACE =
        HighTemperatureElectrolyticFurnace(of(Material.STONE).hardness(3.5F).breakByHand(true).build())
    var PRIMARY_WELL_BLOCK =
        PrimaryWellBlock(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var PRIMARY_MANAGEMENT_BLOCK =
        PrimaryManagementBox(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
    var PRIMARY_PUMPS =
        PrimaryPumps(of(Material.STONE).hardness(3.5F).breakByHand(false).build())
}