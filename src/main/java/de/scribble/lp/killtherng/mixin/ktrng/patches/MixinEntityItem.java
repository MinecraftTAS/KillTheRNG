package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityItem.class)
public class MixinEntityItem{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_16_1() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_16.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_16.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_17_2() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_17.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_17.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_18_3() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_18.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_18.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_19_4() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_19.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_19.nextDouble();
//		return Math.random();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_itemMotionInLava_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_itemMotionInLava_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_itemMotionInLava_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_itemMotionInLava_8(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_itemMotionInLava_9(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}


}