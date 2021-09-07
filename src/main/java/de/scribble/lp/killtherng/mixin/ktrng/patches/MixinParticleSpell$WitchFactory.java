package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleSpell;

@Mixin(ParticleSpell.WitchFactory.class)
public class MixinParticleSpell$WitchFactory {

	/**
	* null
	*/
	@Redirect(method = "createParticle(ILnet/minecraft/world/World;DDDDDD[I)Lnet/minecraft/client/particle/Particle;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1432_1(Random rand) {
		return KillTheRNG.randomness.random_1432.nextFloat();
//		KillTheRNG.randomness.random_1432.nextFloat();
//		return rand.nextFloat();
	}

}
