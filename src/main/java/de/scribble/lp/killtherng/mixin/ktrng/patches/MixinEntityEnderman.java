package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityEnderman.class)
public class MixinEntityEnderman{

	/**
	* After attacking or something there is a chance enderman won't teleport away
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endermanTeleportAwayWhenEntityIsNearby_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportAwayWhenEntityIsNearby.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportAwayWhenEntityIsNearby.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportAwayWhenEntityIsNearby.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermanParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermanParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_endermanParticle_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_endermanParticle_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_endermanParticle_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_endermanParticle_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to a random location (Coords are randomized)
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermanTeleportRandomly_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to a random location (Coords are randomized)
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endermanTeleportRandomly_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Teleports enderman to a random location (Coords are randomized)
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermanTeleportRandomly_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportRandomly.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to near to the targeted entity (Coords are kinda randomized)
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermanTeleportToEntity_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to near to the targeted entity (Coords are kinda randomized)
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endermanTeleportToEntity_12(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Teleports enderman to near to the targeted entity (Coords are kinda randomized)
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermanTeleportToEntity_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanTeleportToEntity.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Enderman loses interest when in daylight and starts teleporting randomly
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endermanInitiateTeleportRandomly_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermanInitiateTeleportRandomly.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermanInitiateTeleportRandomly.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermanInitiateTeleportRandomly.nextFloat();
			return rand.nextFloat();
		}
	}


}