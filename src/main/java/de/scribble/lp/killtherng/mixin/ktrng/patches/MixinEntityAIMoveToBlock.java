package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIMoveToBlock.class)
public class MixinEntityAIMoveToBlock{

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_979_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_979.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_979.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_979.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_980_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_980.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_980.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_980.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_981_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_981.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_981.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_981.nextInt(i);
			return rand.nextInt(i);
		}
	}


}