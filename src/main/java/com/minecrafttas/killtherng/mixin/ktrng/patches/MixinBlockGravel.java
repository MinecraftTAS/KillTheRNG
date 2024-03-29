package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockGravel.class)
public class MixinBlockGravel{

	/**
	* If gravel frops flint or itself
	*/
	@Redirect(method = "getItemDropped(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_gravelDropFlint_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.gravelDropFlint.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.gravelDropFlint.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.gravelDropFlint.nextInt(i);
			return rand.nextInt(i);
		}
	}


}