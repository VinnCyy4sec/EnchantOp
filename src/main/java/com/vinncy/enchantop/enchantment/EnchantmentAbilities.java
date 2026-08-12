package com.vinncy.enchantop.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EnchantmentAbilities {

	/**
	 * Fireball Enchantment - Launch fireball at target
	 */
	public static void fireballAbility(LivingEntity user, LivingEntity target, int level) {
		World world = user.getWorld();
		if (!world.isClient) {
			FireballEntity fireball = new FireballEntity(world, user, 
				new Vec3d(user.getX() - target.getX(), 
					user.getEyeY() - target.getEyeY(), 
					user.getZ() - target.getZ()).normalize().multiply(2));
			fireball.setPosition(user.getEyePos().add(user.getRotationVector().multiply(2)));
			fireball.explosionPower = 1 + level;
			world.spawnEntity(fireball);
		}
	}

	/**
	 * Lifesteal Enchantment - Heal player on hit
	 */
	public static void lifestealAbility(LivingEntity user, float damage, int level) {
		float healAmount = damage * (0.25f * level);
		user.heal(healAmount);
	}

	/**
	 * Frost Enchantment - Freeze enemy
	 */
	public static void frostAbility(LivingEntity target, int level) {
		target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60 * level, level - 1));
	}

	/**
	 * Lightning Enchantment - Strike lightning
	 */
	public static void lightningAbility(LivingEntity user, LivingEntity target, int level) {
		World world = user.getWorld();
		if (!world.isClient) {
			Entity lightning = net.minecraft.entity.EntityType.LIGHTNING_BOLT.create(world);
			lightning.setPosition(target.getPos());
			world.spawnEntity(lightning);
		}
	}

	/**
	 * Teleport Enchantment - Teleport to target
	 */
	public static void teleportAbility(LivingEntity user, LivingEntity target, int level) {
		double distance = 4 + (level * 2);
		Vec3d targetPos = target.getPos().add(target.getRotationVector().multiply(-distance));
		user.teleport(targetPos.x, targetPos.y, targetPos.z);
	}

	/**
	 * Sharpness Plus - Extra damage
	 */
	public static float sharpnessPlusModifier(int level) {
		return 2f * level;
	}

	/**
	 * Knockback Plus - More knockback
	 */
	public static float knockbackPlusModifier(int level) {
		return 0.5f * level;
	}

	/**
	 * Speed Boost - Increase attack speed
	 */
	public static void speedBoostAbility(LivingEntity user, int level) {
		user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, level - 1));
	}

	/**
	 * Bleeding - Deal damage over time
	 */
	public static void bleedingAbility(LivingEntity target, int level) {
		target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40 * level, level - 1));
	}

	/**
	 * Vampire - Drain health
	 */
	public static void vampireAbility(LivingEntity user, LivingEntity target, float damage, int level) {
		float drainAmount = damage * (0.15f * level);
		target.damage(user.getDamageSources().generic(), drainAmount);
		user.heal(drainAmount);
	}

	/**
	 * Stun - Paralyze target
	 */
	public static void stunAbility(LivingEntity target, int level) {
		target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 80 * level, 5));
	}

	/**
	 * Fury - Increase damage
	 */
	public static float furyModifier(int level) {
		return 3f * level;
	}

	/**
	 * Reflection - Reflect damage
	 */
	public static void reflectionAbility(LivingEntity user, float damage, int level) {
		user.heal(damage * (0.2f * level));
	}

	/**
	 * Curse - Weaken enemy permanently
	 */
	public static void curseAbility(LivingEntity target, int level) {
		target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600 * level, level - 1));
	}

	/**
	 * Poison - Apply poison
	 */
	public static void poisonAbility(LivingEntity target, int level) {
		target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 120 * level, level - 1));
	}

	/**
	 * Explosive - Create explosion
	 */
	public static void explosiveAbility(World world, LivingEntity user, LivingEntity target, int level) {
		if (!world.isClient) {
			world.createExplosion(user, target.getX(), target.getY(), target.getZ(), 1f + level, World.ExplosionSourceType.MOB);
		}
	}

	/**
	 * Invisible - Turn invisible temporarily
	 */
	public static void invisibleAbility(LivingEntity user, int level) {
		user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 120 * level, 0));
	}
}
