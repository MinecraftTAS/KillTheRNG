package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityBoat.class)
public class MixinEntityBoat{

	/**
	* Pitch of boat sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_boatSound_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.boatSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.boatSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.boatSound.nextFloat();
			return rand.nextFloat();
		}
	}


}