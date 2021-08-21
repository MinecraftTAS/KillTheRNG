package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleLava;

@Mixin(ParticleLava.class)
public class MixinParticleLava {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1443_1(Random rand) {
		return KillTheRNG.randomness.random_1443.nextFloat();
//		KillTheRNG.randomness.random_1443.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1444_2(Random rand) {
		return KillTheRNG.randomness.random_1444.nextFloat();
//		KillTheRNG.randomness.random_1444.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1445_3(Random rand) {
		return KillTheRNG.randomness.random_1445.nextFloat();
//		KillTheRNG.randomness.random_1445.nextFloat();
//		return rand.nextFloat();
	}

}
