package com.vinncy.enchantop.enchantment;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import com.vinncy.enchantop.EnchantOpMod;

public class EnchantOPEnchantments {
	
	// Registry key
	public static final RegistryKey<Registry<Enchantment>> ENCHANTOP_REGISTRY = 
		RegistryKey.ofRegistry(new Identifier(EnchantOpMod.MOD_ID, "enchantments"));

	// Custom enchantments
	public static final Enchantment FIREBALL = register("fireball", new FireballEnchantment());
	public static final Enchantment LIFESTEAL = register("lifesteal", new LifestealEnchantment());
	public static final Enchantment FROST = register("frost", new FrostEnchantment());
	public static final Enchantment LIGHTNING = register("lightning", new LightningEnchantment());
	public static final Enchantment TELEPORT = register("teleport", new TeleportEnchantment());
	public static final Enchantment SHARPNESS_PLUS = register("sharpness_plus", new SharpnessPlusEnchantment());
	public static final Enchantment KNOCKBACK_PLUS = register("knockback_plus", new KnockbackPlusEnchantment());
	public static final Enchantment SPEED_BOOST = register("speed_boost", new SpeedBoostEnchantment());
	public static final Enchantment BLEEDING = register("bleeding", new BleedingEnchantment());
	public static final Enchantment VAMPIRE = register("vampire", new VampireEnchantment());
	public static final Enchantment STUN = register("stun", new StunEnchantment());
	public static final Enchantment FURY = register("fury", new FuryEnchantment());
	public static final Enchantment REFLECTION = register("reflection", new ReflectionEnchantment());
	public static final Enchantment CURSE = register("curse", new CurseEnchantment());
	public static final Enchantment EXPLOSIVE = register("explosive", new ExplosiveEnchantment());

	private static Enchantment register(String name, Enchantment enchantment) {
		Identifier id = new Identifier(EnchantOpMod.MOD_ID, name);
		return Registry.register(Registries.ENCHANTMENT, id, enchantment);
	}

	public static void register() {
		EnchantOpMod.LOGGER.info("Registering EnchantOp Enchantments");
	}
}
