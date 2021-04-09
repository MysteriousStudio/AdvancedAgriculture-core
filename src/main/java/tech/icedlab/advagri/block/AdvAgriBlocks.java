package tech.icedlab.advagri.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
import tech.icedlab.advagri.ModAta;
import tech.icedlab.advagri.block.machines.*;
import tech.icedlab.advagri.itemgroup.AdvAgriItemCoreGroup;
import tech.icedlab.advagri.itemgroup.AdvAgriItemWorldGroup;

public class AdvAgriBlocks {
    public static AdvAgriBlocks thisAdvAgriBlocks = new AdvAgriBlocks();

    public static ItemGroup CORE_ITEM_GROUP;
    public static ItemGroup WORLD_ITEM_GROUP;

    public static Integer MAX_COUNT = 64;

    public Float BAMBOO_HARDNESS = 2.0F;
    public Float CABLE_HARDNESS = 1.0F;
    public Float DIRT_HARDNESS = 0.5F;


    public Integer BASE_ORE_GEN_LINE = 48;
    public Integer BASE_ORE_GEN_SIZE = 8;
    public Integer BASE_ORE_GEN_COUNT = 16;

    ///GENERATE

    //MetalOre
    public Block COPPER_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block ZINC_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block TIN_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block ALUMINUM_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block LEAD_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block SILVER_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block HIGH_CARBON_IRON_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block NICKEL_ORE = this.CopyBlockSettings(Blocks.IRON_ORE);
    public Block TUNGSTEN_ORE = this.CopyBlockSettings(Blocks.DIAMOND_ORE);
    public Block TITANIUM_ORE = this.CopyBlockSettings(Blocks.DIAMOND_ORE);
    //WeatheredOre
    public static Block WEATHERED_COPPER_ORE;
    public static Block WEATHERED_ZINC_ORE;
    public static Block WEATHERED_TIN_ORE;
    public static Block WEATHERED_ALUMINUM_ORE;
    public static Block WEATHERED_LEAD_ORE;
    public static Block WEATHERED_SILVER_ORE;
    public static Block WEATHERED_HIGH_CARBON_IRON_ORE;
    public static Block WEATHERED_NICKEL_ORE;
    public static Block WEATHERED_TUNGSTEN_ORE;
    public static Block WEATHERED_TITANIUM_ORE;
    //Block
    public Block COPPER_BLOCK;
    public Block ZINC_BLOCK;
    public Block TIN_BLOCK;
    public Block BRONZE_BLOCK;
    public Block ALUMINUM_BLOCK;
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
    public Block PHOS_ORE = this.CopyBlockSettings(Blocks.COAL_BLOCK);
    public SulphurOre SULPHUR_ORE = new SulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).luminance(10));
    public NetherSulphurOre NETHER_SULPHUR_ORE = new NetherSulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).luminance(10));

    public BambooBlock BAMBOO_BLOCK;

    public Block QUARRY = this.CopyBlockSettings(Blocks.DIRT);

    //Machine blocks
    public MachineShell MACHINE_SHELL;
    public FermentTank FERMENT_TANK;
    public BurningTank BURNING_TANK;
    public SunshineLiquefiesMachine SUNSHINE_LIQUEFIES_MACHINE;
    public SolarHighTemperatureElectrolyzeMachine SOLAR_HIGH_TEMPERATURE_ELECTROLYZE_MACHINE;
    public Crusher CRUSHER;
    public Extractor EXTRACTOR;
    public Centrifuge CENTRIFUGE;
    public OreWashingMachine ORE_WASHING_MACHINE;
    public ResinExtractor RESIN_EXTRACTOR;

    ///GENERATE

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
    public ConfiguredFeature<?, ?> ORE_ALUMINUM_OVERWORLD = ConfiguredFeature(this.ALUMINUM_ORE, BASE_ORE_GEN_SIZE + 4, BASE_ORE_GEN_LINE + 8, BASE_ORE_GEN_COUNT + 4);
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


    private AdvAgriBlocks() {
        CORE_ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
        WORLD_ITEM_GROUP = AdvAgriItemWorldGroup.getInstance().GetGroup();
    }


    public static AdvAgriBlocks getInstance() {
        return thisAdvAgriBlocks;
    }

    public void InitAllBlocks() {

        this.AllInOneStepForOre(COPPER_ORE, "copper_ore");
        this.AllInOneStepForOre(ZINC_ORE, "zinc_ore");
        this.AllInOneStepForOre(TIN_ORE, "tin_ore");
        this.AllInOneStepForOre(ALUMINUM_ORE, "aluminum_ore");
        this.AllInOneStepForOre(LEAD_ORE, "lead_ore");
        this.AllInOneStepForOre(SILVER_ORE, "silver_ore");
        this.AllInOneStepForOre(HIGH_CARBON_IRON_ORE, "high_carbon_iron_ore");
        this.AllInOneStepForOre(NICKEL_ORE, "nickel_ore");
        this.AllInOneStepForOre(TUNGSTEN_ORE, "tungsten_ore");
        this.AllInOneStepForOre(TITANIUM_ORE, "titanium_ore");

        this.AllInOneStepForOre(PHOS_ORE, "phos_ore");
        this.AllInOneStepForOre(SULPHUR_ORE, "sulphur_ore");
        this.AllInOneStepForOre(NETHER_SULPHUR_ORE, "nether_sulphur_ore");

        this.AllInOneStepForOre(WEATHERED_COPPER_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_copper_ore");
        this.AllInOneStepForOre(WEATHERED_ZINC_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_zinc_ore");
        this.AllInOneStepForOre(WEATHERED_TIN_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_tin_ore");
        this.AllInOneStepForOre(WEATHERED_ALUMINUM_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_aluminum_ore");
        this.AllInOneStepForOre(WEATHERED_LEAD_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_lead_ore");
        this.AllInOneStepForOre(WEATHERED_SILVER_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_silver_ore");
        this.AllInOneStepForOre(WEATHERED_HIGH_CARBON_IRON_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_high_carbon_iron_ore");
        this.AllInOneStepForOre(WEATHERED_NICKEL_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_nickel_ore");
        this.AllInOneStepForOre(WEATHERED_TUNGSTEN_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_tungsten_ore");
        this.AllInOneStepForOre(WEATHERED_TITANIUM_ORE = this.CopyBlockSettings(Blocks.GRAVEL), "weathered_titanium_ore");


        this.AllInOneStep(COPPER_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "copper_block");
        this.AllInOneStep(ZINC_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "zinc_block");
        this.AllInOneStep(TIN_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "tin_block");
        this.AllInOneStep(BRONZE_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "bronze_block");
        this.AllInOneStep(ALUMINUM_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "aluminum_block");
        this.AllInOneStep(LEAD_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "lead_block");
        this.AllInOneStep(SILVER_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "silver_block");
        this.AllInOneStep(STEEL_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "steel_block");
        this.AllInOneStep(NICKEL_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "nickel_block");
        this.AllInOneStep(TUNGSTEN_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "tungsten_block");
        this.AllInOneStep(TITANIUM_BLOCK = this.CopyBlockSettings(Blocks.IRON_BLOCK), "titanium_block");

        this.AllInOneStep(BAMBOO_BLOCK = new BambooBlock(FabricBlockSettings.of(Material.BAMBOO).hardness(BAMBOO_HARDNESS)), "bamboo_block");
        this.AllInOneStep(QUARRY, "quarry");

        this.AllInOneStep(COPPER_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "copper_cable");
        this.AllInOneStep(TIN_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "tin_cable");
        this.AllInOneStep(SILVER_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "silver_cable");
        this.AllInOneStep(GOLD_CABLE = this.AddStoneTypeBlockTool(CABLE_HARDNESS), "gold_cable");

        this.AllInOneStep(MACHINE_SHELL = new MachineShell(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "machine_shell");
        this.AllInOneStep(FERMENT_TANK = new FermentTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "ferment_tank.json");
        this.AllInOneStep(BURNING_TANK = new BurningTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "burning_tank");
        this.AllInOneStep(SUNSHINE_LIQUEFIES_MACHINE = new SunshineLiquefiesMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "sunshine_liquefies_machine");
        this.AllInOneStep(SOLAR_HIGH_TEMPERATURE_ELECTROLYZE_MACHINE = new SolarHighTemperatureElectrolyzeMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "solar_high_temperature_electrolyze_machine");
        this.AllInOneStep(CRUSHER = new Crusher(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "crusher");
        this.AllInOneStep(EXTRACTOR = new Extractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "extractor");
        this.AllInOneStep(CENTRIFUGE = new Centrifuge(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "centrifuge");
        this.AllInOneStep(ORE_WASHING_MACHINE = new OreWashingMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "ore_washing_machine");
        this.AllInOneStep(RESIN_EXTRACTOR = new ResinExtractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)), "resin_extractor");
    }

    public void RegisteredGenOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_copper_overworld"), ORE_COPPER_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_tin_overworld"), ORE_TIN_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_zinc_overworld"), ORE_ZINC_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ModAta.ModID, "ore_aluminum_overworld"), ORE_ALUMINUM_OVERWORLD);
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

    private AdvAgriOreBlock CopyBlockSettings(Block block) {
        return new AdvAgriOreBlock(FabricBlockSettings.copyOf(block));
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
