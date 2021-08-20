package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.entity.layers.LayerEnderDragonDeath;

@Mixin(LayerEnderDragonDeath.class)
public class MixinLayerEnderDragonDeath {

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1379_0(Random rand) {
		return KillTheRNG.randomness.random_1379.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1380_1(Random rand) {
		return KillTheRNG.randomness.random_1380.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1381_2(Random rand) {
		return KillTheRNG.randomness.random_1381.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1382_3(Random rand) {
		return KillTheRNG.randomness.random_1382.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1383_4(Random rand) {
		return KillTheRNG.randomness.random_1383.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1384_5(Random rand) {
		return KillTheRNG.randomness.random_1384.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1385_6(Random rand) {
		return KillTheRNG.randomness.random_1385.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1386_7(Random rand) {
		return KillTheRNG.randomness.random_1386.nextFloat();
	}

}
