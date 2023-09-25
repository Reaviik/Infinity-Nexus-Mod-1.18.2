package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.item.ModItems;
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
                player.getFoodData().setFoodLevel(22);
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, Integer.MAX_VALUE, 1, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, Integer.MAX_VALUE, 1, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, Integer.MAX_VALUE, 1, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 3, 1, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, 1, false, false));
                //----------------------------//----------------------------//
                //----------------------------//----------------------------//
                player.onUpdateAbilities();
            }else{
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
                player.getAbilities().invulnerable = false;
                //----------------------------//----------------------------//
                //----------------------------//----------------------------//
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