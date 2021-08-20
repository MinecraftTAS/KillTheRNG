package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeTaiga;

@Mixin(BiomeTaiga.class)
public class MixinBiomeTaiga {

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1062_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1062.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1063_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1063.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1064_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1064.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomWorldGenForGrass(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1065_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1065.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1066_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1066.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1067_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1067.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1068_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1068.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1069_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1069.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1070_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1070.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1071_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1071.nextInt(i);
	}

}
