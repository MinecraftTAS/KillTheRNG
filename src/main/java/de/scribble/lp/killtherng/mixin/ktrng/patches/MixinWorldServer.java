package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldServer;

@Mixin(WorldServer.class)
public class MixinWorldServer {

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_104_1(Random rand, int i) {
		return KillTheRNG.randomness.random_104.nextInt(i);
//		KillTheRNG.randomness.random_104.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_105_2(Random rand, int i) {
		return KillTheRNG.randomness.random_105.nextInt(i);
//		KillTheRNG.randomness.random_105.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_106_3(Random rand, int i) {
		return KillTheRNG.randomness.random_106.nextInt(i);
//		KillTheRNG.randomness.random_106.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_107_4(Random rand, int i) {
		return KillTheRNG.randomness.random_107.nextInt(i);
//		KillTheRNG.randomness.random_107.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_108_5(Random rand, int i) {
		return KillTheRNG.randomness.random_108.nextInt(i);
//		KillTheRNG.randomness.random_108.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_109_6(Random rand, int i) {
		return KillTheRNG.randomness.random_109.nextInt(i);
//		KillTheRNG.randomness.random_109.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_110_7(Random rand, int i) {
		return KillTheRNG.randomness.random_110.nextInt(i);
//		KillTheRNG.randomness.random_110.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_111_8(Random rand, int i) {
		return KillTheRNG.randomness.random_111.nextInt(i);
//		KillTheRNG.randomness.random_111.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_112_9(Random rand, int i) {
		return KillTheRNG.randomness.random_112.nextInt(i);
//		KillTheRNG.randomness.random_112.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_113_10(Random rand) {
		return KillTheRNG.randomness.random_113.nextDouble();
//		KillTheRNG.randomness.random_113.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_114_11(Random rand, int i) {
		return KillTheRNG.randomness.random_114.nextInt(i);
//		KillTheRNG.randomness.random_114.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "adjustPosToNearbyEntity(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_115_12(Random rand, int i) {
		return KillTheRNG.randomness.random_115.nextInt(i);
//		KillTheRNG.randomness.random_115.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_116_13(Random rand, int i) {
		return KillTheRNG.randomness.random_116.nextInt(i);
//		KillTheRNG.randomness.random_116.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_117_14(Random rand, int i) {
		return KillTheRNG.randomness.random_117.nextInt(i);
//		KillTheRNG.randomness.random_117.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_118_15(Random rand, int i) {
		return KillTheRNG.randomness.random_118.nextInt(i);
//		KillTheRNG.randomness.random_118.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_119_16(Random rand, int i) {
		return KillTheRNG.randomness.random_119.nextInt(i);
//		KillTheRNG.randomness.random_119.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_120_17(Random rand, int i) {
		return KillTheRNG.randomness.random_120.nextInt(i);
//		KillTheRNG.randomness.random_120.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_121_18(Random rand, int i) {
		return KillTheRNG.randomness.random_121.nextInt(i);
//		KillTheRNG.randomness.random_121.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_122_19(Random rand, int i) {
		return KillTheRNG.randomness.random_122.nextInt(i);
//		KillTheRNG.randomness.random_122.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_123_20(Random rand, int i) {
		return KillTheRNG.randomness.random_123.nextInt(i);
//		KillTheRNG.randomness.random_123.nextInt(i);
//		return rand.nextInt(i);
	}

}
