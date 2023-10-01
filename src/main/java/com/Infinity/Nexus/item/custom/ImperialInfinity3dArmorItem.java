package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.config.ModCommonConfigs;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.utils.ModTags;
import com.google.common.collect.ImmutableMap;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
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


public class ImperialInfinity3dArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
    public ImperialInfinity3dArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
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
                boots == ModItems.IMPERIAL_INFINITY_3D_BOOTS.get()
                        && leggings == ModItems.IMPERIAL_INFINITY_3D_LEGGINGS.get()
                        && breastplate == ModItems.IMPERIAL_INFINITY_3D_CHESTPLATE.get()
                        && helmet == ModItems.IMPERIAL_INFINITY_3D_HELMET.get();
        return armor;
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<ImperialInfinity3dArmorItem>(this, "controller",
                20, this::predicate));
    }
    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}