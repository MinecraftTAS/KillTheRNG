package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.item.ItemCompass$1")
public class MixinItemCompass$1{

	/**
	* null
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)F", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_59_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_59.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_59.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.math_random_59.nextDouble();
			return Math.random();
		}
	}


}