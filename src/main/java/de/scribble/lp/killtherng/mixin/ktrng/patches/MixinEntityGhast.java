package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityGhast.class)
public class MixinEntityGhast{

	/**
	* Whether the ghast can spawn at this location
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ghastSpawning_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.ghastSpawning.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.ghastSpawning.nextInt(i);
//		return rand.nextInt(i);
	}


}