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
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_deathDustParticles_7(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_deathDustParticles_8(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_deathDustParticles_9(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		KillTheRNG.randomness.deathDustParticles.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_deathDustParticles_10(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextFloat();
//		KillTheRNG.randomness.deathDustParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_deathDustParticles_11(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextFloat();
//		KillTheRNG.randomness.deathDustParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_deathDustParticles_12(Random rand) {
		return KillTheRNG.randomness.deathDustParticles.nextFloat();
//		KillTheRNG.randomness.deathDustParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Decrease or not decrease air supply while having a respiration enchantment
	*/
	@Redirect(method = "decreaseAirSupply(I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_respirationDecrementAirSupply_13(Random rand, int i) {
		return KillTheRNG.randomness.respirationDecrementAirSupply.nextInt(i);
//		KillTheRNG.randomness.respirationDecrementAirSupply.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether or not it should spawn potion effects when invisible
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_potionParticlesInvisible_14(Random rand, int i) {
		return KillTheRNG.randomness.potionParticlesInvisible.nextInt(i);
//		KillTheRNG.randomness.potionParticlesInvisible.nextInt(i);
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
	* Whether or not it should spawn potion effects when particles are hidden
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_potionParticlesHidden_16(Random rand, int i) {
		return KillTheRNG.randomness.potionParticlesHidden.nextInt(i);
//		KillTheRNG.randomness.potionParticlesHidden.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_potionParticlesPosition_17(Random rand) {
		return KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_potionParticlesPosition_18(Random rand) {
		return KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_potionParticlesPosition_19(Random rand) {
		return KillTheRNG.randomness.potionParticlesPosition.nextDouble();
//		KillTheRNG.randomness.potionParticlesPosition.nextDouble();
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
	* Pitch when an item breaks in your hand
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brokenItemSound_21(Random rand) {
		return KillTheRNG.randomness.brokenItemSound.nextFloat();
//		KillTheRNG.randomness.brokenItemSound.nextFloat();
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
	* If knockback resistance is applied
	*/
	@Redirect(method = "knockBack(Lnet/minecraft/entity/Entity;FDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBackResistance_25(Random rand) {
		return KillTheRNG.randomness.knockBackResistance.nextDouble();
//		KillTheRNG.randomness.knockBackResistance.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Pitch of the death sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entityDeathSound_26(Random rand) {
		return KillTheRNG.randomness.entityDeathSound.nextFloat();
//		KillTheRNG.randomness.entityDeathSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the death sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_entityDeathSound_27(Random rand) {
		return KillTheRNG.randomness.entityDeathSound.nextFloat();
//		KillTheRNG.randomness.entityDeathSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the shield break sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_entityShieldBreakSound_28(Random rand) {
		return KillTheRNG.randomness.entityShieldBreakSound.nextFloat();
//		KillTheRNG.randomness.entityShieldBreakSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the shield block sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_entityShieldBlockSound_29(Random rand) {
		return KillTheRNG.randomness.entityShieldBlockSound.nextFloat();
//		KillTheRNG.randomness.entityShieldBlockSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the thorns hit sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_entityThornsSound_30(Random rand) {
		return KillTheRNG.randomness.entityThornsSound.nextFloat();
//		KillTheRNG.randomness.entityThornsSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the thorns hit sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_entityThornsSound_31(Random rand) {
		return KillTheRNG.randomness.entityThornsSound.nextFloat();
//		KillTheRNG.randomness.entityThornsSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_entityHurtSound_32(Random rand) {
		return KillTheRNG.randomness.entityHurtSound.nextFloat();
//		KillTheRNG.randomness.entityHurtSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the hurt sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_entityHurtSound_33(Random rand) {
		return KillTheRNG.randomness.entityHurtSound.nextFloat();
//		KillTheRNG.randomness.entityHurtSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Change the pitch of the sound when the entity is a child
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_soundPitchChild_34(Random rand) {
		return KillTheRNG.randomness.soundPitchChild.nextFloat();
//		KillTheRNG.randomness.soundPitchChild.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Change the pitch of the sound when the entity is a child
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_soundPitchChild_35(Random rand) {
		return KillTheRNG.randomness.soundPitchChild.nextFloat();
//		KillTheRNG.randomness.soundPitchChild.nextFloat();
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
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entityTeleportParticle_47(Random rand) {
		return KillTheRNG.randomness.entityTeleportParticle.nextFloat();
//		KillTheRNG.randomness.entityTeleportParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_entityTeleportParticle_48(Random rand) {
		return KillTheRNG.randomness.entityTeleportParticle.nextFloat();
//		KillTheRNG.randomness.entityTeleportParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_entityTeleportParticle_49(Random rand) {
		return KillTheRNG.randomness.entityTeleportParticle.nextFloat();
//		KillTheRNG.randomness.entityTeleportParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_entityTeleportParticle_50(Random rand) {
		return KillTheRNG.randomness.entityTeleportParticle.nextDouble();
//		KillTheRNG.randomness.entityTeleportParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_entityTeleportParticle_51(Random rand) {
		return KillTheRNG.randomness.entityTeleportParticle.nextDouble();
//		KillTheRNG.randomness.entityTeleportParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_entityTeleportParticle_52(Random rand) {
		return KillTheRNG.randomness.entityTeleportParticle.nextDouble();
//		KillTheRNG.randomness.entityTeleportParticle.nextDouble();
//		return rand.nextDouble();
	}

}
