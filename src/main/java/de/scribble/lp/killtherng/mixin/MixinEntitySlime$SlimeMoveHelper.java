package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntitySlime$SlimeMoveHelper")
public class MixinEntitySlime$SlimeMoveHelper {
	@Redirect(method = "onUpdateMoveHelper()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_853(Random rand) {
		return KillTheRNG.randomness.random_853.nextFloat();
	}

	@Redirect(method = "onUpdateMoveHelper()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_854(Random rand) {
		return KillTheRNG.randomness.random_854.nextFloat();
	}

}
