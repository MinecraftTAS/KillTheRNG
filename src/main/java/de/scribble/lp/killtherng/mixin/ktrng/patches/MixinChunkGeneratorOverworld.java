package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorOverworld;

@Mixin(ChunkGeneratorOverworld.class)
public class MixinChunkGeneratorOverworld {

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_populationGeneration_1(Random rand, long seed) {
		KillTheRNG.randomness.populationGeneration.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_populationGeneration_2(Random rand, long seed) {
		KillTheRNG.randomness.populationGeneration.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_populationGeneration_3(Random rand) {
//		return KillTheRNG.randomness.populationGeneration.nextLong();
		KillTheRNG.randomness.populationGeneration.nextLong();
		return rand.nextLong();
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_populationGeneration_4(Random rand) {
//		return KillTheRNG.randomness.populationGeneration.nextLong();
		KillTheRNG.randomness.populationGeneration.nextLong();
		return rand.nextLong();
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_populationGeneration_5(Random rand, long seed) {
		KillTheRNG.randomness.populationGeneration.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_populationGeneration_6(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_populationGeneration_7(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_populationGeneration_8(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_populationGeneration_9(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_populationGeneration_10(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_populationGeneration_11(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_populationGeneration_12(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_populationGeneration_13(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_populationGeneration_14(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_populationGeneration_15(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_populationGeneration_16(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_populationGeneration_17(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Grass, Flowers population generation
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_populationGeneration_18(Random rand, int i) {
//		return KillTheRNG.randomness.populationGeneration.nextInt(i);
		KillTheRNG.randomness.populationGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
