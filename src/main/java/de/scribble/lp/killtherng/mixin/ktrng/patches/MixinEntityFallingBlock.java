package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityFallingBlock.class)
public class MixinEntityFallingBlock{

	/**
	* If anvil get's damaged when falling
	*/
	@Redirect(method = "fall(FF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_anvilFallingDamage_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.anvilFallingDamage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.anvilFallingDamage.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.anvilFallingDamage.nextFloat();
			return rand.nextFloat();
		}
	}


}