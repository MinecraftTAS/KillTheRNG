package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldEntitySpawner;

@Mixin(WorldEntitySpawner.class)
public class MixinWorldEntitySpawner {
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1486(Random rand, int i) {
		return KillTheRNG.randomness.random_1486.nextInt(i);
	}

	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1487(Random rand, int i) {
		return KillTheRNG.randomness.random_1487.nextInt(i);
	}

	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1488(Random rand, int i) {
		return KillTheRNG.randomness.random_1488.nextInt(i);
	}

	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1489(Random rand, int i) {
		return KillTheRNG.randomness.random_1489.nextInt(i);
	}

	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1490(Random rand, int i) {
		return KillTheRNG.randomness.random_1490.nextInt(i);
	}

	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1491(Random rand, int i) {
		return KillTheRNG.randomness.random_1491.nextInt(i);
	}

	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1492(Random rand) {
		return KillTheRNG.randomness.random_1492.nextFloat();
	}

	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1493(Random rand, int i) {
		return KillTheRNG.randomness.random_1493.nextInt(i);
	}

	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1494(Random rand, int i) {
		return KillTheRNG.randomness.random_1494.nextInt(i);
	}

	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1495(Random rand, int i) {
		return KillTheRNG.randomness.random_1495.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1496(Random rand) {
		return KillTheRNG.randomness.random_1496.nextFloat();
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1497(Random rand, int i) {
		return KillTheRNG.randomness.random_1497.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1498(Random rand, int i) {
		return KillTheRNG.randomness.random_1498.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_random_1499(Random rand, int i) {
		return KillTheRNG.randomness.random_1499.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	private static float redirect_random_1500(Random rand) {
		return KillTheRNG.randomness.random_1500.nextFloat();
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_random_1501(Random rand, int i) {
		return KillTheRNG.randomness.random_1501.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	private static int redirect_random_1502(Random rand, int i) {
		return KillTheRNG.randomness.random_1502.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	private static int redirect_random_1503(Random rand, int i) {
		return KillTheRNG.randomness.random_1503.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	private static int redirect_random_1504(Random rand, int i) {
		return KillTheRNG.randomness.random_1504.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	private static int redirect_random_1505(Random rand, int i) {
		return KillTheRNG.randomness.random_1505.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	private static int redirect_random_1506(Random rand, int i) {
		return KillTheRNG.randomness.random_1506.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	private static int redirect_random_1507(Random rand, int i) {
		return KillTheRNG.randomness.random_1507.nextInt(i);
	}

	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	private static int redirect_random_1508(Random rand, int i) {
		return KillTheRNG.randomness.random_1508.nextInt(i);
	}

}
