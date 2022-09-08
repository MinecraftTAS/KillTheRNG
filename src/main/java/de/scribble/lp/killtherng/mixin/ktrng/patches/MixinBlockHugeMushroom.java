package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockHugeMushroom.class)
public class MixinBlockHugeMushroom{

	/**
	* Quantity of huge mushroom drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_hugeMushroomDrop_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.hugeMushroomDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.hugeMushroomDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.hugeMushroomDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}


}