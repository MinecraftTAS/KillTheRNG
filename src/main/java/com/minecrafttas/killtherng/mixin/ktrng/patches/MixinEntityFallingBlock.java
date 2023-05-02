package com.minecrafttas.killtherng.mixin.ktrng.patches;
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
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.anvilFallingDamage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.anvilFallingDamage.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.anvilFallingDamage.nextFloat();
			return rand.nextFloat();
		}
	}


}