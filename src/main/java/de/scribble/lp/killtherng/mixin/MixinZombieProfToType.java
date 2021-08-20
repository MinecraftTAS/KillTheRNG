package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.util.datafix.fixes.ZombieProfToType;

@Mixin(ZombieProfToType.class)
public class MixinZombieProfToType {

	/**
	* null
	*/
	@Redirect(method = "fixTagCompound(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1264_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1264.nextInt(i);
	}

}
