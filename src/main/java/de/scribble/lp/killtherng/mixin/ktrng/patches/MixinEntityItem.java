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
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_itemMotionInLava_1(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_itemMotionInLava_2(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_itemMotionInLava_3(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_itemMotionInLava_4(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* X and y motion when dropping an item in lava
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_itemMotionInLava_5(Random rand) {
		return KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		KillTheRNG.randomness.itemMotionInLava.nextFloat();
//		return rand.nextFloat();
	}

}
