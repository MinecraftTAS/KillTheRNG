package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenEndCity;

@Mixin(MapGenEndCity.class)
public class MixinMapGenEndCity {

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1868_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1868.nextInt(i);
//		KillTheRNG.randomness.random_1868.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1869_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1869.nextInt(i);
//		KillTheRNG.randomness.random_1869.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1870_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1870.nextInt(i);
//		KillTheRNG.randomness.random_1870.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1871_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1871.nextInt(i);
//		KillTheRNG.randomness.random_1871.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getYPosForStructure(IILnet/minecraft/world/gen/ChunkGeneratorEnd;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1872_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1872.nextInt(i);
//		KillTheRNG.randomness.random_1872.nextInt(i);
//		return rand.nextInt(i);
	}

}
