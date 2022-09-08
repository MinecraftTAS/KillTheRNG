package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.entity.RenderEnderman.class)
public class MixinRenderEnderman{

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/monster/EntityEnderman;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1376_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1376.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1376.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/monster/EntityEnderman;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1377_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1377.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1377.nextGaussian();
//		return rand.nextGaussian();
	}


}