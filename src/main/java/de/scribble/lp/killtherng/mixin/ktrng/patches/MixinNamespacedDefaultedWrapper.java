package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraftforge.registries.NamespacedDefaultedWrapper")
public class MixinNamespacedDefaultedWrapper{

	/**
	* Responsible for a random enchantment during trading and random villager professions
	*/
	@Redirect(method = "getRandomObject(Ljava/util/Random;)Lnet/minecraftforge/registries/IForgeRegistryEntry;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_randomRegistryObject_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.randomRegistryObject.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.randomRegistryObject.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.randomRegistryObject.nextInt(i);
			return rand.nextInt(i);
		}
	}


}