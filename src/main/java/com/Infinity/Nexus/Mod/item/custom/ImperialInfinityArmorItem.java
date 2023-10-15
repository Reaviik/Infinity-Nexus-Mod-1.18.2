package com.Infinity.Nexus.Mod.item.custom;

import com.Infinity.Nexus.Mod.config.ModCommonConfigs;
import com.Infinity.Nexus.Mod.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class ImperialInfinityArmorItem extends  ArmorItem{
    public ImperialInfinityArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (hasFullSuitOfArmorOn(player)) {
                player.getAbilities().mayfly = true;
                player.getAbilities().invulnerable = true;
                player.getFoodData().setSaturation(20);
                player.getFoodData().setFoodLevel(20);
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200, ModCommonConfigs.I_I_A_N_VISION.get(), false, false));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, ModCommonConfigs.I_I_A_SPEED.get(), false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, ModCommonConfigs.I_I_A_D_SPEED.get(), false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, ModCommonConfigs.I_I_A_D_BOOST.get(), false, false));
                player.addEffect(new MobEffectInstance(MobEffects.LUCK, 200, ModCommonConfigs.I_I_A_LUCK.get(), false, false));
                player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 200, ModCommonConfigs.I_I_A_HERO.get(), false, false));
                player.onUpdateAbilities();
            }else{
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
                player.getAbilities().invulnerable = false;
                player.onUpdateAbilities();
            }
        }
    }
    private boolean hasFullSuitOfArmorOn(Player player) {
        Item boots = player.getInventory().getArmor(0).getItem();
        Item leggings = player.getInventory().getArmor(1).getItem();
        Item breastplate = player.getInventory().getArmor(2).getItem();
        Item helmet = player.getInventory().getArmor(3).getItem();
        boolean armor =
                boots == ModItems.IMPERIAL_INFINITY_BOOTS.get()
                && leggings == ModItems.IMPERIAL_INFINITY_LEGGINGS.get()
                && breastplate == ModItems.IMPERIAL_INFINITY_CHESTPLATE.get()
                && helmet == ModItems.IMPERIAL_INFINITY_HELMET.get();
        return armor;
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}