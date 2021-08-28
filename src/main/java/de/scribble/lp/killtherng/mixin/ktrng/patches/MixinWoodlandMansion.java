package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.WoodlandMansion;

@Mixin(WoodlandMansion.class)
public class MixinWoodlandMansion {

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1622_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1622.nextInt(i);
		KillTheRNG.randomness.random_1622.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1623_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_1623.nextInt(i);
		KillTheRNG.randomness.random_1623.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1624_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_1624.nextInt(i);
		KillTheRNG.randomness.random_1624.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1625_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_1625.nextInt(i);
		KillTheRNG.randomness.random_1625.nextInt(i);
		return rand.nextInt(i);
	}

}
