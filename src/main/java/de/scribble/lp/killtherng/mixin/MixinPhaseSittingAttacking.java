package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseSittingAttacking;

@Mixin(PhaseSittingAttacking.class)
public class MixinPhaseSittingAttacking {

	/**
	* null
	*/
	@Redirect(method = "doClientRenderEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_2002_0(Random rand) {
		return KillTheRNG.randomness.random_2002.nextFloat();
	}

}
