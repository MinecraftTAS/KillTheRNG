package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleSweepAttack.class)
public class MixinParticleSweepAttack{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1457_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1457.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1457.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1457.nextFloat();
			return rand.nextFloat();
		}
	}


}