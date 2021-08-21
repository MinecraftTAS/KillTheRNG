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
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_2006_1(Random rand, long seed) {
		KillTheRNG.randomness.random_2006.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_2007_2(Random rand) {
		return KillTheRNG.randomness.random_2007.nextLong();
//		KillTheRNG.randomness.random_2007.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_2008_3(Random rand) {
		return KillTheRNG.randomness.random_2008.nextLong();
//		KillTheRNG.randomness.random_2008.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 1))
	public void redirect_random_2009_4(Random rand, long seed) {
		KillTheRNG.randomness.random_2009.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_2010_5(Random rand, int i) {
		return KillTheRNG.randomness.random_2010.nextInt(i);
//		KillTheRNG.randomness.random_2010.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_2011_6(Random rand, int i) {
		return KillTheRNG.randomness.random_2011.nextInt(i);
//		KillTheRNG.randomness.random_2011.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_2012_7(Random rand, int i) {
		return KillTheRNG.randomness.random_2012.nextInt(i);
//		KillTheRNG.randomness.random_2012.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_2013_8(Random rand, int i) {
		return KillTheRNG.randomness.random_2013.nextInt(i);
//		KillTheRNG.randomness.random_2013.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_2014_9(Random rand, int i) {
		return KillTheRNG.randomness.random_2014.nextInt(i);
//		KillTheRNG.randomness.random_2014.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_2015_10(Random rand, int i) {
		return KillTheRNG.randomness.random_2015.nextInt(i);
//		KillTheRNG.randomness.random_2015.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_2016_11(Random rand, int i) {
		return KillTheRNG.randomness.random_2016.nextInt(i);
//		KillTheRNG.randomness.random_2016.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_2017_12(Random rand, int i) {
		return KillTheRNG.randomness.random_2017.nextInt(i);
//		KillTheRNG.randomness.random_2017.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_2018_13(Random rand, int i) {
		return KillTheRNG.randomness.random_2018.nextInt(i);
//		KillTheRNG.randomness.random_2018.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_2019_14(Random rand, int i) {
		return KillTheRNG.randomness.random_2019.nextInt(i);
//		KillTheRNG.randomness.random_2019.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_2020_15(Random rand, int i) {
		return KillTheRNG.randomness.random_2020.nextInt(i);
//		KillTheRNG.randomness.random_2020.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_2021_16(Random rand, int i) {
		return KillTheRNG.randomness.random_2021.nextInt(i);
//		KillTheRNG.randomness.random_2021.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_2022_17(Random rand, int i) {
		return KillTheRNG.randomness.random_2022.nextInt(i);
//		KillTheRNG.randomness.random_2022.nextInt(i);
//		return rand.nextInt(i);
	}

}
