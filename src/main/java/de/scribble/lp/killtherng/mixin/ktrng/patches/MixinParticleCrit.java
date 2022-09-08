package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleCrit.class)
public class MixinParticleCrit{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_63_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_63.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_63.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_63.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_64_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_64.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_64.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_64.nextDouble();
			return Math.random();
		}
	}


}