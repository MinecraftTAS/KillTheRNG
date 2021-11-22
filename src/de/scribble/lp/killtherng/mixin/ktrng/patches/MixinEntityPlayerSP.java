package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.entity.EntityPlayerSP;

@Mixin(EntityPlayerSP.class)
public class MixinEntityPlayerSP {

	/**
	* Pitch of wooshing sounds when entering a nether portal
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_portalSoundTrigger_1(Random rand) {
		return KillTheRNG.randomness.portalSoundTrigger.nextFloat();
//		KillTheRNG.randomness.portalSoundTrigger.nextFloat();
//		return rand.nextFloat();
	}

}
