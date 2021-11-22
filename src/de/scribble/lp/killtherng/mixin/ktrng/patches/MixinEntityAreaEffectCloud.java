package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityAreaEffectCloud;

@Mixin(EntityAreaEffectCloud.class)
public class MixinEntityAreaEffectCloud {

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_areaEffectCloudStuff_1(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextBoolean();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_areaEffectCloudStuff_2(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_areaEffectCloudStuff_3(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_areaEffectCloudStuff_4(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextBoolean();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_areaEffectCloudStuff_5(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_areaEffectCloudStuff_6(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_areaEffectCloudStuff_7(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextDouble();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_areaEffectCloudStuff_8(Random rand) {
		return KillTheRNG.randomness.areaEffectCloudStuff.nextDouble();
//		KillTheRNG.randomness.areaEffectCloudStuff.nextDouble();
//		return rand.nextDouble();
	}

}
