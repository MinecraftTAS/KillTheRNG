package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityArrow;

@Mixin(EntityArrow.class)
public class MixinEntityArrow {

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_573_0(Random rand) {
		return KillTheRNG.randomness.random_573.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_574_1(Random rand) {
		return KillTheRNG.randomness.random_574.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "shoot(DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_575_2(Random rand) {
		return KillTheRNG.randomness.random_575.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_576_0(Random rand) {
		return KillTheRNG.randomness.random_576.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_577_1(Random rand) {
		return KillTheRNG.randomness.random_577.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_578_2(Random rand) {
		return KillTheRNG.randomness.random_578.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_579_0(Random rand, int i) {
		return KillTheRNG.randomness.random_579.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_580_1(Random rand) {
		return KillTheRNG.randomness.random_580.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onHit(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_581_2(Random rand) {
		return KillTheRNG.randomness.random_581.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "setEnchantmentEffectsFromEntity(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_582_0(Random rand) {
		return KillTheRNG.randomness.random_582.nextGaussian();
	}

}
