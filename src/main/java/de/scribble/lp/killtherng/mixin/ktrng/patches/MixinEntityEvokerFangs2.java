package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityEvokerFangs;

@Mixin(EntityEvokerFangs.class)
public class MixinEntityEvokerFangs2 {

	/**
	* Pitch of evocation fangs attack sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_evokerFangSound_1(Random rand) {
		return KillTheRNG.randomness.evokerFangSound.nextFloat();
//		KillTheRNG.randomness.evokerFangSound.nextFloat();
//		return rand.nextFloat();
	}

}
