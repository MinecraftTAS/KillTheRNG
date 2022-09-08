package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntitySlime.class)
public class MixinEntitySlime{

	/**
	* Pitch of slime attack sound
	*/
	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSoundAttack_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSoundAttack.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSoundAttack.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSoundAttack.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of slime attack sound
	*/
	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_slimeSoundAttack_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSoundAttack.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSoundAttack.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSoundAttack.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSpawnFlatWorld_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_slimeSpawnFlatWorld_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeSpawnFlatWorld_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_slimeSpawnFlatWorld_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_slimeSpawnFlatWorld_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* A delay between jumps of the slime
	*/
	@Redirect(method = "getJumpDelay()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeJumpDelay_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeJumpDelay.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeJumpDelay.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeJumpDelay.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Does a water splash effect when slime is in water
	*/
	@Redirect(method = "notifyDataManagerChange(Lnet/minecraft/network/datasync/DataParameter;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeWaterSplashEffect_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeWaterSplashEffect.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeWaterSplashEffect.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeWaterSplashEffect.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How big the slime is when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeSize_10(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSize.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSize.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSize.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How big the slime is when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSize_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSize.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSize.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSize.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeParticle_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_slimeParticle_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_slimeParticle_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_slimeParticle_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* How many slimes will be spawned after splitting up
	*/
	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeSplitting_16(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSplitting.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSplitting.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSplitting.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How many slimes will be spawned after splitting up
	*/
	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSplitting_17(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSplitting.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSplitting.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.slimeSplitting.nextFloat();
			return rand.nextFloat();
		}
	}


}