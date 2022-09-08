package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityPigZombie.class)
public class MixinEntityPigZombie{

	/**
	* Adds a random amount to the base anger level
	*/
	@Redirect(method = "becomeAngryAt(Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_pigZombieAngerLevel_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieAngerLevel.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieAngerLevel.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Adds a random amount to the base anger level
	*/
	@Redirect(method = "becomeAngryAt(Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_pigZombieAngerLevel_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieAngerLevel.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieAngerLevel.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of zombie piglin
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_pigZombieSound_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of zombie piglin
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_pigZombieSound_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.pigZombieSound.nextFloat();
//		return rand.nextFloat();
	}


}