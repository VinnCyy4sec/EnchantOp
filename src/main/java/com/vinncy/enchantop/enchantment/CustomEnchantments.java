package com.vinncy.enchantop.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class FireballEnchantment extends Enchantment {
	public FireballEnchantment() {
		super(Enchantment.createLevelBasedCost(10, 15), Enchantment.createLevelBasedCost(40, 15), 5, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class LifestealEnchantment extends Enchantment {
	public LifestealEnchantment() {
		super(Enchantment.createLevelBasedCost(15, 20), Enchantment.createLevelBasedCost(50, 20), 4, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class FrostEnchantment extends Enchantment {
	public FrostEnchantment() {
		super(Enchantment.createLevelBasedCost(10, 12), Enchantment.createLevelBasedCost(35, 12), 5, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class LightningEnchantment extends Enchantment {
	public LightningEnchantment() {
		super(Enchantment.createLevelBasedCost(20, 25), Enchantment.createLevelBasedCost(60, 25), 3, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class TeleportEnchantment extends Enchantment {
	public TeleportEnchantment() {
		super(Enchantment.createLevelBasedCost(25, 30), Enchantment.createLevelBasedCost(70, 30), 2, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class SharpnessPlusEnchantment extends Enchantment {
	public SharpnessPlusEnchantment() {
		super(Enchantment.createLevelBasedCost(5, 8), Enchantment.createLevelBasedCost(25, 8), 6, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean isTreasure() {
		return false;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class KnockbackPlusEnchantment extends Enchantment {
	public KnockbackPlusEnchantment() {
		super(Enchantment.createLevelBasedCost(8, 10), Enchantment.createLevelBasedCost(30, 10), 5, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 4;
	}

	@Override
	public boolean isTreasure() {
		return false;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class SpeedBoostEnchantment extends Enchantment {
	public SpeedBoostEnchantment() {
		super(Enchantment.createLevelBasedCost(10, 12), Enchantment.createLevelBasedCost(40, 12), 5, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class BleedingEnchantment extends Enchantment {
	public BleedingEnchantment() {
		super(Enchantment.createLevelBasedCost(12, 15), Enchantment.createLevelBasedCost(45, 15), 5, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class VampireEnchantment extends Enchantment {
	public VampireEnchantment() {
		super(Enchantment.createLevelBasedCost(18, 22), Enchantment.createLevelBasedCost(55, 22), 3, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class StunEnchantment extends Enchantment {
	public StunEnchantment() {
		super(Enchantment.createLevelBasedCost(14, 18), Enchantment.createLevelBasedCost(48, 18), 4, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class FuryEnchantment extends Enchantment {
	public FuryEnchantment() {
		super(Enchantment.createLevelBasedCost(16, 20), Enchantment.createLevelBasedCost(52, 20), 4, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class ReflectionEnchantment extends Enchantment {
	public ReflectionEnchantment() {
		super(Enchantment.createLevelBasedCost(15, 18), Enchantment.createLevelBasedCost(50, 18), 4, EnchantmentTarget.ARMOR);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.EnumSet.of(EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.HEAD);
	}
}

class CurseEnchantment extends Enchantment {
	public CurseEnchantment() {
		super(Enchantment.createLevelBasedCost(20, 25), Enchantment.createLevelBasedCost(65, 25), 2, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}

class ExplosiveEnchantment extends Enchantment {
	public ExplosiveEnchantment() {
		super(Enchantment.createLevelBasedCost(22, 28), Enchantment.createLevelBasedCost(68, 28), 2, EnchantmentTarget.WEAPON);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean isTreasure() {
		return true;
	}

	@Override
	public java.util.Set<EquipmentSlot> getApplicableSlots() {
		return java.util.Set.of(EquipmentSlot.MAINHAND);
	}
}
