package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraftforge.common.ForgeHooks$1")
public class MixinForgeHooks$1{

	/**
	* Amount of wheat seeds to drop
	*/
	@Redirect(method = "getStack(Ljava/util/Random;I)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_wheatSeedRandom_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.wheatSeedRandom.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.wheatSeedRandom.nextInt(i);
//		return rand.nextInt(i);
	}


}