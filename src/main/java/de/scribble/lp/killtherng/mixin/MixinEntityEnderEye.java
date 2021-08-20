package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityEnderEye;

@Mixin(EntityEnderEye.class)
public class MixinEntityEnderEye {

	/**
	* null
	*/
	@Redirect(method = "moveTowards(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_652_0(Random rand, int i) {
		return KillTheRNG.randomness.random_652.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_653_0(Random rand) {
		return KillTheRNG.randomness.random_653.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_654_1(Random rand) {
		return KillTheRNG.randomness.random_654.nextDouble();
	}

}