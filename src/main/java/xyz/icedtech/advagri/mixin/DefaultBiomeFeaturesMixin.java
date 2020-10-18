package xyz.icedtech.advagri.mixin;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.icedtech.advagri.block.Blocks;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci) {
        Blocks block = Blocks.getInstance();
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_COPPER_OVERWORLD);

        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_SILVER_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_NICKEL_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_TIN_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_TITANIUM_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_LEAD_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_ZINC_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_ALUMINIUM_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_TUNGSTEN_OVERWORLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_HIGH_CARBON_IRON_OVERWORLD);

        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_SULPHUR_OVERWORLD);

        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, block.ORE_QUARRY_OVERWORLD);
    }
}