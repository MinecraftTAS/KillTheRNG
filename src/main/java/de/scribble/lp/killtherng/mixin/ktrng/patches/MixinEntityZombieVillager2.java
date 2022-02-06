package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityZombieVillager;

@Mixin(EntityZombieVillager.class)
public class MixinEntityZombieVillager2 {

	/**
	* Pitch of zombie villager converting sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_zombieVillagerConvertionSound_1(Random rand) {
		return KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of zombie villager converting sound
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_zombieVillagerConvertionSound_2(Random rand) {
		return KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		KillTheRNG.randomness.zombieVillagerConvertionSound.nextFloat();
//		return rand.nextFloat();
	}

}
