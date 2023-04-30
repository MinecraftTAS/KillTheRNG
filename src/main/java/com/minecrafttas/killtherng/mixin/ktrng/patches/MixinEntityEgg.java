package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityEgg.class)
public class MixinEntityEgg{

	/**
	* Chance of chick spawning from a thrown egg
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_eggChickChance_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.eggChickChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.eggChickChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.eggChickChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance of 4 chicks spawning from a thrown egg
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_eggFourChickChance_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.eggFourChickChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.eggFourChickChance.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.eggFourChickChance.nextInt(i);
			return rand.nextInt(i);
		}
	}


}