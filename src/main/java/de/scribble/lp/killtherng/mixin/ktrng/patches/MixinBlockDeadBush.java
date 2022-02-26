package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockDeadBush;

@Mixin(BlockDeadBush.class)
public class MixinBlockDeadBush {

	/**
	* Quantity of dead bush drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_deadBushDrop_1(Random rand, int i) {
		return KillTheRNG.randomness.deadBushDrop.nextInt(i);
//		KillTheRNG.randomness.deadBushDrop.nextInt(i);
//		return rand.nextInt(i);
	}

}
