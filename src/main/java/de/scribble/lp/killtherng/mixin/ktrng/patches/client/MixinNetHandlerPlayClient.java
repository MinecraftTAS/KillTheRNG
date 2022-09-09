package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.network.NetHandlerPlayClient.class)
public class MixinNetHandlerPlayClient{

	/**
	* Pitch for sound when other players pickup an item
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_pickupItemPitch_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch for sound when other players pickup an item
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_pickupItemPitch_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch for sound when other players pickup an item
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_pickupItemPitch_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch for sound when other players pickup an item
	*/
	@Redirect(method = "handleCollectItem(Lnet/minecraft/network/play/server/SPacketCollectItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_pickupItemPitch_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.pickupItemPitch.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Offset for incoming packets with any particle
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_incomingParticleOffset_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Offset for incoming packets with any particle
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_incomingParticleOffset_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Offset for incoming packets with any particle
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_incomingParticleOffset_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Offset for incoming packets with any particle
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_incomingParticleOffset_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Offset for incoming packets with any particle
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_incomingParticleOffset_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Offset for incoming packets with any particle
	*/
	@Redirect(method = "handleParticles(Lnet/minecraft/network/play/server/SPacketParticles;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_incomingParticleOffset_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.incomingParticleOffset.nextGaussian();
			return rand.nextGaussian();
		}
	}


}