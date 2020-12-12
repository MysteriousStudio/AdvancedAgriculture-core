package xyz.icedtech.advagri.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
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
import xyz.icedtech.advagri.itemgroup.AdvAgriItemCoreGroup;
import xyz.icedtech.advagri.itemgroup.AdvAgriItemWorldGroup;

public class Blocks {
    public static Blocks thisBlocks = new Blocks();

    public static ItemGroup CORE_ITEM_GROUP;
    public static ItemGroup WORLD_ITEM_GROUP;

    public static Integer MAX_COUNT = 64;

    public Float BAMBOO_HARDNESS = 2.0F;
    public Float CABLE_HARDNESS = 1.0F;
    public Float DIRT_TYPE_HARDNESS = 0.5F;


    public Integer BASE_ORE_GEN_LINE = 48;
    public Integer BASE_ORE_GEN_SIZE = 8;
    public Integer BASE_ORE_GEN_COUNT = 16;

    //MetalOre
    public Block COPPER_ORE = this.AddStoneTypeBlockTool(1);
    public Block ZINC_ORE = this.AddStoneTypeBlockTool(1);
    public Block TIN_ORE = this.AddStoneTypeBlockTool(1);
    public Block ALUMINIUM_ORE = this.AddStoneTypeBlockTool(2);
    public Block LEAD_ORE = this.AddStoneTypeBlockTool(2);
    public Block SILVER_ORE = this.AddStoneTypeBlockTool(2);
    public Block HIGH_CARBON_IRON_ORE = this.AddStoneTypeBlockTool(2);
    public Block NICKEL_ORE = this.AddStoneTypeBlockTool(2);
    public Block TUNGSTEN_ORE = this.AddStoneTypeBlockTool(3);
    public Block TITANIUM_ORE = this.AddStoneTypeBlockTool(3);
    //WeatheredOre
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
    public Block BRONZE_BLOCK;
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
    //OtherOre
    public Block PHOS_ORE = this.AddStoneTypeBlockTool();
    public Block SULPHUR_ORE = this.AddStoneTypeBlockTool();
    public Block NETHER_SULPHUR_ORE = this.AddStoneTypeBlockTool();

    public Block BAMBOO_BLOCK;

    public Block QUARRY = this.AddStoneTypeBlockTool(DIRT_TYPE_HARDNESS);

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
    @NotNull
    public ConfiguredFeature<?, ?> ORE_SULPHUR_OVERWORLD = ConfiguredFeature(this.SULPHUR_ORE, BASE_ORE_GEN_SIZE, BASE_ORE_GEN_LINE + 16, BASE_ORE_GEN_COUNT);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_QUARRY_OVERWORLD = ConfiguredFeature(this.QUARRY, BASE_ORE_GEN_SIZE, BASE_ORE_GEN_LINE + 32, BASE_ORE_GEN_COUNT);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_PHOS_OVERWORLD = ConfiguredFeature(this.PHOS_ORE, BASE_ORE_GEN_SIZE, BASE_ORE_GEN_LINE, BASE_ORE_GEN_COUNT);
    @NotNull
    public ConfiguredFeature<?, ?> ORE_NETHER_SULPHUR_NETHER = NetherConfiguredFeature(this.NETHER_SULPHUR_ORE, BASE_ORE_GEN_SIZE, BASE_ORE_GEN_LINE + 32, BASE_ORE_GEN_COUNT + 16);


    private Blocks() {
        CORE_ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
        WORLD_ITEM_GROUP = AdvAgriItemWorldGroup.getInstance().GetGroup();
    }


    public static Blocks getInstance() {
        return thisBlocks;
    }

    public void InitAllBlocks() {

        this.AllInOneStepForOre(COPPER_ORE, "copper_ore");
        this.AllInOneStepForOre(ZINC_ORE, "zinc_ore");
        this.AllInOneStepForOre(TIN_ORE, "tin_ore");
        this.AllInOneStepForOre(ALUMINIUM_ORE, "aluminium_ore");
        this.AllInOneStepForOre(LEAD_ORE, "lead_ore");
        this.AllInOneStepForOre(SILVER_ORE, "silver_ore");
        this.AllInOneStepForOre(HIGH_CARBON_IRON_ORE, "high_carbon_iron_ore");
        this.AllInOneStepForOre(NICKEL_ORE, "nickel_ore");
        this.AllInOneStepForOre(TUNGSTEN_ORE, "tungsten_ore");
        this.AllInOneStepForOre(TITANIUM_ORE, "titanium_ore");

        this.AllInOneStepForOre(PHOS_ORE, "phos_ore");
        this.AllInOneStepForOre(SULPHUR_ORE, "sulphur_ore");
        this.AllInOneStepForOre(NETHER_SULPHUR_ORE, "nether_sulphur_ore");

        this.AllInOneStepForOre(WEATHERED_COPPER_ORE = this.AddStoneTypeBlockTool(), "weathered_copper_ore");
        this.AllInOneStepForOre(WEATHERED_ZINC_ORE = this.AddStoneTypeBlockTool(), "weathered_zinc_ore");
        this.AllInOneStepForOre(WEATHERED_TIN_ORE = this.AddStoneTypeBlockTool(), "weathered_tin_ore");
        this.AllInOneStepForOre(WEATHERED_ALUMINIUM_ORE = this.AddStoneTypeBlockTool(), "weathered_aluminium_ore");
        this.AllInOneStepForOre(WEATHERED_LEAD_ORE = this.AddStoneTypeBlockTool(), "weathered_lead_ore");
        this.AllInOneStepForOre(WEATHERED_SILVER_ORE = this.AddStoneTypeBlockTool(), "weathered_silver_ore");
        this.AllInOneStepForOre(WEATHERED_HIGH_CARBON_IRON_ORE = this.AddStoneTypeBlockTool(), "weathered_high_carbon_iron_ore");
        this.AllInOneStepForOre(WEATHERED_NICKEL_ORE = this.AddStoneTypeBlockTool(), "weathered_nickel_ore");
        this.AllInOneStepForOre(WEATHERED_TUNGSTEN_ORE = this.AddStoneTypeBlockTool(), "weathered_tungsten_ore");
        this.AllInOneStepForOre(WEATHERED_TITANIUM_ORE = this.AddStoneTypeBlockTool(), "weathered_titanium_ore");


        this.AllInOneStep(COPPER_BLOCK = this.AddStoneTypeBlockTool(), "copper_block");
        this.AllInOneStep(ZINC_BLOCK = this.AddStoneTypeBlockTool(), "zinc_block");
        this.AllInOneStep(TIN_BLOCK = this.AddStoneTypeBlockTool(), "tin_block");
        this.AllInOneStep(BRONZE_BLOCK = this.AddStoneTypeBlockTool(), "bronze_block");
        this.AllInOneStep(ALUMINIUM_BLOCK = this.AddStoneTypeBlockTool(), "aluminium_block");
        this.AllInOneStep(LEAD_BLOCK = this.AddStoneTypeBlockTool(), "lead_block");
        this.AllInOneStep(SILVER_BLOCK = this.AddStoneTypeBlockTool(), "silver_block");
        this.AllInOneStep(STEEL_BLOCK = this.AddStoneTypeBlockTool(), "steel_block");
        this.AllInOneStep(NICKEL_BLOCK = this.AddStoneTypeBlockTool(), "nickel_block");
        this.AllInOneStep(TUNGSTEN_BLOCK = this.AddStoneTypeBlockTool(), "tungsten_block");
        this.AllInOneStep(TITANIUM_BLOCK = this.AddStoneTypeBlockTool(), "titanium_block");

        this.AllInOneStep(COPPER_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "copper_cable");
        this.AllInOneStep(TIN_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "tin_cable");
        this.AllInOneStep(SILVER_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "silver_cable");
        this.AllInOneStep(GOLD_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "gold_cable");


        this.AllInOneStep(BAMBOO_BLOCK = this.AddStoneTypeBlockTool(BAMBOO_HARDNESS), "bamboo_block");

        this.AllInOneStep(QUARRY, "quarry");

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

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_phos_overworld"), ORE_PHOS_OVERWORLD);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_sulphur_overworld"), ORE_SULPHUR_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_nether_sulphur_nether"), ORE_NETHER_SULPHUR_NETHER);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_quarry_overworld"), ORE_QUARRY_OVERWORLD);

    }

    private Block AddStoneTypeBlockTool() {
        return new AdvAgriOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).hardness(3.0F));
    }

    private Block AddStoneTypeBlockTool(Float hardness) {
        return new AdvAgriOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES).hardness(hardness));
    }

    private Block AddStoneTypeBlockTool(Integer level, Float hardness) {
        return new AdvAgriOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, level).hardness(hardness));
    }

    private Block AddStoneTypeBlockTool(Integer level) {
        return new AdvAgriOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, level).hardness(3.0F));
    }

    private void AllInOneStep(Block block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(ModAta.ModID, path), block);
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, path), new BlockItem(block, new Item.Settings().group(CORE_ITEM_GROUP).maxCount(MAX_COUNT)));
    }

    private void AllInOneStepForOre(Block block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(ModAta.ModID, path), block);
        Registry.register(Registry.ITEM, new Identifier(ModAta.ModID, path), new BlockItem(block, new Item.Settings().group(WORLD_ITEM_GROUP).maxCount(MAX_COUNT)));
    }

    private static ConfiguredFeature<?, ?> ConfiguredFeature(Block block, Integer size, Integer maximum, Integer count) {
        return Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        block.getDefaultState(),
                        size))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        0,
                        0,
                        maximum)))
                .spreadHorizontally()
                .repeat(count);
    }

    private static ConfiguredFeature<?, ?> NetherConfiguredFeature(Block block, Integer size, Integer maximum, Integer count) {
        return Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_NETHER,
                        block.getDefaultState(),
                        size))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        0,
                        0,
                        maximum)))
                .spreadHorizontally()
                .repeat(count);
    }
}
