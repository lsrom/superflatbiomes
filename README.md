# Super Flat with Biomes

This is module for [fabric-carpet](https://github.com/gnembon/fabric-carpet) which will enable you to create superflat worlds with all the biomes. Currently only tested in **1.19**.

Check out some examples of what you can expect [here](showcase/showcase.md) (small gallery).

## Installation

Grab [release file](https://github.com/lsrom/superflatbiomes/releases/latest) and put it into your Minecraft mod folder. Make sure you have CarpetMod as well.

## Creating superflat world with biomes

Go create new world and in `More World Options` choose `World Type: SuperFlat with Biomes`.

## Configuring

SuperFlat with Biomes comes with following config options. You can set them using in-game chat or with carpet config file.

### Generate Structures

`/superflatbiomes generateFeatures true/false` Defaults to **false**, will generate all land features. Has no effect on other configuration options.

`/superflatbiomes generateAllStructures true/false` Defaults to **false**, will generate all structures in full, bounding box and blocks. If true, will spawn villages and strongholds regardless of their own config.

Following configurations work even when `generateAllStructures` is set to false:

`/superflatbiomes generateVillages true/false` Defaults to **true**, will generate villages in full and leave the rest as bounding boxes only.

`/superflatbiomes generateStrongholds true/false` Defaults to **true**, will generate strongholds in full and leave the rest as bounding boxes only.

### Generate Features

This will generate flat world with grass, **trees**, ice spikes and other land features present in normal worlds.

## Current limitations

- Only default flat world: Bedrock - Stone - Stone - Grass Block

## Acknowledgements

- [jsorrell](https://github.com/jsorrell/CarpetSkyAdditions) for `
  CarpetSkyAdditions` which I shamelessly copied
- [@gnembon](https://github.com/gnembon/fabric-carpet) for `fabric-carpet`
- [Mogswamp](https://www.youtube.com/c/Mogswamp) for showing me you can play Superflat survival and thrive