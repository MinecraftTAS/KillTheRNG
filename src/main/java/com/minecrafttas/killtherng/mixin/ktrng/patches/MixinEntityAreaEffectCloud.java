package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.EntityAreaEffectCloud.class)
public class MixinEntityAreaEffectCloud{

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_areaEffectCloudStuff_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_areaEffectCloudStuff_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_areaEffectCloudStuff_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_areaEffectCloudStuff_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_areaEffectCloudStuff_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_areaEffectCloudStuff_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_areaEffectCloudStuff_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Area affect cloud particle stuff
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_areaEffectCloudStuff_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.areaEffectCloudStuff.nextDouble();
			return rand.nextDouble();
		}
	}


}