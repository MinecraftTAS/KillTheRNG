package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityEvoker;

@Mixin(EntityEvoker.AIWololoSpell.class)
public class MixinEntityEvoker$AIWololoSpell {

	/**
	* null
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_803_1(Random rand, int i) {
		return KillTheRNG.randomness.random_803.nextInt(i);
//		KillTheRNG.randomness.random_803.nextInt(i);
//		return rand.nextInt(i);
	}

}
