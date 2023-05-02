package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.storage.loot.conditions.RandomChanceWithLooting.class)
public class MixinRandomChanceWithLooting{

	/**
	* Test Random chance condition with looting
	*/
	@Redirect(method = "testCondition(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_randomChanceWithLootingTestCondition_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomChanceWithLootingTestCondition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomChanceWithLootingTestCondition.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.randomChanceWithLootingTestCondition.nextFloat();
			return rand.nextFloat();
		}
	}


}