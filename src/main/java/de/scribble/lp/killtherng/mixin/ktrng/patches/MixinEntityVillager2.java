package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityVillager;

@Mixin(EntityVillager.class)
public class MixinEntityVillager2 {

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_villagerParticle_1(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextGaussian();
//		KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_villagerParticle_2(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextGaussian();
//		KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_villagerParticle_3(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextGaussian();
//		KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_villagerParticle_4(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextFloat();
//		KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_villagerParticle_5(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextFloat();
//		KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_villagerParticle_6(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextFloat();
//		KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

}
