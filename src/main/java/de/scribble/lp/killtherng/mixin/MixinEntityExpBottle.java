package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityExpBottle;

@Mixin(EntityExpBottle.class)
public class MixinEntityExpBottle {

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_657_0(Random rand, int i) {
		return KillTheRNG.randomness.random_657.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_658_1(Random rand, int i) {
		return KillTheRNG.randomness.random_658.nextInt(i);
	}

}
