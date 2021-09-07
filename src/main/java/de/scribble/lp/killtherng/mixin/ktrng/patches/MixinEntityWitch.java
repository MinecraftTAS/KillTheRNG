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
	* If the witch should consider throwing a weakness potion
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_witchWeaknessPotion_1(Random rand) {
		return KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
//		KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If the witch should consider throwing a weakness potion
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_witchWeaknessPotion_2(Random rand) {
		return KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
//		KillTheRNG.randomness.witchWeaknessPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_witchParticle_3(Random rand, int i) {
		return KillTheRNG.randomness.witchParticle.nextInt(i);
//		KillTheRNG.randomness.witchParticle.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_witchParticle_4(Random rand) {
		return KillTheRNG.randomness.witchParticle.nextGaussian();
//		KillTheRNG.randomness.witchParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_witchParticle_5(Random rand) {
		return KillTheRNG.randomness.witchParticle.nextGaussian();
//		KillTheRNG.randomness.witchParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_witchParticle_6(Random rand) {
		return KillTheRNG.randomness.witchParticle.nextGaussian();
//		KillTheRNG.randomness.witchParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_witchDrinkPotion_7(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_witchDrinkPotion_8(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_witchDrinkPotion_9(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_witchDrinkPotion_10(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_witchDrinkPotion_11(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the potion for the witch to drink
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_witchDrinkPotion_12(Random rand) {
		return KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		KillTheRNG.randomness.witchDrinkPotion.nextFloat();
//		return rand.nextFloat();
	}

}
