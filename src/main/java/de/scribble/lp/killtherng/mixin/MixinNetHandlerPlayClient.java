package de.scribble.lp.killtherng.mixin;

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
	public float redirect_random_1919_0(Random rand) {
		return KillTheRNG.randomness.random_1919.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1920_1(Random rand) {
		return KillTheRNG.randomness.random_1920.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1921_2(Random rand) {
		return KillTheRNG.randomness.random_1921.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1922_3(Random rand) {
		return KillTheRNG.randomness.random_1922.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1923_0(Random rand) {
		return KillTheRNG.randomness.random_1923.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1924_1(Random rand) {
		return KillTheRNG.randomness.random_1924.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1925_2(Random rand) {
		return KillTheRNG.randomness.random_1925.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1926_3(Random rand) {
		return KillTheRNG.randomness.random_1926.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_1927_4(Random rand) {
		return KillTheRNG.randomness.random_1927.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1928_5(Random rand) {
		return KillTheRNG.randomness.random_1928.nextGaussian();
	}

}
