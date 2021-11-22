package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.storage.loot.functions.SetAttributes;

@Mixin(SetAttributes.class)
public class MixinSetAttributes {

	/**
	* What equipment slot the random item should have
	*/
	@Redirect(method = "apply(Lnet/minecraft/item/ItemStack;Ljava/util/Random;Lnet/minecraft/world/storage/loot/LootContext;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_randomEquipmentSlot_1(Random rand, int i) {
		return KillTheRNG.randomness.randomEquipmentSlot.nextInt(i);
//		KillTheRNG.randomness.randomEquipmentSlot.nextInt(i);
//		return rand.nextInt(i);
	}

}
