package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
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
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_59.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_59.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.math_random_59.nextDouble();
			return Math.random();
		}
	}


}