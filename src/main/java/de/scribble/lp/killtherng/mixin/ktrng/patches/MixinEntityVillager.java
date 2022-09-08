package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityVillager.class)
public class MixinEntityVillager{

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_villagerParticle_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_villagerParticle_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_villagerParticle_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_villagerParticle_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_villagerParticle_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of villager related particles
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_villagerParticle_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerLookingForVillage_7(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerLookingForVillage_8(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Time it takes until the villager checks if a village is nearby
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_villagerLookingForVillage_9(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerLookingForVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much xp will be spawned after trading
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerTradingXp_10(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much xp will be spawned after trading
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerTradingXp_11(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.villagerTradingXp.nextInt(i);
//		return rand.nextInt(i);
	}


}