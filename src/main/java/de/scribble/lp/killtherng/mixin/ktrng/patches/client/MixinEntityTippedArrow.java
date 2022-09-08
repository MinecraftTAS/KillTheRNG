package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityTippedArrow.class)
public class MixinEntityTippedArrow{

	/**
	* Same as Arrow particle but for multiple entities (?)
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_tippedArrowParticleStatusUpdate_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Same as Arrow particle but for multiple entities (?)
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_tippedArrowParticleStatusUpdate_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Same as Arrow particle but for multiple entities (?)
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_tippedArrowParticleStatusUpdate_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
			return rand.nextDouble();
		}
	}


}