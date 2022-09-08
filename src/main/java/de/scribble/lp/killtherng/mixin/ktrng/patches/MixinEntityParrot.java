package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityParrot.class)
public class MixinEntityParrot{

	/**
	* If an imitated sound should play
	*/
	@Redirect(method = "getAmbientSound(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_parrotImitatedSoundChance_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.parrotImitatedSoundChance.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.parrotImitatedSoundChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* If an imitated sound should play
	*/
	@Redirect(method = "getAmbientSound(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_parrotImitatedSoundChance_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.parrotImitatedSoundChance.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.parrotImitatedSoundChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getPitch(Ljava/util/Random;)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1022_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1022.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1022.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getPitch(Ljava/util/Random;)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1023_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1023.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1023.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Sets the variant of the parrot when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_parrotInitialVariant_5(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.parrotInitialVariant.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.parrotInitialVariant.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playAmbientSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1019_6(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1019.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1019.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playMimicSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1014_7(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1014.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1014.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playMimicSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1015_8(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1015.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1015.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of parrot eating
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_parrotEatingSound_9(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.parrotEatingSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.parrotEatingSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of parrot eating
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_parrotEatingSound_10(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.parrotEatingSound.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.parrotEatingSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of parrot eating
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_parrotEatingSound_11(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.parrotEatingSound.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.parrotEatingSound.nextInt(i);
//		return rand.nextInt(i);
	}


}