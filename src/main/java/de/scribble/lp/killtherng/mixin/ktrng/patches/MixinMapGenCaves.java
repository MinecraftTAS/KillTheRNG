package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.MapGenCaves.class)
public class MixinMapGenCaves{

	/**
	* Cave Generation
	*/
	@Redirect(method = "addRoom(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_caveGeneration_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_caveGeneration_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_caveGeneration_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_caveGeneration_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_caveGeneration_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_caveGeneration_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_caveGeneration_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_caveGeneration_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_caveGeneration_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_caveGeneration_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_caveGeneration_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_caveGeneration_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_caveGeneration_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_caveGeneration_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_caveGeneration_15(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_caveGeneration_16(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_caveGeneration_17(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_caveGeneration_18(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_caveGeneration_19(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_caveGeneration_20(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_caveGeneration_21(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_caveGeneration_22(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_caveGeneration_23(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_caveGeneration_24(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_caveGeneration_25(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_caveGeneration_26(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_caveGeneration_27(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_caveGeneration_28(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_caveGeneration_29(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_caveGeneration_30(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_caveGeneration_31(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_caveGeneration_32(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_caveGeneration_33(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_caveGeneration_34(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.caveGeneration.nextLong();
				return rand.nextLong();
		}
	}


}