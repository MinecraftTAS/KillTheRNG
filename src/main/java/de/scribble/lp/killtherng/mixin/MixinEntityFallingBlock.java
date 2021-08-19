package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityFallingBlock;

@Mixin(EntityFallingBlock.class)
public class MixinEntityFallingBlock {
	@Redirect(method = "fall(FF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_316(Random rand) {
		return KillTheRNG.randomness.random_316.nextFloat();
	}

}
