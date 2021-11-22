package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityFallingBlock;

@Mixin(EntityFallingBlock.class)
public class MixinEntityFallingBlock {

	/**
	* If anvil get's damaged when falling
	*/
	@Redirect(method = "fall(FF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_anvilFallingDamage_1(Random rand) {
		return KillTheRNG.randomness.anvilFallingDamage.nextFloat();
//		KillTheRNG.randomness.anvilFallingDamage.nextFloat();
//		return rand.nextFloat();
	}

}
