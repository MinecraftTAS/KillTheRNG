package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityLiving;

@Mixin(EntityLiving.class)
public class MixinEntityLiving {
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_125(Random rand, int i) {
		return KillTheRNG.randomness.random_125.nextInt(i);
	}

	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_126(Random rand, int i) {
		return KillTheRNG.randomness.random_126.nextInt(i);
	}

	@Redirect(method = "getExperiencePoints(Lnet/minecraft/entity/player/EntityPlayer;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_127(Random rand, int i) {
		return KillTheRNG.randomness.random_127.nextInt(i);
	}

	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_128(Random rand) {
		return KillTheRNG.randomness.random_128.nextGaussian();
	}

	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_129(Random rand) {
		return KillTheRNG.randomness.random_129.nextGaussian();
	}

	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_130(Random rand) {
		return KillTheRNG.randomness.random_130.nextGaussian();
	}

	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_131(Random rand) {
		return KillTheRNG.randomness.random_131.nextFloat();
	}

	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_132(Random rand) {
		return KillTheRNG.randomness.random_132.nextFloat();
	}

	@Redirect(method = "spawnExplosionParticle()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_133(Random rand) {
		return KillTheRNG.randomness.random_133.nextFloat();
	}

	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_134(Random rand, int i) {
		return KillTheRNG.randomness.random_134.nextInt(i);
	}

	@Redirect(method = "dropFewItems(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_135(Random rand, int i) {
		return KillTheRNG.randomness.random_135.nextInt(i);
	}

	@Redirect(method = "updateEquipmentIfNeeded(Lnet/minecraft/entity/item/EntityItem;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_136(Random rand) {
		return KillTheRNG.randomness.random_136.nextFloat();
	}

	@Redirect(method = "despawnEntity()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_137(Random rand, int i) {
		return KillTheRNG.randomness.random_137.nextInt(i);
	}

	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_138(Random rand) {
		return KillTheRNG.randomness.random_138.nextFloat();
	}

	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_139(Random rand, int i) {
		return KillTheRNG.randomness.random_139.nextInt(i);
	}

	@Redirect(method = "dropEquipment(ZI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_140(Random rand, int i) {
		return KillTheRNG.randomness.random_140.nextInt(i);
	}

	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_141(Random rand) {
		return KillTheRNG.randomness.random_141.nextFloat();
	}

	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_142(Random rand, int i) {
		return KillTheRNG.randomness.random_142.nextInt(i);
	}

	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_143(Random rand) {
		return KillTheRNG.randomness.random_143.nextFloat();
	}

	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_144(Random rand) {
		return KillTheRNG.randomness.random_144.nextFloat();
	}

	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_145(Random rand) {
		return KillTheRNG.randomness.random_145.nextFloat();
	}

	@Redirect(method = "setEquipmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_146(Random rand) {
		return KillTheRNG.randomness.random_146.nextFloat();
	}

	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_147(Random rand) {
		return KillTheRNG.randomness.random_147.nextFloat();
	}

	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_148(Random rand, int i) {
		return KillTheRNG.randomness.random_148.nextInt(i);
	}

	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_149(Random rand) {
		return KillTheRNG.randomness.random_149.nextFloat();
	}

	@Redirect(method = "setEnchantmentBasedOnDifficulty(Lnet/minecraft/world/DifficultyInstance;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_150(Random rand, int i) {
		return KillTheRNG.randomness.random_150.nextInt(i);
	}

	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_151(Random rand) {
		return KillTheRNG.randomness.random_151.nextGaussian();
	}

	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_152(Random rand) {
		return KillTheRNG.randomness.random_152.nextFloat();
	}

}
