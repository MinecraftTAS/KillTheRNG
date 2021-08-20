package de.scribble.lp.killtherng.mixin;

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
	public int redirect_random_104_0(Random rand, int i) {
		return KillTheRNG.randomness.random_104.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_105_1(Random rand, int i) {
		return KillTheRNG.randomness.random_105.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_106_2(Random rand, int i) {
		return KillTheRNG.randomness.random_106.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_107_3(Random rand, int i) {
		return KillTheRNG.randomness.random_107.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_108_0(Random rand, int i) {
		return KillTheRNG.randomness.random_108.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_109_1(Random rand, int i) {
		return KillTheRNG.randomness.random_109.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_110_2(Random rand, int i) {
		return KillTheRNG.randomness.random_110.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_111_3(Random rand, int i) {
		return KillTheRNG.randomness.random_111.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_112_0(Random rand, int i) {
		return KillTheRNG.randomness.random_112.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_113_1(Random rand) {
		return KillTheRNG.randomness.random_113.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_114_2(Random rand, int i) {
		return KillTheRNG.randomness.random_114.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "adjustPosToNearbyEntity(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_115_0(Random rand, int i) {
		return KillTheRNG.randomness.random_115.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_116_0(Random rand, int i) {
		return KillTheRNG.randomness.random_116.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_117_1(Random rand, int i) {
		return KillTheRNG.randomness.random_117.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_118_2(Random rand, int i) {
		return KillTheRNG.randomness.random_118.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_119_3(Random rand, int i) {
		return KillTheRNG.randomness.random_119.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_120_0(Random rand, int i) {
		return KillTheRNG.randomness.random_120.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_121_1(Random rand, int i) {
		return KillTheRNG.randomness.random_121.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_122_2(Random rand, int i) {
		return KillTheRNG.randomness.random_122.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_123_3(Random rand, int i) {
		return KillTheRNG.randomness.random_123.nextInt(i);
	}

}
