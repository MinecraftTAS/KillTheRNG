package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityEndermite.class)
public class MixinEntityEndermite{

	/**
	* Position of 'Portal' particles on an endermite
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_endermiteParticle_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an endermite
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_endermiteParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an endermite
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_endermiteParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an endermite
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_endermiteParticle_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an endermite
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_endermiteParticle_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of 'Portal' particles on an endermite
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_endermiteParticle_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.endermiteParticle.nextDouble();
			return rand.nextDouble();
		}
	}


}