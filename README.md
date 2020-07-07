
## KillTheRNG
A Minecraft mod to change the random things in game to be a consistent.  
  
Minecraft uses Java.util.Random a lot, to make various things random...  
This mod replaces those variables to their own random variables, so you can set your seed for each instance individually

Put `--mixin mixins.killtherng.json --tweakClass org.spongepowered.asm.launch.MixinTweaker` in your program arguments to make this work in your IDE  
Use `gradlew shadow` to build your mod.
