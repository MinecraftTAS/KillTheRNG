package de.scribble.lp.killtherng.mixin;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import de.scribble.lp.killtherng.UltimateRandomness;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.ICommandSender;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ReportedException;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

@Mixin(Entity.class)
public abstract class MixinEntity extends Object implements ICommandSender, net.minecraftforge.common.capabilities.ICapabilitySerializable<NBTTagCompound>{
    @Shadow
    protected Random rand;
    @Shadow
	private boolean noClip;
    @Shadow
	private World world;
    @Shadow
	private long pistonDeltasGameTime;
    @Shadow
	private double[] pistonDeltas;
    @Shadow
	private double posX;
    @Shadow
	private double posY;
    @Shadow
	private double posZ;
    @Shadow
	private boolean isInWeb;
    @Shadow
	private double motionX;
    @Shadow
	private double motionY;
    @Shadow
	private double motionZ;
    @Shadow
	private boolean onGround;
    @Shadow
	private boolean collidedHorizontally;
    @Shadow
	private boolean collidedVertically;
    @Shadow
	private boolean collided;
    @Shadow
	private float distanceWalkedModified;
    @Shadow
	private float distanceWalkedOnStepModified;
    @Shadow
	private int nextStepDistance;
    @Shadow
	private float stepHeight;
    @Shadow
	private float nextFlap;
    @Shadow
	private int fire;
    @Shadow
	private float width;

    
    @Shadow
    public abstract boolean isBurning();
    @Shadow
    public abstract int getFireImmuneTicks();
    @Shadow
    public abstract void setFire(int i);
    @Shadow
    public abstract void dealFireDamage(int i);
    @Shadow
    public abstract boolean isWet();
    @Shadow
    public abstract void addEntityCrashInfo(CrashReportCategory crashreportcategory);
    @Shadow
    public abstract void doBlockCollisions();
    @Shadow
    public abstract float playFlySound(float distanceWalkedOnStepModified2);
    @Shadow
    public abstract boolean makeFlySound();
    @Shadow
    public abstract void playStepSound(BlockPos blockpos, Block block);
    @Shadow
    public abstract void playSound(SoundEvent soundIn, float volume, float pitch);
    @Shadow
    public abstract SoundEvent getSwimSound();
    @Shadow
    public abstract Entity getControllingPassenger();
    @Shadow
    public abstract boolean isBeingRidden();
    @Shadow
    public abstract boolean isInWater();
    @Shadow
    public abstract boolean isRiding();
    @Shadow
    public abstract boolean canTriggerWalking();
    @Shadow
    public abstract void updateFallState(double y, boolean onGround2, IBlockState iblockstate, BlockPos blockpos);
	@Shadow
    public abstract boolean isSneaking();
	@Shadow
    public abstract void resetPositionToBB();
	@Shadow
    public abstract void setEntityBoundingBox(AxisAlignedBB offset);
	@Shadow
	public abstract AxisAlignedBB getEntityBoundingBox();
	@Shadow
	public abstract SoundEvent getSplashSound();
	/**
	 * Patching swimming sounds and fire extinguish sounds
	 */
    @Inject(method = "move",at= @At(value = "HEAD"), cancellable=true)
    public void redoMove(MoverType type, double x, double y, double z, CallbackInfo ci) {
    	if (this.noClip)
        {
            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(x, y, z));
            this.resetPositionToBB();
        }
        else
        {
            if (type == MoverType.PISTON)
            {
                long i = this.world.getTotalWorldTime();

                if (i != this.pistonDeltasGameTime)
                {
                    Arrays.fill(this.pistonDeltas, 0.0D);
                    this.pistonDeltasGameTime = i;
                }

                if (x != 0.0D)
                {
                    int j = EnumFacing.Axis.X.ordinal();
                    double d0 = MathHelper.clamp(x + this.pistonDeltas[j], -0.51D, 0.51D);
                    x = d0 - this.pistonDeltas[j];
                    this.pistonDeltas[j] = d0;

                    if (Math.abs(x) <= 9.999999747378752E-6D)
                    {
                        return;
                    }
                }
                else if (y != 0.0D)
                {
                    int l4 = EnumFacing.Axis.Y.ordinal();
                    double d12 = MathHelper.clamp(y + this.pistonDeltas[l4], -0.51D, 0.51D);
                    y = d12 - this.pistonDeltas[l4];
                    this.pistonDeltas[l4] = d12;

                    if (Math.abs(y) <= 9.999999747378752E-6D)
                    {
                        return;
                    }
                }
                else
                {
                    if (z == 0.0D)
                    {
                        return;
                    }

                    int i5 = EnumFacing.Axis.Z.ordinal();
                    double d13 = MathHelper.clamp(z + this.pistonDeltas[i5], -0.51D, 0.51D);
                    z = d13 - this.pistonDeltas[i5];
                    this.pistonDeltas[i5] = d13;

                    if (Math.abs(z) <= 9.999999747378752E-6D)
                    {
                        return;
                    }
                }
            }

            this.world.profiler.startSection("move");
            double d10 = this.posX;
            double d11 = this.posY;
            double d1 = this.posZ;

            if (this.isInWeb)
            {
                this.isInWeb = false;
                x *= 0.25D;
                y *= 0.05000000074505806D;
                z *= 0.25D;
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            }

            double d2 = x;
            double d3 = y;
            double d4 = z;

            if ((type == MoverType.SELF || type == MoverType.PLAYER) && this.onGround && this.isSneaking() && (Entity)(Object)this instanceof EntityPlayer)
            {
                for (double d5 = 0.05D; x != 0.0D && this.world.getCollisionBoxes((Entity)(Object)this, this.getEntityBoundingBox().offset(x, (double)(-this.stepHeight), 0.0D)).isEmpty(); d2 = x)
                {
                    if (x < 0.05D && x >= -0.05D)
                    {
                        x = 0.0D;
                    }
                    else if (x > 0.0D)
                    {
                        x -= 0.05D;
                    }
                    else
                    {
                        x += 0.05D;
                    }
                }

                for (; z != 0.0D && this.world.getCollisionBoxes((Entity)(Object)this, this.getEntityBoundingBox().offset(0.0D, (double)(-this.stepHeight), z)).isEmpty(); d4 = z)
                {
                    if (z < 0.05D && z >= -0.05D)
                    {
                        z = 0.0D;
                    }
                    else if (z > 0.0D)
                    {
                        z -= 0.05D;
                    }
                    else
                    {
                        z += 0.05D;
                    }
                }

                for (; x != 0.0D && z != 0.0D && this.world.getCollisionBoxes((Entity)(Object)this, this.getEntityBoundingBox().offset(x, (double)(-this.stepHeight), z)).isEmpty(); d4 = z)
                {
                    if (x < 0.05D && x >= -0.05D)
                    {
                        x = 0.0D;
                    }
                    else if (x > 0.0D)
                    {
                        x -= 0.05D;
                    }
                    else
                    {
                        x += 0.05D;
                    }

                    d2 = x;

                    if (z < 0.05D && z >= -0.05D)
                    {
                        z = 0.0D;
                    }
                    else if (z > 0.0D)
                    {
                        z -= 0.05D;
                    }
                    else
                    {
                        z += 0.05D;
                    }
                }
            }

            List<AxisAlignedBB> list1 = this.world.getCollisionBoxes((Entity)(Object)this, this.getEntityBoundingBox().expand(x, y, z));
            AxisAlignedBB axisalignedbb = this.getEntityBoundingBox();

            if (y != 0.0D)
            {
                int k = 0;

                for (int l = list1.size(); k < l; ++k)
                {
                    y = ((AxisAlignedBB)list1.get(k)).calculateYOffset(this.getEntityBoundingBox(), y);
                }

                this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0D, y, 0.0D));
            }

            if (x != 0.0D)
            {
                int j5 = 0;

                for (int l5 = list1.size(); j5 < l5; ++j5)
                {
                    x = ((AxisAlignedBB)list1.get(j5)).calculateXOffset(this.getEntityBoundingBox(), x);
                }

                if (x != 0.0D)
                {
                    this.setEntityBoundingBox(this.getEntityBoundingBox().offset(x, 0.0D, 0.0D));
                }
            }

            if (z != 0.0D)
            {
                int k5 = 0;

                for (int i6 = list1.size(); k5 < i6; ++k5)
                {
                    z = ((AxisAlignedBB)list1.get(k5)).calculateZOffset(this.getEntityBoundingBox(), z);
                }

                if (z != 0.0D)
                {
                    this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0D, 0.0D, z));
                }
            }

            boolean flag = this.onGround || d3 != y && d3 < 0.0D;

            if (this.stepHeight > 0.0F && flag && (d2 != x || d4 != z))
            {
                double d14 = x;
                double d6 = y;
                double d7 = z;
                AxisAlignedBB axisalignedbb1 = this.getEntityBoundingBox();
                this.setEntityBoundingBox(axisalignedbb);
                y = (double)this.stepHeight;
                List<AxisAlignedBB> list = this.world.getCollisionBoxes((Entity)(Object)this, this.getEntityBoundingBox().expand(d2, y, d4));
                AxisAlignedBB axisalignedbb2 = this.getEntityBoundingBox();
                AxisAlignedBB axisalignedbb3 = axisalignedbb2.expand(d2, 0.0D, d4);
                double d8 = y;
                int j1 = 0;

                for (int k1 = list.size(); j1 < k1; ++j1)
                {
                    d8 = ((AxisAlignedBB)list.get(j1)).calculateYOffset(axisalignedbb3, d8);
                }

                axisalignedbb2 = axisalignedbb2.offset(0.0D, d8, 0.0D);
                double d18 = d2;
                int l1 = 0;

                for (int i2 = list.size(); l1 < i2; ++l1)
                {
                    d18 = ((AxisAlignedBB)list.get(l1)).calculateXOffset(axisalignedbb2, d18);
                }

                axisalignedbb2 = axisalignedbb2.offset(d18, 0.0D, 0.0D);
                double d19 = d4;
                int j2 = 0;

                for (int k2 = list.size(); j2 < k2; ++j2)
                {
                    d19 = ((AxisAlignedBB)list.get(j2)).calculateZOffset(axisalignedbb2, d19);
                }

                axisalignedbb2 = axisalignedbb2.offset(0.0D, 0.0D, d19);
                AxisAlignedBB axisalignedbb4 = this.getEntityBoundingBox();
                double d20 = y;
                int l2 = 0;

                for (int i3 = list.size(); l2 < i3; ++l2)
                {
                    d20 = ((AxisAlignedBB)list.get(l2)).calculateYOffset(axisalignedbb4, d20);
                }

                axisalignedbb4 = axisalignedbb4.offset(0.0D, d20, 0.0D);
                double d21 = d2;
                int j3 = 0;

                for (int k3 = list.size(); j3 < k3; ++j3)
                {
                    d21 = ((AxisAlignedBB)list.get(j3)).calculateXOffset(axisalignedbb4, d21);
                }

                axisalignedbb4 = axisalignedbb4.offset(d21, 0.0D, 0.0D);
                double d22 = d4;
                int l3 = 0;

                for (int i4 = list.size(); l3 < i4; ++l3)
                {
                    d22 = ((AxisAlignedBB)list.get(l3)).calculateZOffset(axisalignedbb4, d22);
                }

                axisalignedbb4 = axisalignedbb4.offset(0.0D, 0.0D, d22);
                double d23 = d18 * d18 + d19 * d19;
                double d9 = d21 * d21 + d22 * d22;

                if (d23 > d9)
                {
                    x = d18;
                    z = d19;
                    y = -d8;
                    this.setEntityBoundingBox(axisalignedbb2);
                }
                else
                {
                    x = d21;
                    z = d22;
                    y = -d20;
                    this.setEntityBoundingBox(axisalignedbb4);
                }

                int j4 = 0;

                for (int k4 = list.size(); j4 < k4; ++j4)
                {
                    y = ((AxisAlignedBB)list.get(j4)).calculateYOffset(this.getEntityBoundingBox(), y);
                }

                this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0D, y, 0.0D));

                if (d14 * d14 + d7 * d7 >= x * x + z * z)
                {
                    x = d14;
                    y = d6;
                    z = d7;
                    this.setEntityBoundingBox(axisalignedbb1);
                }
            }

            this.world.profiler.endSection();
            this.world.profiler.startSection("rest");
            this.resetPositionToBB();
            this.collidedHorizontally = d2 != x || d4 != z;
            this.collidedVertically = d3 != y;
            this.onGround = this.collidedVertically && d3 < 0.0D;
            this.collided = this.collidedHorizontally || this.collidedVertically;
            int j6 = MathHelper.floor(this.posX);
            int i1 = MathHelper.floor(this.posY - 0.20000000298023224D);
            int k6 = MathHelper.floor(this.posZ);
            BlockPos blockpos = new BlockPos(j6, i1, k6);
            IBlockState iblockstate = this.world.getBlockState(blockpos);

            if (iblockstate.getMaterial() == Material.AIR)
            {
                BlockPos blockpos1 = blockpos.down();
                IBlockState iblockstate1 = this.world.getBlockState(blockpos1);
                Block block1 = iblockstate1.getBlock();

                if (block1 instanceof BlockFence || block1 instanceof BlockWall || block1 instanceof BlockFenceGate)
                {
                    iblockstate = iblockstate1;
                    blockpos = blockpos1;
                }
            }

            this.updateFallState(y, this.onGround, iblockstate, blockpos);

            if (d2 != x)
            {
                this.motionX = 0.0D;
            }

            if (d4 != z)
            {
                this.motionZ = 0.0D;
            }

            Block block = iblockstate.getBlock();

            if (d3 != y)
            {
                block.onLanded(this.world, (Entity)(Object)this);
            }

            if (this.canTriggerWalking() && (!this.onGround || !this.isSneaking() || !((Entity)(Object)this instanceof EntityPlayer)) && !this.isRiding())
            {
                double d15 = this.posX - d10;
                double d16 = this.posY - d11;
                double d17 = this.posZ - d1;

                if (block != Blocks.LADDER)
                {
                    d16 = 0.0D;
                }

                if (block != null && this.onGround)
                {
                    block.onEntityWalk(this.world, blockpos, (Entity)(Object)this);
                }

                this.distanceWalkedModified = (float)((double)this.distanceWalkedModified + (double)MathHelper.sqrt(d15 * d15 + d17 * d17) * 0.6D);
                this.distanceWalkedOnStepModified = (float)((double)this.distanceWalkedOnStepModified + (double)MathHelper.sqrt(d15 * d15 + d16 * d16 + d17 * d17) * 0.6D);

                if (this.distanceWalkedOnStepModified > (float)this.nextStepDistance && iblockstate.getMaterial() != Material.AIR)
                {
                    this.nextStepDistance = (int)this.distanceWalkedOnStepModified + 1;

                    if (this.isInWater())
                    {
                        Entity entity = this.isBeingRidden() && this.getControllingPassenger() != null ? (Entity)(Object)this.getControllingPassenger() : (Entity)(Object)this;
                        float f = entity == (Entity)(Object)this ? 0.35F : 0.4F;
                        float f1 = MathHelper.sqrt(entity.motionX * entity.motionX * 0.20000000298023224D + entity.motionY * entity.motionY + entity.motionZ * entity.motionZ * 0.20000000298023224D) * f;

                        if (f1 > 1.0F)
                        {
                            f1 = 1.0F;
                        }
                        boolean save=true;
                        long seedsave=0;
                        this.playSound(this.getSwimSound(), f1, 1.0F + (UltimateRandomness.entitySoundSwim.nextFloat() - UltimateRandomness.entitySoundSwim.nextFloat()) * 0.4F);
                    }
                    else
                    {
                        this.playStepSound(blockpos, block);
                    }
                }
                else if (this.distanceWalkedOnStepModified > this.nextFlap && this.makeFlySound() && iblockstate.getMaterial() == Material.AIR)
                {
                    this.nextFlap = this.playFlySound(this.distanceWalkedOnStepModified);
                }
            }

            try
            {
                this.doBlockCollisions();
            }
            catch (Throwable throwable)
            {
                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
                CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being checked for collision");
                this.addEntityCrashInfo(crashreportcategory);
                throw new ReportedException(crashreport);
            }

            boolean flag1 = this.isWet();

            if (this.world.isFlammableWithin(this.getEntityBoundingBox().shrink(0.001D)))
            {
                this.dealFireDamage(1);

                if (!flag1)
                {
                    ++this.fire;

                    if (this.fire == 0)
                    {
                        this.setFire(8);
                    }
                }
            }
            else if (this.fire <= 0)
            {
                this.fire = -this.getFireImmuneTicks();
            }
            
            if (flag1 && this.isBurning())
            {
            	//KillTheRNG: Transforming random pitch for the sound, when an entity on fire is being extinguished
            	boolean save=true;
                long seedsave=0;
                this.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 0.7F, 1.6F + (UltimateRandomness.entitySoundExtinguishFire.nextFloat() - UltimateRandomness.entitySoundExtinguishFire.nextFloat()) * 0.4F);
                this.fire = -this.getFireImmuneTicks();
            }

            this.world.profiler.endSection();
        }
    	ci.cancel();
    }
    /**
     * Patching water splash sound and particles
     */
    @Inject(method = "doWaterSplashEffect",at= @At(value = "HEAD"), cancellable=true)
    public void redoDoWaterSplashEffect(CallbackInfo ci) {
    	Entity entity = this.isBeingRidden() && this.getControllingPassenger() != null ? this.getControllingPassenger() : (Entity)(Object)this;
        float f = entity == (Entity)(Object)this ? 0.2F : 0.9F;
        float f1 = MathHelper.sqrt(entity.motionX * entity.motionX * 0.20000000298023224D + entity.motionY * entity.motionY + entity.motionZ * entity.motionZ * 0.20000000298023224D) * f;

        if (f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        boolean save=true;
        long seedsave=0;
        this.playSound(this.getSplashSound(), f1, 1.0F + (UltimateRandomness.entitySoundSplash.nextFloat() - UltimateRandomness.entitySoundSplash.nextFloat()) * 0.4F);
        float f2 = (float)MathHelper.floor(this.getEntityBoundingBox().minY);

        for (int i = 0; (float)i < 1.0F + this.width * 20.0F; ++i)
        {
            float f3 = (UltimateRandomness.entityParticleWaterBubble.nextFloat() * 2.0F - 1.0F) * this.width;
            float f4 = (UltimateRandomness.entityParticleWaterBubble.nextFloat() * 2.0F - 1.0F) * this.width;
            this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + (double)f3, (double)(f2 + 1.0F), this.posZ + (double)f4, this.motionX, this.motionY - (double)(UltimateRandomness.entityParticleWaterBubble.nextFloat() * 0.2F), this.motionZ);
        }

        for (int j = 0; (float)j < 1.0F + this.width * 20.0F; ++j)
        {
            float f5 = (UltimateRandomness.entityParticleWaterSplash.nextFloat() * 2.0F - 1.0F) * this.width;
            float f6 = (UltimateRandomness.entityParticleWaterSplash.nextFloat() * 2.0F - 1.0F) * this.width;
            this.world.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX + (double)f5, (double)(f2 + 1.0F), this.posZ + (double)f6, this.motionX, this.motionY, this.motionZ);
        }
        ci.cancel();
    }
    
    @Inject(method="createRunningParticles", at=@At("HEAD"), cancellable=true)
    public void redoCreateRunningParticle(CallbackInfo ci) {
    	int i = MathHelper.floor(this.posX);
        int j = MathHelper.floor(this.posY - 0.20000000298023224D);
        int k = MathHelper.floor(this.posZ);
        BlockPos blockpos = new BlockPos(i, j, k);
        IBlockState iblockstate = this.world.getBlockState(blockpos);

        if(!iblockstate.getBlock().addRunningEffects(iblockstate, world, blockpos, (Entity)(Object)this))
        if (iblockstate.getRenderType() != EnumBlockRenderType.INVISIBLE)
        {
            this.world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, this.posX + ((double)UltimateRandomness.entityParticleRunning.nextFloat() - 0.5D) * (double)this.width, this.getEntityBoundingBox().minY + 0.1D, this.posZ + ((double)UltimateRandomness.entityParticleRunning.nextFloat() - 0.5D) * (double)this.width, -this.motionX * 4.0D, 1.5D, -this.motionZ * 4.0D, Block.getStateId(iblockstate));
        }
        ci.cancel();
    }
}