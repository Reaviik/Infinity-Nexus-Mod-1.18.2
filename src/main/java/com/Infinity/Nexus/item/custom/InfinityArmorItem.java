package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.config.ModCommonConfigs;
import com.Infinity.Nexus.item.ModArmorMaterials;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.utils.ModTags;
import com.google.common.collect.ImmutableMap;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class InfinityArmorItem extends ArmorItem {
    public InfinityArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }
    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (hasFullSuitOfArmorOn(player)) {

                //Ad player effects
                player.getAbilities().mayfly = true;
                player.fireImmune();
                player.getFoodData().setSaturation(5);
                player.getFoodData().setFoodLevel(19);
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, ModCommonConfigs.I_A_ABSORPTION.get(), false, false));
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, ModCommonConfigs.I_A_REGENERATION.get(), false, false));
                player.onUpdateAbilities();
            }else{
                //Remove Player Effects
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
                player.onUpdateAbilities();
            }
        }
    }

    public static boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0).getItem().getDefaultInstance();
        ItemStack leggings = player.getInventory().getArmor(1).getItem().getDefaultInstance();
        ItemStack breastplate = player.getInventory().getArmor(2).getItem().getDefaultInstance();
        ItemStack helmet = player.getInventory().getArmor(3).getItem().getDefaultInstance();


        boolean armor =
                boots.is(ModTags.Items.INFINITY_BOOTS)
                        && leggings.is(ModTags.Items.INFINITY_LEGGINGS)
                        && breastplate.is(ModTags.Items.INFINITY_CHESTPLATE)
                        && helmet.is(ModTags.Items.INFINITY_HELMET);
        return armor;
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(new TranslatableComponent("item.infinity_nexus.infinity_armor"));
        } else {
            components.add(new TranslatableComponent("tooltip.infinity_nexus.pressShift"));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}