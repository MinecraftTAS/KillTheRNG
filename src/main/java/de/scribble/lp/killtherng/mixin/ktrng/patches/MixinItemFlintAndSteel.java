package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemFlintAndSteel.class)
public class MixinItemFlintAndSteel{

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_569_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_569.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_569.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_569.nextFloat();
			return rand.nextFloat();
		}
	}


}