package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityAnimal;

@Mixin(EntityAnimal.class)
public class MixinEntityAnimal {

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_185_0(Random rand) {
		return KillTheRNG.randomness.random_185.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_186_1(Random rand) {
		return KillTheRNG.randomness.random_186.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_187_2(Random rand) {
		return KillTheRNG.randomness.random_187.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_188_3(Random rand) {
		return KillTheRNG.randomness.random_188.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_189_4(Random rand) {
		return KillTheRNG.randomness.random_189.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_190_5(Random rand) {
		return KillTheRNG.randomness.random_190.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_191_0(Random rand, int i) {
		return KillTheRNG.randomness.random_191.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_192_0(Random rand) {
		return KillTheRNG.randomness.random_192.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_193_1(Random rand) {
		return KillTheRNG.randomness.random_193.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_194_2(Random rand) {
		return KillTheRNG.randomness.random_194.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_195_3(Random rand) {
		return KillTheRNG.randomness.random_195.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_196_4(Random rand) {
		return KillTheRNG.randomness.random_196.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_197_5(Random rand) {
		return KillTheRNG.randomness.random_197.nextFloat();
	}

}
