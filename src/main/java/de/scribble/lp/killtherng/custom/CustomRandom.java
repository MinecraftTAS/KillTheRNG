package de.scribble.lp.killtherng.custom;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import net.minecraft.util.text.TextFormatting;


public class CustomRandom extends Random {

    public boolean pseudoRandom;
    
    private String name;
    private String description;
    private String randomvariable;
    
    private static long timesCalled=0;

    public CustomRandom() {
    	setSeed(0);
        pseudoRandom=true;
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    
    public CustomRandom(long seedIn) {
        setSeed(seedIn);
        pseudoRandom=true;
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    public CustomRandom(boolean isPseudoRandom) {
    	setSeed(0);
    	this.pseudoRandom=isPseudoRandom;
    	String nothing="Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    public CustomRandom(long seedIn, boolean isPseudoRandom) {
    	setSeed(seedIn);
        pseudoRandom=isPseudoRandom;
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    public CustomRandom(long seedIn, boolean isPseudoRandom, String name, String description, String randomVariable) {
    	setSeed(seedIn);
        pseudoRandom=isPseudoRandom;
        this.name=name;
        this.description=description;
        this.randomvariable=randomVariable;
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
	public String getRandomvariable() {
		return randomvariable;
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
}
