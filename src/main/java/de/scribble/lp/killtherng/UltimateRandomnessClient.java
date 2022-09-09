package de.scribble.lp.killtherng;

import de.scribble.lp.killtherng.custom.CustomRandom;
import java.util.HashMap;

public class UltimateRandomnessClient {

	private HashMap<String, CustomRandom> REGISTRY = new HashMap<>();

	private CustomRandom registerRandom(String name, String description, boolean enabled) {
		CustomRandom newRandom = new CustomRandom(name, description, enabled);
		REGISTRY.put(name, newRandom);
		return newRandom;
	}

	public CustomRandom GlobalClient = registerRandom("GlobalClient", "The global randomness every client random variable should have", true);
	public CustomRandom horseTamingParticles = registerRandom("horseTamingParticles", "Particles when trying to tame a horse", true);
	public CustomRandom tippedArrowParticleStatusUpdate = registerRandom("tippedArrowParticleStatusUpdate", "Same as Arrow particle but for multiple entities (?)", true);
	public CustomRandom initialSpawnLocation = registerRandom("initialSpawnLocation", "Spawn location when spawning in a world, unused in forge", true);
	public CustomRandom fireSpreading = registerRandom("fireSpreading", "Chance whether fire can spread", true);
	public CustomRandom fireSoundChance = registerRandom("fireSoundChance", "Chance if fire makes a sound", true);
	public CustomRandom fireSound = registerRandom("fireSound", "Something about fire sound", true);
	public CustomRandom fireParticlePosX = registerRandom("fireParticlePosX", "Get the X of a fire particle", true);
	public CustomRandom fireParticlePosY = registerRandom("fireParticlePosY", "Get the Y of a fire particle", true);
	public CustomRandom fireParticlePosZ = registerRandom("fireParticlePosZ", "Get the Z of a fire particle", true);
	public CustomRandom random_415 = registerRandom("random_415", "null", true);
	public CustomRandom random_416 = registerRandom("random_416", "null", true);
	public CustomRandom random_417 = registerRandom("random_417", "null", true);
	public CustomRandom eggCrackParticle = registerRandom("eggCrackParticle", "Motion of egg crack particles", true);
	public CustomRandom zombieVillagerConvertionSound = registerRandom("zombieVillagerConvertionSound", "Pitch of zombie villager converting sound", true);
	public CustomRandom random_469 = registerRandom("random_469", "null", true);
	public CustomRandom random_470 = registerRandom("random_470", "null", true);
	public CustomRandom random_471 = registerRandom("random_471", "null", true);
	public CustomRandom leafDripParticleActivate = registerRandom("leafDripParticleActivate", "If a drip particle should spawn", true);
	public CustomRandom leafDripParticle = registerRandom("leafDripParticle", "Position of drip particle", true);
	public CustomRandom waterAmbientSoundActivate = registerRandom("waterAmbientSoundActivate", "If the water flowing sound should play", true);
	public CustomRandom waterAmbientSound = registerRandom("waterAmbientSound", "Pitch of the water flowing sound", true);
	public CustomRandom waterParticleSuspendedActivate = registerRandom("waterParticleSuspendedActivate", "If a water particle should spawn", true);
	public CustomRandom waterParticleSuspendedPos = registerRandom("waterParticleSuspendedPos", "Water particle position", true);
	public CustomRandom lavaPopSoundActivate = registerRandom("lavaPopSoundActivate", "If the lava pop sound should activate", true);
	public CustomRandom lavaPopParticle = registerRandom("lavaPopParticle", "Position of lava pop particle", true);
	public CustomRandom lavaPopSoundPitch = registerRandom("lavaPopSoundPitch", "Postion of lava pop sound", true);
	public CustomRandom lavaAmbientSoundActivate = registerRandom("lavaAmbientSoundActivate", "If the lava flowing sound should play", true);
	public CustomRandom lavaAmbientSound = registerRandom("lavaAmbientSound", "Pitch of flowing lava sound", true);
	public CustomRandom liquidDripParticleActivate = registerRandom("liquidDripParticleActivate", "If a drip particle should spawn", true);
	public CustomRandom liquidDripParticle = registerRandom("liquidDripParticle", "Position of drip particle", true);
	public CustomRandom villagerParticle = registerRandom("villagerParticle", "Position and velocity of villager related particles", true);
	public CustomRandom entityDeathSound = registerRandom("entityDeathSound", "Pitch of the death sound", true);
	public CustomRandom entityShieldBreakSound = registerRandom("entityShieldBreakSound", "Pitch of the shield break sound", true);
	public CustomRandom entityShieldBlockSound = registerRandom("entityShieldBlockSound", "Pitch of the shield block sound", true);
	public CustomRandom entityThornsSound = registerRandom("entityThornsSound", "Pitch of the thorns hit sound", true);
	public CustomRandom entityHurtSound = registerRandom("entityHurtSound", "Pitch of the hurt sound", true);
	public CustomRandom random_439 = registerRandom("random_439", "null", false);
	public CustomRandom random_440 = registerRandom("random_440", "null", false);
	public CustomRandom random_441 = registerRandom("random_441", "null", false);
	public CustomRandom random_442 = registerRandom("random_442", "null", false);
	public CustomRandom random_443 = registerRandom("random_443", "null", false);
	public CustomRandom random_444 = registerRandom("random_444", "null", false);
	public CustomRandom random_445 = registerRandom("random_445", "null", false);
	public CustomRandom random_446 = registerRandom("random_446", "null", false);
	public CustomRandom random_447 = registerRandom("random_447", "null", false);
	public CustomRandom random_448 = registerRandom("random_448", "null", false);
	public CustomRandom random_449 = registerRandom("random_449", "null", false);
	public CustomRandom animalHeartParticleStatusUpdate = registerRandom("animalHeartParticleStatusUpdate", "Same as animalHeartParticle but with some status handler stuff... idk", true);
	public CustomRandom evokerFangSound = registerRandom("evokerFangSound", "Pitch of evocation fangs attack sound", true);
	public CustomRandom witchParticle = registerRandom("witchParticle", "Quantity and position of which particles", true);
}
