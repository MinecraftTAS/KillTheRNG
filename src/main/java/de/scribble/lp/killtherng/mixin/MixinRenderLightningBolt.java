package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.entity.RenderLightningBolt;

@Mixin(RenderLightningBolt.class)
public class MixinRenderLightningBolt {

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1402_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1402.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1403_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1403.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1404_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1404.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1405_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1405.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1406_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1406.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1407_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1407.nextInt(i);
	}

}
