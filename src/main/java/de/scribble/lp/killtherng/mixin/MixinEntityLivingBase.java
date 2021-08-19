package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityLivingBase;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_52(Random rand) {
		return KillTheRNG.randomness.random_52.nextFloat();
	}

	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_53(Random rand) {
		return KillTheRNG.randomness.random_53.nextFloat();
	}

	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_54(Random rand) {
		return KillTheRNG.randomness.random_54.nextFloat();
	}

	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_55(Random rand) {
		return KillTheRNG.randomness.random_55.nextFloat();
	}

	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_56(Random rand) {
		return KillTheRNG.randomness.random_56.nextFloat();
	}

	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_57(Random rand) {
		return KillTheRNG.randomness.random_57.nextFloat();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_58(Random rand) {
		return KillTheRNG.randomness.random_58.nextGaussian();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_59(Random rand) {
		return KillTheRNG.randomness.random_59.nextGaussian();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_60(Random rand) {
		return KillTheRNG.randomness.random_60.nextGaussian();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_61(Random rand) {
		return KillTheRNG.randomness.random_61.nextFloat();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_62(Random rand) {
		return KillTheRNG.randomness.random_62.nextFloat();
	}

	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_63(Random rand) {
		return KillTheRNG.randomness.random_63.nextFloat();
	}

	@Redirect(method = "decreaseAirSupply(I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_64(Random rand, int i) {
		return KillTheRNG.randomness.random_64.nextInt(i);
	}

	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_65(Random rand, int i) {
		return KillTheRNG.randomness.random_65.nextInt(i);
	}

	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_66(Random rand) {
		return KillTheRNG.randomness.random_66.nextBoolean();
	}

	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_67(Random rand, int i) {
		return KillTheRNG.randomness.random_67.nextInt(i);
	}

	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_68(Random rand) {
		return KillTheRNG.randomness.random_68.nextDouble();
	}

	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_69(Random rand) {
		return KillTheRNG.randomness.random_69.nextDouble();
	}

	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_70(Random rand) {
		return KillTheRNG.randomness.random_70.nextDouble();
	}

	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_71(Random rand) {
		return KillTheRNG.randomness.random_71.nextFloat();
	}

	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_72(Random rand) {
		return KillTheRNG.randomness.random_72.nextFloat();
	}

	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_73(Random rand) {
		return KillTheRNG.randomness.random_73.nextFloat();
	}

	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_74(Random rand) {
		return KillTheRNG.randomness.random_74.nextFloat();
	}

	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_75(Random rand) {
		return KillTheRNG.randomness.random_75.nextFloat();
	}

	@Redirect(method = "knockBack(Lnet/minecraft/entity/Entity;FDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_76(Random rand) {
		return KillTheRNG.randomness.random_76.nextDouble();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_77(Random rand) {
		return KillTheRNG.randomness.random_77.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_78(Random rand) {
		return KillTheRNG.randomness.random_78.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_79(Random rand) {
		return KillTheRNG.randomness.random_79.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_80(Random rand) {
		return KillTheRNG.randomness.random_80.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_81(Random rand) {
		return KillTheRNG.randomness.random_81.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_82(Random rand) {
		return KillTheRNG.randomness.random_82.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_83(Random rand) {
		return KillTheRNG.randomness.random_83.nextFloat();
	}

	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_84(Random rand) {
		return KillTheRNG.randomness.random_84.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_85(Random rand) {
		return KillTheRNG.randomness.random_85.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_86(Random rand) {
		return KillTheRNG.randomness.random_86.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_87(Random rand) {
		return KillTheRNG.randomness.random_87.nextFloat();
	}

	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_88(Random rand) {
		return KillTheRNG.randomness.random_88.nextFloat();
	}

	@Redirect(method = "collideWithNearbyEntities()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_89(Random rand, int i) {
		return KillTheRNG.randomness.random_89.nextInt(i);
	}

	@Redirect(method = "markVelocityChanged()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_90(Random rand) {
		return KillTheRNG.randomness.random_90.nextDouble();
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_91(Random rand) {
		return KillTheRNG.randomness.random_91.nextFloat();
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_92(Random rand) {
		return KillTheRNG.randomness.random_92.nextFloat();
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_93(Random rand) {
		return KillTheRNG.randomness.random_93.nextFloat();
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_94(Random rand) {
		return KillTheRNG.randomness.random_94.nextFloat();
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_95(Random rand, int i) {
		return KillTheRNG.randomness.random_95.nextInt(i);
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_96(Random rand) {
		return KillTheRNG.randomness.random_96.nextFloat();
	}

	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_97(Random rand) {
		return KillTheRNG.randomness.random_97.nextFloat();
	}

	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_98(Random rand) {
		return KillTheRNG.randomness.random_98.nextFloat();
	}

	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_99(Random rand) {
		return KillTheRNG.randomness.random_99.nextFloat();
	}

	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_100(Random rand) {
		return KillTheRNG.randomness.random_100.nextFloat();
	}

	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_101(Random rand) {
		return KillTheRNG.randomness.random_101.nextDouble();
	}

	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_102(Random rand) {
		return KillTheRNG.randomness.random_102.nextDouble();
	}

	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_103(Random rand) {
		return KillTheRNG.randomness.random_103.nextDouble();
	}

}
