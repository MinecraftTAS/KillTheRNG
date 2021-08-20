package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.passive.EntityWolf$AIAvoidEntity")
public class MixinEntityWolf$AIAvoidEntity {

	/**
	* null
	*/
	@Redirect(method = "avoidLlama(Lnet/minecraft/entity/passive/EntityLlama;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_972_0(Random rand, int i) {
		return KillTheRNG.randomness.random_972.nextInt(i);
	}

}
