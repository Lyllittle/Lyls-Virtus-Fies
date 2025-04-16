package lylittle.virtus_fies.util;

import lylittle.virtus_fies.LylsVirtusFies;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LylsVirtusFies.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> RUNE_CARVER_HANDLE_MATERIALS = createTag("rune_carver_handle_materials");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(LylsVirtusFies.MOD_ID, name));
        }
    }
}
