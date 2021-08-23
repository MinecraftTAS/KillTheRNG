package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraftforge.registries.NamespacedDefaultedWrapper")
public class MixinNamespacedDefaultedWrapper {

	/**
	* Responsible for a random enchantment during trading and random villager professions
	*/
	@Redirect(method = "getRandomObject(Ljava/util/Random;)Lnet/minecraftforge/registries/IForgeRegistryEntry;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_randomRegistryObject_1(Random rand, int i) {
		return KillTheRNG.randomness.randomRegistryObject.nextInt(i);
//		KillTheRNG.randomness.randomRegistryObject.nextInt(i);
//		return rand.nextInt(i);
	}

}
