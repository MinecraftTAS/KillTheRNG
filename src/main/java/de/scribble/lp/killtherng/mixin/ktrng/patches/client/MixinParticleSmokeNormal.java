package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSmokeNormal.class)
public class MixinParticleSmokeNormal{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_65_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_65.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_65.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_65.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_66_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_66.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_66.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_66.nextDouble();
			return Math.random();
		}
	}


}