package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIEatGrass.class)
public class MixinEntityAIEatGrass{

	/**
	* Should eat grass
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiEatGrassEatGrass_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiEatGrassEatGrass.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiEatGrassEatGrass.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.aiEatGrassEatGrass.nextInt(i);
			return rand.nextInt(i);
		}
	}


}