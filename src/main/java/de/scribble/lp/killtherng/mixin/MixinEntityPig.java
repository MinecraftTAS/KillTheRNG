package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityPig;

@Mixin(EntityPig.class)
public class MixinEntityPig {

	/**
	* null
	*/
	@Redirect(method = "boost()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_946_0(Random rand, int i) {
		return KillTheRNG.randomness.random_946.nextInt(i);
	}

}
