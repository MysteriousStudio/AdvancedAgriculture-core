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

    public static Integer MAX_COUNT;

    //Ore
    public Block COPPER_ORE;
    public Block ZINC_ORE;
    public Block TIN_ORE;
    public Block ALUMINIUM_ORE;
    public Block LEAD_ORE;
    public Block SILVER_ORE;
    public Block NICKEL_ORE;
    public Block TUNGSTEN_ORE;
    public Block TITANIUM_ORE;

    public Blocks(ItemGroup ig) {
        ITEM_GROUP = ig;
        InitAllBlocks();
    }

    private void InitAllBlocks() {
        COPPER_ORE = this.AllInOneStep(this.FastAddTool(), "copper_ore");
        ZINC_ORE = this.AllInOneStep(this.FastAddTool(), "zinc_ore");
        TIN_ORE = this.AllInOneStep(this.FastAddTool(), "tin_ore");
        ALUMINIUM_ORE = this.AllInOneStep(this.FastAddTool(), "aluminium_ore");
        LEAD_ORE = this.AllInOneStep(this.FastAddTool(), "lead_ore");
        SILVER_ORE = this.AllInOneStep(this.FastAddTool(), "silver_ore");
        NICKEL_ORE = this.AllInOneStep(this.FastAddTool(), "nickel_ore");
        TUNGSTEN_ORE = this.AllInOneStep(this.FastAddTool(), "tungsten_ore");
        TITANIUM_ORE = this.AllInOneStep(this.FastAddTool(), "titanium_ore");
    }

    private Block FastAddTool() {
        return new Block(FabricBlockSettings.of(Material.STONE).hardness(3.0F));
    }

    private Block AllInOneStep(Block block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(ModAta.ModID, path), block);
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, path), new BlockItem(block, new Item.Settings().group(ITEM_GROUP).maxCount(MAX_COUNT)));
        return block;
    }

}
