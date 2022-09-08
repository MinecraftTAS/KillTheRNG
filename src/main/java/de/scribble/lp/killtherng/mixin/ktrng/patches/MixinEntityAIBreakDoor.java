package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIBreakDoor.class)
public class MixinEntityAIBreakDoor{

	/**
	* If the zombie break door sound should be played
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiBreakDoorSound_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.aiBreakDoorSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.aiBreakDoorSound.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.aiBreakDoorSound.nextInt(i);
			return rand.nextInt(i);
		}
	}


}