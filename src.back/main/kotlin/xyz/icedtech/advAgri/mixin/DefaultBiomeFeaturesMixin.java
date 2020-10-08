
package xyz.icedtech.advAgri.mixin;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.icedtech.advAgri.register.OreConfigure;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/Biome;)V", at = @At("TAIL"))
    private static void addDefaultOres(Biome biome, CallbackInfo ci) {
        biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, OreConfigure.ORE_ALUMINIUM);
    }
}
