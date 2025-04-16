package lylittle.virtus_fies;

import lylittle.virtus_fies.block.ModBlocks;
import lylittle.virtus_fies.item.ModItemGroups;
import lylittle.virtus_fies.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LylsVirtusFies implements ModInitializer {
	public static final String MOD_ID = "lyls-virtus-fies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.initialize();
		ModItems.initialize();
		ModBlocks.initialize();
	}
}
