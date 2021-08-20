package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.AbstractChestHorse;

@Mixin(AbstractChestHorse.class)
public class MixinAbstractChestHorse {

	/**
	* null
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_788_0(Random rand) {
		return KillTheRNG.randomness.random_788.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_789_1(Random rand) {
		return KillTheRNG.randomness.random_789.nextFloat();
	}

}