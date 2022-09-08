package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleEnchantmentTable.class)
public class MixinParticleEnchantmentTable{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1435_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1435.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1435.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1436_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1436.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1436.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_54_3() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_54.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_54.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_55_4() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_55.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_55.nextDouble();
//		return Math.random();
	}


}