package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleLava.class)
public class MixinParticleLava{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1443_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1443.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1443.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1444_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1444.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1444.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_57_3() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_57.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_57.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1445_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1445.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1445.nextFloat();
//		return rand.nextFloat();
	}


}