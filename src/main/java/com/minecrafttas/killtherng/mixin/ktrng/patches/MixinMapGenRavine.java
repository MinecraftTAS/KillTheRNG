package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.MapGenRavine.class)
public class MixinMapGenRavine{

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ravineGeneration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_ravineGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_ravineGeneration_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_ravineGeneration_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_ravineGeneration_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_ravineGeneration_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_ravineGeneration_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_ravineGeneration_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_ravineGeneration_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_ravineGeneration_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_ravineGeneration_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_ravineGeneration_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "addTunnel(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_ravineGeneration_13(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_ravineGeneration_14(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_ravineGeneration_15(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_ravineGeneration_16(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_ravineGeneration_17(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_ravineGeneration_18(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_ravineGeneration_19(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_ravineGeneration_20(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_ravineGeneration_21(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_ravineGeneration_22(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ravine Generation
	*/
	@Redirect(method = "recursiveGenerate(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_ravineGeneration_23(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.ravineGeneration.nextLong();
				return rand.nextLong();
		}
	}


}