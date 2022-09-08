package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenEndCity.class)
public class MixinMapGenEndCity{

	/**
	* End City Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endCityPos_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* End City Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_endCityPos_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* End City Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_endCityPos_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* End City Position
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_endCityPos_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* End City Position
	*/
	@Redirect(method = "getYPosForStructure(IILnet/minecraft/world/gen/ChunkGeneratorEnd;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_endCityPos_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.endCityPos.nextInt(i);
		return rand.nextInt(i);
	}


}