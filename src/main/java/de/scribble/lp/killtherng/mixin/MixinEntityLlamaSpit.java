package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityLlamaSpit;

@Mixin(EntityLlamaSpit.class)
public class MixinEntityLlamaSpit {

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1010_0(Random rand) {
		return KillTheRNG.randomness.random_1010.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1011_1(Random rand) {
		return KillTheRNG.randomness.random_1011.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1012_2(Random rand) {
		return KillTheRNG.randomness.random_1012.nextGaussian();
	}

}
