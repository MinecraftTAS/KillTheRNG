package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIFleeSun;

@Mixin(EntityAIFleeSun.class)
public class MixinEntityAIFleeSun {

	/**
	* null
	*/
	@Redirect(method = "findPossibleShelter()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_715_0(Random rand, int i) {
		return KillTheRNG.randomness.random_715.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findPossibleShelter()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_716_1(Random rand, int i) {
		return KillTheRNG.randomness.random_716.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findPossibleShelter()Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_717_2(Random rand, int i) {
		return KillTheRNG.randomness.random_717.nextInt(i);
	}

}
