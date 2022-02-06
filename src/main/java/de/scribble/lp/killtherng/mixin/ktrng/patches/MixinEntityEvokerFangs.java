package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityEvokerFangs;

@Mixin(EntityEvokerFangs.class)
public class MixinEntityEvokerFangs {

	/**
	* Particles of evoker fangs
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_evokerFangCritParticles_1(Random rand) {
		return KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particles of evoker fangs
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_evokerFangCritParticles_2(Random rand) {
		return KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particles of evoker fangs
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_evokerFangCritParticles_3(Random rand) {
		return KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particles of evoker fangs
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_evokerFangCritParticles_4(Random rand) {
		return KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particles of evoker fangs
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_evokerFangCritParticles_5(Random rand) {
		return KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particles of evoker fangs
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_evokerFangCritParticles_6(Random rand) {
		return KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		KillTheRNG.randomness.evokerFangCritParticles.nextDouble();
//		return rand.nextDouble();
	}

}
