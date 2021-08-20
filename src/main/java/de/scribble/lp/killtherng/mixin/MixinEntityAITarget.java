package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAITarget;

@Mixin(EntityAITarget.class)
public class MixinEntityAITarget {

	/**
	* null
	*/
	@Redirect(method = "canEasilyReach(Lnet/minecraft/entity/EntityLivingBase;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_702_0(Random rand, int i) {
		return KillTheRNG.randomness.random_702.nextInt(i);
	}

}
