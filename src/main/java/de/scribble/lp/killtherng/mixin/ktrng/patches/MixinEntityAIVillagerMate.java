package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIVillagerMate;

@Mixin(EntityAIVillagerMate.class)
public class MixinEntityAIVillagerMate {

	/**
	* If the villager should start mating
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiVillagerMateStart_1(Random rand, int i) {
		return KillTheRNG.randomness.aiVillagerMateStart.nextInt(i);
//		KillTheRNG.randomness.aiVillagerMateStart.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Unused method???
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiVillagerMateSetEntityState_2(Random rand, int i) {
		return KillTheRNG.randomness.aiVillagerMateSetEntityState.nextInt(i);
//		KillTheRNG.randomness.aiVillagerMateSetEntityState.nextInt(i);
//		return rand.nextInt(i);
	}

}
