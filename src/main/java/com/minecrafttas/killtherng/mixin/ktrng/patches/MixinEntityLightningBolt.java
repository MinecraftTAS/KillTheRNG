package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.effect.EntityLightningBolt.class)
public class MixinEntityLightningBolt{

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_lightningBoltVertex_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningBoltVertex_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lightningBoltVertex_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_lightningBoltVertex_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Rendering randomness
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_lightningBoltVertex_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltVertex.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_lightningBoltSound_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_lightningBoltSound_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lightningBoltSound_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of thunder and impact sounds
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_lightningBoltSound_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.lightningBoltSound.nextLong();
				return rand.nextLong();
		}
	}


}