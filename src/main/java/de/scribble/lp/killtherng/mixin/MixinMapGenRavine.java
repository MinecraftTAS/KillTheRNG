package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.MapGenRavine;

@Mixin(MapGenRavine.class)
public class MixinMapGenRavine {
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1575(Random rand, int i) {
		return KillTheRNG.randomness.random_1575.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1576(Random rand, int i) {
		return KillTheRNG.randomness.random_1576.nextInt(i);
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1577(Random rand) {
		return KillTheRNG.randomness.random_1577.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1578(Random rand) {
		return KillTheRNG.randomness.random_1578.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1579(Random rand) {
		return KillTheRNG.randomness.random_1579.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1580(Random rand) {
		return KillTheRNG.randomness.random_1580.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1581(Random rand) {
		return KillTheRNG.randomness.random_1581.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1582(Random rand) {
		return KillTheRNG.randomness.random_1582.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1583(Random rand) {
		return KillTheRNG.randomness.random_1583.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_1584(Random rand) {
		return KillTheRNG.randomness.random_1584.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1585(Random rand) {
		return KillTheRNG.randomness.random_1585.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1586(Random rand) {
		return KillTheRNG.randomness.random_1586.nextFloat();
	}

	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1587(Random rand, int i) {
		return KillTheRNG.randomness.random_1587.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1588(Random rand, int i) {
		return KillTheRNG.randomness.random_1588.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1589(Random rand, int i) {
		return KillTheRNG.randomness.random_1589.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1590(Random rand, int i) {
		return KillTheRNG.randomness.random_1590.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1591(Random rand, int i) {
		return KillTheRNG.randomness.random_1591.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1592(Random rand, int i) {
		return KillTheRNG.randomness.random_1592.nextInt(i);
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1593(Random rand) {
		return KillTheRNG.randomness.random_1593.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1594(Random rand) {
		return KillTheRNG.randomness.random_1594.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1595(Random rand) {
		return KillTheRNG.randomness.random_1595.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1596(Random rand) {
		return KillTheRNG.randomness.random_1596.nextFloat();
	}

	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 9))
	public long redirect_random_1597(Random rand) {
		return KillTheRNG.randomness.random_1597.nextLong();
	}

}
