package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.storage.loot.LootTable.class)
public class MixinLootTable{

	/**
	* Shuffles items?
	*/
	@Redirect(method = "shuffleItems(Ljava/util/List;ILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_lootTableShuffleItems_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.lootTableShuffleItems.nextBoolean();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.lootTableShuffleItems.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Shuffles items?
	*/
	@Redirect(method = "shuffleItems(Ljava/util/List;ILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_lootTableShuffleItems_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.lootTableShuffleItems.nextBoolean();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.lootTableShuffleItems.nextBoolean();
//		return rand.nextBoolean();
	}


}