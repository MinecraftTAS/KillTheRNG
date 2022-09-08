package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
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
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.evokerFangSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.evokerFangSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.evokerFangSound.nextFloat();
			return rand.nextFloat();
		}
	}


}