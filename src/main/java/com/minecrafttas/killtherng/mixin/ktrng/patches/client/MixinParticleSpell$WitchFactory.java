package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSpell.WitchFactory.class)
public class MixinParticleSpell$WitchFactory{

	/**
	* null
	*/
	@Redirect(method = "createParticle(ILnet/minecraft/world/World;DDDDDD[I)Lnet/minecraft/client/particle/Particle;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1432_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1432.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1432.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1432.nextFloat();
			return rand.nextFloat();
		}
	}


}