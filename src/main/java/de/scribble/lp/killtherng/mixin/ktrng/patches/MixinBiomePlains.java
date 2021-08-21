package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomePlains;

@Mixin(BiomePlains.class)
public class MixinBiomePlains {

	/**
	* null
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1033_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1033.nextInt(i);
//		KillTheRNG.randomness.random_1033.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1034_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1034.nextInt(i);
//		KillTheRNG.randomness.random_1034.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1035_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1035.nextInt(i);
//		KillTheRNG.randomness.random_1035.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1036_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1036.nextInt(i);
//		KillTheRNG.randomness.random_1036.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1037_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1037.nextInt(i);
//		KillTheRNG.randomness.random_1037.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1038_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1038.nextInt(i);
//		KillTheRNG.randomness.random_1038.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1039_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1039.nextInt(i);
//		KillTheRNG.randomness.random_1039.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1040_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1040.nextInt(i);
//		KillTheRNG.randomness.random_1040.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1041_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1041.nextInt(i);
//		KillTheRNG.randomness.random_1041.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1042_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1042.nextInt(i);
//		KillTheRNG.randomness.random_1042.nextInt(i);
//		return rand.nextInt(i);
	}

}
