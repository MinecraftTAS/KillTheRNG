package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.Teleporter.class)
public class MixinTeleporter{

	/**
	* Position where a portal should be created
	*/
	@Redirect(method = "makePortal(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_portalGenerationPosition_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.portalGenerationPosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.portalGenerationPosition.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.portalGenerationPosition.nextInt(i);
			return rand.nextInt(i);
		}
	}


}