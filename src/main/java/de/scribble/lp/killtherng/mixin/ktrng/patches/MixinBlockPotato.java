package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPotato.class)
public class MixinBlockPotato{

	/**
	* Chance of posonous potato dropping
	*/
	@Redirect(method = "getDrops(Lnet/minecraft/util/NonNullList;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_poisonousPotatoDrop_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.poisonousPotatoDrop.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.poisonousPotatoDrop.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.poisonousPotatoDrop.nextInt(i);
			return rand.nextInt(i);
		}
	}


}