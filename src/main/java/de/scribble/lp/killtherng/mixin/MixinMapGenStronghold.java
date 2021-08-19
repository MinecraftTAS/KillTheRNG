package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenStronghold;

@Mixin(MapGenStronghold.class)
public class MixinMapGenStronghold {
	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1598(Random rand, long unused) {
	}

	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1599(Random rand) {
		return KillTheRNG.randomness.random_1599.nextDouble();
	}

	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1600(Random rand) {
		return KillTheRNG.randomness.random_1600.nextDouble();
	}

	@Redirect(method = "generatePositions()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1601(Random rand) {
		return KillTheRNG.randomness.random_1601.nextDouble();
	}

}
