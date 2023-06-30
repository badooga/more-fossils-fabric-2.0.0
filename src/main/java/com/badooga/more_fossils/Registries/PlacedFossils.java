package com.badooga.more_fossils.Registries;
import com.badooga.more_fossils.MoreFossils;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class PlacedFossils {
    public static final RegistryKey<PlacedFeature> FOSSIL_UPPER = of("fossil_upper");
    public static final RegistryKey<PlacedFeature> FOSSIL_LOWER = of("fossil_lower");
    public static final RegistryKey<PlacedFeature> FOSSIL_DEEP_DARK = of("fossil_deep_dark");

    public static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MoreFossils.MODID, id));
    }
}
