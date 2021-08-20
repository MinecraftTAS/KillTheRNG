package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityLivingBase;

@Mixin(EntityLivingBase.class)
public class MixinEntityLivingBase {

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_52_0(Random rand) {
		return KillTheRNG.randomness.random_52.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_53_1(Random rand) {
		return KillTheRNG.randomness.random_53.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_54_2(Random rand) {
		return KillTheRNG.randomness.random_54.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_55_3(Random rand) {
		return KillTheRNG.randomness.random_55.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_56_4(Random rand) {
		return KillTheRNG.randomness.random_56.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onEntityUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_57_5(Random rand) {
		return KillTheRNG.randomness.random_57.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_58_0(Random rand) {
		return KillTheRNG.randomness.random_58.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_59_1(Random rand) {
		return KillTheRNG.randomness.random_59.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_60_2(Random rand) {
		return KillTheRNG.randomness.random_60.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_61_3(Random rand) {
		return KillTheRNG.randomness.random_61.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_62_4(Random rand) {
		return KillTheRNG.randomness.random_62.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_63_5(Random rand) {
		return KillTheRNG.randomness.random_63.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "decreaseAirSupply(I)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_64_0(Random rand, int i) {
		return KillTheRNG.randomness.random_64.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_65_0(Random rand, int i) {
		return KillTheRNG.randomness.random_65.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_66_1(Random rand) {
		return KillTheRNG.randomness.random_66.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_67_2(Random rand, int i) {
		return KillTheRNG.randomness.random_67.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_68_3(Random rand) {
		return KillTheRNG.randomness.random_68.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_69_4(Random rand) {
		return KillTheRNG.randomness.random_69.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updatePotionEffects()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_70_5(Random rand) {
		return KillTheRNG.randomness.random_70.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_71_0(Random rand) {
		return KillTheRNG.randomness.random_71.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_72_0(Random rand) {
		return KillTheRNG.randomness.random_72.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_73_1(Random rand) {
		return KillTheRNG.randomness.random_73.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_74_2(Random rand) {
		return KillTheRNG.randomness.random_74.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderBrokenItemStack(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_75_3(Random rand) {
		return KillTheRNG.randomness.random_75.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "knockBack(Lnet/minecraft/entity/Entity;FDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_76_0(Random rand) {
		return KillTheRNG.randomness.random_76.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_77_0(Random rand) {
		return KillTheRNG.randomness.random_77.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_78_1(Random rand) {
		return KillTheRNG.randomness.random_78.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_79_2(Random rand) {
		return KillTheRNG.randomness.random_79.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_80_3(Random rand) {
		return KillTheRNG.randomness.random_80.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_81_4(Random rand) {
		return KillTheRNG.randomness.random_81.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_82_5(Random rand) {
		return KillTheRNG.randomness.random_82.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_83_6(Random rand) {
		return KillTheRNG.randomness.random_83.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_84_7(Random rand) {
		return KillTheRNG.randomness.random_84.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_85_0(Random rand) {
		return KillTheRNG.randomness.random_85.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_86_1(Random rand) {
		return KillTheRNG.randomness.random_86.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_87_2(Random rand) {
		return KillTheRNG.randomness.random_87.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "getSoundPitch()F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_88_3(Random rand) {
		return KillTheRNG.randomness.random_88.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "collideWithNearbyEntities()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_89_0(Random rand, int i) {
		return KillTheRNG.randomness.random_89.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "markVelocityChanged()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_90_0(Random rand) {
		return KillTheRNG.randomness.random_90.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_91_0(Random rand) {
		return KillTheRNG.randomness.random_91.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_92_1(Random rand) {
		return KillTheRNG.randomness.random_92.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_93_2(Random rand) {
		return KillTheRNG.randomness.random_93.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_94_3(Random rand) {
		return KillTheRNG.randomness.random_94.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_95_4(Random rand, int i) {
		return KillTheRNG.randomness.random_95.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_96_5(Random rand) {
		return KillTheRNG.randomness.random_96.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "updateItemUse(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_97_6(Random rand) {
		return KillTheRNG.randomness.random_97.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_98_0(Random rand) {
		return KillTheRNG.randomness.random_98.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_99_1(Random rand) {
		return KillTheRNG.randomness.random_99.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_100_2(Random rand) {
		return KillTheRNG.randomness.random_100.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_101_3(Random rand) {
		return KillTheRNG.randomness.random_101.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_102_4(Random rand) {
		return KillTheRNG.randomness.random_102.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "attemptTeleport(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_103_5(Random rand) {
		return KillTheRNG.randomness.random_103.nextDouble();
	}

}
