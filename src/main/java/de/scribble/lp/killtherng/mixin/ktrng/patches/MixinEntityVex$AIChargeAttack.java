package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.entity.monster.EntityVex$AIChargeAttack")
public class MixinEntityVex$AIChargeAttack{

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_804_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_804.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_804.nextInt(i);
//		return rand.nextInt(i);
	}


}