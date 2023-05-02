package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenSpikes.class)
public class MixinWorldGenSpikes{

	/**
	* Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spikeGeneration_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.spikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.spikeGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.spikeGeneration.nextFloat();
			return rand.nextFloat();
		}
	}


}