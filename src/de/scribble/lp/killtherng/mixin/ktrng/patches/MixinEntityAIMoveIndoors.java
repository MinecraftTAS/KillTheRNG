package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIMoveIndoors;

@Mixin(EntityAIMoveIndoors.class)
public class MixinEntityAIMoveIndoors {

	/**
	* If the entity should run indoors
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiMoveIndoors_1(Random rand, int i) {
		return KillTheRNG.randomness.aiMoveIndoors.nextInt(i);
//		KillTheRNG.randomness.aiMoveIndoors.nextInt(i);
//		return rand.nextInt(i);
	}

}
