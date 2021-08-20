package de.scribble.lp.killtherng.mixin;

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
	public void redirect_random_2006_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_2007_1(Random rand) {
		return KillTheRNG.randomness.random_2007.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 2))
	public long redirect_random_2008_2(Random rand) {
		return KillTheRNG.randomness.random_2008.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 3))
	public void redirect_random_2009_3(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_2010_4(Random rand, int i) {
		return KillTheRNG.randomness.random_2010.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_2011_5(Random rand, int i) {
		return KillTheRNG.randomness.random_2011.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_2012_6(Random rand, int i) {
		return KillTheRNG.randomness.random_2012.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_2013_7(Random rand, int i) {
		return KillTheRNG.randomness.random_2013.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_2014_8(Random rand, int i) {
		return KillTheRNG.randomness.random_2014.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_2015_9(Random rand, int i) {
		return KillTheRNG.randomness.random_2015.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_2016_10(Random rand, int i) {
		return KillTheRNG.randomness.random_2016.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_2017_11(Random rand, int i) {
		return KillTheRNG.randomness.random_2017.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_2018_12(Random rand, int i) {
		return KillTheRNG.randomness.random_2018.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_2019_13(Random rand, int i) {
		return KillTheRNG.randomness.random_2019.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_2020_14(Random rand, int i) {
		return KillTheRNG.randomness.random_2020.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_2021_15(Random rand, int i) {
		return KillTheRNG.randomness.random_2021.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_2022_16(Random rand, int i) {
		return KillTheRNG.randomness.random_2022.nextInt(i);
	}

}
