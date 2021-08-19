package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;

@Mixin(StructureMineshaftPieces.Corridor.class)
public class MixinStructureMineshaftPieces$Corridor {
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1676(Random rand, int i) {
		return KillTheRNG.randomness.random_1676.nextInt(i);
	}

	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1677(Random rand, int i) {
		return KillTheRNG.randomness.random_1677.nextInt(i);
	}

	@Redirect(method = "findCorridorSize(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1678(Random rand, int i) {
		return KillTheRNG.randomness.random_1678.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1679(Random rand, int i) {
		return KillTheRNG.randomness.random_1679.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1680(Random rand, int i) {
		return KillTheRNG.randomness.random_1680.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1681(Random rand, int i) {
		return KillTheRNG.randomness.random_1681.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1682(Random rand, int i) {
		return KillTheRNG.randomness.random_1682.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1683(Random rand, int i) {
		return KillTheRNG.randomness.random_1683.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1684(Random rand, int i) {
		return KillTheRNG.randomness.random_1684.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_random_1685(Random rand, int i) {
		return KillTheRNG.randomness.random_1685.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1686(Random rand, int i) {
		return KillTheRNG.randomness.random_1686.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_random_1687(Random rand, int i) {
		return KillTheRNG.randomness.random_1687.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_random_1688(Random rand, int i) {
		return KillTheRNG.randomness.random_1688.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_random_1689(Random rand, int i) {
		return KillTheRNG.randomness.random_1689.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_random_1690(Random rand, int i) {
		return KillTheRNG.randomness.random_1690.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_random_1691(Random rand, int i) {
		return KillTheRNG.randomness.random_1691.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_random_1692(Random rand, int i) {
		return KillTheRNG.randomness.random_1692.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_random_1693(Random rand, int i) {
		return KillTheRNG.randomness.random_1693.nextInt(i);
	}

	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1694(Random rand) {
		return KillTheRNG.randomness.random_1694.nextBoolean();
	}

	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1695(Random rand) {
		return KillTheRNG.randomness.random_1695.nextLong();
	}

	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1696(Random rand, int i) {
		return KillTheRNG.randomness.random_1696.nextInt(i);
	}

	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1697(Random rand, int i) {
		return KillTheRNG.randomness.random_1697.nextInt(i);
	}

	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1698(Random rand, int i) {
		return KillTheRNG.randomness.random_1698.nextInt(i);
	}

	@Redirect(method = "placeSupport(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1699(Random rand, int i) {
		return KillTheRNG.randomness.random_1699.nextInt(i);
	}

}
