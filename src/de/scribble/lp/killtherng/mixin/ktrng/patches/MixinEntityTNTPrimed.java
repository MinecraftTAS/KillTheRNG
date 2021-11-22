package de.scribble.lp.killtherng.mixin.ktrng.patches;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityTNTPrimed;

@Mixin(EntityTNTPrimed.class)
public class MixinEntityTNTPrimed {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_58_1() {
		return KillTheRNG.randomness.math_random_58.nextDouble();
//		KillTheRNG.randomness.math_random_58.nextDouble();
//		return Math.random();
	}

}
