package com.badooga.more_fossils;
import com.badooga.more_fossils.Registries.FossilBiomeTags;
import com.badooga.more_fossils.Registries.PlacedFossils;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFossils implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.

    public static final String MODID = "more_fossils";
    public static final Logger LOGGER = LoggerFactory.getLogger("more_fossils");

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        LOGGER.info("More Fossils initialized!");

        BiomeModifications.addFeature(
                BiomeSelectors.tag(FossilBiomeTags.FOSSIL_OVERWORLD),
                GenerationStep.Feature.UNDERGROUND_STRUCTURES,
                PlacedFossils.FOSSIL_LOWER
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(FossilBiomeTags.FOSSIL_OVERWORLD),
                GenerationStep.Feature.UNDERGROUND_STRUCTURES,
                PlacedFossils.FOSSIL_UPPER
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(FossilBiomeTags.FOSSIL_DEEP_DARK),
                GenerationStep.Feature.UNDERGROUND_STRUCTURES,
                PlacedFossils.FOSSIL_DEEP_DARK
        );
    }
}
