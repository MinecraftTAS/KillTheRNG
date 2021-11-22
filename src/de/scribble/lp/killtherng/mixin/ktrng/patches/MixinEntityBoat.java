package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityBoat;

@Mixin(EntityBoat.class)
public class MixinEntityBoat {

	/**
	* Pitch of boat sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_boatSound_1(Random rand) {
		return KillTheRNG.randomness.boatSound.nextFloat();
//		KillTheRNG.randomness.boatSound.nextFloat();
//		return rand.nextFloat();
	}

}
