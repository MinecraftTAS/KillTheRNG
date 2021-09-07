
## KillTheRNG
A Minecraft mod to change the random things in the game to be a bit more consistent.  

It works by redirecting every random call like rand.nextInt() to our own random variable with a random call.
By using a tsv file we can generate Mixin classes automatically and update them with names and a description and whether they should be skipped

The list of all random occurences can be found [here](https://docs.google.com/spreadsheets/d/157dEK9Qw6Zkp4Cp33jLhsTjwERUXDSKC5KIBtRsf2l4/edit?usp=sharing)
  
Note that every random call currently has it's own variable stored in UltimateRandomness.java

Put `--mixin mixins.killtherng.json --tweakClass org.spongepowered.asm.launch.MixinTweaker` in your program arguments to make this work in your IDE  
Use `gradlew shadow` to build your mod.
