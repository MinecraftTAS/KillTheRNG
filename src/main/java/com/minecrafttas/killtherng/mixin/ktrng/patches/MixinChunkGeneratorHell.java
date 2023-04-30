package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.ChunkGeneratorHell.class)
public class MixinChunkGeneratorHell{

	/**
	* Terrain Bumpyness in the Nether
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_netherPerlinGen_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Terrain Bumpyness in the Nether
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_netherPerlinGen_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Terrain Bumpyness in the Nether
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_netherPerlinGen_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Terrain Bumpyness in the Nether
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_netherPerlinGen_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Terrain Bumpyness in the Nether
	*/
	@Redirect(method = "buildSurfaces(IILnet/minecraft/world/chunk/ChunkPrimer;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_netherPerlinGen_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Terrain Bumpyness in the Nether
	*/
	@Redirect(method = "generateChunk(II)Lnet/minecraft/world/chunk/Chunk;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_netherPerlinGen_6(Random rand, long seed) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.isEnabled()) {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPerlinGen.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_netherPopulationGen_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_netherPopulationGen_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_netherPopulationGen_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_netherPopulationGen_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_netherPopulationGen_11(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_netherPopulationGen_12(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_netherPopulationGen_13(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_netherPopulationGen_14(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_netherPopulationGen_15(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_netherPopulationGen_16(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_netherPopulationGen_17(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_netherPopulationGen_18(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_netherPopulationGen_19(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_netherPopulationGen_20(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_netherPopulationGen_21(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_netherPopulationGen_22(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_netherPopulationGen_23(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_netherPopulationGen_24(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_netherPopulationGen_25(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_netherPopulationGen_26(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_netherPopulationGen_27(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_netherPopulationGen_28(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
	public int redirect_netherPopulationGen_29(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_netherPopulationGen_30(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_netherPopulationGen_31(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_netherPopulationGen_32(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_netherPopulationGen_33(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_netherPopulationGen_34(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_netherPopulationGen_35(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_netherPopulationGen_36(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_netherPopulationGen_37(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_netherPopulationGen_38(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Nether population and structures
	*/
	@Redirect(method = "populate(II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_netherPopulationGen_39(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.netherPopulationGen.nextInt(i);
			return rand.nextInt(i);
		}
	}


}