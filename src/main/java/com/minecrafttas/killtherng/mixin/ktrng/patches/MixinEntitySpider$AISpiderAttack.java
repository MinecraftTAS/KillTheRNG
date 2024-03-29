package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntitySpider$AISpiderAttack")
public class MixinEntitySpider$AISpiderAttack{

	/**
	* null
	*/
	@Redirect(method = "shouldContinueExecuting()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_835_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_835.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_835.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_835.nextInt(i);
			return rand.nextInt(i);
		}
	}


}