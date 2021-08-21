package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityGhast;

@Mixin(EntityGhast.class)
public class MixinEntityGhast {

	/**
	* Whether the ghast can spawn at this location
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ghastSpawning_1(Random rand, int i) {
		return KillTheRNG.randomness.ghastSpawning.nextInt(i);
//		KillTheRNG.randomness.ghastSpawning.nextInt(i);
//		return rand.nextInt(i);
	}

}
