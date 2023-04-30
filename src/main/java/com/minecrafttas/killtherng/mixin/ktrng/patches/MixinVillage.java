package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.village.Village.class)
public class MixinVillage{

	/**
	* Random Position for Villagers to spawn
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerSpawnPos_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Position for Villagers to spawn
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerSpawnPos_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Random Position for Villagers to spawn
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_villagerSpawnPos_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villagerSpawnPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Unused Code
	*/
	@Redirect(method = "removeDeadAndOutOfRangeDoors()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villageResetDoorOpeningRestrictionCounter_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.villageResetDoorOpeningRestrictionCounter.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.villageResetDoorOpeningRestrictionCounter.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.villageResetDoorOpeningRestrictionCounter.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Whether to spawn an Iron Golem in a Village or not
	*/
	@Redirect(method = "tick(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ironGolemSpawnVillage_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemSpawnVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemSpawnVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ironGolemSpawnVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}


}