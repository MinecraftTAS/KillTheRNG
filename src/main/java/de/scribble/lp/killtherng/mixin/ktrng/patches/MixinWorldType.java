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
	* Whether a slime can spawn here
	*/
	@Redirect(method = "handleSlimeSpawnReduction(Ljava/util/Random;Lnet/minecraft/world/World;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_slimeSpawnModifier_1(Random rand, int i) {
		return KillTheRNG.randomness.slimeSpawnModifier.nextInt(i);
//		KillTheRNG.randomness.slimeSpawnModifier.nextInt(i);
//		return rand.nextInt(i);
	}

}
