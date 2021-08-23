package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;

@Mixin(WorldGenCanopyTree.class)
public class MixinWorldGenCanopyTree {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_280_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_280.nextInt(i);
		KillTheRNG.randomness.random_280.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_281_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_281.nextInt(i);
		KillTheRNG.randomness.random_281.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_282_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_282.nextInt(i);
		KillTheRNG.randomness.random_282.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_283_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_283.nextInt(i);
		KillTheRNG.randomness.random_283.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_284_5(Random rand) {
//		return KillTheRNG.randomness.random_284.nextBoolean();
		KillTheRNG.randomness.random_284.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_285_6(Random rand, int i) {
//		return KillTheRNG.randomness.random_285.nextInt(i);
		KillTheRNG.randomness.random_285.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_286_7(Random rand, int i) {
//		return KillTheRNG.randomness.random_286.nextInt(i);
		KillTheRNG.randomness.random_286.nextInt(i);
		return rand.nextInt(i);
	}

}
