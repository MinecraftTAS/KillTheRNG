package de.scribble.lp.killtherng.mixin.ktrng.patches;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleWaterWake.class)
public class MixinParticleWaterWake{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_61_1() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_61.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_61.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_62_2() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_62.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_62.nextDouble();
//		return Math.random();
	}


}