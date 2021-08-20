package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseDying;

@Mixin(PhaseDying.class)
public class MixinPhaseDying {

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_2003_0(Random rand) {
		return KillTheRNG.randomness.random_2003.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_2004_1(Random rand) {
		return KillTheRNG.randomness.random_2004.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_2005_2(Random rand) {
		return KillTheRNG.randomness.random_2005.nextFloat();
	}

}
