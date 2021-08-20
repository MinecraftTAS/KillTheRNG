package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeJungle;

@Mixin(BiomeJungle.class)
public class MixinBiomeJungle {

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1077_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1077.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1078_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1078.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1079_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1079.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1080_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1080.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomWorldGenForGrass(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1081_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1081.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1082_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1082.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1083_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1083.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1084_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1084.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1085_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1085.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1086_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1086.nextInt(i);
	}

}
