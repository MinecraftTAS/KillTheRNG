package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorEnd;

@Mixin(ChunkGeneratorEnd.class)
public class MixinChunkGeneratorEnd {
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1852(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1853(Random rand, int i) {
		return KillTheRNG.randomness.random_1853.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1854(Random rand, int i) {
		return KillTheRNG.randomness.random_1854.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1855(Random rand, int i) {
		return KillTheRNG.randomness.random_1855.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1856(Random rand, int i) {
		return KillTheRNG.randomness.random_1856.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1857(Random rand, int i) {
		return KillTheRNG.randomness.random_1857.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1858(Random rand, int i) {
		return KillTheRNG.randomness.random_1858.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1859(Random rand, int i) {
		return KillTheRNG.randomness.random_1859.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1860(Random rand, int i) {
		return KillTheRNG.randomness.random_1860.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1861(Random rand, int i) {
		return KillTheRNG.randomness.random_1861.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1862(Random rand, int i) {
		return KillTheRNG.randomness.random_1862.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1863(Random rand, int i) {
		return KillTheRNG.randomness.random_1863.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1864(Random rand, int i) {
		return KillTheRNG.randomness.random_1864.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1865(Random rand, int i) {
		return KillTheRNG.randomness.random_1865.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1866(Random rand, int i) {
		return KillTheRNG.randomness.random_1866.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1867(Random rand, int i) {
		return KillTheRNG.randomness.random_1867.nextInt(i);
	}

}
