package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.village.Village;

@Mixin(Village.class)
public class MixinVillage {

	/**
	* null
	*/
	@Redirect(method = "tick(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1913_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1913.nextInt(i);
//		KillTheRNG.randomness.random_1913.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1914_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1914.nextInt(i);
//		KillTheRNG.randomness.random_1914.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1915_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1915.nextInt(i);
//		KillTheRNG.randomness.random_1915.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1916_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1916.nextInt(i);
//		KillTheRNG.randomness.random_1916.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "removeDeadAndOutOfRangeDoors()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1917_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1917.nextInt(i);
//		KillTheRNG.randomness.random_1917.nextInt(i);
//		return rand.nextInt(i);
	}

}
