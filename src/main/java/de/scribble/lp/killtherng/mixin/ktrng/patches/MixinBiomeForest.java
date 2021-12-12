package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeForest;

@Mixin(BiomeForest.class)
public class MixinBiomeForest {

	/**
	* Forest Generation
	*/
	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_forestGenration_1(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_forestGenration_2(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_forestGenration_3(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "addDoublePlants(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_forestGenration_4(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "addMushrooms(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_forestGenration_5(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "addMushrooms(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_forestGenration_6(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "addMushrooms(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_forestGenration_7(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_forestGenration_8(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_forestGenration_9(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_forestGenration_10(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Forest Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_forestGenration_11(Random rand, int i) {
//		return KillTheRNG.randomness.forestGenration.nextInt(i);
		KillTheRNG.randomness.forestGenration.nextInt(i);
		return rand.nextInt(i);
	}

}
