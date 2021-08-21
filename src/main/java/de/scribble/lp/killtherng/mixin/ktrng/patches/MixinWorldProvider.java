package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldProvider;

@Mixin(WorldProvider.class)
public class MixinWorldProvider {

	/**
	* null
	*/
	@Redirect(method = "getRandomizedSpawnPoint()Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_1480_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1480.nextInt(i);
//		KillTheRNG.randomness.random_1480.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomizedSpawnPoint()Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap=false)
	public int redirect_random_1481_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1481.nextInt(i);
//		KillTheRNG.randomness.random_1481.nextInt(i);
//		return rand.nextInt(i);
	}

}
