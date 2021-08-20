package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityEnderPearl;

@Mixin(EntityEnderPearl.class)
public class MixinEntityEnderPearl {

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_645_0(Random rand) {
		return KillTheRNG.randomness.random_645.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_646_1(Random rand) {
		return KillTheRNG.randomness.random_646.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_647_2(Random rand) {
		return KillTheRNG.randomness.random_647.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_648_3(Random rand) {
		return KillTheRNG.randomness.random_648.nextFloat();
	}

}
