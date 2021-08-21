package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityVillager;

@Mixin(EntityVillager.class)
public class MixinEntityVillager {

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerLookingForVillage_1(Random rand, int i) {
		return KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerLookingForVillage_2(Random rand, int i) {
		return KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_villagerLookingForVillage_3(Random rand, int i) {
		return KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much xp will be spawned after trading
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerTradingXp_4(Random rand, int i) {
		return KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much xp will be spawned after trading
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerTradingXp_5(Random rand, int i) {
		return KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_villagerParticle_6(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextGaussian();
//		KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_villagerParticle_7(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextGaussian();
//		KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_villagerParticle_8(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextGaussian();
//		KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_villagerParticle_9(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextFloat();
//		KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_villagerParticle_10(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextFloat();
//		KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_villagerParticle_11(Random rand) {
		return KillTheRNG.randomness.villagerParticle.nextFloat();
//		KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

}
