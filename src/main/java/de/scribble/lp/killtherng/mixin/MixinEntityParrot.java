package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityParrot;

@Mixin(EntityParrot.class)
public class MixinEntityParrot {
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1013(Random rand, int i) {
		return KillTheRNG.randomness.random_1013.nextInt(i);
	}

	@Redirect(method = "playMimicSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1014(Random rand, int i) {
		return KillTheRNG.randomness.random_1014.nextInt(i);
	}

	@Redirect(method = "playMimicSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1015(Random rand, int i) {
		return KillTheRNG.randomness.random_1015.nextInt(i);
	}

	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1016(Random rand) {
		return KillTheRNG.randomness.random_1016.nextFloat();
	}

	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1017(Random rand) {
		return KillTheRNG.randomness.random_1017.nextFloat();
	}

	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1018(Random rand, int i) {
		return KillTheRNG.randomness.random_1018.nextInt(i);
	}

	@Redirect(method = "playAmbientSound(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1019(Random rand, int i) {
		return KillTheRNG.randomness.random_1019.nextInt(i);
	}

	@Redirect(method = "getAmbientSound(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1020(Random rand, int i) {
		return KillTheRNG.randomness.random_1020.nextInt(i);
	}

	@Redirect(method = "getAmbientSound(Ljava/util/Random;)Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_1021(Random rand, int i) {
		return KillTheRNG.randomness.random_1021.nextInt(i);
	}

	@Redirect(method = "getPitch(Ljava/util/Random;)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_1022(Random rand) {
		return KillTheRNG.randomness.random_1022.nextFloat();
	}

	@Redirect(method = "getPitch(Ljava/util/Random;)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_1023(Random rand) {
		return KillTheRNG.randomness.random_1023.nextFloat();
	}

}
