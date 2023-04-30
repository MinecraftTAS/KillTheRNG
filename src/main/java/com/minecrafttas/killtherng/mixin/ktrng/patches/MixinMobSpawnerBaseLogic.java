package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.tileentity.MobSpawnerBaseLogic.class)
public class MixinMobSpawnerBaseLogic{

	/**
	* null
	*/
	@Redirect(method = "resetTimer()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_829_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_829.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_829.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_829.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_820_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_820.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_820.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_820.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_821_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_821.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_821.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_821.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_822_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_822.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_822.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_822.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_823_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_823.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_823.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_823.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_824_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_824.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_824.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_824.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_825_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_825.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_825.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_825.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_826_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_826.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_826.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_826.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_827_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_827.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_827.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_827.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_828_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_828.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_828.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_828.nextFloat();
			return rand.nextFloat();
		}
	}


}