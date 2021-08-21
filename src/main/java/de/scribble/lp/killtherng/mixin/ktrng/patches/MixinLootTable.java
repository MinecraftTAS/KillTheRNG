package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.storage.loot.LootTable;

@Mixin(LootTable.class)
public class MixinLootTable {

	/**
	* null
	*/
	@Redirect(method = "shuffleItems(Ljava/util/List;ILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1642_1(Random rand) {
		return KillTheRNG.randomness.random_1642.nextBoolean();
//		KillTheRNG.randomness.random_1642.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "shuffleItems(Ljava/util/List;ILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1643_2(Random rand) {
		return KillTheRNG.randomness.random_1643.nextBoolean();
//		KillTheRNG.randomness.random_1643.nextBoolean();
//		return rand.nextBoolean();
	}

}
