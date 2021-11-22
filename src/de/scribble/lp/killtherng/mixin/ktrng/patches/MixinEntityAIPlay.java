package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIPlay;

@Mixin(EntityAIPlay.class)
public class MixinEntityAIPlay {

	/**
	* If entities should play with each other
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiPlay_1(Random rand, int i) {
		return KillTheRNG.randomness.aiPlay.nextInt(i);
//		KillTheRNG.randomness.aiPlay.nextInt(i);
//		return rand.nextInt(i);
	}

}
