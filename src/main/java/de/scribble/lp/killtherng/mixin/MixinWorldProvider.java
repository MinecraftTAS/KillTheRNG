package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldProvider;

@Mixin(WorldProvider.class)
public class MixinWorldProvider {
	@Redirect(method = "getRandomizedSpawnPoint()Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1480(Random rand, int i) {
		return KillTheRNG.randomness.random_1480.nextInt(i);
	}

	@Redirect(method = "getRandomizedSpawnPoint()Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1481(Random rand, int i) {
		return KillTheRNG.randomness.random_1481.nextInt(i);
	}

}
