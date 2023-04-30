package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.MapGenCavesHell.class)
public class MixinMapGenCavesHell{

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addRoom(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_caveGenNether_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_caveGenNether_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_caveGenNether_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_caveGenNether_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_caveGenNether_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_caveGenNether_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_caveGenNether_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_caveGenNether_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_caveGenNether_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_caveGenNether_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_caveGenNether_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_caveGenNether_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_caveGenNether_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_caveGenNether_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_caveGenNether_15(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_caveGenNether_16(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_caveGenNether_17(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_caveGenNether_18(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_caveGenNether_19(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_caveGenNether_20(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_caveGenNether_21(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_caveGenNether_22(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_caveGenNether_23(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_caveGenNether_24(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_caveGenNether_25(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_caveGenNether_26(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_caveGenNether_27(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_caveGenNether_28(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_caveGenNether_29(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Cave Shape in the nether
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_caveGenNether_30(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.caveGenNether.nextLong();
				return rand.nextLong();
		}
	}


}