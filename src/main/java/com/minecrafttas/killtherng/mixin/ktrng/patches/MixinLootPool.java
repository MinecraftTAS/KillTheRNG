package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.storage.loot.LootPool.class)
public class MixinLootPool{

	/**
	* Creates a loot roll dependant on weight
	*/
	@Redirect(method = "createLootRoll(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lootCreateRoll_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lootCreateRoll.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lootCreateRoll.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lootCreateRoll.nextInt(i);
			return rand.nextInt(i);
		}
	}


}