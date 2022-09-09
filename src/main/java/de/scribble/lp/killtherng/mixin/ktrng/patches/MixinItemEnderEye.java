package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemEnderEye.class)
public class MixinItemEnderEye{

	/**
	* null
	*/
	@Redirect(method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_651_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_651.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_651.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_651.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_649_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_649.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_649.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_649.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_650_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_650.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_650.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_650.nextFloat();
			return rand.nextFloat();
		}
	}


}