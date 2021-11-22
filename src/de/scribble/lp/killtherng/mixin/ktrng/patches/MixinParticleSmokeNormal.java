package de.scribble.lp.killtherng.mixin.ktrng.patches;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleSmokeNormal;

@Mixin(ParticleSmokeNormal.class)
public class MixinParticleSmokeNormal {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_65_1() {
		return KillTheRNG.randomness.math_random_65.nextDouble();
//		KillTheRNG.randomness.math_random_65.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_66_2() {
		return KillTheRNG.randomness.math_random_66.nextDouble();
//		KillTheRNG.randomness.math_random_66.nextDouble();
//		return Math.random();
	}

}
