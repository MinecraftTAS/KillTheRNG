package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.network.NetHandlerPlayClient;

@Mixin(NetHandlerPlayClient.class)
public class MixinNetHandlerPlayClient {

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1919_1(Random rand) {
		return KillTheRNG.randomness.random_1919.nextFloat();
//		KillTheRNG.randomness.random_1919.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1920_2(Random rand) {
		return KillTheRNG.randomness.random_1920.nextFloat();
//		KillTheRNG.randomness.random_1920.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1921_3(Random rand) {
		return KillTheRNG.randomness.random_1921.nextFloat();
//		KillTheRNG.randomness.random_1921.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1922_4(Random rand) {
		return KillTheRNG.randomness.random_1922.nextFloat();
//		KillTheRNG.randomness.random_1922.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1923_5(Random rand) {
		return KillTheRNG.randomness.random_1923.nextGaussian();
//		KillTheRNG.randomness.random_1923.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1924_6(Random rand) {
		return KillTheRNG.randomness.random_1924.nextGaussian();
//		KillTheRNG.randomness.random_1924.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1925_7(Random rand) {
		return KillTheRNG.randomness.random_1925.nextGaussian();
//		KillTheRNG.randomness.random_1925.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1926_8(Random rand) {
		return KillTheRNG.randomness.random_1926.nextGaussian();
//		KillTheRNG.randomness.random_1926.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_1927_9(Random rand) {
		return KillTheRNG.randomness.random_1927.nextGaussian();
//		KillTheRNG.randomness.random_1927.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1928_10(Random rand) {
		return KillTheRNG.randomness.random_1928.nextGaussian();
//		KillTheRNG.randomness.random_1928.nextGaussian();
//		return rand.nextGaussian();
	}

}
