package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;

@Mixin(StructureMineshaftPieces.Cross.class)
public class MixinStructureMineshaftPieces$Cross {
	@Redirect(method = "findCrossing(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_1671(Random rand, int i) {
		return KillTheRNG.randomness.random_1671.nextInt(i);
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1672(Random rand) {
		return KillTheRNG.randomness.random_1672.nextBoolean();
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1673(Random rand) {
		return KillTheRNG.randomness.random_1673.nextBoolean();
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_1674(Random rand) {
		return KillTheRNG.randomness.random_1674.nextBoolean();
	}

	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 3))
	public boolean redirect_random_1675(Random rand) {
		return KillTheRNG.randomness.random_1675.nextBoolean();
	}

}
