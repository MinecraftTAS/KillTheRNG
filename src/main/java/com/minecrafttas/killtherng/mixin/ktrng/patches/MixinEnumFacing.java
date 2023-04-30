package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.util.EnumFacing.class)
public class MixinEnumFacing{

	/**
	* A random facing direction
	*/
	@Redirect(method = "random(Ljava/util/Random;)Lnet/minecraft/util/EnumFacing;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_randomFacing_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomFacing.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomFacing.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomFacing.nextInt(i);
			return rand.nextInt(i);
		}
	}


}