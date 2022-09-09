package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityZombieVillager.class)
public class MixinEntityZombieVillager{

	/**
	* Pitch of zombie villager converting sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieVillagerConvertionSound_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.zombieVillagerConvertionSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.zombieVillagerConvertionSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.zombieVillagerConvertionSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of zombie villager converting sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_zombieVillagerConvertionSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.zombieVillagerConvertionSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.zombieVillagerConvertionSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.zombieVillagerConvertionSound.nextFloat();
			return rand.nextFloat();
		}
	}


}