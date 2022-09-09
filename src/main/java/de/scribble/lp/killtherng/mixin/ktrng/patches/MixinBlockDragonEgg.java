package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockDragonEgg.class)
public class MixinBlockDragonEgg{

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_dragoneggTeleportPos_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_dragoneggTeleportPos_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_dragoneggTeleportPos_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_dragoneggTeleportPos_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_dragoneggTeleportPos_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_dragoneggTeleportPos_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_dragoneggTeleportPos_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_dragoneggTeleportPos_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_dragoneggTeleportPos_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_dragoneggTeleportPos_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_dragoneggTeleportPos_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_dragoneggTeleportPos_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* The position of the dragon egg after the player interacts with it
	*/
	@Redirect(method = "teleport(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_dragoneggTeleportPos_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.dragoneggTeleportPos.nextDouble();
			return rand.nextDouble();
		}
	}


}