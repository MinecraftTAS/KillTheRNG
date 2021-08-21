package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

@Mixin(EntityAINearestAttackableTarget.class)
public class MixinEntityAINearestAttackableTarget {

	/**
	* If the entity should look for a new target
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiNearestAttackableTarget_1(Random rand, int i) {
		return KillTheRNG.randomness.aiNearestAttackableTarget.nextInt(i);
//		KillTheRNG.randomness.aiNearestAttackableTarget.nextInt(i);
//		return rand.nextInt(i);
	}

}
