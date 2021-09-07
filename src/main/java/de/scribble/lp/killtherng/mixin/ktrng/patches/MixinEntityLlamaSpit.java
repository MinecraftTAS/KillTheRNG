package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityLlamaSpit;

@Mixin(EntityLlamaSpit.class)
public class MixinEntityLlamaSpit {

	/**
	* Adding inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_spitInaccuracy_1(Random rand) {
		return KillTheRNG.randomness.spitInaccuracy.nextGaussian();
//		KillTheRNG.randomness.spitInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Adding inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_spitInaccuracy_2(Random rand) {
		return KillTheRNG.randomness.spitInaccuracy.nextGaussian();
//		KillTheRNG.randomness.spitInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Adding inaccuracy to the shot
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_spitInaccuracy_3(Random rand) {
		return KillTheRNG.randomness.spitInaccuracy.nextGaussian();
//		KillTheRNG.randomness.spitInaccuracy.nextGaussian();
//		return rand.nextGaussian();
	}

}
