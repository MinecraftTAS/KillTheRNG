package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityEnderPearl.class)
public class MixinEntityEnderPearl{

	/**
	* Particle of ender pearl
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_enderPearlParticle_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particle of ender pearl
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_enderPearlParticle_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particle of ender pearl
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_enderPearlParticle_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Particle of ender pearl
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_enderPearlParticle_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderPearlParticle.nextFloat();
//		return rand.nextFloat();
	}


}