package com.minecrafttas.killtherng.mixin.ktrng.patches;
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
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportAwayWhenEntityIsNearby.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportAwayWhenEntityIsNearby.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportAwayWhenEntityIsNearby.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermanParticle_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermanParticle_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_endermanParticle_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_endermanParticle_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_endermanParticle_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an enderman
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_endermanParticle_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to a random location (Coords are randomized)
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermanTeleportRandomly_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to a random location (Coords are randomized)
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endermanTeleportRandomly_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Teleports enderman to a random location (Coords are randomized)
	*/
	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermanTeleportRandomly_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportRandomly.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to near to the targeted entity (Coords are kinda randomized)
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermanTeleportToEntity_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Teleports enderman to near to the targeted entity (Coords are kinda randomized)
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endermanTeleportToEntity_12(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Teleports enderman to near to the targeted entity (Coords are kinda randomized)
	*/
	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermanTeleportToEntity_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanTeleportToEntity.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Enderman loses interest when in daylight and starts teleporting randomly
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endermanInitiateTeleportRandomly_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanInitiateTeleportRandomly.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanInitiateTeleportRandomly.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.endermanInitiateTeleportRandomly.nextFloat();
			return rand.nextFloat();
		}
	}


}