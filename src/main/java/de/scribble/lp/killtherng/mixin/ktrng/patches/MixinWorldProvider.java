package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.WorldProvider.class)
public class MixinWorldProvider{

	/**
	* Spawn Position of the player when creating a new world
	*/
	@Redirect(method = "getRandomizedSpawnPoint()Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_spawnPosWorldGen_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPosWorldGen.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPosWorldGen.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Spawn Position of the player when creating a new world
	*/
	@Redirect(method = "getRandomizedSpawnPoint()Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_spawnPosWorldGen_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPosWorldGen.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.spawnPosWorldGen.nextInt(i);
//		return rand.nextInt(i);
	}


}