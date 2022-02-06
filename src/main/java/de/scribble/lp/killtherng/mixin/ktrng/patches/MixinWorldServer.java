package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldServer;

@Mixin(WorldServer.class)
public class MixinWorldServer {

	/**
	* The chance of lightning striking during thunderstorm
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningChance_1(Random rand, int i) {
		return KillTheRNG.randomness.lightningChance.nextInt(i);
//		KillTheRNG.randomness.lightningChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The chance of skeletonRiders spawn on a lightning strike
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_spawnSkeletonRiders_2(Random rand) {
		return KillTheRNG.randomness.spawnSkeletonRiders.nextDouble();
//		KillTheRNG.randomness.spawnSkeletonRiders.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* If ice and snow form during snow storm
	*/
	@Redirect(method = "updateBlocks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_addSnowBlocks_3(Random rand, int i) {
		return KillTheRNG.randomness.addSnowBlocks.nextInt(i);
//		KillTheRNG.randomness.addSnowBlocks.nextInt(i);
//		return rand.nextInt(i);
	}

}
