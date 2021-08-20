package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.effect.EntityLightningBolt;

@Mixin(EntityLightningBolt.class)
public class MixinEntityLightningBolt {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1393_0(Random rand) {
		return KillTheRNG.randomness.random_1393.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1394_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1394.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1395_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1395.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1396_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1396.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1397_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1397.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1398_0(Random rand) {
		return KillTheRNG.randomness.random_1398.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1399_1(Random rand) {
		return KillTheRNG.randomness.random_1399.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1400_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1400.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 3))
	public long redirect_random_1401_3(Random rand) {
		return KillTheRNG.randomness.random_1401.nextLong();
	}

}
