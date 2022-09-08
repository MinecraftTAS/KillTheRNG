package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAILookAtVillager.class)
public class MixinEntityAILookAtVillager{

	/**
	* If the entity should look at a villager
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiLookAtVillagerLook_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiLookAtVillagerLook.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiLookAtVillagerLook.nextInt(i);
//		return rand.nextInt(i);
	}


}