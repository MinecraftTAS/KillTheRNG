package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.RenderGlobal;

@Mixin(RenderGlobal.class)
public class MixinRenderGlobal {

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1270_0(Random rand) {
		return KillTheRNG.randomness.random_1270.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1271_1(Random rand) {
		return KillTheRNG.randomness.random_1271.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1272_2(Random rand) {
		return KillTheRNG.randomness.random_1272.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1273_3(Random rand) {
		return KillTheRNG.randomness.random_1273.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "renderStars(Lnet/minecraft/client/renderer/BufferBuilder;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1274_4(Random rand) {
		return KillTheRNG.randomness.random_1274.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1275_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1275.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "calculateParticleLevel(Z)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1276_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1276.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1277_0(Random rand) {
		return KillTheRNG.randomness.random_1277.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1278_1(Random rand) {
		return KillTheRNG.randomness.random_1278.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1279_2(Random rand) {
		return KillTheRNG.randomness.random_1279.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1280_3(Random rand) {
		return KillTheRNG.randomness.random_1280.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1281_4(Random rand) {
		return KillTheRNG.randomness.random_1281.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_1282_5(Random rand) {
		return KillTheRNG.randomness.random_1282.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1283_6(Random rand) {
		return KillTheRNG.randomness.random_1283.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_1284_7(Random rand) {
		return KillTheRNG.randomness.random_1284.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_1285_8(Random rand) {
		return KillTheRNG.randomness.random_1285.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	public float redirect_random_1286_9(Random rand) {
		return KillTheRNG.randomness.random_1286.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	public float redirect_random_1287_10(Random rand) {
		return KillTheRNG.randomness.random_1287.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	public float redirect_random_1288_11(Random rand) {
		return KillTheRNG.randomness.random_1288.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 12))
	public float redirect_random_1289_12(Random rand) {
		return KillTheRNG.randomness.random_1289.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 13))
	public float redirect_random_1290_13(Random rand) {
		return KillTheRNG.randomness.random_1290.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 14))
	public float redirect_random_1291_14(Random rand) {
		return KillTheRNG.randomness.random_1291.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 15))
	public float redirect_random_1292_15(Random rand) {
		return KillTheRNG.randomness.random_1292.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 16))
	public float redirect_random_1293_16(Random rand) {
		return KillTheRNG.randomness.random_1293.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 17))
	public float redirect_random_1294_17(Random rand) {
		return KillTheRNG.randomness.random_1294.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 18))
	public float redirect_random_1295_18(Random rand) {
		return KillTheRNG.randomness.random_1295.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 19))
	public float redirect_random_1296_19(Random rand) {
		return KillTheRNG.randomness.random_1296.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 20))
	public float redirect_random_1297_20(Random rand) {
		return KillTheRNG.randomness.random_1297.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 21))
	public float redirect_random_1298_21(Random rand) {
		return KillTheRNG.randomness.random_1298.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 22))
	public float redirect_random_1299_22(Random rand) {
		return KillTheRNG.randomness.random_1299.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 23))
	public float redirect_random_1300_23(Random rand) {
		return KillTheRNG.randomness.random_1300.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 24))
	public float redirect_random_1301_24(Random rand) {
		return KillTheRNG.randomness.random_1301.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 25))
	public float redirect_random_1302_25(Random rand) {
		return KillTheRNG.randomness.random_1302.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 26))
	public float redirect_random_1303_26(Random rand) {
		return KillTheRNG.randomness.random_1303.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 27))
	public float redirect_random_1304_27(Random rand) {
		return KillTheRNG.randomness.random_1304.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 28))
	public float redirect_random_1305_28(Random rand) {
		return KillTheRNG.randomness.random_1305.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 29))
	public float redirect_random_1306_29(Random rand) {
		return KillTheRNG.randomness.random_1306.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 30))
	public float redirect_random_1307_30(Random rand) {
		return KillTheRNG.randomness.random_1307.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 31))
	public float redirect_random_1308_31(Random rand) {
		return KillTheRNG.randomness.random_1308.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 32))
	public float redirect_random_1309_32(Random rand) {
		return KillTheRNG.randomness.random_1309.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 33))
	public float redirect_random_1310_33(Random rand) {
		return KillTheRNG.randomness.random_1310.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 34))
	public float redirect_random_1311_34(Random rand) {
		return KillTheRNG.randomness.random_1311.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 35))
	public float redirect_random_1312_35(Random rand) {
		return KillTheRNG.randomness.random_1312.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 36))
	public float redirect_random_1313_36(Random rand) {
		return KillTheRNG.randomness.random_1313.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 37))
	public float redirect_random_1314_37(Random rand) {
		return KillTheRNG.randomness.random_1314.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 38))
	public float redirect_random_1315_38(Random rand) {
		return KillTheRNG.randomness.random_1315.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 39))
	public float redirect_random_1316_39(Random rand) {
		return KillTheRNG.randomness.random_1316.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 40))
	public double redirect_random_1317_40(Random rand) {
		return KillTheRNG.randomness.random_1317.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 41))
	public double redirect_random_1318_41(Random rand) {
		return KillTheRNG.randomness.random_1318.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 42))
	public double redirect_random_1319_42(Random rand) {
		return KillTheRNG.randomness.random_1319.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 43))
	public double redirect_random_1320_43(Random rand) {
		return KillTheRNG.randomness.random_1320.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 44))
	public double redirect_random_1321_44(Random rand) {
		return KillTheRNG.randomness.random_1321.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 45))
	public double redirect_random_1322_45(Random rand) {
		return KillTheRNG.randomness.random_1322.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 46))
	public double redirect_random_1323_46(Random rand) {
		return KillTheRNG.randomness.random_1323.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 47))
	public double redirect_random_1324_47(Random rand) {
		return KillTheRNG.randomness.random_1324.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 48))
	public double redirect_random_1325_48(Random rand) {
		return KillTheRNG.randomness.random_1325.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 49))
	public double redirect_random_1326_49(Random rand) {
		return KillTheRNG.randomness.random_1326.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 50))
	public double redirect_random_1327_50(Random rand) {
		return KillTheRNG.randomness.random_1327.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 51))
	public double redirect_random_1328_51(Random rand) {
		return KillTheRNG.randomness.random_1328.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 52))
	public double redirect_random_1329_52(Random rand) {
		return KillTheRNG.randomness.random_1329.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 53))
	public float redirect_random_1330_53(Random rand) {
		return KillTheRNG.randomness.random_1330.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 54))
	public float redirect_random_1331_54(Random rand) {
		return KillTheRNG.randomness.random_1331.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 55))
	public double redirect_random_1332_55(Random rand) {
		return KillTheRNG.randomness.random_1332.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 56))
	public double redirect_random_1333_56(Random rand) {
		return KillTheRNG.randomness.random_1333.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 57))
	public double redirect_random_1334_57(Random rand) {
		return KillTheRNG.randomness.random_1334.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 58))
	public float redirect_random_1335_58(Random rand) {
		return KillTheRNG.randomness.random_1335.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 59))
	public float redirect_random_1336_59(Random rand) {
		return KillTheRNG.randomness.random_1336.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 60))
	public float redirect_random_1337_60(Random rand) {
		return KillTheRNG.randomness.random_1337.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 61))
	public float redirect_random_1338_61(Random rand) {
		return KillTheRNG.randomness.random_1338.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 62))
	public float redirect_random_1339_62(Random rand) {
		return KillTheRNG.randomness.random_1339.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 63))
	public double redirect_random_1340_63(Random rand) {
		return KillTheRNG.randomness.random_1340.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 64))
	public float redirect_random_1341_64(Random rand) {
		return KillTheRNG.randomness.random_1341.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 65))
	public float redirect_random_1342_65(Random rand) {
		return KillTheRNG.randomness.random_1342.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 66))
	public float redirect_random_1343_66(Random rand) {
		return KillTheRNG.randomness.random_1343.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "playEvent(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 67))
	public float redirect_random_1344_67(Random rand) {
		return KillTheRNG.randomness.random_1344.nextFloat();
	}

}
