package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.advancements.AdvancementRewards;

@Mixin(AdvancementRewards.class)
public class MixinAdvancementRewards {
	@Redirect(method = "apply(Lnet/minecraft/entity/player/EntityPlayerMP;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1649(Random rand) {
		return KillTheRNG.randomness.random_1649.nextFloat();
	}

	@Redirect(method = "apply(Lnet/minecraft/entity/player/EntityPlayerMP;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1650(Random rand) {
		return KillTheRNG.randomness.random_1650.nextFloat();
	}

}
