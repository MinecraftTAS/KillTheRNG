package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.AbstractChestHorse.class)
public class MixinAbstractChestHorse{

	/**
	* Pitch of donkey chest sound
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_chestHorseSound_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.chestHorseSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.chestHorseSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.chestHorseSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of donkey chest sound
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_chestHorseSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.chestHorseSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.chestHorseSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.chestHorseSound.nextFloat();
			return rand.nextFloat();
		}
	}


}