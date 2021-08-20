package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityShulkerBullet;

@Mixin(EntityShulkerBullet.class)
public class MixinEntityShulkerBullet {

	/**
	* null
	*/
	@Redirect(method = "selectNextMoveDirection(Lnet/minecraft/util/EnumFacing$Axis;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_773_0(Random rand, int i) {
		return KillTheRNG.randomness.random_773.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "selectNextMoveDirection(Lnet/minecraft/util/EnumFacing$Axis;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_774_1(Random rand, int i) {
		return KillTheRNG.randomness.random_774.nextInt(i);
	}

}
