package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorHell;

@Mixin(ChunkGeneratorHell.class)
public class MixinChunkGeneratorHell {
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1761(Random rand) {
		return KillTheRNG.randomness.random_1761.nextDouble();
	}

	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1762(Random rand) {
		return KillTheRNG.randomness.random_1762.nextDouble();
	}

	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1763(Random rand) {
		return KillTheRNG.randomness.random_1763.nextDouble();
	}

	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1764(Random rand, int i) {
		return KillTheRNG.randomness.random_1764.nextInt(i);
	}

	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1765(Random rand, int i) {
		return KillTheRNG.randomness.random_1765.nextInt(i);
	}

	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1766(Random rand, long unused) {
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1767(Random rand, int i) {
		return KillTheRNG.randomness.random_1767.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1768(Random rand, int i) {
		return KillTheRNG.randomness.random_1768.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1769(Random rand, int i) {
		return KillTheRNG.randomness.random_1769.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1770(Random rand, int i) {
		return KillTheRNG.randomness.random_1770.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1771(Random rand, int i) {
		return KillTheRNG.randomness.random_1771.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1772(Random rand, int i) {
		return KillTheRNG.randomness.random_1772.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1773(Random rand, int i) {
		return KillTheRNG.randomness.random_1773.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1774(Random rand, int i) {
		return KillTheRNG.randomness.random_1774.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1775(Random rand, int i) {
		return KillTheRNG.randomness.random_1775.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1776(Random rand, int i) {
		return KillTheRNG.randomness.random_1776.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1777(Random rand, int i) {
		return KillTheRNG.randomness.random_1777.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1778(Random rand, int i) {
		return KillTheRNG.randomness.random_1778.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1779(Random rand, int i) {
		return KillTheRNG.randomness.random_1779.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1780(Random rand, int i) {
		return KillTheRNG.randomness.random_1780.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1781(Random rand, int i) {
		return KillTheRNG.randomness.random_1781.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1782(Random rand, int i) {
		return KillTheRNG.randomness.random_1782.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 16))
	public boolean redirect_random_1783(Random rand) {
		return KillTheRNG.randomness.random_1783.nextBoolean();
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_random_1784(Random rand, int i) {
		return KillTheRNG.randomness.random_1784.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_random_1785(Random rand, int i) {
		return KillTheRNG.randomness.random_1785.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_random_1786(Random rand, int i) {
		return KillTheRNG.randomness.random_1786.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 20))
	public boolean redirect_random_1787(Random rand) {
		return KillTheRNG.randomness.random_1787.nextBoolean();
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_random_1788(Random rand, int i) {
		return KillTheRNG.randomness.random_1788.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_random_1789(Random rand, int i) {
		return KillTheRNG.randomness.random_1789.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_random_1790(Random rand, int i) {
		return KillTheRNG.randomness.random_1790.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_random_1791(Random rand, int i) {
		return KillTheRNG.randomness.random_1791.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_random_1792(Random rand, int i) {
		return KillTheRNG.randomness.random_1792.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_random_1793(Random rand, int i) {
		return KillTheRNG.randomness.random_1793.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_random_1794(Random rand, int i) {
		return KillTheRNG.randomness.random_1794.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_random_1795(Random rand, int i) {
		return KillTheRNG.randomness.random_1795.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_random_1796(Random rand, int i) {
		return KillTheRNG.randomness.random_1796.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_random_1797(Random rand, int i) {
		return KillTheRNG.randomness.random_1797.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 31))
	public int redirect_random_1798(Random rand, int i) {
		return KillTheRNG.randomness.random_1798.nextInt(i);
	}

	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 32))
	public int redirect_random_1799(Random rand, int i) {
		return KillTheRNG.randomness.random_1799.nextInt(i);
	}

}
