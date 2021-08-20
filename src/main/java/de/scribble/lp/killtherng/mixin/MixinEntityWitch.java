package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityWitch;

@Mixin(EntityWitch.class)
public class MixinEntityWitch {

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_925_0(Random rand) {
		return KillTheRNG.randomness.random_925.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_926_1(Random rand) {
		return KillTheRNG.randomness.random_926.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_927_2(Random rand) {
		return KillTheRNG.randomness.random_927.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_928_3(Random rand) {
		return KillTheRNG.randomness.random_928.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_929_4(Random rand) {
		return KillTheRNG.randomness.random_929.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_930_5(Random rand) {
		return KillTheRNG.randomness.random_930.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_931_0(Random rand, int i) {
		return KillTheRNG.randomness.random_931.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_932_1(Random rand) {
		return KillTheRNG.randomness.random_932.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_933_2(Random rand) {
		return KillTheRNG.randomness.random_933.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_934_3(Random rand) {
		return KillTheRNG.randomness.random_934.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_935_0(Random rand) {
		return KillTheRNG.randomness.random_935.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_936_1(Random rand) {
		return KillTheRNG.randomness.random_936.nextFloat();
	}

}
