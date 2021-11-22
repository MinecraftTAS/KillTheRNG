package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIBreakDoor;

@Mixin(EntityAIBreakDoor.class)
public class MixinEntityAIBreakDoor {

	/**
	* If the zombie break door sound should be played
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiBreakDoorSound_1(Random rand, int i) {
		return KillTheRNG.randomness.aiBreakDoorSound.nextInt(i);
//		KillTheRNG.randomness.aiBreakDoorSound.nextInt(i);
//		return rand.nextInt(i);
	}

}
