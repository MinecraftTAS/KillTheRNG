package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.passive.EntityWolf$AIAvoidEntity")
public class MixinEntityWolf$AIAvoidEntity{

	/**
	* null
	*/
	@Redirect(method = "avoidLlama(Lnet/minecraft/entity/passive/EntityLlama;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_972_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_972.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_972.nextInt(i);
//		return rand.nextInt(i);
	}


}