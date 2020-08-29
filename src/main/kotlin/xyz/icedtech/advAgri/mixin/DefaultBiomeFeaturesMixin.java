package xyz.icedtech.advAgri.mixin;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.icedtech.advAgri.register.AgriOreRegistry;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getALUMINIUM_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getCOPPER_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getLEAD_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getPHOS_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getSILVER_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getTIN_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getTUNGSTEN_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getSULPHUR_ORE());
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, new AgriOreRegistry().getZINC_ORE());
    }
}