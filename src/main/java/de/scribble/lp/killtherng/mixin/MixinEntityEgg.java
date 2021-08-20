package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityEgg;

@Mixin(EntityEgg.class)
public class MixinEntityEgg {

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_602_0(Random rand) {
		return KillTheRNG.randomness.random_602.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_603_1(Random rand) {
		return KillTheRNG.randomness.random_603.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_604_2(Random rand) {
		return KillTheRNG.randomness.random_604.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_605_0(Random rand, int i) {
		return KillTheRNG.randomness.random_605.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_606_1(Random rand, int i) {
		return KillTheRNG.randomness.random_606.nextInt(i);
	}

}
