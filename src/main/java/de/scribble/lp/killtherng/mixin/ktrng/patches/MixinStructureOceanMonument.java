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
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeOceanMonument_2(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeOceanMonument_3(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeOceanMonument_4(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		KillTheRNG.randomness.posRotTypeOceanMonument.nextInt(i);
		return rand.nextInt(i);
	}

}
