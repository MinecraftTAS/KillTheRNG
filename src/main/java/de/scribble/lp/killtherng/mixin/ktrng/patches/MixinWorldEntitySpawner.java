package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldEntitySpawner;

@Mixin(WorldEntitySpawner.class)
public class MixinWorldEntitySpawner {

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1486_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1486.nextInt(i);
//		KillTheRNG.randomness.random_1486.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1487_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1487.nextInt(i);
//		KillTheRNG.randomness.random_1487.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1488_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1488.nextInt(i);
//		KillTheRNG.randomness.random_1488.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1489_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1489.nextInt(i);
//		KillTheRNG.randomness.random_1489.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1490_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1490.nextInt(i);
//		KillTheRNG.randomness.random_1490.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1491_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1491.nextInt(i);
//		KillTheRNG.randomness.random_1491.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1492_7(Random rand) {
		return KillTheRNG.randomness.random_1492.nextFloat();
//		KillTheRNG.randomness.random_1492.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1493_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1493.nextInt(i);
//		KillTheRNG.randomness.random_1493.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1494_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1494.nextInt(i);
//		KillTheRNG.randomness.random_1494.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1495_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1495.nextInt(i);
//		KillTheRNG.randomness.random_1495.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1496_11(Random rand) {
		return KillTheRNG.randomness.random_1496.nextFloat();
//		KillTheRNG.randomness.random_1496.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1497_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1497.nextInt(i);
//		KillTheRNG.randomness.random_1497.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1498_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1498.nextInt(i);
//		KillTheRNG.randomness.random_1498.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_random_1499_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1499.nextInt(i);
//		KillTheRNG.randomness.random_1499.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1500_15(Random rand) {
		return KillTheRNG.randomness.random_1500.nextFloat();
//		KillTheRNG.randomness.random_1500.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_random_1501_16(Random rand, int i) {
		return KillTheRNG.randomness.random_1501.nextInt(i);
//		KillTheRNG.randomness.random_1501.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_random_1502_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1502.nextInt(i);
//		KillTheRNG.randomness.random_1502.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_random_1503_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1503.nextInt(i);
//		KillTheRNG.randomness.random_1503.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	private static int redirect_random_1504_19(Random rand, int i) {
		return KillTheRNG.randomness.random_1504.nextInt(i);
//		KillTheRNG.randomness.random_1504.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	private static int redirect_random_1505_20(Random rand, int i) {
		return KillTheRNG.randomness.random_1505.nextInt(i);
//		KillTheRNG.randomness.random_1505.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	private static int redirect_random_1506_21(Random rand, int i) {
		return KillTheRNG.randomness.random_1506.nextInt(i);
//		KillTheRNG.randomness.random_1506.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	private static int redirect_random_1507_22(Random rand, int i) {
		return KillTheRNG.randomness.random_1507.nextInt(i);
//		KillTheRNG.randomness.random_1507.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	private static int redirect_random_1508_23(Random rand, int i) {
		return KillTheRNG.randomness.random_1508.nextInt(i);
//		KillTheRNG.randomness.random_1508.nextInt(i);
//		return rand.nextInt(i);
	}

}
