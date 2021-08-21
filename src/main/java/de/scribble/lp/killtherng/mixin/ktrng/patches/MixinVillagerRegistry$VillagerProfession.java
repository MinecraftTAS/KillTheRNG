package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

@Mixin(VillagerRegistry.VillagerProfession.class)
public class MixinVillagerRegistry$VillagerProfession {

	/**
	* null
	*/
	@Redirect(method = "getRandomCareer(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_212_1(Random rand, int i) {
		return KillTheRNG.randomness.random_212.nextInt(i);
//		KillTheRNG.randomness.random_212.nextInt(i);
//		return rand.nextInt(i);
	}

}
