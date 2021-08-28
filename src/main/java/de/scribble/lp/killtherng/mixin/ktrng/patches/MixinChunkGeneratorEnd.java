package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorEnd;

@Mixin(ChunkGeneratorEnd.class)
public class MixinChunkGeneratorEnd {

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_chunkGenEnd_1(Random rand, long seed) {
		KillTheRNG.randomness.chunkGenEnd.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chunkGenEnd_2(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_chunkGenEnd_3(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_chunkGenEnd_4(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_chunkGenEnd_5(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_chunkGenEnd_6(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_chunkGenEnd_7(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_chunkGenEnd_8(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_chunkGenEnd_9(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_chunkGenEnd_10(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_chunkGenEnd_11(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_chunkGenEnd_12(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_chunkGenEnd_13(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_chunkGenEnd_14(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_chunkGenEnd_15(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Population for Chunk Generation in the end
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_chunkGenEnd_16(Random rand, int i) {
//		return KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		KillTheRNG.randomness.chunkGenEnd.nextInt(i);
		return rand.nextInt(i);
	}

}
