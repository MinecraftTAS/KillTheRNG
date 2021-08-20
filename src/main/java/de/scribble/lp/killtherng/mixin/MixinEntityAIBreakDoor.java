package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIBreakDoor;

@Mixin(EntityAIBreakDoor.class)
public class MixinEntityAIBreakDoor {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_752_0(Random rand, int i) {
		return KillTheRNG.randomness.random_752.nextInt(i);
	}

}
