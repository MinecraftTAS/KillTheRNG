package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.storage.loot.LootPool;

@Mixin(LootPool.class)
public class MixinLootPool {

	/**
	* null
	*/
	@Redirect(method = "createLootRoll(Ljava/util/Collection;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1641_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1641.nextInt(i);
	}

}
