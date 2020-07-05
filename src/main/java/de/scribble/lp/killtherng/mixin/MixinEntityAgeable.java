package de.scribble.lp.killtherng.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import de.scribble.lp.killtherng.UltimateRandomness;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

@Mixin(EntityAgeable.class)
public abstract class MixinEntityAgeable extends EntityCreature{
	public MixinEntityAgeable(World worldIn) {
		super(worldIn);
	}
	@Shadow
	private int forcedAgeTimer;

	@Inject(method="onLivingUpdate", at=@At("HEAD"), cancellable=true)
	public void redoOnLivingUpdate(CallbackInfo ci) {

        if (this.world.isRemote)
        {
            if (this.forcedAgeTimer > 0)
            {
                if (this.forcedAgeTimer % 4 == 0)
                {
                	boolean save=true;
                    long seedsave=0;
                	if(!UltimateRandomness.entityAgeableParticleVillagerHappy.pseudoRandom) {
                    	save=false;
                    	seedsave=UltimateRandomness.entityAgeableParticleVillagerHappy.getSeed();
                    	UltimateRandomness.entityAgeableParticleVillagerHappy.pseudoRandom=true;
                    }
                    this.world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX + (double)(UltimateRandomness.entityAgeableParticleVillagerHappy.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(UltimateRandomness.entityAgeableParticleVillagerHappy.nextFloat() * this.height), this.posZ + (double)(UltimateRandomness.entityAgeableParticleVillagerHappy.nextFloat() * this.width * 2.0F) - (double)this.width, 0.0D, 0.0D, 0.0D);
                    System.out.println("Particles: "+UltimateRandomness.entityAgeableParticleVillagerHappy.getSeed());
                    if(!save) {
                    	UltimateRandomness.entityAgeableParticleVillagerHappy.setSeed(seedsave);
                		UltimateRandomness.entityAgeableParticleVillagerHappy.pseudoRandom=false;
                    }
                }

                --this.forcedAgeTimer;
            }
        }
        else
        {
            int i = this.getGrowingAge();

            if (i < 0)
            {
                ++i;
                this.setGrowingAge(i);

                if (i == 0)
                {
                    this.onGrowingAdult();
                }
            }
            else if (i > 0)
            {
                --i;
                this.setGrowingAge(i);
            }
        }
		ci.cancel();
	}
	@Shadow
	public abstract void onGrowingAdult();
	@Shadow
	public abstract void setGrowingAge(int i);
	@Shadow
	public abstract int getGrowingAge();
}
