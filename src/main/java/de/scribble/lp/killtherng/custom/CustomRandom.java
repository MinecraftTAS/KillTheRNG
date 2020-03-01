package de.scribble.lp.killtherng.custom;

import java.util.Random;

import net.minecraft.util.text.TextFormatting;



public class CustomRandom extends Random {

    private static long seed = 0;
    private static Random random = new Random(seed);
    public boolean pseudoRandom;
    
    private String name;
    private String description;
    private String randomvariable;

    public CustomRandom() {
        pseudoRandom=true;
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    
    public CustomRandom(long seedIn) {
        CustomRandom.seed=seedIn;
        pseudoRandom=true;
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    public CustomRandom(boolean isPseudoRandom) {
    	this.pseudoRandom=isPseudoRandom;
    	String nothing="Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    public CustomRandom(long seedIn, boolean isPseudoRandom) {
    	CustomRandom.seed=seedIn;
        pseudoRandom=isPseudoRandom;
        String nothing=TextFormatting.GRAY+""+TextFormatting.ITALIC+"Nothing here yet :(";
        this.name=nothing;
        this.description=nothing;
        this.randomvariable=nothing;
    }
    public CustomRandom(long seedIn, boolean isPseudoRandom, String name, String description, String randomVariable) {
    	CustomRandom.seed=seedIn;
        pseudoRandom=isPseudoRandom;
        this.name=name;
        this.description=description;
        this.randomvariable=randomVariable;
    }
    public void setSeed(long seedIn) {
        seed = seedIn;
        random.setSeed(seedIn);
    }
	public Random getRandom() {
		return random;
	}

	public long getSeed() {
		return seed;
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
	
	@Override
	public boolean nextBoolean() {
		if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextBoolean();
	}
	@Override
	public int nextInt() {
		if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextInt();
    }

    @Override
    public int nextInt(int bound) {
    	if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextInt(bound);
    }

    @Override
    public double nextGaussian() {
    	if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextGaussian();
    }

    @Override
    public double nextDouble() {
    	if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextDouble();
    }

    @Override
    public float nextFloat() {
    	if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextFloat();
    }

    @Override
    public long nextLong() {
    	if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
		return random.nextLong();
    }

    @Override
    public void nextBytes(byte[] bytes) {
    	if(pseudoRandom) {
    		seed=random.nextLong();
			random.setSeed(seed);
		}else {
			random.setSeed(seed);
			random.setSeed(random.nextLong());
		}
        random.nextBytes(bytes);
    }

}
