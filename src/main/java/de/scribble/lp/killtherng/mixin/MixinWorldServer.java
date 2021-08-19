package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldServer;

@Mixin(WorldServer.class)
public class MixinWorldServer {
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_104(Random rand, int i) {
		return KillTheRNG.randomness.random_104.nextInt(i);
	}

	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_105(Random rand, int i) {
		return KillTheRNG.randomness.random_105.nextInt(i);
	}

	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_106(Random rand, int i) {
		return KillTheRNG.randomness.random_106.nextInt(i);
	}

	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_107(Random rand, int i) {
		return KillTheRNG.randomness.random_107.nextInt(i);
	}

	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_108(Random rand, int i) {
		return KillTheRNG.randomness.random_108.nextInt(i);
	}

	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_109(Random rand, int i) {
		return KillTheRNG.randomness.random_109.nextInt(i);
	}

	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_110(Random rand, int i) {
		return KillTheRNG.randomness.random_110.nextInt(i);
	}

	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_111(Random rand, int i) {
		return KillTheRNG.randomness.random_111.nextInt(i);
	}

	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_112(Random rand, int i) {
		return KillTheRNG.randomness.random_112.nextInt(i);
	}

	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_113(Random rand) {
		return KillTheRNG.randomness.random_113.nextDouble();
	}

	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_114(Random rand, int i) {
		return KillTheRNG.randomness.random_114.nextInt(i);
	}

	@Redirect(method = "adjustPosToNearbyEntity(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_115(Random rand, int i) {
		return KillTheRNG.randomness.random_115.nextInt(i);
	}

	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_116(Random rand, int i) {
		return KillTheRNG.randomness.random_116.nextInt(i);
	}

	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_117(Random rand, int i) {
		return KillTheRNG.randomness.random_117.nextInt(i);
	}

	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_118(Random rand, int i) {
		return KillTheRNG.randomness.random_118.nextInt(i);
	}

	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_119(Random rand, int i) {
		return KillTheRNG.randomness.random_119.nextInt(i);
	}

	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_120(Random rand, int i) {
		return KillTheRNG.randomness.random_120.nextInt(i);
	}

	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_121(Random rand, int i) {
		return KillTheRNG.randomness.random_121.nextInt(i);
	}

	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_122(Random rand, int i) {
		return KillTheRNG.randomness.random_122.nextInt(i);
	}

	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_123(Random rand, int i) {
		return KillTheRNG.randomness.random_123.nextInt(i);
	}

}
