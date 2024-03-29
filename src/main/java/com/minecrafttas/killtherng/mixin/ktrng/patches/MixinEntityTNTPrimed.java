package com.minecrafttas.killtherng.mixin.ktrng.patches;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityTNTPrimed.class)
public class MixinEntityTNTPrimed{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_58_1() {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.math_random_58.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.math_random_58.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.math_random_58.nextDouble();
			return Math.random();
		}
	}


}