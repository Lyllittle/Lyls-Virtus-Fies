package lylittle.virtus_fies.block;

import lylittle.virtus_fies.LylsVirtusFies;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block HOLY_POWDER_BLOCK = registerBlock("holy_powder_block", new Block(AbstractBlock.Settings
            .create().strength(1f).sounds(BlockSoundGroup.SAND)));
    public static final Block HOLY_RUNE_BRICKS = registerBlock("holy_rune_bricks", new Block(AbstractBlock.Settings
            .create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block RUNE_PEDESTAL = registerBlock("rune_pedestal",new Block(AbstractBlock.Settings
            .create().strength(3f).requiresTool().nonOpaque().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LylsVirtusFies.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(LylsVirtusFies.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        LylsVirtusFies.LOGGER.info("Registering Mod Blocks for " + LylsVirtusFies.MOD_ID);

    }
}
