package com.vinncy.enchantop.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
	
	@Inject(method = "onTargetDamaged", at = @At("HEAD"))
	private void onTargetDamaged(PlayerEntity user, Object target, int level, CallbackInfo ci) {
		// This mixin is a placeholder for future enchantment event handling
	}
}
