package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityEnderman;

@Mixin(EntityEnderman.class)
public class MixinEntityEnderman {

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_867_0(Random rand) {
		return KillTheRNG.randomness.random_867.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_868_1(Random rand) {
		return KillTheRNG.randomness.random_868.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_869_2(Random rand) {
		return KillTheRNG.randomness.random_869.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_870_3(Random rand) {
		return KillTheRNG.randomness.random_870.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_871_4(Random rand) {
		return KillTheRNG.randomness.random_871.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_872_5(Random rand) {
		return KillTheRNG.randomness.random_872.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_873_0(Random rand) {
		return KillTheRNG.randomness.random_873.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_874_0(Random rand) {
		return KillTheRNG.randomness.random_874.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_875_1(Random rand, int i) {
		return KillTheRNG.randomness.random_875.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_876_2(Random rand) {
		return KillTheRNG.randomness.random_876.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_877_0(Random rand) {
		return KillTheRNG.randomness.random_877.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_878_1(Random rand, int i) {
		return KillTheRNG.randomness.random_878.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_879_2(Random rand) {
		return KillTheRNG.randomness.random_879.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_880_0(Random rand, int i) {
		return KillTheRNG.randomness.random_880.nextInt(i);
	}

}
