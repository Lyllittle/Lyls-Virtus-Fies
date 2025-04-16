package lylittle.virtus_fies.datagen;

import lylittle.virtus_fies.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.RUNE_CARVER_HANDLE_MATERIALS)
                .add(Items.DEEPSLATE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.STONE)
                .add(Items.COBBLESTONE);
    }
}
