package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityMinecartTNT;

@Mixin(EntityMinecartTNT.class)
public class MixinEntityMinecartTNT {

	/**
	* null
	*/
	@Redirect(method = "killMinecart(Lnet/minecraft/util/DamageSource;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_817_0(Random rand, int i) {
		return KillTheRNG.randomness.random_817.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "killMinecart(Lnet/minecraft/util/DamageSource;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_818_1(Random rand, int i) {
		return KillTheRNG.randomness.random_818.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "explodeCart(D)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_819_0(Random rand) {
		return KillTheRNG.randomness.random_819.nextDouble();
	}

}
