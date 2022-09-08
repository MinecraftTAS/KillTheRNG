package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityShulkerBullet.class)
public class MixinEntityShulkerBullet{

	/**
	* What direction the bullet should go if no target is specified
	*/
	@Redirect(method = "selectNextMoveDirection(Lnet/minecraft/util/EnumFacing$Axis;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_shulkerbulletRandomDirection_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.shulkerbulletRandomDirection.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.shulkerbulletRandomDirection.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.shulkerbulletRandomDirection.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* What direction the bullet should go if no target is specified
	*/
	@Redirect(method = "selectNextMoveDirection(Lnet/minecraft/util/EnumFacing$Axis;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_shulkerbulletRandomDirection_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.shulkerbulletRandomDirection.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.shulkerbulletRandomDirection.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.shulkerbulletRandomDirection.nextInt(i);
			return rand.nextInt(i);
		}
	}


}