package lylittle.virtus_fies.datagen;

import lylittle.virtus_fies.block.ModBlocks;
import lylittle.virtus_fies.item.ModItems;
import lylittle.virtus_fies.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HOLY_POWDER, RecipeCategory.MISC, ModBlocks.HOLY_POWDER_BLOCK);
        offer2x2CompactingRecipe(recipeExporter,RecipeCategory.BUILDING_BLOCKS,ModBlocks.HOLY_RUNE_BRICKS, ModItems.HOLY_RUNE_BRICK);
        offerBlasting(recipeExporter, List.of(ModItems.HOLY_POWDER), RecipeCategory.MISC,ModItems.HOLY_RUNE_BRICK,0.1f,100,"holy_rune_brick");
        offerSmelting(recipeExporter, List.of(ModItems.HOLY_POWDER), RecipeCategory.MISC,ModItems.HOLY_RUNE_BRICK,0.1f,100,"holy_rune_brick");
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.RUNE_CARVER)
                .pattern("#")
                .pattern("X")
                .input('#',ModItems.HOLY_RUNE_BRICK)
                .input('X', ModTags.Items.RUNE_CARVER_HANDLE_MATERIALS)
                .criterion(hasItem(ModItems.HOLY_RUNE_BRICK),conditionsFromItem(ModItems.HOLY_RUNE_BRICK))
                .offerTo(recipeExporter);

    }
}
