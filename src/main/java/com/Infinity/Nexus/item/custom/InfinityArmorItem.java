package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.item.ModArmorMaterials;
import com.Infinity.Nexus.item.ModItems;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Map;

public class InfinityArmorItem extends ArmorItem {
    public InfinityArmorItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }
    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (hasFullSuitOfArmorOn(player)) {

                //Ad player effects
                player.getAbilities().mayfly = true;
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION,100,5,false,false));
                player.onUpdateAbilities();
            }else{
                //Remove Player Effects
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
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
                boots == ModItems.INFINITY_BOOTS.get()
                        && leggings == ModItems.INFINITY_LEGGINGS.get()
                        && breastplate == ModItems.INFINITY_CHESTPLATE.get()
                        && helmet == ModItems.INFINITY_HELMET.get();
        return armor;
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

}