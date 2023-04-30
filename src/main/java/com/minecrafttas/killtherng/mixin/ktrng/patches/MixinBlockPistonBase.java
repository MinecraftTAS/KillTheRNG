package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPistonBase.class)
public class MixinBlockPistonBase{

	/**
	* Pitch of piston extend sounds
	*/
	@Redirect(method = "eventReceived(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_pistonSoundExtend_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.pistonSoundExtend.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.pistonSoundExtend.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.pistonSoundExtend.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of piston retract sounds
	*/
	@Redirect(method = "eventReceived(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_pistonSoundRetract_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.pistonSoundRetract.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.pistonSoundRetract.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.pistonSoundRetract.nextFloat();
			return rand.nextFloat();
		}
	}


}