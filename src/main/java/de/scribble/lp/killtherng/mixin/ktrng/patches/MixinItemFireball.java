package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemFireball.class)
public class MixinItemFireball{

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_659_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_659.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_659.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_659.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_660_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_660.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_660.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_660.nextFloat();
			return rand.nextFloat();
		}
	}


}