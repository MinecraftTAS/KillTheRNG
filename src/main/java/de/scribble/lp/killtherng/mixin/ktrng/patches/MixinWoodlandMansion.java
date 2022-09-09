package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.WoodlandMansion.class)
public class MixinWoodlandMansion{

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_woodlandMansionRng_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_woodlandMansionRng_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_woodlandMansionRng_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
			return rand.nextInt(i);
		}
	}


}