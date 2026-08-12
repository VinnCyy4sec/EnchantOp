package com.vinncy.enchantop;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vinncy.enchantop.enchantment.EnchantOPEnchantments;
import com.vinncy.enchantop.item.EnchantOPItems;
import com.vinncy.enchantop.event.EventHandler;

public class EnchantOpMod implements ModInitializer {
	public static final String MOD_ID = "enchantop";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing EnchantOp Mod");
		
		// Register enchantments
		EnchantOPEnchantments.register();
		LOGGER.info("EnchantOp Enchantments registered!");
		
		// Register items
		EnchantOPItems.register();
		LOGGER.info("EnchantOp Items registered!");
		
		// Register event handlers
		EventHandler.registerAll();
		LOGGER.info("EnchantOp Event Handlers registered!");
		
		LOGGER.info("EnchantOp Mod initialized successfully!");
	}
}
