package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockOre;

@Mixin(BlockOre.class)
public class MixinBlockOre {

	/**
	* null
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_318_1(Random rand, int i) {
		return KillTheRNG.randomness.random_318.nextInt(i);
//		KillTheRNG.randomness.random_318.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_319_2(Random rand, int i) {
		return KillTheRNG.randomness.random_319.nextInt(i);
//		KillTheRNG.randomness.random_319.nextInt(i);
//		return rand.nextInt(i);
	}

}
