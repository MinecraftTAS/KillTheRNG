package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityBat;

@Mixin(EntityBat.class)
public class MixinEntityBat {

	/**
	* Plays the ambient entity bat sound
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_batPlayAmbientSound_1(Random rand, int i) {
		return KillTheRNG.randomness.batPlayAmbientSound.nextInt(i);
//		KillTheRNG.randomness.batPlayAmbientSound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_batHangingRandomHeadRotation_2(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_batHangingRandomHeadRotation_3(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_batHangingRandomHeadRotation_4(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_batHangingRandomHeadRotation_5(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_batHangingRandomHeadRotation_6(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_batHangingRandomHeadRotation_7(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_batHangingRandomHeadRotation_8(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_batHangingRandomHeadRotation_9(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of rotating the bats head when it's hanging from a block
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_batHangingRandomHeadRotation_10(Random rand, int i) {
		return KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		KillTheRNG.randomness.batHangingRandomHeadRotation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_923_11(Random rand) {
		return KillTheRNG.randomness.random_923.nextBoolean();
//		KillTheRNG.randomness.random_923.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_924_12(Random rand, int i) {
		return KillTheRNG.randomness.random_924.nextInt(i);
//		KillTheRNG.randomness.random_924.nextInt(i);
//		return rand.nextInt(i);
	}

}
