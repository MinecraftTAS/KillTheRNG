package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityBat;

@Mixin(EntityBat.class)
public class MixinEntityBat {

	/**
	* null
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_913_0(Random rand, int i) {
		return KillTheRNG.randomness.random_913.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_914_0(Random rand, int i) {
		return KillTheRNG.randomness.random_914.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_915_1(Random rand, int i) {
		return KillTheRNG.randomness.random_915.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_916_2(Random rand, int i) {
		return KillTheRNG.randomness.random_916.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_917_3(Random rand, int i) {
		return KillTheRNG.randomness.random_917.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_918_4(Random rand, int i) {
		return KillTheRNG.randomness.random_918.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_919_5(Random rand, int i) {
		return KillTheRNG.randomness.random_919.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_920_6(Random rand, int i) {
		return KillTheRNG.randomness.random_920.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_921_7(Random rand, int i) {
		return KillTheRNG.randomness.random_921.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_922_8(Random rand, int i) {
		return KillTheRNG.randomness.random_922.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_923_0(Random rand) {
		return KillTheRNG.randomness.random_923.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_924_1(Random rand, int i) {
		return KillTheRNG.randomness.random_924.nextInt(i);
	}

}
