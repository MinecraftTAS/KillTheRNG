package de.scribble.lp.killtherng.mixin.ktrng.patches;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleDrip.class)
public class MixinParticleDrip{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/block/material/Material;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_67_1() {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_67.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.math_random_67.nextDouble();
//		return Math.random();
	}


}