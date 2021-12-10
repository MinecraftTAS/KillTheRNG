
## KillTheRNG
A Minecraft mod to change the random things in the game to be a bit more consistent.  

It works by redirecting every random call like rand.nextInt() to our own random variable with a random call.
By using a tsv file we can generate Mixin classes automatically and update them with names and a description and whether they should be skipped

The list of all random occurences can be found [here](https://docs.google.com/spreadsheets/d/157dEK9Qw6Zkp4Cp33jLhsTjwERUXDSKC5KIBtRsf2l4/edit?usp=sharing)
  
Note that every random call currently has it's own variable stored in UltimateRandomness.java

## Development
This Project uses ForgeNoGradle. Please download and run [this file](https://mgnet.work/ForgeNoGradle-1.0.1.jar) in your repository root directory
To export a jar, clean the project first. Project -> Clean, then run the -export.launch file