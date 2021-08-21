package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityZombieVillager;

@Mixin(EntityZombieVillager.class)
public class MixinEntityZombieVillager {

	/**
	* How long the z villager will take to convert to a villager
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_zombieVillagerConvertionTime_1(Random rand, int i) {
		return KillTheRNG.randomness.zombieVillagerConvertionTime.nextInt(i);
//		KillTheRNG.randomness.zombieVillagerConvertionTime.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of zombie villager converting sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieVillagerConvertionSound_2(Random rand) {
		return KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of zombie villager converting sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_zombieVillagerConvertionSound_3(Random rand) {
		return KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* There is a chance to speedup convertion progress
	*/
	@Redirect(method = "getConversionProgress()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieVillagerConvertionSpeedup_4(Random rand) {
		return KillTheRNG.randomness.zombieVillagerConvertionSpeedup.nextFloat();
//		KillTheRNG.randomness.zombieVillagerConvertionSpeedup.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* There is a chance to speedup convertion progress
	*/
	@Redirect(method = "getConversionProgress()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_zombieVillagerConvertionSpeedup_5(Random rand) {
		return KillTheRNG.randomness.zombieVillagerConvertionSpeedup.nextFloat();
//		KillTheRNG.randomness.zombieVillagerConvertionSpeedup.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get's a different pitch dependant if the villager is a child or an adult
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieVillagerChildrenPitch_6(Random rand) {
		return KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get's a different pitch dependant if the villager is a child or an adult
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_zombieVillagerChildrenPitch_7(Random rand) {
		return KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get's a different pitch dependant if the villager is a child or an adult
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_zombieVillagerChildrenPitch_8(Random rand) {
		return KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Get's a different pitch dependant if the villager is a child or an adult
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_zombieVillagerChildrenPitch_9(Random rand) {
		return KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		KillTheRNG.randomness.zombieVillagerChildrenPitch.nextFloat();
//		return rand.nextFloat();
	}

}
