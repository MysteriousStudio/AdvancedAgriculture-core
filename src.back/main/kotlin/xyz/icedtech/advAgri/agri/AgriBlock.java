package xyz.icedtech.advAgri.agri;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import xyz.icedtech.advAgri.agri.block.*;


public class AgriBlock {
    public final Block PHOS_ORE = this.FastAddOreBlock();
    public final CropRacksBlock CROP_RACKS = new CropRacksBlock(FabricBlockSettings.of(Material.BAMBOO).hardness(0.5F).breakByHand(true));
    public final Block QUARRY = this.FastAddSoilBlock();
    public final FermentTankBlock FERMENT_TANK = new FermentTankBlock(FabricBlockSettings.of(Material.STONE).hardness(4).breakByHand(false));
    public final Block SILT = this.FastAddSoilBlock();
    public final Block HUMUS = this.FastAddSoilBlock();
    public final Block ACIDIFIED_SOIL = this.FastAddSoilBlock();
    public final Block HARDENED_SOIL = this.FastAddSoilBlock();
    public final Block SULPHUR_ORE = this.FastAddOreBlock();
    public final Block NETHER_SULPHUR_ORE = this.FastAddOreBlock();
    public final BambooFence BAMBOO_FENCE = new BambooFence(FabricBlockSettings.of(Material.BAMBOO).hardness(2.0F).breakByHand(true));
    public final BambooBlock BAMBOO_BLOCK = new BambooBlock(FabricBlockSettings.of(Material.BAMBOO).hardness(2.0F).breakByHand(true));
    public final CeramicJars CERAMIC_JARS = new CeramicJars(FabricBlockSettings.of(Material.STONE).hardness(2.0F).breakByHand(true));

    public final Block COPPER_ORE = this.FastAddOreBlock();
    public final Block TIN_ORE = this.FastAddOreBlock();
    public final Block ZINC_ORE = this.FastAddOreBlock();
    public final Block LEAD_ORE = this.FastAddOreBlock();
    public final Block TUNGSTEN_ORE = this.FastAddOreBlock();
    public final Block ALUMINIUM_ORE = this.FastAddOreBlock();
    public final Block SILVER_ORE = this.FastAddOreBlock();

    public final Block COPPER_BLOCK = this.FastAddOreBlock();
    public final Block TIN_BLOCK = this.FastAddOreBlock();
    public final Block ZINC_BLOCK = this.FastAddOreBlock();
    public final Block LEAD_BLOCK = this.FastAddOreBlock();
    public final Block TUNGSTEN_BLOCK = this.FastAddOreBlock();
    public final Block ALUMINIUM_BLOCK = this.FastAddOreBlock();
    public final Block SILVER_BLOCK = this.FastAddOreBlock();
    public final Block STEEL_BLOCK = this.FastAddOreBlock();
    public final Block NICKEL_BLOCK = this.FastAddOreBlock();
    public final Block TITANIUM_BLOCK = this.FastAddOreBlock();
    public final Block BRONZE_BLOCK = this.FastAddOreBlock();

    public final HighTemperatureElectrolyticFurnace HIGH_TEMPERATURE_ELECTROLYTIC_FURNACE = new
            HighTemperatureElectrolyticFurnace(FabricBlockSettings.of(Material.STONE).hardness(3.5F).breakByHand(true));
    public final ElementaryWellBlock ELEMENTARY_WELL_BLOCK = new
            ElementaryWellBlock(FabricBlockSettings.of(Material.STONE).hardness(3.5F).breakByHand(false));
    public final PrimaryManagementBox PRIMARY_MANAGEMENT_BLOCK = new
            PrimaryManagementBox(FabricBlockSettings.of(Material.STONE).hardness(3.5F).breakByHand(false));
    public final PrimaryPumps PRIMARY_PUMPS = new
            PrimaryPumps(FabricBlockSettings.of(Material.STONE).hardness(3.5F).breakByHand(false));
    public final Block MACHINE_CHASSIS = new
            Block(FabricBlockSettings.of(Material.STONE).hardness(2.0F).breakByHand(true));

    public final Block ELEMENTARY_FLUID_TANK = new
            Block(FabricBlockSettings.of(Material.STONE).hardness(2.0F).breakByHand(true));

    public final Block ELEMENTARY_SUNLIGHT_HARVESTER = new Block(FabricBlockSettings.of(Material.STONE).hardness(2.0F).breakByHand(false));


    private Block FastAddOreBlock() {
        return new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));
    }

    private Block FastAddSoilBlock() {
        return new Block(FabricBlockSettings.of(Material.METAL).hardness(1.0f).breakByHand(true));
    }

}
