package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;

@Mixin(MapGenScatteredFeature.class)
public class MixinMapGenScatteredFeature {

	/**
	* Position of structure for amplified world type
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_amplifiedStructureRng_1(Random rand, int i) {
//		return KillTheRNG.randomness.amplifiedStructureRng.nextInt(i);
		KillTheRNG.randomness.amplifiedStructureRng.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position of structure for amplified world type
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_amplifiedStructureRng_2(Random rand, int i) {
//		return KillTheRNG.randomness.amplifiedStructureRng.nextInt(i);
		KillTheRNG.randomness.amplifiedStructureRng.nextInt(i);
		return rand.nextInt(i);
	}

}