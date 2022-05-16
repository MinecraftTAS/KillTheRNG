package de.scribble.lp.killtherng.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import kaptainwutax.seedutils.lcg.LCG;
import kaptainwutax.seedutils.rand.JRand;
import net.minecraft.util.text.TextFormatting;


public class CustomRandom extends Random {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2682222387413311282L;
	private String name;
    private String description;
    
    private long timesCalled=0;
    
    private boolean enabled;
    
    /**
     * List of all custom randoms
     */
    public static final List<CustomRandom> LIST=new ArrayList<>();
    
    private JRand jrand=new JRand(0L);
    
    /**
     * Use this constructor to not add the created randomness to {@link #LIST}
     * @param name
     */
    public CustomRandom(String name) {
    	super(0L);
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=name;
        this.description=nothing;
    }
    
    public CustomRandom(String name, String description) {
    	super(0L);
		this.name = name;
		this.description = description;
		enabled=true;
		LIST.add(this);
	}
    
    public CustomRandom(String name, String description, boolean enabled) {
    	super(0);
		this.name = name;
		this.description = description;
		this.enabled=enabled;
		LIST.add(this);
	}

	public void setSeed(long seedIn) {
    	timesCalled=0;
    	super.setSeed(seedIn ^ 0x5deece66dL);
    }
	
	public void setSeed(long seedIn, boolean shouldIncrease) {
		if(shouldIncrease) {
			timesCalled++;
		}
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
	
	public boolean isEnabled() {
		return enabled;
	}
	
	@Override
	public long nextLong() {
		timesCalled++;
		long seedstored=getSeed();
		long value=super.nextLong();
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)&&!this.name.equals("Global")) setSeed(seedstored, false);
		
		return value;
	}
	@Override	
	public double nextDouble() {
		timesCalled++;
		long seedstored=getSeed();
		double value=super.nextDouble();
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)) setSeed(seedstored, false);
		return value;
	}
	@Override
	public boolean nextBoolean() {
		timesCalled++;
		long seedstored=getSeed();
		boolean value=super.nextBoolean();
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)) setSeed(seedstored, false);
		return value;
	}
	@Override
	public int nextInt() {
		timesCalled++;
		long seedstored=getSeed();
		int value=super.nextInt();
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)) setSeed(seedstored, false);
		return value;
	}
	@Override
	public int nextInt(int bound) {
		timesCalled++;
		long seedstored=getSeed();
		int value=super.nextInt(bound);
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)) setSeed(seedstored, false);
		return value;
	}
	@Override
	public float nextFloat() {
		timesCalled++;
		long seedstored=getSeed();
		float value=super.nextFloat();
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)) setSeed(seedstored, false);
		return value;
	}
	@Override
	public void nextBytes(byte[] bytes) {
		timesCalled++;
		long seedstored=getSeed();
		super.nextBytes(bytes);
		if((KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput)) setSeed(seedstored, false);
	}
	@Override
	public double nextGaussian() {
		timesCalled++;
		long seedstored=getSeed();
		double value=0;
		if(KillTheRNG.mode==SeedingModes.Fixed||KillTheRNG.mode==SeedingModes.PlayerInput) {
			jrand.setSeed(seedstored);
			value=jrand.nextGaussian();
		}else {
			value=super.nextGaussian();
		}
		return value;
	}
	
	public void advance() {
		advance(1);
	}
	
	public void advance(long i) {
		JRand thing = JRand.ofInternalSeed(getSeed());
		thing.advance(i);
		setSeed(thing.getSeed());
	}
	
	public long getSeedAt(int steps) {
		JRand thing=new JRand(getSeed()).combine(steps);
		return thing.getSeed();
	}
	
	public long steps(CustomRandom random) {
		return LCG.JAVA.distance(this.getSeed(), random.getSeed());
	}
	
	public static long steps(CustomRandom random1, CustomRandom random2) {
		return LCG.JAVA.distance(random1.getSeed(), random2.getSeed());
	}
}