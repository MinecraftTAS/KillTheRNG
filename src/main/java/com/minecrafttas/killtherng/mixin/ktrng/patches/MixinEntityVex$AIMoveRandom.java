package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityVex$AIMoveRandom")
public class MixinEntityVex$AIMoveRandom{

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_805_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_805.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_805.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_805.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_806_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_806.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_806.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_806.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_807_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_807.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_807.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_807.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_808_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_808.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_808.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_808.nextInt(i);
			return rand.nextInt(i);
		}
	}


}