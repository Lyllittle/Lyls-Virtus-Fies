package lylittle.virtus_fies.datagen;

import lylittle.virtus_fies.block.ModBlocks;
import lylittle.virtus_fies.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HOLY_POWDER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HOLY_RUNE_BRICKS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RUNE_PEDESTAL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HOLY_POWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOLY_RUNE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_CARVER, Models.GENERATED);
    }
}
