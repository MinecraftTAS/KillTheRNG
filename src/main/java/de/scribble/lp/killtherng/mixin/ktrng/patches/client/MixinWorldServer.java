package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.WorldServer.class)
public class MixinWorldServer{

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_initialSpawnLocation_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_initialSpawnLocation_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_initialSpawnLocation_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Spawn location when spawning in a world, unused in forge
	*/
	@Redirect(method = "setInitialSpawnLocation()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_initialSpawnLocation_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.initialSpawnLocation.nextInt(i);
			return rand.nextInt(i);
		}
	}


}