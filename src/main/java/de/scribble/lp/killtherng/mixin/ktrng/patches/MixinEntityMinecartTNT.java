package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityMinecartTNT.class)
public class MixinEntityMinecartTNT{

	/**
	* null
	*/
	@Redirect(method = "explodeCart(D)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_819_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_819.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_819.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_819.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The time it takes to explode the minecart
	*/
	@Redirect(method = "killMinecart(Lnet/minecraft/util/DamageSource;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_minecartTNTFuse_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.minecartTNTFuse.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.minecartTNTFuse.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.minecartTNTFuse.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The time it takes to explode the minecart
	*/
	@Redirect(method = "killMinecart(Lnet/minecraft/util/DamageSource;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_minecartTNTFuse_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.minecartTNTFuse.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.minecartTNTFuse.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.minecartTNTFuse.nextInt(i);
			return rand.nextInt(i);
		}
	}


}