package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.EntityWither;

@Mixin(EntityWither.class)
public class MixinEntityWither {

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_515_0(Random rand) {
		return KillTheRNG.randomness.random_515.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_516_1(Random rand) {
		return KillTheRNG.randomness.random_516.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_517_2(Random rand) {
		return KillTheRNG.randomness.random_517.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_518_3(Random rand, int i) {
		return KillTheRNG.randomness.random_518.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_519_4(Random rand) {
		return KillTheRNG.randomness.random_519.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_520_5(Random rand) {
		return KillTheRNG.randomness.random_520.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_random_521_6(Random rand) {
		return KillTheRNG.randomness.random_521.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 7))
	public double redirect_random_522_7(Random rand) {
		return KillTheRNG.randomness.random_522.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_523_8(Random rand) {
		return KillTheRNG.randomness.random_523.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 9))
	public double redirect_random_524_9(Random rand) {
		return KillTheRNG.randomness.random_524.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_525_0(Random rand, int i) {
		return KillTheRNG.randomness.random_525.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_526_1(Random rand, int i) {
		return KillTheRNG.randomness.random_526.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_527_2(Random rand, int i) {
		return KillTheRNG.randomness.random_527.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "launchWitherSkullToEntity(ILnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_528_0(Random rand) {
		return KillTheRNG.randomness.random_528.nextFloat();
	}

}
