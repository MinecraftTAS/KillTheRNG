package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityEvokerFangs;

@Mixin(EntityEvokerFangs.class)
public class MixinEntityEvokerFangs {
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_792(Random rand) {
		return KillTheRNG.randomness.random_792.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_793(Random rand) {
		return KillTheRNG.randomness.random_793.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_794(Random rand) {
		return KillTheRNG.randomness.random_794.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_795(Random rand) {
		return KillTheRNG.randomness.random_795.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_796(Random rand) {
		return KillTheRNG.randomness.random_796.nextDouble();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_797(Random rand) {
		return KillTheRNG.randomness.random_797.nextDouble();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_798(Random rand) {
		return KillTheRNG.randomness.random_798.nextFloat();
	}

}
