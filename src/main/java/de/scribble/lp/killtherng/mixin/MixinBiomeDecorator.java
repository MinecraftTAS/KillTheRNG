package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeDecorator;

@Mixin(BiomeDecorator.class)
public class MixinBiomeDecorator {

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1114_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1114.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1115_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1115.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1116_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1116.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1117_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1117.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1118_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1118.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1119_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1119.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_1120_6(Random rand) {
		return KillTheRNG.randomness.random_1120.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1121_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1121.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1122_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1122.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1123_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1123.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1124_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1124.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1125_11(Random rand, int i) {
		return KillTheRNG.randomness.random_1125.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1126_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1126.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1127_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1127.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1128_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1128.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1129_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1129.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_1130_16(Random rand, int i) {
		return KillTheRNG.randomness.random_1130.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_random_1131_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1131.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_random_1132_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1132.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_random_1133_19(Random rand, int i) {
		return KillTheRNG.randomness.random_1133.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
	public int redirect_random_1134_20(Random rand, int i) {
		return KillTheRNG.randomness.random_1134.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_random_1135_21(Random rand, int i) {
		return KillTheRNG.randomness.random_1135.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_random_1136_22(Random rand, int i) {
		return KillTheRNG.randomness.random_1136.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_random_1137_23(Random rand, int i) {
		return KillTheRNG.randomness.random_1137.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_random_1138_24(Random rand, int i) {
		return KillTheRNG.randomness.random_1138.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_random_1139_25(Random rand, int i) {
		return KillTheRNG.randomness.random_1139.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_random_1140_26(Random rand, int i) {
		return KillTheRNG.randomness.random_1140.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_random_1141_27(Random rand, int i) {
		return KillTheRNG.randomness.random_1141.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_random_1142_28(Random rand, int i) {
		return KillTheRNG.randomness.random_1142.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_random_1143_29(Random rand, int i) {
		return KillTheRNG.randomness.random_1143.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_random_1144_30(Random rand, int i) {
		return KillTheRNG.randomness.random_1144.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 31))
	public int redirect_random_1145_31(Random rand, int i) {
		return KillTheRNG.randomness.random_1145.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 32))
	public int redirect_random_1146_32(Random rand, int i) {
		return KillTheRNG.randomness.random_1146.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 33))
	public int redirect_random_1147_33(Random rand, int i) {
		return KillTheRNG.randomness.random_1147.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 34))
	public int redirect_random_1148_34(Random rand, int i) {
		return KillTheRNG.randomness.random_1148.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 35))
	public int redirect_random_1149_35(Random rand, int i) {
		return KillTheRNG.randomness.random_1149.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 36))
	public int redirect_random_1150_36(Random rand, int i) {
		return KillTheRNG.randomness.random_1150.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 37))
	public int redirect_random_1151_37(Random rand, int i) {
		return KillTheRNG.randomness.random_1151.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 38))
	public int redirect_random_1152_38(Random rand, int i) {
		return KillTheRNG.randomness.random_1152.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 39))
	public int redirect_random_1153_39(Random rand, int i) {
		return KillTheRNG.randomness.random_1153.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 40))
	public int redirect_random_1154_40(Random rand, int i) {
		return KillTheRNG.randomness.random_1154.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 41))
	public int redirect_random_1155_41(Random rand, int i) {
		return KillTheRNG.randomness.random_1155.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 42))
	public int redirect_random_1156_42(Random rand, int i) {
		return KillTheRNG.randomness.random_1156.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 43))
	public int redirect_random_1157_43(Random rand, int i) {
		return KillTheRNG.randomness.random_1157.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 44))
	public int redirect_random_1158_44(Random rand, int i) {
		return KillTheRNG.randomness.random_1158.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 45))
	public int redirect_random_1159_45(Random rand, int i) {
		return KillTheRNG.randomness.random_1159.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 46))
	public int redirect_random_1160_46(Random rand, int i) {
		return KillTheRNG.randomness.random_1160.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 47))
	public int redirect_random_1161_47(Random rand, int i) {
		return KillTheRNG.randomness.random_1161.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 48))
	public int redirect_random_1162_48(Random rand, int i) {
		return KillTheRNG.randomness.random_1162.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 49))
	public int redirect_random_1163_49(Random rand, int i) {
		return KillTheRNG.randomness.random_1163.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 50))
	public int redirect_random_1164_50(Random rand, int i) {
		return KillTheRNG.randomness.random_1164.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 51))
	public int redirect_random_1165_51(Random rand, int i) {
		return KillTheRNG.randomness.random_1165.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 52))
	public int redirect_random_1166_52(Random rand, int i) {
		return KillTheRNG.randomness.random_1166.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 53))
	public int redirect_random_1167_53(Random rand, int i) {
		return KillTheRNG.randomness.random_1167.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 54))
	public int redirect_random_1168_54(Random rand, int i) {
		return KillTheRNG.randomness.random_1168.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 55))
	public int redirect_random_1169_55(Random rand, int i) {
		return KillTheRNG.randomness.random_1169.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 56))
	public int redirect_random_1170_56(Random rand, int i) {
		return KillTheRNG.randomness.random_1170.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 57))
	public int redirect_random_1171_57(Random rand, int i) {
		return KillTheRNG.randomness.random_1171.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 58))
	public int redirect_random_1172_58(Random rand, int i) {
		return KillTheRNG.randomness.random_1172.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 59))
	public int redirect_random_1173_59(Random rand, int i) {
		return KillTheRNG.randomness.random_1173.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1174_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1174.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1175_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1175.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1176_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1176.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1177_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1177.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1178_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1178.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1179_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1179.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1180_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1180.nextInt(i);
	}

}
