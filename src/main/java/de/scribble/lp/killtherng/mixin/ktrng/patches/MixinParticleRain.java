package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleRain.class)
public class MixinParticleRain{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1426_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1426.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1426.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_46_2() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_46.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_46.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_47_3() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_47.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_47.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_48_4() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_48.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_48.nextDouble();
//		return Math.random();
	}


}