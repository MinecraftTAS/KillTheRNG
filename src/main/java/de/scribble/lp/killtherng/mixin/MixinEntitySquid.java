package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntitySquid;

@Mixin(EntitySquid.class)
public class MixinEntitySquid {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_952_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_953_1(Random rand) {
		return KillTheRNG.randomness.random_953.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_954_0(Random rand, int i) {
		return KillTheRNG.randomness.random_954.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_955_1(Random rand) {
		return KillTheRNG.randomness.random_955.nextFloat();
	}

}
