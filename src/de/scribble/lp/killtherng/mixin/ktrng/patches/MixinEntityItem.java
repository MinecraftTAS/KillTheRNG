package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityItem;

@Mixin(EntityItem.class)
public class MixinEntityItem {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_20_1() {
		return KillTheRNG.randomness.math_random_20.nextDouble();
//		KillTheRNG.randomness.math_random_20.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_16_2() {
		return KillTheRNG.randomness.math_random_16.nextDouble();
//		KillTheRNG.randomness.math_random_16.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_17_3() {
		return KillTheRNG.randomness.math_random_17.nextDouble();
//		KillTheRNG.randomness.math_random_17.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_18_4() {
		return KillTheRNG.randomness.math_random_18.nextDouble();
//		KillTheRNG.randomness.math_random_18.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_19_5() {
		return KillTheRNG.randomness.math_random_19.nextDouble();
//		KillTheRNG.randomness.math_random_19.nextDouble();
//		return Math.random();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_itemMotionInLava_6(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_itemMotionInLava_7(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_itemMotionInLava_8(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_itemMotionInLava_9(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_itemMotionInLava_10(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

}
