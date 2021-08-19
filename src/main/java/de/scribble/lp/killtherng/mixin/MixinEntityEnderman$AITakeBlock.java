package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntityEnderman$AITakeBlock")
public class MixinEntityEnderman$AITakeBlock {
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_885(Random rand, int i) {
		return KillTheRNG.randomness.random_885.nextInt(i);
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_886(Random rand) {
		return KillTheRNG.randomness.random_886.nextDouble();
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_887(Random rand) {
		return KillTheRNG.randomness.random_887.nextDouble();
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_888(Random rand) {
		return KillTheRNG.randomness.random_888.nextDouble();
	}

}
