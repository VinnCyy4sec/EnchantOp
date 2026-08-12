package com.vinncy.enchantop.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.vinncy.enchantop.EnchantOpMod;

public class EnchantOPItems {

	// Enchant Books
	public static final Item ENCHANTOP_BOOK_I = register("enchantop_book_i", new Item(new Item.Settings()));
	public static final Item ENCHANTOP_BOOK_II = register("enchantop_book_ii", new Item(new Item.Settings()));
	public static final Item ENCHANTOP_BOOK_III = register("enchantop_book_iii", new Item(new Item.Settings()));

	private static Item register(String name, Item item) {
		Identifier id = new Identifier(EnchantOpMod.MOD_ID, name);
		return Registry.register(Registries.ITEM, id, item);
	}

	public static void register() {
		EnchantOpMod.LOGGER.info("Registering EnchantOp Items");
		
		// Add items to creative tabs
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(ENCHANTOP_BOOK_I);
			entries.add(ENCHANTOP_BOOK_II);
			entries.add(ENCHANTOP_BOOK_III);
		});
	}
}
