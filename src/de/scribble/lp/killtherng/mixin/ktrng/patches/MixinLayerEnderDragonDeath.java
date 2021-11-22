package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public float redirect_random_1379_1(Random rand) {
		return KillTheRNG.randomness.random_1379.nextFloat();
//		KillTheRNG.randomness.random_1379.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1380_2(Random rand) {
		return KillTheRNG.randomness.random_1380.nextFloat();
//		KillTheRNG.randomness.random_1380.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1381_3(Random rand) {
		return KillTheRNG.randomness.random_1381.nextFloat();
//		KillTheRNG.randomness.random_1381.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1382_4(Random rand) {
		return KillTheRNG.randomness.random_1382.nextFloat();
//		KillTheRNG.randomness.random_1382.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1383_5(Random rand) {
		return KillTheRNG.randomness.random_1383.nextFloat();
//		KillTheRNG.randomness.random_1383.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1384_6(Random rand) {
		return KillTheRNG.randomness.random_1384.nextFloat();
//		KillTheRNG.randomness.random_1384.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1385_7(Random rand) {
		return KillTheRNG.randomness.random_1385.nextFloat();
//		KillTheRNG.randomness.random_1385.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "doRenderLayer(Lnet/minecraft/entity/boss/EntityDragon;FFFFFFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1386_8(Random rand) {
		return KillTheRNG.randomness.random_1386.nextFloat();
//		KillTheRNG.randomness.random_1386.nextFloat();
//		return rand.nextFloat();
	}

}
