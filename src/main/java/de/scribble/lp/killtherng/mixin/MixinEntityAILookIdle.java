package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAILookIdle;

@Mixin(EntityAILookIdle.class)
public class MixinEntityAILookIdle {

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_698_0(Random rand) {
		return KillTheRNG.randomness.random_698.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_699_0(Random rand) {
		return KillTheRNG.randomness.random_699.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_700_1(Random rand, int i) {
		return KillTheRNG.randomness.random_700.nextInt(i);
	}

}
