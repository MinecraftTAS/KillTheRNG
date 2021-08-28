package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureOceanMonument;

@Mixin(StructureOceanMonument.class)
public class MixinStructureOceanMonument {

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1618_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1618.nextInt(i);
		KillTheRNG.randomness.random_1618.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1619_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_1619.nextInt(i);
		KillTheRNG.randomness.random_1619.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1620_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_1620.nextInt(i);
		KillTheRNG.randomness.random_1620.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1621_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_1621.nextInt(i);
		KillTheRNG.randomness.random_1621.nextInt(i);
		return rand.nextInt(i);
	}

}
