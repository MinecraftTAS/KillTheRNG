package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.item.ItemClock$1")
public class MixinItemClock$1{

	/**
	* null
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)F", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_60_1() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_60.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_60.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_60.nextDouble();
			return Math.random();
		}
	}


}