package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityZombieVillager;

@Mixin(EntityZombieVillager.class)
public class MixinEntityZombieVillager {

	/**
	* How long the z villager will take to convert to a villager
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_zombieVillagerConvertionTime_1(Random rand, int i) {
		return KillTheRNG.randomness.zombieVillagerConvertionTime.nextInt(i);
//		KillTheRNG.randomness.zombieVillagerConvertionTime.nextInt(i);
//		return rand.nextInt(i);
	}

}
