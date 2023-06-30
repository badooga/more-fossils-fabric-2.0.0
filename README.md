# More Fossils
Have you ever wondered why fossils are so rare? Turns out, they only generate rarely in desert, swamp, and mangrove swamp biomes. Most players won't ever encounter one throughout their playthroughs.

This datapack uses Fabric/Forge biome modifiers to allow fossils to generate in any Overworld biome. They aren't too common, but exploring big cave systems will give you a good shot at finding some.

Since this is done on top of vanilla fossil generation, fossils will be around ~70% more common in deserts, swamps, and mangrove swamps compared to other biomes. Similarly, fossils are about 160% more common in the deep dark compared to other biomes.

**Configuration:** If you want to edit the generation frequency of these fossils, make a datapack with the `data/more_fossils/worldgen/placed_feature` folder from the source repository and edit the corresponding json file. The `minecraft:rarity_filter` entry controls the rarity of a feature's generation, where a value of 30 corresponds to a 1 in 30 chance of passing through the filter (and a 29 in 30 chance of generation failing).

You can also go to `data/more_fossils/tags/worldgen/biome` to edit the tags that determine which biomes a fossil can spawn in.
