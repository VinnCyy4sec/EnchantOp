package com.vinncy.enchantop.event;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.EntityHitResult;
import com.vinncy.enchantop.enchantment.EnchantOPEnchantments;
import com.vinncy.enchantop.enchantment.EnchantmentAbilities;

public class EntityInteractHandler {

	public static void register() {
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (player.isSneaking() && hand == Hand.MAIN_HAND && entity instanceof LivingEntity target) {
				ItemStack itemStack = player.getStackInHand(hand);
				
				// Check for enchantments and trigger abilities
				if (itemStack.hasEnchantments()) {
					triggerAbilities(player, target, itemStack);
					return ActionResult.SUCCESS;
				}
			}
			return ActionResult.PASS;
		});
	}

	private static void triggerAbilities(PlayerEntity player, LivingEntity target, ItemStack weapon) {
		// Fireball
		int fireballLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.FIREBALL, weapon);
		if (fireballLevel > 0) {
			EnchantmentAbilities.fireballAbility(player, target, fireballLevel);
		}

		// Lifesteal
		int lifestealLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.LIFESTEAL, weapon);
		if (lifestealLevel > 0) {
			EnchantmentAbilities.lifestealAbility(player, 5f, lifestealLevel);
		}

		// Frost
		int frostLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.FROST, weapon);
		if (frostLevel > 0) {
			EnchantmentAbilities.frostAbility(target, frostLevel);
		}

		// Lightning
		int lightningLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.LIGHTNING, weapon);
		if (lightningLevel > 0) {
			EnchantmentAbilities.lightningAbility(player, target, lightningLevel);
		}

		// Teleport
		int teleportLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.TELEPORT, weapon);
		if (teleportLevel > 0) {
			EnchantmentAbilities.teleportAbility(player, target, teleportLevel);
		}

		// Speed Boost
		int speedBoostLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.SPEED_BOOST, weapon);
		if (speedBoostLevel > 0) {
			EnchantmentAbilities.speedBoostAbility(player, speedBoostLevel);
		}

		// Bleeding
		int bleedingLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.BLEEDING, weapon);
		if (bleedingLevel > 0) {
			EnchantmentAbilities.bleedingAbility(target, bleedingLevel);
		}

		// Vampire
		int vampireLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.VAMPIRE, weapon);
		if (vampireLevel > 0) {
			EnchantmentAbilities.vampireAbility(player, target, 5f, vampireLevel);
		}

		// Stun
		int stunLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.STUN, weapon);
		if (stunLevel > 0) {
			EnchantmentAbilities.stunAbility(target, stunLevel);
		}

		// Curse
		int curseLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.CURSE, weapon);
		if (curseLevel > 0) {
			EnchantmentAbilities.curseAbility(target, curseLevel);
		}

		// Poison
		int poisonLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.CURSE, weapon);
		if (poisonLevel > 0) {
			EnchantmentAbilities.poisonAbility(target, poisonLevel);
		}

		// Explosive
		int explosiveLevel = EnchantmentHelper.getLevel(EnchantOPEnchantments.EXPLOSIVE, weapon);
		if (explosiveLevel > 0) {
			EnchantmentAbilities.explosiveAbility(player.getWorld(), player, target, explosiveLevel);
		}

		// Invisible
		// (This would be for armor, not weapon)
	}
}
