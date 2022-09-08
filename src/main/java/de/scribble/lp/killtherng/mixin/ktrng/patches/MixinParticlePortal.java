package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticlePortal.class)
public class MixinParticlePortal{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1433_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1433.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1433.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1434_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1434.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1434.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_52_3() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_52.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_52.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_53_4() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_53.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_53.nextDouble();
//		return Math.random();
	}


}