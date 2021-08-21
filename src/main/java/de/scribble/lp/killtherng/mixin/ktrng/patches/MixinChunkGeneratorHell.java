package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public double redirect_random_1761_1(Random rand) {
		return KillTheRNG.randomness.random_1761.nextDouble();
//		KillTheRNG.randomness.random_1761.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1762_2(Random rand) {
		return KillTheRNG.randomness.random_1762.nextDouble();
//		KillTheRNG.randomness.random_1762.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1763_3(Random rand) {
		return KillTheRNG.randomness.random_1763.nextDouble();
//		KillTheRNG.randomness.random_1763.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1764_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1764.nextInt(i);
//		KillTheRNG.randomness.random_1764.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1765_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1765.nextInt(i);
//		KillTheRNG.randomness.random_1765.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1766_6(Random rand, long seed) {
		KillTheRNG.randomness.random_1766.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1767_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1767.nextInt(i);
//		KillTheRNG.randomness.random_1767.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1768_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1768.nextInt(i);
//		KillTheRNG.randomness.random_1768.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1769_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1769.nextInt(i);
//		KillTheRNG.randomness.random_1769.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1770_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1770.nextInt(i);
//		KillTheRNG.randomness.random_1770.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1771_11(Random rand, int i) {
		return KillTheRNG.randomness.random_1771.nextInt(i);
//		KillTheRNG.randomness.random_1771.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1772_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1772.nextInt(i);
//		KillTheRNG.randomness.random_1772.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1773_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1773.nextInt(i);
//		KillTheRNG.randomness.random_1773.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1774_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1774.nextInt(i);
//		KillTheRNG.randomness.random_1774.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1775_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1775.nextInt(i);
//		KillTheRNG.randomness.random_1775.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1776_16(Random rand, int i) {
		return KillTheRNG.randomness.random_1776.nextInt(i);
//		KillTheRNG.randomness.random_1776.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1777_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1777.nextInt(i);
//		KillTheRNG.randomness.random_1777.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1778_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1778.nextInt(i);
//		KillTheRNG.randomness.random_1778.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1779_19(Random rand, int i) {
		return KillTheRNG.randomness.random_1779.nextInt(i);
//		KillTheRNG.randomness.random_1779.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1780_20(Random rand, int i) {
		return KillTheRNG.randomness.random_1780.nextInt(i);
//		KillTheRNG.randomness.random_1780.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1781_21(Random rand, int i) {
		return KillTheRNG.randomness.random_1781.nextInt(i);
//		KillTheRNG.randomness.random_1781.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1782_22(Random rand, int i) {
		return KillTheRNG.randomness.random_1782.nextInt(i);
//		KillTheRNG.randomness.random_1782.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1783_23(Random rand) {
		return KillTheRNG.randomness.random_1783.nextBoolean();
//		KillTheRNG.randomness.random_1783.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_1784_24(Random rand, int i) {
		return KillTheRNG.randomness.random_1784.nextInt(i);
//		KillTheRNG.randomness.random_1784.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_random_1785_25(Random rand, int i) {
		return KillTheRNG.randomness.random_1785.nextInt(i);
//		KillTheRNG.randomness.random_1785.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_random_1786_26(Random rand, int i) {
		return KillTheRNG.randomness.random_1786.nextInt(i);
//		KillTheRNG.randomness.random_1786.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1787_27(Random rand) {
		return KillTheRNG.randomness.random_1787.nextBoolean();
//		KillTheRNG.randomness.random_1787.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_random_1788_28(Random rand, int i) {
		return KillTheRNG.randomness.random_1788.nextInt(i);
//		KillTheRNG.randomness.random_1788.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
	public int redirect_random_1789_29(Random rand, int i) {
		return KillTheRNG.randomness.random_1789.nextInt(i);
//		KillTheRNG.randomness.random_1789.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_random_1790_30(Random rand, int i) {
		return KillTheRNG.randomness.random_1790.nextInt(i);
//		KillTheRNG.randomness.random_1790.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_random_1791_31(Random rand, int i) {
		return KillTheRNG.randomness.random_1791.nextInt(i);
//		KillTheRNG.randomness.random_1791.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_random_1792_32(Random rand, int i) {
		return KillTheRNG.randomness.random_1792.nextInt(i);
//		KillTheRNG.randomness.random_1792.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_random_1793_33(Random rand, int i) {
		return KillTheRNG.randomness.random_1793.nextInt(i);
//		KillTheRNG.randomness.random_1793.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_random_1794_34(Random rand, int i) {
		return KillTheRNG.randomness.random_1794.nextInt(i);
//		KillTheRNG.randomness.random_1794.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_random_1795_35(Random rand, int i) {
		return KillTheRNG.randomness.random_1795.nextInt(i);
//		KillTheRNG.randomness.random_1795.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_random_1796_36(Random rand, int i) {
		return KillTheRNG.randomness.random_1796.nextInt(i);
//		KillTheRNG.randomness.random_1796.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_random_1797_37(Random rand, int i) {
		return KillTheRNG.randomness.random_1797.nextInt(i);
//		KillTheRNG.randomness.random_1797.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_random_1798_38(Random rand, int i) {
		return KillTheRNG.randomness.random_1798.nextInt(i);
//		KillTheRNG.randomness.random_1798.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_random_1799_39(Random rand, int i) {
		return KillTheRNG.randomness.random_1799.nextInt(i);
//		KillTheRNG.randomness.random_1799.nextInt(i);
//		return rand.nextInt(i);
	}

}
