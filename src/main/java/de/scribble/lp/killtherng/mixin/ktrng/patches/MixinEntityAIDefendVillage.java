package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIDefendVillage.class)
public class MixinEntityAIDefendVillage{

	/**
	* If the entity should look for a player with low reputation as a target
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiDefendVillageCheckForEnemyPlayer_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiDefendVillageCheckForEnemyPlayer.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiDefendVillageCheckForEnemyPlayer.nextInt(i);
//		return rand.nextInt(i);
	}


}