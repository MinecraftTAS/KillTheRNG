package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenCavesHell;

@Mixin(MapGenCavesHell.class)
public class MixinMapGenCavesHell {

	/**
	* null
	*/
	@Redirect(method = "addRoom(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1800_0(Random rand) {
		return KillTheRNG.randomness.random_1800.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1801_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1801.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1802_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1802.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1803_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1803.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1804_3(Random rand) {
		return KillTheRNG.randomness.random_1804.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1805_4(Random rand) {
		return KillTheRNG.randomness.random_1805.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1806_5(Random rand) {
		return KillTheRNG.randomness.random_1806.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1807_6(Random rand) {
		return KillTheRNG.randomness.random_1807.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1808_7(Random rand) {
		return KillTheRNG.randomness.random_1808.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1809_8(Random rand) {
		return KillTheRNG.randomness.random_1809.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1810_9(Random rand) {
		return KillTheRNG.randomness.random_1810.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1811_10(Random rand) {
		return KillTheRNG.randomness.random_1811.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 11))
	public long redirect_random_1812_11(Random rand) {
		return KillTheRNG.randomness.random_1812.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1813_12(Random rand) {
		return KillTheRNG.randomness.random_1813.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1814_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1814.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1815_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1815.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1816_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1816.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1817_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1817.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1818_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1818.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1819_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1819.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1820_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1820.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1821_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1821.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1822_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1822.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 8))
	public long redirect_random_1823_8(Random rand) {
		return KillTheRNG.randomness.random_1823.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1824_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1824.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1825_10(Random rand) {
		return KillTheRNG.randomness.random_1825.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1826_11(Random rand) {
		return KillTheRNG.randomness.random_1826.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1827_12(Random rand) {
		return KillTheRNG.randomness.random_1827.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1828_13(Random rand) {
		return KillTheRNG.randomness.random_1828.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 14))
	public long redirect_random_1829_14(Random rand) {
		return KillTheRNG.randomness.random_1829.nextLong();
	}

}
