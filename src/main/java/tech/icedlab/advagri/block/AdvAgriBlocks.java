package tech.icedlab.advagri.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.jetbrains.annotations.NotNull;
import tech.icedlab.advagri.ModAta;
import tech.icedlab.advagri.block.machines.*;
import tech.icedlab.advagri.groups.AdvAgriItemCoreGroup;
import tech.icedlab.advagri.groups.AdvAgriItemWorldGroup;
import tech.icedlab.thorium.datas.RegistrationType;
import tech.icedlab.thorium.registration.DefaultBlock;
import tech.icedlab.thorium.registration.RegistrationUtil;

import java.lang.reflect.Field;

public class AdvAgriBlocks {
    public static AdvAgriBlocks thisAdvAgriBlocks = new AdvAgriBlocks();

    public static ItemGroup CORE_ITEM_GROUP = AdvAgriItemCoreGroup.getInstance().GetGroup();
    public static ItemGroup WORLD_ITEM_GROUP = AdvAgriItemWorldGroup.getInstance().GetGroup();

    public static Integer MAX_COUNT = 64;

    public Float BAMBOO_HARDNESS = 2.0F;
    public Float CABLE_HARDNESS = 1.0F;
    public Float DIRT_HARDNESS = 0.5F;


    public Integer BASE_ORE_GEN_LINE = 48;
    public Integer BASE_ORE_GEN_SIZE = 8;
    public Integer BASE_ORE_GEN_COUNT = 16;

    //MetalOre
    @AutoBlock(Path = AdvAgriBlocksEnum.COPPER_ORE)
    public Block COPPER_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.ZINC_ORE)
    public Block ZINC_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.TIN_ORE)
    public Block TIN_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.ALUMINUM_ORE)
    public Block ALUMINUM_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.LEAD_ORE)
    public Block LEAD_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.SILVER_ORE)
    public Block SILVER_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.HIGH_CARBON_IRON_ORE)
    public Block HIGH_CARBON_IRON_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.NICKEL_ORE)
    public Block NICKEL_ORE = new Block(DefaultBlock.cloneSettings(Blocks.IRON_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.TUNGSTEN_ORE)
    public Block TUNGSTEN_ORE = new Block(DefaultBlock.cloneSettings(Blocks.DIAMOND_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.TITANIUM_ORE)
    public Block TITANIUM_ORE = new Block(DefaultBlock.cloneSettings(Blocks.DIAMOND_ORE));
    //WeatheredOre
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_COPPER_ORE)
    public Block WEATHERED_COPPER_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_ZINC_ORE)
    public Block WEATHERED_ZINC_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_TIN_ORE)
    public Block WEATHERED_TIN_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_ALUMINUM_ORE)
    public Block WEATHERED_ALUMINUM_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_LEAD_ORE)
    public Block WEATHERED_LEAD_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_SILVER_ORE)
    public Block WEATHERED_SILVER_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_HIGH_CARBON_IRON_ORE)
    public Block WEATHERED_HIGH_CARBON_IRON_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_NICKEL_ORE)
    public Block WEATHERED_NICKEL_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_TUNGSTEN_ORE)
    public Block WEATHERED_TUNGSTEN_ORE;
    @AutoBlock(Path = AdvAgriBlocksEnum.WEATHERED_TITANIUM_ORE)
    public Block WEATHERED_TITANIUM_ORE;

    @AutoBlock(Path = AdvAgriBlocksEnum.COPPER_BLOCK)
    public Block COPPER_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.ZINC_BLOCK)
    public Block ZINC_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.TIN_BLOCK)
    public Block TIN_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.ALUMINUM_BLOCK)
    public Block ALUMINUM_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.LEAD_BLOCK)
    public Block LEAD_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.SILVER_BLOCK)
    public Block SILVER_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));

    @AutoBlock(Path = AdvAgriBlocksEnum.BRONZE_BLOCK)
    public Block BRONZE_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.STEEL_BLOCK)
    public Block STEEL_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.NICKEL_BLOCK)
    public Block NICKEL_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.TUNGSTEN_BLOCK)
    public Block TUNGSTEN_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.DIAMOND_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.TITANIUM_BLOCK)
    public Block TITANIUM_BLOCK = new Block(DefaultBlock.cloneSettings(Blocks.DIAMOND_BLOCK));

    @AutoBlock(Path = AdvAgriBlocksEnum.COPPER_CABLE)
    public Block COPPER_CABLE;
    @AutoBlock(Path = AdvAgriBlocksEnum.TIN_CABLE)
    public Block TIN_CABLE;
    @AutoBlock(Path = AdvAgriBlocksEnum.SILVER_CABLE)
    public Block SILVER_CABLE;
    @AutoBlock(Path = AdvAgriBlocksEnum.GOLD_CABLE)
    public Block GOLD_CABLE;

    //OtherOre
    @AutoBlock(Path = AdvAgriBlocksEnum.PHOS_ORE)
    public Block PHOS_ORE = new Block(DefaultBlock.cloneSettings(Blocks.COAL_ORE));
    @AutoBlock(Path = AdvAgriBlocksEnum.SULPHUR_ORE)
    public SulphurOre SULPHUR_ORE = new SulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).luminance(10));
    @AutoBlock(Path = AdvAgriBlocksEnum.NETHER_SULPHUR_ORE)
    public NetherSulphurOre NETHER_SULPHUR_ORE = new NetherSulphurOre(FabricBlockSettings.copyOf(Blocks.COAL_ORE).luminance(10));
    @AutoBlock(Path = AdvAgriBlocksEnum.BAMBOO_BLOCK)
    public BambooBlock BAMBOO_BLOCK = new BambooBlock(FabricBlockSettings.of(Material.BAMBOO).hardness(BAMBOO_HARDNESS));

    @AutoBlock(Path = AdvAgriBlocksEnum.QUARRY)
    public Block QUARRY = new Block(DefaultBlock.cloneSettings(Blocks.DIRT));

    //Machine blocks
    @AutoBlock(Path = AdvAgriBlocksEnum.MACHINE_SHELL)
    public MachineShell MACHINE_SHELL = new MachineShell(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.ADVANCED_CRAFTING_TABLE)
    public AdvancedCraftingTable ADVANCED_CRAFTING_TABLE = new AdvancedCraftingTable(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.FERMENT_TANK)
    public FermentTank FERMENT_TANK = new FermentTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.BURNING_TANK)
    public BurningTank BURNING_TANK = new BurningTank(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.SUNSHINE_LIQUEFIES_MACHINE)
    public SunshineLiquefiesMachine SUNSHINE_LIQUEFIES_MACHINE = new SunshineLiquefiesMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.SOLAR_HIGH_TEMPERATURE_ELECTROLYZE_MACHINE)
    public SolarHighTemperatureElectrolyzeMachine SOLAR_HIGH_TEMPERATURE_ELECTROLYZE_MACHINE = new SolarHighTemperatureElectrolyzeMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.CRUSHER)
    public Crusher CRUSHER = new Crusher(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.EXTRACTOR)
    public Extractor EXTRACTOR = new Extractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.CENTRIFUGE)
    public Centrifuge CENTRIFUGE = new Centrifuge(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.ORE_WASHING_MACHINE)
    public OreWashingMachine ORE_WASHING_MACHINE = new OreWashingMachine(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
    @AutoBlock(Path = AdvAgriBlocksEnum.RESIN_EXTRACTOR)
    public ResinExtractor RESIN_EXTRACTOR = new ResinExtractor(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK));
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

    }


    public static AdvAgriBlocks getInstance() {
        return thisAdvAgriBlocks;
    }

    public void registryBlock() {
        Field[] fields = AdvAgriBlocks.class.getFields();
        for (Field f : fields) {
            try {
                f.setAccessible(true);
                if (f.isAnnotationPresent(AutoBlock.class) && f.get(AdvAgriBlocks.getInstance()) == null) {
                    if (f.getAnnotation(AutoBlock.class).Path().toString().toLowerCase().contains("weathered")) {
                        f.set(AdvAgriBlocks.getInstance(), new Block(DefaultBlock.cloneSettings(Blocks.GRAVEL)));
                    } else if (f.getAnnotation(AutoBlock.class).Path().toString().toLowerCase().contains("cable")) {
                        f.set(AdvAgriBlocks.getInstance(), new Machine(DefaultBlock.cloneSettings(Blocks.BAMBOO)));
                    }
                    new RegistrationUtil().reg((Block) f.get(AdvAgriBlocks.getInstance()), f.getAnnotation(AutoBlock.class).Path().toString().toLowerCase(), ModAta.ModID, WORLD_ITEM_GROUP);
                } else if (f.isAnnotationPresent(AutoBlock.class)) {
                    new RegistrationUtil().reg((Block) f.get(AdvAgriBlocks.getInstance()), f.getAnnotation(AutoBlock.class).Path().toString().toLowerCase(), ModAta.ModID, WORLD_ITEM_GROUP);
                }
                f.setAccessible(false);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public void RegisteredGenOres() {
        new RegistrationUtil()
                .reg(ORE_COPPER_OVERWORLD, "ore_copper_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_TIN_OVERWORLD, "ore_tin_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_ZINC_OVERWORLD, "ore_zinc_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_ALUMINUM_OVERWORLD, "ore_aluminum_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_SILVER_OVERWORLD, "ore_silver_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_LEAD_OVERWORLD, "ore_lead_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_HIGH_CARBON_IRON_OVERWORLD, "ore_high_carbon_iron_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_NICKEL_OVERWORLD, "ore_nickel_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_TITANIUM_OVERWORLD, "ore_titanium_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_TUNGSTEN_OVERWORLD, "ore_tungsten_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_PHOS_OVERWORLD, "ore_phos_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_SULPHUR_OVERWORLD, "ore_sulphur_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE)
                .reg(ORE_NETHER_SULPHUR_NETHER, "ore_nether_sulphur_nether", ModAta.ModID, RegistrationType.NETHER_ORE)
                .reg(ORE_QUARRY_OVERWORLD, "ore_quarry_overworld", ModAta.ModID, RegistrationType.OVERWORLD_ORE);
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
