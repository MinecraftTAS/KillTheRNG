package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.storage.loot.conditions.RandomChance.class)
public class MixinRandomChance{

	/**
	* Test Random chance condition
	*/
	@Redirect(method = "testCondition(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_randomChanceTestCondition_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomChanceTestCondition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomChanceTestCondition.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomChanceTestCondition.nextFloat();
			return rand.nextFloat();
		}
	}


}