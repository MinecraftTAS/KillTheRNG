package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityWaterMob.class)
public class MixinEntityWaterMob{

	/**
	* null
	*/
	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_956_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_956.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_956.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_956.nextInt(i);
			return rand.nextInt(i);
		}
	}


}