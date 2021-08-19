package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityEndermite;

@Mixin(EntityEndermite.class)
public class MixinEntityEndermite {
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_726(Random rand) {
		return KillTheRNG.randomness.random_726.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_727(Random rand) {
		return KillTheRNG.randomness.random_727.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_728(Random rand) {
		return KillTheRNG.randomness.random_728.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_729(Random rand) {
		return KillTheRNG.randomness.random_729.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_730(Random rand) {
		return KillTheRNG.randomness.random_730.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_731(Random rand) {
		return KillTheRNG.randomness.random_731.nextDouble();
	}

}
