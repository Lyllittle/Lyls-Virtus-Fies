package lylittle.virtus_fies.item;


import lylittle.virtus_fies.LylsVirtusFies;
import lylittle.virtus_fies.item.custom.RuneCarverItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HOLY_POWDER = registerItem("holy_powder", new Item(new Item.Settings()));
    public static final Item HOLY_RUNE_BRICK = registerItem("holy_rune_brick", new Item(new Item.Settings()));
    public static final Item RUNE_CARVER = registerItem("rune_carver",new RuneCarverItem(new Item.Settings().maxDamage(64)));

    public static void initialize() {
        LylsVirtusFies.LOGGER.info("Registering Mod Items for " + LylsVirtusFies.MOD_ID);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LylsVirtusFies.MOD_ID, name), item);
    }
}