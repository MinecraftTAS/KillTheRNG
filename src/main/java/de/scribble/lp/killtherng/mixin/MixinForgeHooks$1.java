package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraftforge.common.ForgeHooks$1")
public class MixinForgeHooks$1 {

	/**
	* null
	*/
	@Redirect(method = "getStack(Ljava/util/Random;I)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_1268_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1268.nextInt(i);
	}

}
