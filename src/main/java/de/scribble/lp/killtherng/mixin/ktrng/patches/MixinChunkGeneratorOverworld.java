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
	* null
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1515_1(Random rand, long seed) {
		KillTheRNG.randomness.random_1515.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1516_2(Random rand, long seed) {
		KillTheRNG.randomness.random_1516.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1517_3(Random rand) {
		return KillTheRNG.randomness.random_1517.nextLong();
//		KillTheRNG.randomness.random_1517.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1518_4(Random rand) {
		return KillTheRNG.randomness.random_1518.nextLong();
//		KillTheRNG.randomness.random_1518.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_random_1519_5(Random rand, long seed) {
		KillTheRNG.randomness.random_1519.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1520_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1520.nextInt(i);
//		KillTheRNG.randomness.random_1520.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1521_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1521.nextInt(i);
//		KillTheRNG.randomness.random_1521.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1522_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1522.nextInt(i);
//		KillTheRNG.randomness.random_1522.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1523_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1523.nextInt(i);
//		KillTheRNG.randomness.random_1523.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1524_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1524.nextInt(i);
//		KillTheRNG.randomness.random_1524.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1525_11(Random rand, int i) {
		return KillTheRNG.randomness.random_1525.nextInt(i);
//		KillTheRNG.randomness.random_1525.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1526_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1526.nextInt(i);
//		KillTheRNG.randomness.random_1526.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1527_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1527.nextInt(i);
//		KillTheRNG.randomness.random_1527.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1528_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1528.nextInt(i);
//		KillTheRNG.randomness.random_1528.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1529_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1529.nextInt(i);
//		KillTheRNG.randomness.random_1529.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1530_16(Random rand, int i) {
		return KillTheRNG.randomness.random_1530.nextInt(i);
//		KillTheRNG.randomness.random_1530.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1531_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1531.nextInt(i);
//		KillTheRNG.randomness.random_1531.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1532_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1532.nextInt(i);
//		KillTheRNG.randomness.random_1532.nextInt(i);
//		return rand.nextInt(i);
	}

}
