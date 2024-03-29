package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityEnderCrystal.class)
public class MixinEntityEnderCrystal{

	/**
	* Offsetting the crystal animation
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enderCrystalRotationOffset_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderCrystalRotationOffset.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderCrystalRotationOffset.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.enderCrystalRotationOffset.nextInt(i);
			return rand.nextInt(i);
		}
	}


}