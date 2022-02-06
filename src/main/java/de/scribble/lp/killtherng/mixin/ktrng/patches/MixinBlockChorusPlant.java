package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockChorusPlant;

@Mixin(BlockChorusPlant.class)
public class MixinBlockChorusPlant {

	/**
	* How many chorus fruit drops when broken
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_chorusQuantityDropped_1(Random rand, int i) {
		return KillTheRNG.randomness.chorusQuantityDropped.nextInt(i);
//		KillTheRNG.randomness.chorusQuantityDropped.nextInt(i);
//		return rand.nextInt(i);
	}

}
