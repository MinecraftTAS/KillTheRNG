package com.minecrafttas.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.RenderGlobal.class)
public class MixinRenderGlobal{

	/**
	* null
	*/
	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1275_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1275.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1275.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1275.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1276_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1276.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1276.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1276.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1277_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1277.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1277.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1277.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1278_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1278.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1278.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1278.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1279_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1279.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1279.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1279.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1280_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1280.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1280.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1280.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1281_7(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1281.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1281.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1281.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1282_8(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1282.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1282.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1282.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1283_9(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1283.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1283.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1283.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1284_10(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1284.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1284.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1284.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1285_11(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1285.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1285.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1285.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_1286_12(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1286.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1286.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1286.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1287_13(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1287.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1287.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1287.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1288_14(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1288.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1288.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1288.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1289_15(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1289.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1289.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1289.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1290_16(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1290.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1290.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1290.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 14))
	public float redirect_random_1291_17(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1291.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1291.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1291.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 15))
	public float redirect_random_1292_18(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1292.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1292.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1292.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 16))
	public float redirect_random_1293_19(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1293.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1293.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1293.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 17))
	public float redirect_random_1294_20(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1294.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1294.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1294.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 18))
	public float redirect_random_1295_21(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1295.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1295.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1295.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 19))
	public float redirect_random_1296_22(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1296.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1296.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1296.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 20))
	public float redirect_random_1297_23(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1297.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1297.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1297.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 21))
	public float redirect_random_1298_24(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1298.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1298.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1298.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 22))
	public float redirect_random_1299_25(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1299.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1299.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1299.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 23))
	public float redirect_random_1300_26(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1300.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1300.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1300.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 24))
	public float redirect_random_1301_27(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1301.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1301.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1301.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 25))
	public float redirect_random_1302_28(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1302.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1302.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1302.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 26))
	public float redirect_random_1303_29(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1303.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1303.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1303.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 27))
	public float redirect_random_1304_30(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1304.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1304.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1304.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 28))
	public float redirect_random_1305_31(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1305.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1305.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1305.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 29))
	public float redirect_random_1306_32(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1306.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1306.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1306.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 30))
	public float redirect_random_1307_33(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1307.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1307.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1307.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 31))
	public float redirect_random_1308_34(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1308.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1308.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1308.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 32))
	public float redirect_random_1309_35(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1309.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1309.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1309.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 33))
	public float redirect_random_1310_36(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1310.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1310.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1310.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 34))
	public float redirect_random_1311_37(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1311.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1311.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1311.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 35))
	public float redirect_random_1312_38(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1312.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1312.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1312.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 36))
	public float redirect_random_1313_39(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1313.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1313.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1313.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 37))
	public float redirect_random_1314_40(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1314.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1314.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1314.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 38))
	public float redirect_random_1315_41(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1315.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1315.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1315.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 39))
	public float redirect_random_1316_42(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1316.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1316.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1316.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1317_43(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1317.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1317.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1317.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1318_44(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1318.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1318.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1318.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1319_45(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1319.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1319.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1319.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1320_46(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1320.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1320.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1320.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1321_47(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1321.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1321.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1321.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1322_48(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1322.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1322.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1322.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1323_49(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1323.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1323.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1323.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1324_50(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1324.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1324.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1324.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1325_51(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1325.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1325.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1325.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_1326_52(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1326.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1326.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1326.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1327_53(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1327.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1327.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1327.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_1328_54(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1328.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1328.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1328.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_1329_55(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1329.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1329.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1329.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 40))
	public float redirect_random_1330_56(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1330.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1330.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1330.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 41))
	public float redirect_random_1331_57(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1331.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1331.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1331.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1332_58(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1332.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1332.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1332.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_random_1333_59(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1333.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1333.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1333.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_random_1334_60(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1334.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1334.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1334.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 42))
	public float redirect_random_1335_61(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1335.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1335.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1335.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 43))
	public float redirect_random_1336_62(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1336.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1336.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1336.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 44))
	public float redirect_random_1337_63(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1337.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1337.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1337.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 45))
	public float redirect_random_1338_64(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1338.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1338.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1338.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 46))
	public float redirect_random_1339_65(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1339.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1339.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1339.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_random_1340_66(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1340.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1340.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1340.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 47))
	public float redirect_random_1341_67(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1341.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1341.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1341.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 48))
	public float redirect_random_1342_68(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1342.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1342.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1342.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 49))
	public float redirect_random_1343_69(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1343.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1343.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1343.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 50))
	public float redirect_random_1344_70(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1344.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1344.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1344.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1270_71(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1270.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1270.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1270.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1271_72(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1271.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1271.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1271.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1272_73(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1272.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1272.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1272.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1273_74(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1273.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1273.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1273.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1274_75(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1274.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1274.nextDouble();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.clientRandom.random_1274.nextDouble();
			return rand.nextDouble();
		}
	}


}