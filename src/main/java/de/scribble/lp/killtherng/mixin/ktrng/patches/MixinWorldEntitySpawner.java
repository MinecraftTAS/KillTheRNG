package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.WorldEntitySpawner.class)
public class MixinWorldEntitySpawner{

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_entitySpawnPos_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_entitySpawnPos_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_entitySpawnPos_3(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_entitySpawnPos_4(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_entitySpawnPos_5(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_entitySpawnPos_6(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entitySpawnPos_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "findChunksForSpawning(Lnet/minecraft/world/WorldServer;ZZZ)I", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_entitySpawnPosMR_8() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosMR.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosMR.nextDouble();
//		return Math.random();
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_entitySpawnPos_9(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_entitySpawnPos_10(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds a random positon in a chunk
	*/
	@Redirect(method = "getRandomChunkPosition(Lnet/minecraft/world/World;II)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_entitySpawnPos_11(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_entitySpawnPosWorldGen_12(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextFloat();
		return rand.nextFloat();
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_entitySpawnPosWorldGen_13(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_entitySpawnPosWorldGen_14(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	private static int redirect_entitySpawnPosWorldGen_15(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_entitySpawnPosWorldGen_16(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextFloat();
		return rand.nextFloat();
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	private static int redirect_entitySpawnPosWorldGen_17(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	private static int redirect_entitySpawnPosWorldGen_18(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	private static int redirect_entitySpawnPosWorldGen_19(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	private static int redirect_entitySpawnPosWorldGen_20(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	private static int redirect_entitySpawnPosWorldGen_21(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	private static int redirect_entitySpawnPosWorldGen_22(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	private static int redirect_entitySpawnPosWorldGen_23(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Finds an Entity and the position where to spawn during world gen
	*/
	@Redirect(method = "performWorldGenSpawning(Lnet/minecraft/world/World;Lnet/minecraft/world/biome/Biome;IIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	private static int redirect_entitySpawnPosWorldGen_24(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.entitySpawnPosWorldGen.nextInt(i);
		return rand.nextInt(i);
	}


}