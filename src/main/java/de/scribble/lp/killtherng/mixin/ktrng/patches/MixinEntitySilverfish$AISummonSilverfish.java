package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntitySilverfish$AISummonSilverfish")
public class MixinEntitySilverfish$AISummonSilverfish{

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_889_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_889.nextBoolean();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_889.nextBoolean();
//		return rand.nextBoolean();
	}


}