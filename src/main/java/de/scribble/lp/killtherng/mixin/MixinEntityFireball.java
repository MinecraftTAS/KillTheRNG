package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityFireball;

@Mixin(EntityFireball.class)
public class MixinEntityFireball {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_723_0(Random rand) {
		return KillTheRNG.randomness.random_723.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_724_1(Random rand) {
		return KillTheRNG.randomness.random_724.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_725_2(Random rand) {
		return KillTheRNG.randomness.random_725.nextGaussian();
	}

}
