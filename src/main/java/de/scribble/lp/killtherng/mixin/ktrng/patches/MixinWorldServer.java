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
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_initialSpawnLocation_1(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_initialSpawnLocation_2(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_initialSpawnLocation_3(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_initialSpawnLocation_4(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Selects the player where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_checkLightPlayer_5(Random rand, int i) {
		return KillTheRNG.randomness.checkLightPlayer.nextInt(i);
//		KillTheRNG.randomness.checkLightPlayer.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position, where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_checkLightPosition_6(Random rand, int i) {
		return KillTheRNG.randomness.checkLightPosition.nextInt(i);
//		KillTheRNG.randomness.checkLightPosition.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position, where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_checkLightPosition_7(Random rand, int i) {
		return KillTheRNG.randomness.checkLightPosition.nextInt(i);
//		KillTheRNG.randomness.checkLightPosition.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position, where the light should be checked
	*/
	@Redirect(method = "playerCheckLight()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_checkLightPosition_8(Random rand, int i) {
		return KillTheRNG.randomness.checkLightPosition.nextInt(i);
//		KillTheRNG.randomness.checkLightPosition.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The chance of lightning striking during thunderstorm
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningChance_9(Random rand, int i) {
		return KillTheRNG.randomness.lightningChance.nextInt(i);
//		KillTheRNG.randomness.lightningChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The chance of skeletonRiders spawn on a lightning strike
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_spawnSkeletonRiders_10(Random rand) {
		return KillTheRNG.randomness.spawnSkeletonRiders.nextDouble();
//		KillTheRNG.randomness.spawnSkeletonRiders.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* If ice and snow form during snow storm
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_addSnowBlocks_11(Random rand, int i) {
		return KillTheRNG.randomness.addSnowBlocks.nextInt(i);
//		KillTheRNG.randomness.addSnowBlocks.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Lightning aims for an entity in a radius where it's about to strike. If multiple entities are found this random variable selects the entity
	*/
	@Redirect(method = "adjustPosToNearbyEntity(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningAimForEntity_12(Random rand, int i) {
		return KillTheRNG.randomness.lightningAimForEntity.nextInt(i);
//		KillTheRNG.randomness.lightningAimForEntity.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_spawnPos_13(Random rand, int i) {
		return KillTheRNG.randomness.spawnPos.nextInt(i);
//		KillTheRNG.randomness.spawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_spawnPos_14(Random rand, int i) {
		return KillTheRNG.randomness.spawnPos.nextInt(i);
//		KillTheRNG.randomness.spawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_spawnPos_15(Random rand, int i) {
		return KillTheRNG.randomness.spawnPos.nextInt(i);
//		KillTheRNG.randomness.spawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Creates a spawn position at random within 256 blocks of 0,0
	*/
	@Redirect(method = "createSpawnPosition(Lnet/minecraft/world/WorldSettings;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_spawnPos_16(Random rand, int i) {
		return KillTheRNG.randomness.spawnPos.nextInt(i);
//		KillTheRNG.randomness.spawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_bonusChestPos_17(Random rand, int i) {
		return KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_bonusChestPos_18(Random rand, int i) {
		return KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_bonusChestPos_19(Random rand, int i) {
		return KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The spawn position of the bonus chest
	*/
	@Redirect(method = "createBonusChest()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_bonusChestPos_20(Random rand, int i) {
		return KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		KillTheRNG.randomness.bonusChestPos.nextInt(i);
//		return rand.nextInt(i);
	}

}
