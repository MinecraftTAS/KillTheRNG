package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleCloud.class)
public class MixinParticleCloud{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_68_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_68.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_68.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_68.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_69_2() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_69.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_69.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_69.nextDouble();
			return Math.random();
		}
	}


}