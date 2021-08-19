package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityCreeper;

@Mixin(EntityCreeper.class)
public class MixinEntityCreeper {
	@Redirect(method = "onDeath(Lnet/minecraft/util/DamageSource;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_830(Random rand, int i) {
		return KillTheRNG.randomness.random_830.nextInt(i);
	}

	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_831(Random rand) {
		return KillTheRNG.randomness.random_831.nextFloat();
	}

}
