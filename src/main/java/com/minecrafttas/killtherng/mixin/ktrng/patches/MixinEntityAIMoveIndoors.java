package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIMoveIndoors.class)
public class MixinEntityAIMoveIndoors{

	/**
	* If the entity should run indoors
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiMoveIndoors_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiMoveIndoors.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiMoveIndoors.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiMoveIndoors.nextInt(i);
			return rand.nextInt(i);
		}
	}


}