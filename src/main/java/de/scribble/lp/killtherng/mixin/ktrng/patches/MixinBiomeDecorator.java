package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public int redirect_random_1114_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1114.nextInt(i);
//		KillTheRNG.randomness.random_1114.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1115_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1115.nextInt(i);
//		KillTheRNG.randomness.random_1115.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1116_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1116.nextInt(i);
//		KillTheRNG.randomness.random_1116.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1117_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1117.nextInt(i);
//		KillTheRNG.randomness.random_1117.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1118_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1118.nextInt(i);
//		KillTheRNG.randomness.random_1118.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1119_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1119.nextInt(i);
//		KillTheRNG.randomness.random_1119.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1120_7(Random rand) {
		return KillTheRNG.randomness.random_1120.nextFloat();
//		KillTheRNG.randomness.random_1120.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1121_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1121.nextInt(i);
//		KillTheRNG.randomness.random_1121.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1122_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1122.nextInt(i);
//		KillTheRNG.randomness.random_1122.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1123_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1123.nextInt(i);
//		KillTheRNG.randomness.random_1123.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1124_11(Random rand, int i) {
		return KillTheRNG.randomness.random_1124.nextInt(i);
//		KillTheRNG.randomness.random_1124.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1125_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1125.nextInt(i);
//		KillTheRNG.randomness.random_1125.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1126_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1126.nextInt(i);
//		KillTheRNG.randomness.random_1126.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1127_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1127.nextInt(i);
//		KillTheRNG.randomness.random_1127.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1128_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1128.nextInt(i);
//		KillTheRNG.randomness.random_1128.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1129_16(Random rand, int i) {
		return KillTheRNG.randomness.random_1129.nextInt(i);
//		KillTheRNG.randomness.random_1129.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 15))
	public int redirect_random_1130_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1130.nextInt(i);
//		KillTheRNG.randomness.random_1130.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 16))
	public int redirect_random_1131_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1131.nextInt(i);
//		KillTheRNG.randomness.random_1131.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 17))
	public int redirect_random_1132_19(Random rand, int i) {
		return KillTheRNG.randomness.random_1132.nextInt(i);
//		KillTheRNG.randomness.random_1132.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 18))
	public int redirect_random_1133_20(Random rand, int i) {
		return KillTheRNG.randomness.random_1133.nextInt(i);
//		KillTheRNG.randomness.random_1133.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 19))
	public int redirect_random_1134_21(Random rand, int i) {
		return KillTheRNG.randomness.random_1134.nextInt(i);
//		KillTheRNG.randomness.random_1134.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
	public int redirect_random_1135_22(Random rand, int i) {
		return KillTheRNG.randomness.random_1135.nextInt(i);
//		KillTheRNG.randomness.random_1135.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 21))
	public int redirect_random_1136_23(Random rand, int i) {
		return KillTheRNG.randomness.random_1136.nextInt(i);
//		KillTheRNG.randomness.random_1136.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 22))
	public int redirect_random_1137_24(Random rand, int i) {
		return KillTheRNG.randomness.random_1137.nextInt(i);
//		KillTheRNG.randomness.random_1137.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 23))
	public int redirect_random_1138_25(Random rand, int i) {
		return KillTheRNG.randomness.random_1138.nextInt(i);
//		KillTheRNG.randomness.random_1138.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 24))
	public int redirect_random_1139_26(Random rand, int i) {
		return KillTheRNG.randomness.random_1139.nextInt(i);
//		KillTheRNG.randomness.random_1139.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 25))
	public int redirect_random_1140_27(Random rand, int i) {
		return KillTheRNG.randomness.random_1140.nextInt(i);
//		KillTheRNG.randomness.random_1140.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 26))
	public int redirect_random_1141_28(Random rand, int i) {
		return KillTheRNG.randomness.random_1141.nextInt(i);
//		KillTheRNG.randomness.random_1141.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 27))
	public int redirect_random_1142_29(Random rand, int i) {
		return KillTheRNG.randomness.random_1142.nextInt(i);
//		KillTheRNG.randomness.random_1142.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 28))
	public int redirect_random_1143_30(Random rand, int i) {
		return KillTheRNG.randomness.random_1143.nextInt(i);
//		KillTheRNG.randomness.random_1143.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 29))
	public int redirect_random_1144_31(Random rand, int i) {
		return KillTheRNG.randomness.random_1144.nextInt(i);
//		KillTheRNG.randomness.random_1144.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 30))
	public int redirect_random_1145_32(Random rand, int i) {
		return KillTheRNG.randomness.random_1145.nextInt(i);
//		KillTheRNG.randomness.random_1145.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 31))
	public int redirect_random_1146_33(Random rand, int i) {
		return KillTheRNG.randomness.random_1146.nextInt(i);
//		KillTheRNG.randomness.random_1146.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 32))
	public int redirect_random_1147_34(Random rand, int i) {
		return KillTheRNG.randomness.random_1147.nextInt(i);
//		KillTheRNG.randomness.random_1147.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 33))
	public int redirect_random_1148_35(Random rand, int i) {
		return KillTheRNG.randomness.random_1148.nextInt(i);
//		KillTheRNG.randomness.random_1148.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 34))
	public int redirect_random_1149_36(Random rand, int i) {
		return KillTheRNG.randomness.random_1149.nextInt(i);
//		KillTheRNG.randomness.random_1149.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 35))
	public int redirect_random_1150_37(Random rand, int i) {
		return KillTheRNG.randomness.random_1150.nextInt(i);
//		KillTheRNG.randomness.random_1150.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 36))
	public int redirect_random_1151_38(Random rand, int i) {
		return KillTheRNG.randomness.random_1151.nextInt(i);
//		KillTheRNG.randomness.random_1151.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 37))
	public int redirect_random_1152_39(Random rand, int i) {
		return KillTheRNG.randomness.random_1152.nextInt(i);
//		KillTheRNG.randomness.random_1152.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 38))
	public int redirect_random_1153_40(Random rand, int i) {
		return KillTheRNG.randomness.random_1153.nextInt(i);
//		KillTheRNG.randomness.random_1153.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 39))
	public int redirect_random_1154_41(Random rand, int i) {
		return KillTheRNG.randomness.random_1154.nextInt(i);
//		KillTheRNG.randomness.random_1154.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 40))
	public int redirect_random_1155_42(Random rand, int i) {
		return KillTheRNG.randomness.random_1155.nextInt(i);
//		KillTheRNG.randomness.random_1155.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 41))
	public int redirect_random_1156_43(Random rand, int i) {
		return KillTheRNG.randomness.random_1156.nextInt(i);
//		KillTheRNG.randomness.random_1156.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 42))
	public int redirect_random_1157_44(Random rand, int i) {
		return KillTheRNG.randomness.random_1157.nextInt(i);
//		KillTheRNG.randomness.random_1157.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 43))
	public int redirect_random_1158_45(Random rand, int i) {
		return KillTheRNG.randomness.random_1158.nextInt(i);
//		KillTheRNG.randomness.random_1158.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 44))
	public int redirect_random_1159_46(Random rand, int i) {
		return KillTheRNG.randomness.random_1159.nextInt(i);
//		KillTheRNG.randomness.random_1159.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 45))
	public int redirect_random_1160_47(Random rand, int i) {
		return KillTheRNG.randomness.random_1160.nextInt(i);
//		KillTheRNG.randomness.random_1160.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 46))
	public int redirect_random_1161_48(Random rand, int i) {
		return KillTheRNG.randomness.random_1161.nextInt(i);
//		KillTheRNG.randomness.random_1161.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 47))
	public int redirect_random_1162_49(Random rand, int i) {
		return KillTheRNG.randomness.random_1162.nextInt(i);
//		KillTheRNG.randomness.random_1162.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 48))
	public int redirect_random_1163_50(Random rand, int i) {
		return KillTheRNG.randomness.random_1163.nextInt(i);
//		KillTheRNG.randomness.random_1163.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 49))
	public int redirect_random_1164_51(Random rand, int i) {
		return KillTheRNG.randomness.random_1164.nextInt(i);
//		KillTheRNG.randomness.random_1164.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 50))
	public int redirect_random_1165_52(Random rand, int i) {
		return KillTheRNG.randomness.random_1165.nextInt(i);
//		KillTheRNG.randomness.random_1165.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 51))
	public int redirect_random_1166_53(Random rand, int i) {
		return KillTheRNG.randomness.random_1166.nextInt(i);
//		KillTheRNG.randomness.random_1166.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 52))
	public int redirect_random_1167_54(Random rand, int i) {
		return KillTheRNG.randomness.random_1167.nextInt(i);
//		KillTheRNG.randomness.random_1167.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 53))
	public int redirect_random_1168_55(Random rand, int i) {
		return KillTheRNG.randomness.random_1168.nextInt(i);
//		KillTheRNG.randomness.random_1168.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 54))
	public int redirect_random_1169_56(Random rand, int i) {
		return KillTheRNG.randomness.random_1169.nextInt(i);
//		KillTheRNG.randomness.random_1169.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 55))
	public int redirect_random_1170_57(Random rand, int i) {
		return KillTheRNG.randomness.random_1170.nextInt(i);
//		KillTheRNG.randomness.random_1170.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 56))
	public int redirect_random_1171_58(Random rand, int i) {
		return KillTheRNG.randomness.random_1171.nextInt(i);
//		KillTheRNG.randomness.random_1171.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 57))
	public int redirect_random_1172_59(Random rand, int i) {
		return KillTheRNG.randomness.random_1172.nextInt(i);
//		KillTheRNG.randomness.random_1172.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genDecorations(Lnet/minecraft/world/biome/Biome;Lnet/minecraft/world/World;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 58))
	public int redirect_random_1173_60(Random rand, int i) {
		return KillTheRNG.randomness.random_1173.nextInt(i);
//		KillTheRNG.randomness.random_1173.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1174_61(Random rand, int i) {
		return KillTheRNG.randomness.random_1174.nextInt(i);
//		KillTheRNG.randomness.random_1174.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1175_62(Random rand, int i) {
		return KillTheRNG.randomness.random_1175.nextInt(i);
//		KillTheRNG.randomness.random_1175.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre1(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1176_63(Random rand, int i) {
		return KillTheRNG.randomness.random_1176.nextInt(i);
//		KillTheRNG.randomness.random_1176.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1177_64(Random rand, int i) {
		return KillTheRNG.randomness.random_1177.nextInt(i);
//		KillTheRNG.randomness.random_1177.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1178_65(Random rand, int i) {
		return KillTheRNG.randomness.random_1178.nextInt(i);
//		KillTheRNG.randomness.random_1178.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1179_66(Random rand, int i) {
		return KillTheRNG.randomness.random_1179.nextInt(i);
//		KillTheRNG.randomness.random_1179.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "genStandardOre2(Lnet/minecraft/world/World;Ljava/util/Random;ILnet/minecraft/world/gen/feature/WorldGenerator;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1180_67(Random rand, int i) {
		return KillTheRNG.randomness.random_1180.nextInt(i);
//		KillTheRNG.randomness.random_1180.nextInt(i);
//		return rand.nextInt(i);
	}

}
