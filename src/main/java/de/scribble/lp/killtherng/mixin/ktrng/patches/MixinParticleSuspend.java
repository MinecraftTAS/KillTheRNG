package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleSuspend;

@Mixin(ParticleSuspend.class)
public class MixinParticleSuspend {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1427_1(Random rand) {
		return KillTheRNG.randomness.random_1427.nextFloat();
//		KillTheRNG.randomness.random_1427.nextFloat();
//		return rand.nextFloat();
	}

}
