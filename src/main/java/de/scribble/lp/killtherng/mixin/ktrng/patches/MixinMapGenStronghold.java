package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenStronghold.class)
public class MixinMapGenStronghold{

	/**
	* Position of the Stronghold
	*/
	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_posRotStronghold_1(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Position of the Stronghold
	*/
	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotStronghold_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the Stronghold
	*/
	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_posRotStronghold_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the Stronghold
	*/
	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_posRotStronghold_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotStronghold.nextDouble();
			return rand.nextDouble();
		}
	}


}