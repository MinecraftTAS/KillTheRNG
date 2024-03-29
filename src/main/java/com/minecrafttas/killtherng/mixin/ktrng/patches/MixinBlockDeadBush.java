package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockDeadBush.class)
public class MixinBlockDeadBush{

	/**
	* Quantity of dead bush drop
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_deadBushDrop_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.deadBushDrop.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.deadBushDrop.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.deadBushDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}


}