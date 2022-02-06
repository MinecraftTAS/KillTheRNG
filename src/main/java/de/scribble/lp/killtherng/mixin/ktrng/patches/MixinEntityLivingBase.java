package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityLivingBase;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {

	/**
	* If knockback resistance is applied
	*/
	@Redirect(method = "knockBack(Lnet/minecraft/entity/Entity;FDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBackResistance_1(Random rand) {
		return KillTheRNG.randomness.knockBackResistance.nextDouble();
//		KillTheRNG.randomness.knockBackResistance.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* How much knockback resistance is added
	*/
	@Redirect(method = "markVelocityChanged()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBackResistance_2(Random rand) {
		return KillTheRNG.randomness.knockBackResistance.nextDouble();
//		KillTheRNG.randomness.knockBackResistance.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_deathDustParticles_3(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_deathDustParticles_4(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_deathDustParticles_5(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_deathDustParticles_6(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextFloat();
//		KillTheRNG.randomness.deathDustParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_deathDustParticles_7(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextFloat();
//		KillTheRNG.randomness.deathDustParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_deathDustParticles_8(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextFloat();
//		KillTheRNG.randomness.deathDustParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spawnWaterbubbleWhenDrowning_9(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_spawnWaterbubbleWhenDrowning_10(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_spawnWaterbubbleWhenDrowning_11(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_spawnWaterbubbleWhenDrowning_12(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_spawnWaterbubbleWhenDrowning_13(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_spawnWaterbubbleWhenDrowning_14(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch when an item breaks in your hand
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brokenItemSound_15(Random rand) {
		return KillTheRNG.randomness.brokenItemSound.nextFloat();
//		KillTheRNG.randomness.brokenItemSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_brokenItemParticles_16(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_brokenItemParticles_17(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_brokenItemParticles_18(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_9_19() {
		return KillTheRNG.randomness.math_random_9.nextDouble();
//		KillTheRNG.randomness.math_random_9.nextDouble();
//		return Math.random();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_drinkAndEatSound_20(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_drinkAndEatSound_21(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_drinkAndEatSound_22(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_drinkAndEatSound_23(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_drinkAndEatSound_24(Random rand, int i) {
		return KillTheRNG.randomness.drinkAndEatSound.nextInt(i);
//		KillTheRNG.randomness.drinkAndEatSound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_drinkAndEatSound_25(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_drinkAndEatSound_26(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_10_27() {
		return KillTheRNG.randomness.math_random_10.nextDouble();
//		KillTheRNG.randomness.math_random_10.nextDouble();
//		return Math.random();
	}

	/**
	* Whether or not it should spawn potion effects when invisible
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_potionParticlesInvisible_28(Random rand, int i) {
		return KillTheRNG.randomness.potionParticlesInvisible.nextInt(i);
//		KillTheRNG.randomness.potionParticlesInvisible.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_potionParticles_29(Random rand) {
		return KillTheRNG.randomness.potionParticles.nextBoolean();
//		KillTheRNG.randomness.potionParticles.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Whether or not it should spawn potion effects when particles are hidden
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_potionParticlesHidden_30(Random rand, int i) {
		return KillTheRNG.randomness.potionParticlesHidden.nextInt(i);
//		KillTheRNG.randomness.potionParticlesHidden.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_potionParticlesPosition_31(Random rand) {
		return KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_potionParticlesPosition_32(Random rand) {
		return KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_potionParticlesPosition_33(Random rand) {
		return KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		return rand.nextDouble();
	}

}
