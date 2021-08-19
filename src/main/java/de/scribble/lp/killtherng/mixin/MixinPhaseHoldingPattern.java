package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.dragon.phase.PhaseHoldingPattern;

@Mixin(PhaseHoldingPattern.class)
public class MixinPhaseHoldingPattern {
	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1987(Random rand, int i) {
		return KillTheRNG.randomness.random_1987.nextInt(i);
	}

	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1988(Random rand, int i) {
		return KillTheRNG.randomness.random_1988.nextInt(i);
	}

	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1989(Random rand, int i) {
		return KillTheRNG.randomness.random_1989.nextInt(i);
	}

	@Redirect(method = "findNewTarget()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1990(Random rand, int i) {
		return KillTheRNG.randomness.random_1990.nextInt(i);
	}

	@Redirect(method = "navigateToNextPathNode()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1991(Random rand) {
		return KillTheRNG.randomness.random_1991.nextFloat();
	}

}
