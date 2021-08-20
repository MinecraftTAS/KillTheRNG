package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityMob;

@Mixin(EntityMob.class)
public class MixinEntityMob {

	/**
	* null
	*/
	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_454_0(Random rand) {
		return KillTheRNG.randomness.random_454.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "isValidLightLevel()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_455_0(Random rand, int i) {
		return KillTheRNG.randomness.random_455.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "isValidLightLevel()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_456_1(Random rand, int i) {
		return KillTheRNG.randomness.random_456.nextInt(i);
	}

}
