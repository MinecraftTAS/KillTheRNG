package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityEvokerFangs.class)
public class MixinEntityEvokerFangs{

	/**
	* Pitch of evocation fangs attack sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_evokerFangSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.evokerFangSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.evokerFangSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.evokerFangSound.nextFloat();
			return rand.nextFloat();
		}
	}


}