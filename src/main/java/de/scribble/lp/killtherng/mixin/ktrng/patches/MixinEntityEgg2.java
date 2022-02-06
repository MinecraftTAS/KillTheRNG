package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityEgg;

@Mixin(EntityEgg.class)
public class MixinEntityEgg2 {

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_eggCrackParticle_1(Random rand) {
		return KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_eggCrackParticle_2(Random rand) {
		return KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_eggCrackParticle_3(Random rand) {
		return KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		return rand.nextFloat();
	}

}
