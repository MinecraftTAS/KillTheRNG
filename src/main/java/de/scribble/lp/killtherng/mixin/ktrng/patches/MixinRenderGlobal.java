package de.scribble.lp.killtherng.mixin.ktrng.patches;
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
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1275.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1275.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1276_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1276.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1276.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1277_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1277.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1277.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1278_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1278.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1278.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1279_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1279.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1279.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1280_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1280.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1280.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1281_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1281.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1281.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1282_8(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1282.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1282.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1283_9(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1283.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1283.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1284_10(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1284.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1284.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1285_11(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1285.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1285.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_1286_12(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1286.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1286.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1287_13(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1287.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1287.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1288_14(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1288.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1288.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1289_15(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1289.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1289.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1290_16(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1290.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1290.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 14))
	public float redirect_random_1291_17(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1291.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1291.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 15))
	public float redirect_random_1292_18(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1292.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1292.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 16))
	public float redirect_random_1293_19(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1293.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1293.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 17))
	public float redirect_random_1294_20(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1294.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1294.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 18))
	public float redirect_random_1295_21(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1295.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1295.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 19))
	public float redirect_random_1296_22(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1296.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1296.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 20))
	public float redirect_random_1297_23(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1297.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1297.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 21))
	public float redirect_random_1298_24(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1298.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1298.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 22))
	public float redirect_random_1299_25(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1299.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1299.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 23))
	public float redirect_random_1300_26(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1300.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1300.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 24))
	public float redirect_random_1301_27(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1301.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1301.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 25))
	public float redirect_random_1302_28(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1302.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1302.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 26))
	public float redirect_random_1303_29(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1303.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1303.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 27))
	public float redirect_random_1304_30(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1304.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1304.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 28))
	public float redirect_random_1305_31(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1305.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1305.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 29))
	public float redirect_random_1306_32(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1306.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1306.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 30))
	public float redirect_random_1307_33(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1307.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1307.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 31))
	public float redirect_random_1308_34(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1308.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1308.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 32))
	public float redirect_random_1309_35(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1309.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1309.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 33))
	public float redirect_random_1310_36(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1310.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1310.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 34))
	public float redirect_random_1311_37(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1311.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1311.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 35))
	public float redirect_random_1312_38(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1312.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1312.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 36))
	public float redirect_random_1313_39(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1313.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1313.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 37))
	public float redirect_random_1314_40(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1314.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1314.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 38))
	public float redirect_random_1315_41(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1315.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1315.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 39))
	public float redirect_random_1316_42(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1316.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1316.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1317_43(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1317.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1317.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1318_44(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1318.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1318.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1319_45(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1319.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1319.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1320_46(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1320.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1320.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1321_47(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1321.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1321.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1322_48(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1322.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1322.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1323_49(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1323.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1323.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	public double redirect_random_1324_50(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1324.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1324.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1325_51(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1325.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1325.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_1326_52(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1326.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1326.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1327_53(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1327.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1327.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_1328_54(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1328.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1328.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_1329_55(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1329.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1329.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 40))
	public float redirect_random_1330_56(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1330.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1330.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 41))
	public float redirect_random_1331_57(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1331.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1331.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_1332_58(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1332.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1332.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 8))
	public double redirect_random_1333_59(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1333.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1333.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_random_1334_60(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1334.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1334.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 42))
	public float redirect_random_1335_61(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1335.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1335.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 43))
	public float redirect_random_1336_62(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1336.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1336.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 44))
	public float redirect_random_1337_63(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1337.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1337.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 45))
	public float redirect_random_1338_64(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1338.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1338.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 46))
	public float redirect_random_1339_65(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1339.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1339.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 9))
	public double redirect_random_1340_66(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1340.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1340.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 47))
	public float redirect_random_1341_67(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1341.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1341.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 48))
	public float redirect_random_1342_68(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1342.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1342.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 49))
	public float redirect_random_1343_69(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1343.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1343.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 50))
	public float redirect_random_1344_70(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1344.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1344.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1270_71(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1270.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1270.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1271_72(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1271.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1271.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1272_73(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1272.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1272.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1273_74(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1273.nextFloat();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1273.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1274_75(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1274.nextDouble();
		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1274.nextDouble();
		return rand.nextDouble();
	}


}