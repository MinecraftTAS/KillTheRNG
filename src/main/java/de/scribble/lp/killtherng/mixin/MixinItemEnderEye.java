package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemEnderEye;

@Mixin(ItemEnderEye.class)
public class MixinItemEnderEye {

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_649_0(Random rand) {
		return KillTheRNG.randomness.random_649.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUse(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_650_1(Random rand) {
		return KillTheRNG.randomness.random_650.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_651_0(Random rand) {
		return KillTheRNG.randomness.random_651.nextFloat();
	}

}
