package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorOverworld;

@Mixin(ChunkGeneratorOverworld.class)
public class MixinChunkGeneratorOverworld {
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1515(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1516(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1517(Random rand) {
		return KillTheRNG.randomness.random_1517.nextLong();
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 2))
	public long redirect_random_1518(Random rand) {
		return KillTheRNG.randomness.random_1518.nextLong();
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 3))
	public void redirect_random_1519(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1520(Random rand, int i) {
		return KillTheRNG.randomness.random_1520.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1521(Random rand, int i) {
		return KillTheRNG.randomness.random_1521.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1522(Random rand, int i) {
		return KillTheRNG.randomness.random_1522.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1523(Random rand, int i) {
		return KillTheRNG.randomness.random_1523.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1524(Random rand, int i) {
		return KillTheRNG.randomness.random_1524.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1525(Random rand, int i) {
		return KillTheRNG.randomness.random_1525.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1526(Random rand, int i) {
		return KillTheRNG.randomness.random_1526.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1527(Random rand, int i) {
		return KillTheRNG.randomness.random_1527.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1528(Random rand, int i) {
		return KillTheRNG.randomness.random_1528.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1529(Random rand, int i) {
		return KillTheRNG.randomness.random_1529.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1530(Random rand, int i) {
		return KillTheRNG.randomness.random_1530.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1531(Random rand, int i) {
		return KillTheRNG.randomness.random_1531.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_1532(Random rand, int i) {
		return KillTheRNG.randomness.random_1532.nextInt(i);
	}

}
