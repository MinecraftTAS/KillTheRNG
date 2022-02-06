package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityWitch;

@Mixin(EntityWitch.class)
public class MixinEntityWitch {

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_witchDrinkPotion_1(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_witchDrinkPotion_2(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_witchDrinkPotion_3(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_witchDrinkPotion_4(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_witchDrinkPotion_5(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_witchDrinkPotion_6(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

}
