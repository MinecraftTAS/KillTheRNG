package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.entity.RenderEntityItem.class)
public class MixinRenderEntityItem{

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1387_1(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1387.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1387.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1388_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1388.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1388.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1388.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1389_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1389.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1389.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1389.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1390_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1390.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1390.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1390.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1391_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1391.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1391.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1391.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1392_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1392.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1392.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1392.nextFloat();
			return rand.nextFloat();
		}
	}


}