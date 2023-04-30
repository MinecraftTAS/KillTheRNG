package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIVillagerMate.class)
public class MixinEntityAIVillagerMate{

	/**
	* If the villager should start mating
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiVillagerMateStart_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiVillagerMateStart.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiVillagerMateStart.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiVillagerMateStart.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Unused method???
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiVillagerMateSetEntityState_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiVillagerMateSetEntityState.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiVillagerMateSetEntityState.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.aiVillagerMateSetEntityState.nextInt(i);
			return rand.nextInt(i);
		}
	}


}