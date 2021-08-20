package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseSittingFlaming;

@Mixin(PhaseSittingFlaming.class)
public class MixinPhaseSittingFlaming {

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1999_0(Random rand) {
		return KillTheRNG.randomness.random_1999.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_2000_1(Random rand) {
		return KillTheRNG.randomness.random_2000.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_2001_2(Random rand) {
		return KillTheRNG.randomness.random_2001.nextGaussian();
	}

}
