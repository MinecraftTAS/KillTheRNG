package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession.class)
public class MixinVillagerRegistry$VillagerProfession{

	/**
	* What profession the villager should have
	*/
	@Redirect(method = "getRandomCareer(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_villagerProfession_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.villagerProfession.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.villagerProfession.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.villagerProfession.nextInt(i);
			return rand.nextInt(i);
		}
	}


}