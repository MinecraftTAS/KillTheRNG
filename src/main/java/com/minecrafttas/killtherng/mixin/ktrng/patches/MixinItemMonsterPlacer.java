package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemMonsterPlacer.class)
public class MixinItemMonsterPlacer{

	/**
	* null
	*/
	@Redirect(method = "spawnCreature(Lnet/minecraft/world/World;Lnet/minecraft/util/ResourceLocation;DDD)Lnet/minecraft/entity/Entity;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_655_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_655.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_655.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_655.nextFloat();
			return rand.nextFloat();
		}
	}


}