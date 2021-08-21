package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemBucket;

@Mixin(ItemBucket.class)
public class MixinItemBucket {

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_591_1(Random rand) {
		return KillTheRNG.randomness.random_591.nextFloat();
//		KillTheRNG.randomness.random_591.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "tryPlaceContainedLiquid(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_592_2(Random rand) {
		return KillTheRNG.randomness.random_592.nextFloat();
//		KillTheRNG.randomness.random_592.nextFloat();
//		return rand.nextFloat();
	}

}
