package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.template.BlockRotationProcessor.class)
public class MixinBlockRotationProcessor{

	/**
	* Rotation of block when being generated
	*/
	@Redirect(method = "processBlock(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;)Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blockRotationProcess_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockRotationProcess.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockRotationProcess.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.blockRotationProcess.nextFloat();
			return rand.nextFloat();
		}
	}


}