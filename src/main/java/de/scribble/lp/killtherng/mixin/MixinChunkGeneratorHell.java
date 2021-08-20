package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.ChunkGeneratorHell;

@Mixin(ChunkGeneratorHell.class)
public class MixinChunkGeneratorHell {

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1761_0(Random rand) {
		return KillTheRNG.randomness.random_1761.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1762_1(Random rand) {
		return KillTheRNG.randomness.random_1762.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1763_2(Random rand) {
		return KillTheRNG.randomness.random_1763.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1764_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1764.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1765_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1765.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1766_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1767_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1767.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1768_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1768.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1769_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1769.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1770_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1770.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1771_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1771.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1772_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1772.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1773_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1773.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1774_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1774.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1775_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1775.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1776_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1776.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1777_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1777.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1778_11(Random rand, int i) {
		return KillTheRNG.randomness.random_1778.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1779_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1779.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1780_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1780.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1781_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1781.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1782_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1782.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 16))
	public boolean redirect_random_1783_16(Random rand) {
		return KillTheRNG.randomness.random_1783.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_random_1784_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1784.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_random_1785_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1785.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_random_1786_19(Random rand, int i) {
		return KillTheRNG.randomness.random_1786.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 20))
	public boolean redirect_random_1787_20(Random rand) {
		return KillTheRNG.randomness.random_1787.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_random_1788_21(Random rand, int i) {
		return KillTheRNG.randomness.random_1788.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_random_1789_22(Random rand, int i) {
		return KillTheRNG.randomness.random_1789.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_random_1790_23(Random rand, int i) {
		return KillTheRNG.randomness.random_1790.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_random_1791_24(Random rand, int i) {
		return KillTheRNG.randomness.random_1791.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_random_1792_25(Random rand, int i) {
		return KillTheRNG.randomness.random_1792.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_random_1793_26(Random rand, int i) {
		return KillTheRNG.randomness.random_1793.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_random_1794_27(Random rand, int i) {
		return KillTheRNG.randomness.random_1794.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_random_1795_28(Random rand, int i) {
		return KillTheRNG.randomness.random_1795.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_random_1796_29(Random rand, int i) {
		return KillTheRNG.randomness.random_1796.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_random_1797_30(Random rand, int i) {
		return KillTheRNG.randomness.random_1797.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 31))
	public int redirect_random_1798_31(Random rand, int i) {
		return KillTheRNG.randomness.random_1798.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 32))
	public int redirect_random_1799_32(Random rand, int i) {
		return KillTheRNG.randomness.random_1799.nextInt(i);
	}

}
