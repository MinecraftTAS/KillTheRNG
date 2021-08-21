package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticlePortal;

@Mixin(ParticlePortal.class)
public class MixinParticlePortal {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1433_1(Random rand) {
		return KillTheRNG.randomness.random_1433.nextFloat();
//		KillTheRNG.randomness.random_1433.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1434_2(Random rand) {
		return KillTheRNG.randomness.random_1434.nextFloat();
//		KillTheRNG.randomness.random_1434.nextFloat();
//		return rand.nextFloat();
	}

}
