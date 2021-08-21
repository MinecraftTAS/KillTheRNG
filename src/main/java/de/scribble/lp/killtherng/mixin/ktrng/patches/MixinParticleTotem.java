package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleTotem;

@Mixin(ParticleTotem.class)
public class MixinParticleTotem {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1458_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1458.nextInt(i);
//		KillTheRNG.randomness.random_1458.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1459_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1459.nextInt(i);
//		KillTheRNG.randomness.random_1459.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1460_3(Random rand) {
		return KillTheRNG.randomness.random_1460.nextFloat();
//		KillTheRNG.randomness.random_1460.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1461_4(Random rand) {
		return KillTheRNG.randomness.random_1461.nextFloat();
//		KillTheRNG.randomness.random_1461.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1462_5(Random rand) {
		return KillTheRNG.randomness.random_1462.nextFloat();
//		KillTheRNG.randomness.random_1462.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1463_6(Random rand) {
		return KillTheRNG.randomness.random_1463.nextFloat();
//		KillTheRNG.randomness.random_1463.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1464_7(Random rand) {
		return KillTheRNG.randomness.random_1464.nextFloat();
//		KillTheRNG.randomness.random_1464.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1465_8(Random rand) {
		return KillTheRNG.randomness.random_1465.nextFloat();
//		KillTheRNG.randomness.random_1465.nextFloat();
//		return rand.nextFloat();
	}

}
