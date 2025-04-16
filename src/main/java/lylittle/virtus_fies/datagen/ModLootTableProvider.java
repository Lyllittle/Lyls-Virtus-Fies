package lylittle.virtus_fies.datagen;

import lylittle.virtus_fies.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HOLY_POWDER_BLOCK);
        addDrop(ModBlocks.HOLY_RUNE_BRICKS);
        addDrop(ModBlocks.RUNE_PEDESTAL);
    }
}
