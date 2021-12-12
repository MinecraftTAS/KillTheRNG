package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenReed;

@Mixin(WorldGenReed.class)
public class MixinWorldGenReed {

	/**
	* reedGeneration
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_reedGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.reedGeneration.nextInt(i);
		KillTheRNG.randomness.reedGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* reedGeneration
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_reedGeneration_2(Random rand, int i) {
//		return KillTheRNG.randomness.reedGeneration.nextInt(i);
		KillTheRNG.randomness.reedGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* reedGeneration
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_reedGeneration_3(Random rand, int i) {
//		return KillTheRNG.randomness.reedGeneration.nextInt(i);
		KillTheRNG.randomness.reedGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* reedGeneration
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_reedGeneration_4(Random rand, int i) {
//		return KillTheRNG.randomness.reedGeneration.nextInt(i);
		KillTheRNG.randomness.reedGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* reedGeneration
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_reedGeneration_5(Random rand, int i) {
//		return KillTheRNG.randomness.reedGeneration.nextInt(i);
		KillTheRNG.randomness.reedGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* reedGeneration
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_reedGeneration_6(Random rand, int i) {
//		return KillTheRNG.randomness.reedGeneration.nextInt(i);
		KillTheRNG.randomness.reedGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
