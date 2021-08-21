package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenVillage;

@Mixin(MapGenVillage.class)
public class MixinMapGenVillage {

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1610_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1610.nextInt(i);
//		KillTheRNG.randomness.random_1610.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1611_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1611.nextInt(i);
//		KillTheRNG.randomness.random_1611.nextInt(i);
//		return rand.nextInt(i);
	}

}
