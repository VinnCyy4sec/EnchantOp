package com.vinncy.enchantop.event;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import com.vinncy.enchantop.EnchantOpMod;

public class EventHandler {
	
	public static void registerAll() {
		EnchantOpMod.LOGGER.info("Registering event handlers");
		EntityInteractHandler.register();
	}
}
