package cz.lsrom.superflat.biomes;

import carpet.api.settings.Rule;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Arrays;
import java.util.List;

public class SuperFlatBiomesSettings {

    public static final String GENERATION = "generation";

    @Rule(categories = GENERATION)
    public static boolean generateFeatures = false;

    @Rule(categories = GENERATION)
    public static boolean generateAllStructures = false;

    @Rule(categories = GENERATION)
    public static boolean generateVillages = true;

    @Rule(categories = GENERATION)
    public static boolean generateStrongholds = true;

    @Rule(categories = GENERATION)
    public static boolean generateAncientCities = true;

    public static List<Block> worldBlocks = Arrays.asList(Blocks.BEDROCK, Blocks.STONE, Blocks.STONE, Blocks.GRASS_BLOCK);
}
