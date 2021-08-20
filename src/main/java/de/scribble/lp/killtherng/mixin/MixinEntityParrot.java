package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityParrot;

@Mixin(EntityParrot.class)
public class MixinEntityParrot {

	/**
	* null
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1013_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1013.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playMimicSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1014_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1014.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playMimicSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1015_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1015.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1016_0(Random rand) {
		return KillTheRNG.randomness.random_1016.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1017_1(Random rand) {
		return KillTheRNG.randomness.random_1017.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1018_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1018.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playAmbientSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1019_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1019.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getAmbientSound(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1020_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1020.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getAmbientSound(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1021_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1021.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getPitch(Ljava/util/Random;)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1022_0(Random rand) {
		return KillTheRNG.randomness.random_1022.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getPitch(Ljava/util/Random;)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1023_1(Random rand) {
		return KillTheRNG.randomness.random_1023.nextFloat();
	}

}
