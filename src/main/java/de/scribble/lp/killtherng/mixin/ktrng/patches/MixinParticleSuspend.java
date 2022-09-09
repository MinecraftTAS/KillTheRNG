package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSuspend.class)
public class MixinParticleSuspend{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1427_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1427.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1427.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1427.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_49_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_49.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_49.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_49.nextDouble();
			return Math.random();
		}
	}


}