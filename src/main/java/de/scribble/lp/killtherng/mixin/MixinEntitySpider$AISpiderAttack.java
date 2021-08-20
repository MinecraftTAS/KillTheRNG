package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntitySpider$AISpiderAttack")
public class MixinEntitySpider$AISpiderAttack {

	/**
	* null
	*/
	@Redirect(method = "shouldContinueExecuting()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_835_0(Random rand, int i) {
		return KillTheRNG.randomness.random_835.nextInt(i);
	}

}
