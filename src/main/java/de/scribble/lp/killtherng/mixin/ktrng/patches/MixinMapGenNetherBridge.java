package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenNetherBridge;

@Mixin(MapGenNetherBridge.class)
public class MixinMapGenNetherBridge {

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1830_1(Random rand, long seed) {
		KillTheRNG.randomness.random_1830.setSeed(seed, true);
//		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_1831_2(Random rand) {
		return KillTheRNG.randomness.random_1831.nextInt();
//		KillTheRNG.randomness.random_1831.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1832_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1832.nextInt(i);
//		KillTheRNG.randomness.random_1832.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1833_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1833.nextInt(i);
//		KillTheRNG.randomness.random_1833.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1834_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1834.nextInt(i);
//		KillTheRNG.randomness.random_1834.nextInt(i);
//		return rand.nextInt(i);
	}

}
