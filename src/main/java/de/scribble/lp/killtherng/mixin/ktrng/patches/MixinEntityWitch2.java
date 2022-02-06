package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityWitch;

@Mixin(EntityWitch.class)
public class MixinEntityWitch2 {

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_witchParticle_1(Random rand, int i) {
		return KillTheRNG.randomness.witchParticle.nextInt(i);
//		KillTheRNG.randomness.witchParticle.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_witchParticle_2(Random rand) {
		return KillTheRNG.randomness.witchParticle.nextGaussian();
//		KillTheRNG.randomness.witchParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_witchParticle_3(Random rand) {
		return KillTheRNG.randomness.witchParticle.nextGaussian();
//		KillTheRNG.randomness.witchParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Quantity and position of which particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_witchParticle_4(Random rand) {
		return KillTheRNG.randomness.witchParticle.nextGaussian();
//		KillTheRNG.randomness.witchParticle.nextGaussian();
//		return rand.nextGaussian();
	}

}
