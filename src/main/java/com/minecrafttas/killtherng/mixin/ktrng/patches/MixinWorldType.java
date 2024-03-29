package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.WorldType.class)
public class MixinWorldType{

	/**
	* Whether a slime can spawn here
	*/
	@Redirect(method = "handleSlimeSpawnReduction(Ljava/util/Random;Lnet/minecraft/world/World;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_slimeSpawnModifier_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.slimeSpawnModifier.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.slimeSpawnModifier.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.slimeSpawnModifier.nextInt(i);
			return rand.nextInt(i);
		}
	}


}