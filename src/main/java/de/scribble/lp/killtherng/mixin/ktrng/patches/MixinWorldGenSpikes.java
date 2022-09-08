package de.scribble.lp.killtherng.mixin.ktrng.patches;
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
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spikeGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spikeGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spikeGeneration.nextFloat();
			return rand.nextFloat();
		}
	}


}