package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeTaiga;

@Mixin(BiomeTaiga.class)
public class MixinBiomeTaiga {

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigeGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_taigeGeneration_2(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_taigeGeneration_3(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_taigeGeneration_4(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_taigeGeneration_5(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_taigeGeneration_6(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigeGeneration_7(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_taigeGeneration_8(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_taigeGeneration_9(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "getRandomWorldGenForGrass(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenerator;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigeGeneration_10(Random rand, int i) {
//		return KillTheRNG.randomness.taigeGeneration.nextInt(i);
		KillTheRNG.randomness.taigeGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
