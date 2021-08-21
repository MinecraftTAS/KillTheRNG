package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleFlame;

@Mixin(ParticleFlame.class)
public class MixinParticleFlame {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1437_1(Random rand) {
		return KillTheRNG.randomness.random_1437.nextFloat();
//		KillTheRNG.randomness.random_1437.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1438_2(Random rand) {
		return KillTheRNG.randomness.random_1438.nextFloat();
//		KillTheRNG.randomness.random_1438.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1439_3(Random rand) {
		return KillTheRNG.randomness.random_1439.nextFloat();
//		KillTheRNG.randomness.random_1439.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1440_4(Random rand) {
		return KillTheRNG.randomness.random_1440.nextFloat();
//		KillTheRNG.randomness.random_1440.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1441_5(Random rand) {
		return KillTheRNG.randomness.random_1441.nextFloat();
//		KillTheRNG.randomness.random_1441.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1442_6(Random rand) {
		return KillTheRNG.randomness.random_1442.nextFloat();
//		KillTheRNG.randomness.random_1442.nextFloat();
//		return rand.nextFloat();
	}

}
