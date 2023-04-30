package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.entity.EntityPlayerSP.class)
public class MixinEntityPlayerSP{

	/**
	* Pitch of wooshing sounds when entering a nether portal
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_portalSoundTrigger_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.portalSoundTrigger.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.portalSoundTrigger.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.portalSoundTrigger.nextFloat();
			return rand.nextFloat();
		}
	}


}