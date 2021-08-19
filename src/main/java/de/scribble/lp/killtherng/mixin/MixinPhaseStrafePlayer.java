package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseStrafePlayer;

@Mixin(PhaseStrafePlayer.class)
public class MixinPhaseStrafePlayer {
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1992(Random rand, int i) {
		return KillTheRNG.randomness.random_1992.nextInt(i);
	}

	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1993(Random rand) {
		return KillTheRNG.randomness.random_1993.nextFloat();
	}

}
