package de.scribble.lp.killtherng.mixin;

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
	public int redirect_random_1913_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1913.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1914_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1914.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1915_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1915.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1916_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1916.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "removeDeadAndOutOfRangeDoors()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1917_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1917.nextInt(i);
	}

}
