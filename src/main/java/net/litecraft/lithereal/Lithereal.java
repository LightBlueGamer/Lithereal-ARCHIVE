package net.litecraft.lithereal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.entity.ModEntities;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.litecraft.lithereal.item.ModItems;
import net.litecraft.lithereal.util.ModRegistries;
import net.litecraft.lithereal.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Lithereal implements ModInitializer {
	public static final String MOD_ID = "lithereal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();

		ModRegistries.registerModStuffs();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.MOSCER, MoscerEntity.setAttributes());
	}
}
