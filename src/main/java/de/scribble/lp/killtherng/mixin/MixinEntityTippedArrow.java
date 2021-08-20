package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityTippedArrow;

@Mixin(EntityTippedArrow.class)
public class MixinEntityTippedArrow {

	/**
	* null
	*/
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_583_0(Random rand) {
		return KillTheRNG.randomness.random_583.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_584_1(Random rand) {
		return KillTheRNG.randomness.random_584.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnPotionParticles(I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_585_2(Random rand) {
		return KillTheRNG.randomness.random_585.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_586_0(Random rand) {
		return KillTheRNG.randomness.random_586.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_587_1(Random rand) {
		return KillTheRNG.randomness.random_587.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_588_2(Random rand) {
		return KillTheRNG.randomness.random_588.nextDouble();
	}

}
