package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntitySnowman;

@Mixin(EntitySnowman.class)
public class MixinEntitySnowman {

	/**
	* Pitch of snowman shooting sound
	*/
	@Redirect(method = "attackEntityWithRangedAttack(Lnet/minecraft/entity/EntityLivingBase;F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_snowmanShootSound_1(Random rand) {
		return KillTheRNG.randomness.snowmanShootSound.nextFloat();
//		KillTheRNG.randomness.snowmanShootSound.nextFloat();
//		return rand.nextFloat();
	}

}
