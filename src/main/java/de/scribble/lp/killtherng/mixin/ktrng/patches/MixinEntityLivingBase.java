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
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spawnWaterbubbleWhenDrowning_1(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_spawnWaterbubbleWhenDrowning_2(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_spawnWaterbubbleWhenDrowning_3(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_spawnWaterbubbleWhenDrowning_4(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_spawnWaterbubbleWhenDrowning_5(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_spawnWaterbubbleWhenDrowning_6(Random rand) {
		return KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of explosionNormal particles when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_deathExplosionParticles_7(Random rand) {
		return KillTheRNG.randomness.deathExplosionParticles.nextGaussian();
//		KillTheRNG.randomness.deathExplosionParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of explosionNormal particles when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_deathExplosionParticles_8(Random rand) {
		return KillTheRNG.randomness.deathExplosionParticles.nextGaussian();
//		KillTheRNG.randomness.deathExplosionParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of explosionNormal particles when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_deathExplosionParticles_9(Random rand) {
		return KillTheRNG.randomness.deathExplosionParticles.nextGaussian();
//		KillTheRNG.randomness.deathExplosionParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of explosionNormal particles when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_deathExplosionParticles_10(Random rand) {
		return KillTheRNG.randomness.deathExplosionParticles.nextFloat();
//		KillTheRNG.randomness.deathExplosionParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of explosionNormal particles when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_deathExplosionParticles_11(Random rand) {
		return KillTheRNG.randomness.deathExplosionParticles.nextFloat();
//		KillTheRNG.randomness.deathExplosionParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of explosionNormal particles when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_deathExplosionParticles_12(Random rand) {
		return KillTheRNG.randomness.deathExplosionParticles.nextFloat();
//		KillTheRNG.randomness.deathExplosionParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Decrease or not decrease air supply while respiration
	*/
	@Redirect(method = "decreaseAirSupply(I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_decrementAirSupply_13(Random rand, int i) {
		return KillTheRNG.randomness.decrementAirSupply.nextInt(i);
//		KillTheRNG.randomness.decrementAirSupply.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_potionParticles_14(Random rand, int i) {
		return KillTheRNG.randomness.potionParticles.nextInt(i);
//		KillTheRNG.randomness.potionParticles.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_potionParticles_15(Random rand) {
		return KillTheRNG.randomness.potionParticles.nextBoolean();
//		KillTheRNG.randomness.potionParticles.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_potionParticles_16(Random rand, int i) {
		return KillTheRNG.randomness.potionParticles.nextInt(i);
//		KillTheRNG.randomness.potionParticles.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_potionParticles_17(Random rand) {
		return KillTheRNG.randomness.potionParticles.nextDouble();
//		KillTheRNG.randomness.potionParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_potionParticles_18(Random rand) {
		return KillTheRNG.randomness.potionParticles.nextDouble();
//		KillTheRNG.randomness.potionParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_potionParticles_19(Random rand) {
		return KillTheRNG.randomness.potionParticles.nextDouble();
//		KillTheRNG.randomness.potionParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Applies damage to headgear when anvil or a block is damaging the player
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_damageHeadgearFromFallingBlock_20(Random rand) {
		return KillTheRNG.randomness.damageHeadgearFromFallingBlock.nextFloat();
//		KillTheRNG.randomness.damageHeadgearFromFallingBlock.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brokenItemParticles_21(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_brokenItemParticles_22(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_brokenItemParticles_23(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_brokenItemParticles_24(Random rand) {
		return KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		KillTheRNG.randomness.brokenItemParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Calculates knockback vector
	*/
	@Redirect(method = "knockBack(Lnet/minecraft/entity/Entity;FDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBack_25(Random rand) {
		return KillTheRNG.randomness.knockBack.nextDouble();
//		KillTheRNG.randomness.knockBack.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entitySounds_26(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_entitySounds_27(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_entitySounds_28(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_entitySounds_29(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_entitySounds_30(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_entitySounds_31(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_entitySounds_32(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* DeathSound, thorns sound hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_entitySounds_33(Random rand) {
		return KillTheRNG.randomness.entitySounds.nextFloat();
//		KillTheRNG.randomness.entitySounds.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Change the pitch of the sound
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_soundPitch_34(Random rand) {
		return KillTheRNG.randomness.soundPitch.nextFloat();
//		KillTheRNG.randomness.soundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Change the pitch of the sound
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_soundPitch_35(Random rand) {
		return KillTheRNG.randomness.soundPitch.nextFloat();
//		KillTheRNG.randomness.soundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Change the pitch of the sound
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_soundPitch_36(Random rand) {
		return KillTheRNG.randomness.soundPitch.nextFloat();
//		KillTheRNG.randomness.soundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Change the pitch of the sound
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_soundPitch_37(Random rand) {
		return KillTheRNG.randomness.soundPitch.nextFloat();
//		KillTheRNG.randomness.soundPitch.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If entity cramming gets applied
	*/
	@Redirect(method = "collideWithNearbyEntities()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_crammingApplience_38(Random rand, int i) {
		return KillTheRNG.randomness.crammingApplience.nextInt(i);
//		KillTheRNG.randomness.crammingApplience.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much knockback resistance is added
	*/
	@Redirect(method = "markVelocityChanged()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBackResistance_39(Random rand) {
		return KillTheRNG.randomness.knockBackResistance.nextDouble();
//		KillTheRNG.randomness.knockBackResistance.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_drinkAndEatSound_40(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_drinkAndEatSound_41(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_drinkAndEatSound_42(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_drinkAndEatSound_43(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_drinkAndEatSound_44(Random rand, int i) {
		return KillTheRNG.randomness.drinkAndEatSound.nextInt(i);
//		KillTheRNG.randomness.drinkAndEatSound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_drinkAndEatSound_45(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_drinkAndEatSound_46(Random rand) {
		return KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		KillTheRNG.randomness.drinkAndEatSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_98_47(Random rand) {
		return KillTheRNG.randomness.random_98.nextFloat();
//		KillTheRNG.randomness.random_98.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_99_48(Random rand) {
		return KillTheRNG.randomness.random_99.nextFloat();
//		KillTheRNG.randomness.random_99.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_100_49(Random rand) {
		return KillTheRNG.randomness.random_100.nextFloat();
//		KillTheRNG.randomness.random_100.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_101_50(Random rand) {
		return KillTheRNG.randomness.random_101.nextDouble();
//		KillTheRNG.randomness.random_101.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_102_51(Random rand) {
		return KillTheRNG.randomness.random_102.nextDouble();
//		KillTheRNG.randomness.random_102.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_103_52(Random rand) {
		return KillTheRNG.randomness.random_103.nextDouble();
//		KillTheRNG.randomness.random_103.nextDouble();
//		return rand.nextDouble();
	}

}
