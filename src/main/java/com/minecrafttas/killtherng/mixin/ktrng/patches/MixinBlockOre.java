package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockOre.class)
public class MixinBlockOre{

	/**
	* How much lapis you get
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_oreLapisAmount_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.oreLapisAmount.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.oreLapisAmount.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.oreLapisAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How much extra ore drop you get with fortune
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_oreFortuneBonus_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.oreFortuneBonus.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.oreFortuneBonus.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.oreFortuneBonus.nextInt(i);
			return rand.nextInt(i);
		}
	}


}