package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.util.datafix.fixes.ZombieProfToType.class)
public class MixinZombieProfToType{

	/**
	* null
	*/
	@Redirect(method = "fixTagCompound(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1264_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1264.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1264.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1264.nextInt(i);
			return rand.nextInt(i);
		}
	}


}