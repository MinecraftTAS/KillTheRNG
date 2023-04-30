package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityGuardian.class)
public class MixinEntityGuardian{

	/**
	* Offsets tail animation
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_guardianTailAnimation_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianTailAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianTailAnimation.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianTailAnimation.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether the guardian can spawn at this location
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_guardianSpawning_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianSpawning.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianSpawning.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianSpawning.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_guardianClientSpikesAnimation_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_guardianClientSpikesAnimation_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_guardianClientSpikesAnimation_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_guardianClientSpikesAnimation_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_guardianClientSpikesAnimation_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_guardianClientSpikesAnimation_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_guardianClientSpikesAnimation_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_guardianClientSpikesAnimation_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Random spike animation (?)
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_guardianClientSpikesAnimation_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.guardianClientSpikesAnimation.nextFloat();
			return rand.nextFloat();
		}
	}


}