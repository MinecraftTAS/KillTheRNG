package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldServer;

@Mixin(WorldServer.class)
public class MixinWorldServer2 {

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_initialSpawnLocation_1(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_initialSpawnLocation_2(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_initialSpawnLocation_3(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_initialSpawnLocation_4(Random rand, int i) {
		return KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
//		return rand.nextInt(i);
	}

}