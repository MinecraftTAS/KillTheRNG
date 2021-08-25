package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.village.Village;

@Mixin(Village.class)
public class MixinVillage {

	/**
	* Whether to spawn an Iron Golem in a Village or not
	*/
	@Redirect(method = "tick(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ironGolemSpawnVillage_1(Random rand, int i) {
		return KillTheRNG.randomness.ironGolemSpawnVillage.nextInt(i);
//		KillTheRNG.randomness.ironGolemSpawnVillage.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random Position for Villagers to spawn
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villagerSpawnPos_2(Random rand, int i) {
		return KillTheRNG.randomness.villagerSpawnPos.nextInt(i);
//		KillTheRNG.randomness.villagerSpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random Position for Villagers to spawn
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_villagerSpawnPos_3(Random rand, int i) {
		return KillTheRNG.randomness.villagerSpawnPos.nextInt(i);
//		KillTheRNG.randomness.villagerSpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Random Position for Villagers to spawn
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_villagerSpawnPos_4(Random rand, int i) {
		return KillTheRNG.randomness.villagerSpawnPos.nextInt(i);
//		KillTheRNG.randomness.villagerSpawnPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Unused Code
	*/
	@Redirect(method = "removeDeadAndOutOfRangeDoors()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_villageResetDoorOpeningRestrictionCounter_5(Random rand, int i) {
//		return KillTheRNG.randomness.villageResetDoorOpeningRestrictionCounter.nextInt(i);
		KillTheRNG.randomness.villageResetDoorOpeningRestrictionCounter.nextInt(i);
		return rand.nextInt(i);
	}

}
