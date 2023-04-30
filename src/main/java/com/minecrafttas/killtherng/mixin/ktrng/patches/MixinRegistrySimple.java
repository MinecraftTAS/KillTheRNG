package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.util.registry.RegistrySimple.class)
public class MixinRegistrySimple{

	/**
	* Gets a random registry value from the mc registry
	*/
	@Redirect(method = "getRandomObject(Ljava/util/Random;)Ljava/lang/Object;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_registryGetRandomObject_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.registryGetRandomObject.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.registryGetRandomObject.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.registryGetRandomObject.nextInt(i);
			return rand.nextInt(i);
		}
	}


}