package com.badooga.more_fossils.Registries;
import com.badooga.more_fossils.MoreFossils;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class FossilBiomeTags {
    public static final TagKey<Biome> FOSSIL_OVERWORLD = of("fossil_overworld");
    public static final TagKey<Biome> FOSSIL_DEEP_DARK = of("fossil_deep_dark");

    public static TagKey<Biome> of(String id) {
        return TagKey.of(RegistryKeys.BIOME, new Identifier(MoreFossils.MODID, id));
    }
}
