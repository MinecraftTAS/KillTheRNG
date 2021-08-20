package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemArmorStand;

@Mixin(ItemArmorStand.class)
public class MixinItemArmorStand {

	/**
	* null
	*/
	@Redirect(method = "applyRandomRotations(Lnet/minecraft/entity/item/EntityArmorStand;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_667_0(Random rand) {
		return KillTheRNG.randomness.random_667.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "applyRandomRotations(Lnet/minecraft/entity/item/EntityArmorStand;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_668_1(Random rand) {
		return KillTheRNG.randomness.random_668.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "applyRandomRotations(Lnet/minecraft/entity/item/EntityArmorStand;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_669_2(Random rand) {
		return KillTheRNG.randomness.random_669.nextFloat();
	}

}
