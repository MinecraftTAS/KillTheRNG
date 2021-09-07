package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityMule;

@Mixin(EntityMule.class)
public class MixinEntityMule {

	/**
	* Pitch of equipping sounds from a mule
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChestEquipSound_1(Random rand) {
		return KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of equipping sounds from a mule
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaChestEquipSound_2(Random rand) {
		return KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		return rand.nextFloat();
	}

}
