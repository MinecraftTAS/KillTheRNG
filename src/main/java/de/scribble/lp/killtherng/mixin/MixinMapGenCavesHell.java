package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenCavesHell;

@Mixin(MapGenCavesHell.class)
public class MixinMapGenCavesHell {
	@Redirect(method = "addRoom(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1800(Random rand) {
		return KillTheRNG.randomness.random_1800.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1801(Random rand, int i) {
		return KillTheRNG.randomness.random_1801.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1802(Random rand, int i) {
		return KillTheRNG.randomness.random_1802.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1803(Random rand, int i) {
		return KillTheRNG.randomness.random_1803.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1804(Random rand) {
		return KillTheRNG.randomness.random_1804.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1805(Random rand) {
		return KillTheRNG.randomness.random_1805.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1806(Random rand) {
		return KillTheRNG.randomness.random_1806.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1807(Random rand) {
		return KillTheRNG.randomness.random_1807.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1808(Random rand) {
		return KillTheRNG.randomness.random_1808.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1809(Random rand) {
		return KillTheRNG.randomness.random_1809.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1810(Random rand) {
		return KillTheRNG.randomness.random_1810.nextLong();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1811(Random rand) {
		return KillTheRNG.randomness.random_1811.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 11))
	public long redirect_random_1812(Random rand) {
		return KillTheRNG.randomness.random_1812.nextLong();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1813(Random rand) {
		return KillTheRNG.randomness.random_1813.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1814(Random rand, int i) {
		return KillTheRNG.randomness.random_1814.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1815(Random rand, int i) {
		return KillTheRNG.randomness.random_1815.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1816(Random rand, int i) {
		return KillTheRNG.randomness.random_1816.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1817(Random rand, int i) {
		return KillTheRNG.randomness.random_1817.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1818(Random rand, int i) {
		return KillTheRNG.randomness.random_1818.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1819(Random rand, int i) {
		return KillTheRNG.randomness.random_1819.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1820(Random rand, int i) {
		return KillTheRNG.randomness.random_1820.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1821(Random rand, int i) {
		return KillTheRNG.randomness.random_1821.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1822(Random rand, int i) {
		return KillTheRNG.randomness.random_1822.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 8))
	public long redirect_random_1823(Random rand) {
		return KillTheRNG.randomness.random_1823.nextLong();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1824(Random rand, int i) {
		return KillTheRNG.randomness.random_1824.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1825(Random rand) {
		return KillTheRNG.randomness.random_1825.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1826(Random rand) {
		return KillTheRNG.randomness.random_1826.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1827(Random rand) {
		return KillTheRNG.randomness.random_1827.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1828(Random rand) {
		return KillTheRNG.randomness.random_1828.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 14))
	public long redirect_random_1829(Random rand) {
		return KillTheRNG.randomness.random_1829.nextLong();
	}

}
