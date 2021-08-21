package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleSuspendedTown;

@Mixin(ParticleSuspendedTown.class)
public class MixinParticleSuspendedTown {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1428_1(Random rand) {
		return KillTheRNG.randomness.random_1428.nextFloat();
//		KillTheRNG.randomness.random_1428.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1429_2(Random rand) {
		return KillTheRNG.randomness.random_1429.nextFloat();
//		KillTheRNG.randomness.random_1429.nextFloat();
//		return rand.nextFloat();
	}

}
