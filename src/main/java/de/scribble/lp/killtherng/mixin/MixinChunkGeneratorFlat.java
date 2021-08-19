package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorFlat;

@Mixin(ChunkGeneratorFlat.class)
public class MixinChunkGeneratorFlat {
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_2006(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_2007(Random rand) {
		return KillTheRNG.randomness.random_2007.nextLong();
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 2))
	public long redirect_random_2008(Random rand) {
		return KillTheRNG.randomness.random_2008.nextLong();
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 3))
	public void redirect_random_2009(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_2010(Random rand, int i) {
		return KillTheRNG.randomness.random_2010.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_2011(Random rand, int i) {
		return KillTheRNG.randomness.random_2011.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_2012(Random rand, int i) {
		return KillTheRNG.randomness.random_2012.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_2013(Random rand, int i) {
		return KillTheRNG.randomness.random_2013.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_2014(Random rand, int i) {
		return KillTheRNG.randomness.random_2014.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_2015(Random rand, int i) {
		return KillTheRNG.randomness.random_2015.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_2016(Random rand, int i) {
		return KillTheRNG.randomness.random_2016.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_2017(Random rand, int i) {
		return KillTheRNG.randomness.random_2017.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_2018(Random rand, int i) {
		return KillTheRNG.randomness.random_2018.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_2019(Random rand, int i) {
		return KillTheRNG.randomness.random_2019.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_2020(Random rand, int i) {
		return KillTheRNG.randomness.random_2020.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_2021(Random rand, int i) {
		return KillTheRNG.randomness.random_2021.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_2022(Random rand, int i) {
		return KillTheRNG.randomness.random_2022.nextInt(i);
	}

}
