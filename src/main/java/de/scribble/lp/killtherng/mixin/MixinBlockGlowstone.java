package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockGlowstone;

@Mixin(BlockGlowstone.class)
public class MixinBlockGlowstone {
	@Redirect(method = "quantityDroppedWithBonus(ILjava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_436(Random rand, int i) {
		return KillTheRNG.randomness.random_436.nextInt(i);
	}

	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_437(Random rand, int i) {
		return KillTheRNG.randomness.random_437.nextInt(i);
	}

}
