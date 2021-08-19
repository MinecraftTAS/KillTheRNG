package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityTameable;

@Mixin(EntityTameable.class)
public class MixinEntityTameable {
	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_966(Random rand) {
		return KillTheRNG.randomness.random_966.nextGaussian();
	}

	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_967(Random rand) {
		return KillTheRNG.randomness.random_967.nextGaussian();
	}

	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_968(Random rand) {
		return KillTheRNG.randomness.random_968.nextGaussian();
	}

	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_969(Random rand) {
		return KillTheRNG.randomness.random_969.nextFloat();
	}

	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_970(Random rand) {
		return KillTheRNG.randomness.random_970.nextFloat();
	}

	@Redirect(method = "playTameEffect(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_971(Random rand) {
		return KillTheRNG.randomness.random_971.nextFloat();
	}

}
