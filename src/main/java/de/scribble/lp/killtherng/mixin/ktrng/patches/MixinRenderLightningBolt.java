package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.entity.RenderLightningBolt.class)
public class MixinRenderLightningBolt{

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1402_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1402.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1402.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1402.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1403_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1403.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1403.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1403.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1404_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1404.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1404.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1404.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1405_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1405.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1405.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1405.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1406_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1406.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1406.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1406.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1407_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1407.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1407.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1407.nextInt(i);
			return rand.nextInt(i);
		}
	}


}