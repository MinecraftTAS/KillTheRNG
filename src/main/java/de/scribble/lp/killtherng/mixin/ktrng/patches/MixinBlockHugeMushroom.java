package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockHugeMushroom;

@Mixin(BlockHugeMushroom.class)
public class MixinBlockHugeMushroom {

	/**
	* Quantity of huge mushroom drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_hugeMushroomDrop_1(Random rand, int i) {
		return KillTheRNG.randomness.hugeMushroomDrop.nextInt(i);
//		KillTheRNG.randomness.hugeMushroomDrop.nextInt(i);
//		return rand.nextInt(i);
	}

}
