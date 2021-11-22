package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.WorldType;

@Mixin(WorldType.class)
public class MixinWorldType {

	/**
	* null
	*/
	@Redirect(method = "handleSlimeSpawnReduction(Ljava/util/Random;Lnet/minecraft/world/World;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_1473_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1473.nextInt(i);
//		KillTheRNG.randomness.random_1473.nextInt(i);
//		return rand.nextInt(i);
	}

}
