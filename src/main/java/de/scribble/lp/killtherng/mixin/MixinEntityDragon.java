package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.EntityDragon;

@Mixin(EntityDragon.class)
public class MixinEntityDragon {

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_900_0(Random rand) {
		return KillTheRNG.randomness.random_900.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_901_1(Random rand) {
		return KillTheRNG.randomness.random_901.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_902_2(Random rand, int i) {
		return KillTheRNG.randomness.random_902.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_903_3(Random rand) {
		return KillTheRNG.randomness.random_903.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_904_4(Random rand) {
		return KillTheRNG.randomness.random_904.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_905_5(Random rand) {
		return KillTheRNG.randomness.random_905.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateDragonEnderCrystal()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_906_0(Random rand, int i) {
		return KillTheRNG.randomness.random_906.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_907_0(Random rand) {
		return KillTheRNG.randomness.random_907.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_908_1(Random rand) {
		return KillTheRNG.randomness.random_908.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_909_2(Random rand) {
		return KillTheRNG.randomness.random_909.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_910_0(Random rand) {
		return KillTheRNG.randomness.random_910.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_911_1(Random rand) {
		return KillTheRNG.randomness.random_911.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_912_2(Random rand) {
		return KillTheRNG.randomness.random_912.nextFloat();
	}

}
