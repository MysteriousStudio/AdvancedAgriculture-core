package xyz.icedtech.advagri.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.jetbrains.annotations.NotNull;
import xyz.icedtech.advagri.ModAta;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemGroup;

public class Blocks {
    public static Blocks thisBlocks = new Blocks();

    public static ItemGroup ITEM_GROUP;

    public static Integer MAX_COUNT = 64;
    public static Float BAMBOO_HARDNESS = 2.0F;
    public static Float CABLE = 1.0F;

    public Integer BASE_ORE_GEN_LINE = 48;
    public Integer BASE_ORE_GEN_SIZE = 8;
    public Integer BASE_ORE_GEN_COUNT = 16;

    //Ore
    public Block COPPER_ORE = this.FastAddTool();
    public Block ZINC_ORE = this.FastAddTool();
    public Block TIN_ORE = this.FastAddTool();
    public Block ALUMINIUM_ORE = this.FastAddTool();
    public Block LEAD_ORE = this.FastAddTool();
    public Block SILVER_ORE = this.FastAddTool();
    public Block HIGH_CARBON_IRON_ORE = this.FastAddTool();
    public Block NICKEL_ORE = this.FastAddTool();
    public Block TUNGSTEN_ORE = this.FastAddTool();
    public Block TITANIUM_ORE = this.FastAddTool();
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

    public Block COPPER_CABLE;
    public Block TIN_CABLE;
    public Block SILVER_CABLE;
    public Block GOLD_CABLE;

    public Block SULPHUR_ORE;

    public Block BAMBOO_BLOCK;

    //OverWorld ores
    @NotNull
    public ConfiguredFeature<?, ?> ORE_COPPER_OVERWORLD = ConfiguredFeature(this.COPPER_ORE, BASE_ORE_GEN_SIZE + 2, BASE_ORE_GEN_LINE + 32, BASE_ORE_GEN_COUNT + 8);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_SILVER_OVERWORLD = ConfiguredFeature(this.SILVER_ORE, BASE_ORE_GEN_SIZE, BASE_ORE_GEN_LINE, BASE_ORE_GEN_COUNT);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_TIN_OVERWORLD = ConfiguredFeature(this.TIN_ORE, BASE_ORE_GEN_SIZE + 2, BASE_ORE_GEN_LINE + 16, BASE_ORE_GEN_COUNT + 4);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_ZINC_OVERWORLD = ConfiguredFeature(this.ZINC_ORE, BASE_ORE_GEN_SIZE, BASE_ORE_GEN_LINE + 2, BASE_ORE_GEN_COUNT + 2);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_ALUMINIUM_OVERWORLD = ConfiguredFeature(this.ALUMINIUM_ORE, BASE_ORE_GEN_SIZE + 4, BASE_ORE_GEN_LINE + 8, BASE_ORE_GEN_COUNT + 4);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_LEAD_OVERWORLD = ConfiguredFeature(this.LEAD_ORE, BASE_ORE_GEN_SIZE + 2, BASE_ORE_GEN_LINE + 4, BASE_ORE_GEN_COUNT + 2);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_HIGH_CARBON_IRON_OVERWORLD = ConfiguredFeature(this.HIGH_CARBON_IRON_ORE, BASE_ORE_GEN_SIZE - 4, BASE_ORE_GEN_LINE - 16, BASE_ORE_GEN_COUNT - 8);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_NICKEL_OVERWORLD = ConfiguredFeature(this.NICKEL_ORE, BASE_ORE_GEN_SIZE - 6, BASE_ORE_GEN_LINE - 16, BASE_ORE_GEN_COUNT);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_TUNGSTEN_OVERWORLD = ConfiguredFeature(this.TUNGSTEN_ORE, BASE_ORE_GEN_SIZE - 4, BASE_ORE_GEN_LINE - 16, BASE_ORE_GEN_COUNT - 12);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_TITANIUM_OVERWORLD = ConfiguredFeature(this.TITANIUM_ORE, BASE_ORE_GEN_SIZE - 6, BASE_ORE_GEN_LINE, BASE_ORE_GEN_COUNT - 15);


    private Blocks() {
        ITEM_GROUP = AdvAgriItemGroup.getInstance().GetGroup();
    }


    public static Blocks getInstance() {
        return thisBlocks;
    }

    public void InitAllBlocks() {

        this.AllInOneStep(COPPER_ORE, "copper_ore");
        this.AllInOneStep(ZINC_ORE, "zinc_ore");
        this.AllInOneStep(TIN_ORE, "tin_ore");
        this.AllInOneStep(ALUMINIUM_ORE, "aluminium_ore");
        this.AllInOneStep(LEAD_ORE, "lead_ore");
        this.AllInOneStep(SILVER_ORE, "silver_ore");
        this.AllInOneStep(HIGH_CARBON_IRON_ORE, "high_carbon_iron_ore");
        this.AllInOneStep(NICKEL_ORE, "nickel_ore");
        this.AllInOneStep(TUNGSTEN_ORE, "tungsten_ore");
        this.AllInOneStep(TITANIUM_ORE, "titanium_ore");

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

        this.AllInOneStep(COPPER_CABLE = this.FastAddTool(CABLE), "copper_cable");
        this.AllInOneStep(TIN_CABLE = this.FastAddTool(CABLE), "tin_cable");
        this.AllInOneStep(SILVER_CABLE = this.FastAddTool(CABLE), "silver_cable");
        this.AllInOneStep(GOLD_CABLE = this.FastAddTool(CABLE), "gold_cable");


        this.AllInOneStep(BAMBOO_BLOCK = this.FastAddTool(BAMBOO_HARDNESS), "bamboo_block");
    }

    public void RegistryGenOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_copper_overworld"), ORE_COPPER_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_tin_overworld"), ORE_TIN_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_zinc_overworld"), ORE_ZINC_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_aluminium_overworld"), ORE_ALUMINIUM_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_silver_overworld"), ORE_SILVER_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_lead_overworld"), ORE_LEAD_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_high_carbon_iron_overworld"), ORE_HIGH_CARBON_IRON_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_nickel_overworld"), ORE_NICKEL_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_titanium_overworld"), ORE_TITANIUM_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_tungsten_overworld"), ORE_TUNGSTEN_OVERWORLD);
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

    private static ConfiguredFeature<?, ?> ConfiguredFeature(Block block, Integer size, Integer maximum, Integer count) {
        return Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        block.getDefaultState(),
                        size)) // vein size
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        0, // bottom offset
                        0, // min y level
                        maximum))) // max y level
                .spreadHorizontally()
                .repeat(count); // number of veins per chunk
    }
}
