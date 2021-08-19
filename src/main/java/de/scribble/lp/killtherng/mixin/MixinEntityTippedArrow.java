package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityTippedArrow;

@Mixin(EntityTippedArrow.class)
public class MixinEntityTippedArrow {
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_583(Random rand) {
		return KillTheRNG.randomness.random_583.nextDouble();
	}

	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_584(Random rand) {
		return KillTheRNG.randomness.random_584.nextDouble();
	}

	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_585(Random rand) {
		return KillTheRNG.randomness.random_585.nextDouble();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_586(Random rand) {
		return KillTheRNG.randomness.random_586.nextDouble();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_587(Random rand) {
		return KillTheRNG.randomness.random_587.nextDouble();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_588(Random rand) {
		return KillTheRNG.randomness.random_588.nextDouble();
	}

}
