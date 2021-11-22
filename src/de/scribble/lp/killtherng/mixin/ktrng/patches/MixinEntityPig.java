package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityPig;

@Mixin(EntityPig.class)
public class MixinEntityPig {

	/**
	* How long the pig boosts when riding it with a carrot on a stick
	*/
	@Redirect(method = "boost()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_pigBoostTime_1(Random rand, int i) {
		return KillTheRNG.randomness.pigBoostTime.nextInt(i);
//		KillTheRNG.randomness.pigBoostTime.nextInt(i);
//		return rand.nextInt(i);
	}

}
