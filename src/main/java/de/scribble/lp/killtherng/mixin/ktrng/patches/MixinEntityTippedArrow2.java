package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityTippedArrow;

@Mixin(EntityTippedArrow.class)
public class MixinEntityTippedArrow2 {

	/**
	* Same as Arrow particle but for multiple entities (?)
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_tippedArrowParticleStatusUpdate_1(Random rand) {
		return KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
//		KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Same as Arrow particle but for multiple entities (?)
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_tippedArrowParticleStatusUpdate_2(Random rand) {
		return KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
//		KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Same as Arrow particle but for multiple entities (?)
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_tippedArrowParticleStatusUpdate_3(Random rand) {
		return KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
//		KillTheRNG.randomness.tippedArrowParticleStatusUpdate.nextDouble();
//		return rand.nextDouble();
	}

}
