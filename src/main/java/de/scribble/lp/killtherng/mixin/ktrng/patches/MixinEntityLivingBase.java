package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.EntityLivingBase.class)
public class MixinEntityLivingBase{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_1_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_1.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_1.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_1.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_2_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_2.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_2.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_2.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_3_3() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_3.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_3.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_3.nextDouble();
			return Math.random();
		}
	}

	/**
	* Applies damage to headgear when anvil or a block is damaging the player
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_damageHeadgearFromFallingBlock_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.damageHeadgearFromFallingBlock.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.damageHeadgearFromFallingBlock.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.damageHeadgearFromFallingBlock.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_4_5() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_4.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_4.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_4.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_5_6() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_5.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_5.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_5.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_6_7() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_6.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_6.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_6.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_7_8() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_7.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_7.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_7.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 4))
	public double redirect_math_random_8_9() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_8.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_8.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_8.nextDouble();
			return Math.random();
		}
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_entityTeleportParticle_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_entityTeleportParticle_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_entityTeleportParticle_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_entityTeleportParticle_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_entityTeleportParticle_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position and velocity of portal particles after an entity teleports
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_entityTeleportParticle_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.entityTeleportParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* If entity cramming gets applied
	*/
	@Redirect(method = "collideWithNearbyEntities()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_crammingApplience_16(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.crammingApplience.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.crammingApplience.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.crammingApplience.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Decrease or not decrease air supply while having a respiration enchantment
	*/
	@Redirect(method = "decreaseAirSupply(I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_respirationDecrementAirSupply_17(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.respirationDecrementAirSupply.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.respirationDecrementAirSupply.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.respirationDecrementAirSupply.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Change the pitch of the sound when the entity is a child
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_soundPitchChild_18(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitchChild.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitchChild.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitchChild.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Change the pitch of the sound when the entity is a child
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_soundPitchChild_19(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitchChild.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitchChild.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitchChild.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Change the pitch of the sound
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_soundPitch_20(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Change the pitch of the sound
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_soundPitch_21(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* If knockback resistance is applied
	*/
	@Redirect(method = "knockBack(Lnet/minecraft/entity/Entity;FDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBackResistance_22(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.knockBackResistance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.knockBackResistance.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.knockBackResistance.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* How much knockback resistance is added
	*/
	@Redirect(method = "markVelocityChanged()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_knockBackResistance_23(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.knockBackResistance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.knockBackResistance.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.knockBackResistance.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_deathDustParticles_24(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_deathDustParticles_25(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_deathDustParticles_26(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_deathDustParticles_27(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_deathDustParticles_28(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the dust clouds when dying
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_deathDustParticles_29(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.deathDustParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spawnWaterbubbleWhenDrowning_30(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_spawnWaterbubbleWhenDrowning_31(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_spawnWaterbubbleWhenDrowning_32(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_spawnWaterbubbleWhenDrowning_33(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_spawnWaterbubbleWhenDrowning_34(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Spawns waterbubbles when entity is drowning
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_spawnWaterbubbleWhenDrowning_35(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.spawnWaterbubbleWhenDrowning.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch when an item breaks in your hand
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_brokenItemSound_36(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_brokenItemParticles_37(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_brokenItemParticles_38(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when item in hand breaks
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_brokenItemParticles_39(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.brokenItemParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_9_40() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_9.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_9.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_9.nextDouble();
			return Math.random();
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_drinkAndEatSound_41(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_drinkAndEatSound_42(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_drinkAndEatSound_43(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_drinkAndEatSound_44(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_drinkAndEatSound_45(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_drinkAndEatSound_46(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of eating and drinking sounds
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_drinkAndEatSound_47(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.drinkAndEatSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_10_48() {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_10.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_10.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_10.nextDouble();
			return Math.random();
		}
	}

	/**
	* Whether or not it should spawn potion effects when invisible
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_potionParticlesInvisible_49(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesInvisible.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesInvisible.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesInvisible.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Whether or not it should spawn potion effects
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_potionParticles_50(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticles.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticles.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Whether or not it should spawn potion effects when particles are hidden
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_potionParticlesHidden_51(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesHidden.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesHidden.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesHidden.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_potionParticlesPosition_52(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_potionParticlesPosition_53(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the potion particles
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_potionParticlesPosition_54(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.potionParticlesPosition.nextDouble();
			return rand.nextDouble();
		}
	}


}