package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.config.ModCommonConfigs;
import com.Infinity.Nexus.item.ModArmorMaterials;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.utils.ModTags;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import net.minecraft.Util;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.List;
import java.util.Map;


public class ImperialArmorItem extends  ArmorItem{
    private boolean extralife = false;
    public ImperialArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (hasFullSuitOfArmorOn(player)) {

                player.getAbilities().mayfly = true;
                player.getAbilities().invulnerable = true;
                player.getFoodData().setFoodLevel(22);
                MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.NIGHT_VISION, Integer.MAX_VALUE, 1, false, false);
                effectInstance.setNoCounter(true);
                player.addEffect(effectInstance);
                extralife = true;
                //----------------------------//----------------------------//
                if (!player.getPersistentData().getBoolean("hasExtraLife")) {
                    player.getPersistentData().putBoolean("hasExtraLife", true);
                    AttributeInstance maxHealthAttribute = player.getAttribute(Attributes.MAX_HEALTH);
                    if (maxHealthAttribute != null) {
                        double currentMaxHealth = maxHealthAttribute.getValue();
                        double newMaxHealth = currentMaxHealth + 20.0;
                        maxHealthAttribute.removeModifiers();
                        maxHealthAttribute.addPermanentModifier(new AttributeModifier("ArmorBonus", newMaxHealth - currentMaxHealth, AttributeModifier.Operation.ADDITION));
                        player.setHealth(player.getHealth() + 20.0f);
                    }
                }
                //----------------------------//----------------------------//
                player.onUpdateAbilities();
            }else{
                //----------------------------//----------------------------//
                if (player.getPersistentData().getBoolean("hasExtraLife")) {
                player.getPersistentData().putBoolean("hasExtraLife", false);
                AttributeInstance maxHealthAttribute = player.getAttribute(Attributes.MAX_HEALTH);
                    if (maxHealthAttribute != null) {
                        maxHealthAttribute.removeModifiers();
                    }
                }
                //----------------------------//----------------------------//
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
                player.getAbilities().invulnerable = false;
                player.onUpdateAbilities();

                if(extralife){
                    extralife = false;
                    player.hurt(DamageSource.CACTUS, 2f);
                }
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