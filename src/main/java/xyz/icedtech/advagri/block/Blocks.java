package xyz.icedtech.advagri.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockCollisionSpliterator;
import org.omg.CORBA.PUBLIC_MEMBER;
import xyz.icedtech.advagri.ModAta;

public class Blocks {
    public static ItemGroup ITEM_GROUP;

    public static Integer MAX_COUNT = 64;
    public static Float BAMBOO_HARDNESS = 2.0F;

    //Ore
    public Block COPPER_ORE;
    public Block ZINC_ORE;
    public Block TIN_ORE;
    public Block ALUMINIUM_ORE;
    public Block LEAD_ORE;
    public Block SILVER_ORE;
    public Block HIGH_CARBON_IRON_ORE;
    public Block NICKEL_ORE;
    public Block TUNGSTEN_ORE;
    public Block TITANIUM_ORE;
    //Ore
    public Block WEATHERED_COPPER_ORE;
    public Block WEATHERED_ZINC_ORE;
    public Block WEATHERED_TIN_ORE;
    public Block WEATHERED_ALUMINIUM_ORE;
    public Block WEATHERED_LEAD_ORE;
    public Block WEATHERED_SILVER_ORE;
    public Block WEATHERED_HIGH_CARBON_IRON_ORE;
    public Block WEATHERED_NICKEL_ORE;
    public Block WEATHERED_TUNGSTEN_ORE;
    public Block WEATHERED_TITANIUM_ORE;
    //Block
    public Block COPPER_BLOCK;
    public Block ZINC_BLOCK;
    public Block TIN_BLOCK;
    public Block ALUMINIUM_BLOCK;
    public Block LEAD_BLOCK;
    public Block SILVER_BLOCK;
    public Block STEEL_BLOCK;
    public Block NICKEL_BLOCK;
    public Block TUNGSTEN_BLOCK;
    public Block TITANIUM_BLOCK;

    public Block BAMBOO_BLOCK;

    public Blocks(ItemGroup ig) {
        ITEM_GROUP = ig;
        InitAllBlocks();
    }

    private void InitAllBlocks() {

        this.AllInOneStep(COPPER_ORE = this.FastAddTool(), "copper_ore");
        this.AllInOneStep(ZINC_ORE = this.FastAddTool(), "zinc_ore");
        this.AllInOneStep(TIN_ORE = this.FastAddTool(), "tin_ore");
        this.AllInOneStep(ALUMINIUM_ORE = this.FastAddTool(), "aluminium_ore");
        this.AllInOneStep(LEAD_ORE = this.FastAddTool(), "lead_ore");
        this.AllInOneStep(SILVER_ORE = this.FastAddTool(), "silver_ore");
        this.AllInOneStep(HIGH_CARBON_IRON_ORE = this.FastAddTool(), "high_carbon_iron_ore");
        this.AllInOneStep(NICKEL_ORE = this.FastAddTool(), "nickel_ore");
        this.AllInOneStep(TUNGSTEN_ORE = this.FastAddTool(), "tungsten_ore");
        this.AllInOneStep(TITANIUM_ORE = this.FastAddTool(), "titanium_ore");

        this.AllInOneStep(WEATHERED_COPPER_ORE = this.FastAddTool(), "weathered_copper_ore");
        this.AllInOneStep(WEATHERED_ZINC_ORE = this.FastAddTool(), "weathered_zinc_ore");
        this.AllInOneStep(WEATHERED_TIN_ORE = this.FastAddTool(), "weathered_tin_ore");
        this.AllInOneStep(WEATHERED_ALUMINIUM_ORE = this.FastAddTool(), "weathered_aluminium_ore");
        this.AllInOneStep(WEATHERED_LEAD_ORE = this.FastAddTool(), "weathered_lead_ore");
        this.AllInOneStep(WEATHERED_SILVER_ORE = this.FastAddTool(), "weathered_silver_ore");
        this.AllInOneStep(WEATHERED_HIGH_CARBON_IRON_ORE = this.FastAddTool(), "weathered_high_carbon_iron_ore");
        this.AllInOneStep(WEATHERED_NICKEL_ORE = this.FastAddTool(), "weathered_nickel_ore");
        this.AllInOneStep(WEATHERED_TUNGSTEN_ORE = this.FastAddTool(), "weathered_tungsten_ore");
        this.AllInOneStep(WEATHERED_TITANIUM_ORE = this.FastAddTool(), "weathered_titanium_ore");


        this.AllInOneStep(COPPER_BLOCK = this.FastAddTool(), "copper_block");
        this.AllInOneStep(ZINC_BLOCK = this.FastAddTool(), "zinc_block");
        this.AllInOneStep(TIN_BLOCK = this.FastAddTool(), "tin_block");
        this.AllInOneStep(ALUMINIUM_BLOCK = this.FastAddTool(), "aluminium_block");
        this.AllInOneStep(LEAD_BLOCK = this.FastAddTool(), "lead_block");
        this.AllInOneStep(SILVER_BLOCK = this.FastAddTool(), "silver_block");
        this.AllInOneStep(STEEL_BLOCK = this.FastAddTool(), "steel_block");
        this.AllInOneStep(NICKEL_BLOCK = this.FastAddTool(), "nickel_block");
        this.AllInOneStep(TUNGSTEN_BLOCK = this.FastAddTool(), "tungsten_block");
        this.AllInOneStep(TITANIUM_BLOCK = this.FastAddTool(), "titanium_block");

        this.AllInOneStep(BAMBOO_BLOCK = this.FastAddTool(BAMBOO_HARDNESS), "bamboo_block");
    }

    private Block FastAddTool() {
        return new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F));
    }

    private Block FastAddTool(Float hardness) {
        return new Block(FabricBlockSettings.of(Material.STONE).hardness(hardness));
    }

    private void AllInOneStep(Block block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(ModAta.ModID, path), block);
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, path), new BlockItem(block, new Item.Settings().group(ITEM_GROUP).maxCount(MAX_COUNT)));
    }

}
