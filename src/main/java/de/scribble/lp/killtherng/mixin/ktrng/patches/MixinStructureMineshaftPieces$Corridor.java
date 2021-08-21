package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;

@Mixin(StructureMineshaftPieces.Corridor.class)
public class MixinStructureMineshaftPieces$Corridor {

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1676_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1676.nextInt(i);
//		KillTheRNG.randomness.random_1676.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1677_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1677.nextInt(i);
//		KillTheRNG.randomness.random_1677.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findCorridorSize(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1678_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1678.nextInt(i);
//		KillTheRNG.randomness.random_1678.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1679_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1679.nextInt(i);
//		KillTheRNG.randomness.random_1679.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1680_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1680.nextInt(i);
//		KillTheRNG.randomness.random_1680.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1681_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1681.nextInt(i);
//		KillTheRNG.randomness.random_1681.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1682_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1682.nextInt(i);
//		KillTheRNG.randomness.random_1682.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1683_8(Random rand, int i) {
		return KillTheRNG.randomness.random_1683.nextInt(i);
//		KillTheRNG.randomness.random_1683.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1684_9(Random rand, int i) {
		return KillTheRNG.randomness.random_1684.nextInt(i);
//		KillTheRNG.randomness.random_1684.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1685_10(Random rand, int i) {
		return KillTheRNG.randomness.random_1685.nextInt(i);
//		KillTheRNG.randomness.random_1685.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1686_11(Random rand, int i) {
		return KillTheRNG.randomness.random_1686.nextInt(i);
//		KillTheRNG.randomness.random_1686.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1687_12(Random rand, int i) {
		return KillTheRNG.randomness.random_1687.nextInt(i);
//		KillTheRNG.randomness.random_1687.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1688_13(Random rand, int i) {
		return KillTheRNG.randomness.random_1688.nextInt(i);
//		KillTheRNG.randomness.random_1688.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1689_14(Random rand, int i) {
		return KillTheRNG.randomness.random_1689.nextInt(i);
//		KillTheRNG.randomness.random_1689.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1690_15(Random rand, int i) {
		return KillTheRNG.randomness.random_1690.nextInt(i);
//		KillTheRNG.randomness.random_1690.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1691_16(Random rand, int i) {
		return KillTheRNG.randomness.random_1691.nextInt(i);
//		KillTheRNG.randomness.random_1691.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1692_17(Random rand, int i) {
		return KillTheRNG.randomness.random_1692.nextInt(i);
//		KillTheRNG.randomness.random_1692.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1693_18(Random rand, int i) {
		return KillTheRNG.randomness.random_1693.nextInt(i);
//		KillTheRNG.randomness.random_1693.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1694_19(Random rand) {
		return KillTheRNG.randomness.random_1694.nextBoolean();
//		KillTheRNG.randomness.random_1694.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1695_20(Random rand) {
		return KillTheRNG.randomness.random_1695.nextLong();
//		KillTheRNG.randomness.random_1695.nextLong();
//		return rand.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1696_21(Random rand, int i) {
		return KillTheRNG.randomness.random_1696.nextInt(i);
//		KillTheRNG.randomness.random_1696.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1697_22(Random rand, int i) {
		return KillTheRNG.randomness.random_1697.nextInt(i);
//		KillTheRNG.randomness.random_1697.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1698_23(Random rand, int i) {
		return KillTheRNG.randomness.random_1698.nextInt(i);
//		KillTheRNG.randomness.random_1698.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "placeSupport(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1699_24(Random rand, int i) {
		return KillTheRNG.randomness.random_1699.nextInt(i);
//		KillTheRNG.randomness.random_1699.nextInt(i);
//		return rand.nextInt(i);
	}

}
