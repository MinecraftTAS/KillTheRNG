package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemEgg.class)
public class MixinItemEgg{

	/**
	* null
	*/
	@Redirect(method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_601_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_601.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_601.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_601.nextFloat();
			return rand.nextFloat();
		}
	}


}