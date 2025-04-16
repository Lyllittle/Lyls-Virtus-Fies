package lylittle.virtus_fies.item;

import lylittle.virtus_fies.LylsVirtusFies;
import lylittle.virtus_fies.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VIRTUS_FIESITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(LylsVirtusFies.MOD_ID, "virtus_fies_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HOLY_POWDER))
                    .displayName(Text.translatable("itemgroup.lyls-virtus-fies_lyls-virtus-fies_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HOLY_POWDER);
                        entries.add(ModBlocks.HOLY_POWDER_BLOCK);
                        entries.add(ModItems.HOLY_RUNE_BRICK);
                        entries.add(ModBlocks.HOLY_RUNE_BRICKS);
                        entries.add(ModItems.RUNE_CARVER);
                    }).build());


    public static void initialize(){
        LylsVirtusFies.LOGGER.info("Registering Item Groups for "+ LylsVirtusFies.MOD_ID);
    }
}
