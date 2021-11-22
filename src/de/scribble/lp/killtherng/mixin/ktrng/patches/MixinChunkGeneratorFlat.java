package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorFlat;

@Mixin(ChunkGeneratorFlat.class)
public class MixinChunkGeneratorFlat {

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_initialStructureRandomSuperflat_1(Random rand, long seed) {
		KillTheRNG.randomness.initialStructureRandomSuperflat.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_initialStructureRandomSuperflat_2(Random rand) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextLong();
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextLong();
		return rand.nextLong();
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_initialStructureRandomSuperflat_3(Random rand) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextLong();
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextLong();
		return rand.nextLong();
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_initialStructureRandomSuperflat_4(Random rand, long seed) {
		KillTheRNG.randomness.initialStructureRandomSuperflat.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_initialStructureRandomSuperflat_5(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_initialStructureRandomSuperflat_6(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_initialStructureRandomSuperflat_7(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_initialStructureRandomSuperflat_8(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_initialStructureRandomSuperflat_9(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_initialStructureRandomSuperflat_10(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_initialStructureRandomSuperflat_11(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_initialStructureRandomSuperflat_12(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_initialStructureRandomSuperflat_13(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_initialStructureRandomSuperflat_14(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_initialStructureRandomSuperflat_15(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_initialStructureRandomSuperflat_16(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Calculates the Position of structures in a new chunk, on a superflat world
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_initialStructureRandomSuperflat_17(Random rand, int i) {
//		return KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		KillTheRNG.randomness.initialStructureRandomSuperflat.nextInt(i);
		return rand.nextInt(i);
	}

}
