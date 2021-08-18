package de.scribble.lp.killtherng.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import kaptainwutax.seedutils.lcg.LCG;
import kaptainwutax.seedutils.rand.JRand;
import net.minecraft.util.text.TextFormatting;


public class CustomRandom extends Random {

    private String name;
    private String description;
    
    private long timesCalled=0;
    
    public static final List<CustomRandom> LIST=new ArrayList<>();

    public CustomRandom() {
    	super(0);
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        LIST.add(this);
    }
    
    public CustomRandom(String name, String description) {
    	super(0);
		this.name = name;
		this.description = description;
		LIST.add(this);
	}

	public void setSeed(long seedIn) {
    	timesCalled=0;
    	super.setSeed(seedIn ^ 0x5deece66dL);
    }

    public long getSeed() {
    	long saved=timesCalled;
        long seed = reverse(super.nextLong()) ^ 0x5deece66dL;
        super.setSeed(seed);
        timesCalled=saved;
        return seed^ 0x5deece66dL;
    }

    public static long reverse(long in) {
        return (((7847617*((24667315*(in >>> 32) + 18218081*(in & 0xffffffffL) + 67552711) >> 32) - 18218081*((-4824621*(in >>> 32) + 7847617*(in & 0xffffffffL) + 7847617) >> 32)) - 11) * 246154705703781L) & 0xffffffffffffL;
    }
    
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public long getTimesCalled() {
		return timesCalled;
	}
	
	@Override
	public long nextLong() {
		timesCalled++;
		return super.nextLong();
	}
	@Override	
	public double nextDouble() {
		timesCalled++;
		return super.nextDouble();
	}
	@Override
	public boolean nextBoolean() {
		timesCalled++;
		return super.nextBoolean();
	}
	@Override
	public int nextInt() {
		timesCalled++;
		return super.nextInt();
	}
	@Override
	public float nextFloat() {
		timesCalled++;
		return super.nextFloat();
	}
	@Override
	public void nextBytes(byte[] bytes) {
		timesCalled++;
		super.nextBytes(bytes);
	}
	@Override
	public synchronized double nextGaussian() {
		timesCalled++;
		return super.nextGaussian();
	}
	
	public long advance(int steps) {
		JRand thing=new JRand(getSeed());
		thing.advance(steps);
		return thing.getSeed();
	}
}
