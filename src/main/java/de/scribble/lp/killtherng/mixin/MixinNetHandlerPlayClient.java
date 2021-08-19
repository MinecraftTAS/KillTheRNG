package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.network.NetHandlerPlayClient;

@Mixin(NetHandlerPlayClient.class)
public class MixinNetHandlerPlayClient {
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1919(Random rand) {
		return KillTheRNG.randomness.random_1919.nextFloat();
	}

	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1920(Random rand) {
		return KillTheRNG.randomness.random_1920.nextFloat();
	}

	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1921(Random rand) {
		return KillTheRNG.randomness.random_1921.nextFloat();
	}

	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1922(Random rand) {
		return KillTheRNG.randomness.random_1922.nextFloat();
	}

	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1923(Random rand) {
		return KillTheRNG.randomness.random_1923.nextGaussian();
	}

	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1924(Random rand) {
		return KillTheRNG.randomness.random_1924.nextGaussian();
	}

	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1925(Random rand) {
		return KillTheRNG.randomness.random_1925.nextGaussian();
	}

	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1926(Random rand) {
		return KillTheRNG.randomness.random_1926.nextGaussian();
	}

	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_1927(Random rand) {
		return KillTheRNG.randomness.random_1927.nextGaussian();
	}

	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1928(Random rand) {
		return KillTheRNG.randomness.random_1928.nextGaussian();
	}

}
