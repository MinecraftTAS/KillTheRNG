package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.storage.loot.conditions.RandomChanceWithLooting;

@Mixin(RandomChanceWithLooting.class)
public class MixinRandomChanceWithLooting {

	/**
	* null
	*/
	@Redirect(method = "testCondition(Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1648_1(Random rand) {
		return KillTheRNG.randomness.random_1648.nextFloat();
//		KillTheRNG.randomness.random_1648.nextFloat();
//		return rand.nextFloat();
	}

}