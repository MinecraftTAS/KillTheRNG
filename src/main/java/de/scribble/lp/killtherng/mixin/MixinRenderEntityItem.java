package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.entity.RenderEntityItem;

@Mixin(RenderEntityItem.class)
public class MixinRenderEntityItem {

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1387_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1388_1(Random rand) {
		return KillTheRNG.randomness.random_1388.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1389_2(Random rand) {
		return KillTheRNG.randomness.random_1389.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1390_3(Random rand) {
		return KillTheRNG.randomness.random_1390.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1391_4(Random rand) {
		return KillTheRNG.randomness.random_1391.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1392_5(Random rand) {
		return KillTheRNG.randomness.random_1392.nextFloat();
	}

}
