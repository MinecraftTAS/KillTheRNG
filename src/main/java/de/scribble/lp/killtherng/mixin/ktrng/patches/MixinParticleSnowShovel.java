package de.scribble.lp.killtherng.mixin.ktrng.patches;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSnowShovel.class)
public class MixinParticleSnowShovel{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_78_1() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_78.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_78.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDF)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_79_2() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_79.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_79.nextDouble();
//		return Math.random();
	}


}