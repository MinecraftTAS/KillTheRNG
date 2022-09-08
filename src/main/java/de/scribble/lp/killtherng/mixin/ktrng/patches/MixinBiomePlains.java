package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomePlains.class)
public class MixinBiomePlains{

	/**
	* Grass generation in plains
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomePlainsGenGrass_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass generation in plains
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_biomePlainsGenGrass_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass generation in plains
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_biomePlainsGenGrass_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass generation in plains
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_biomePlainsGenGrass_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass generation in plains
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_biomePlainsGenGrass_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass generation in plains
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_biomePlainsGenGrass_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenGrass.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a big tree should generate in plains
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomePlainsGenBigtree_7(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenBigtree.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenBigtree.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* What flowers should generate
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomePlainsGenFlowers_8(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenFlowers.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenFlowers.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* What flowers should generate
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_biomePlainsGenFlowers_9(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenFlowers.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenFlowers.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* What flowers should generate
	*/
	@Redirect(method = "pickRandomFlower(Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockFlower$EnumFlowerType;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_biomePlainsGenFlowers_10(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenFlowers.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.biomePlainsGenFlowers.nextInt(i);
		return rand.nextInt(i);
	}


}