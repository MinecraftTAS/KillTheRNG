package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraftforge.registries.NamespacedDefaultedWrapper")
public class MixinNamespacedDefaultedWrapper {

	/**
	* null
	*/
	@Redirect(method = "getRandomObject(Ljava/util/Random;)Lnet/minecraftforge/registries/IForgeRegistryEntry;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_205_0(Random rand, int i) {
		return KillTheRNG.randomness.random_205.nextInt(i);
	}

}
