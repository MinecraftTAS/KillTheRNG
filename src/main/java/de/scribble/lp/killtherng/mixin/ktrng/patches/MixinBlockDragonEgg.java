package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockDragonEgg;

@Mixin(BlockDragonEgg.class)
public class MixinBlockDragonEgg {

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_dragoneggTeleportPos_1(Random rand, int i) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_dragoneggTeleportPos_2(Random rand, int i) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_dragoneggTeleportPos_3(Random rand, int i) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_dragoneggTeleportPos_4(Random rand, int i) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_dragoneggTeleportPos_5(Random rand, int i) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_dragoneggTeleportPos_6(Random rand, int i) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		KillTheRNG.randomness.dragoneggTeleportPos.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_dragoneggTeleportPos_7(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_dragoneggTeleportPos_8(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextFloat();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_dragoneggTeleportPos_9(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextFloat();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_dragoneggTeleportPos_10(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextFloat();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_dragoneggTeleportPos_11(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_dragoneggTeleportPos_12(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_dragoneggTeleportPos_13(Random rand) {
		return KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		KillTheRNG.randomness.dragoneggTeleportPos.nextDouble();
//		return rand.nextDouble();
	}

}
