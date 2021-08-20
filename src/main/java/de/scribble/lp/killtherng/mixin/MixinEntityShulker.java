package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityShulker;

@Mixin(EntityShulker.class)
public class MixinEntityShulker {

	/**
	* null
	*/
	@Redirect(method = "tryTeleportToNewPosition()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_937_0(Random rand, int i) {
		return KillTheRNG.randomness.random_937.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryTeleportToNewPosition()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_938_1(Random rand, int i) {
		return KillTheRNG.randomness.random_938.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "tryTeleportToNewPosition()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_939_2(Random rand, int i) {
		return KillTheRNG.randomness.random_939.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_940_0(Random rand, int i) {
		return KillTheRNG.randomness.random_940.nextInt(i);
	}

}
