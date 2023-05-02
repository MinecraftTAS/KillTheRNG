package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleEndRod.class)
public class MixinParticleEndRod{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1456_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1456.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1456.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1456.nextInt(i);
			return rand.nextInt(i);
		}
	}


}