package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.config.ModCommonConfigs;
import com.Infinity.Nexus.item.ModItems;
import com.Infinity.Nexus.utils.ModTags;
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
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

import java.util.Map;


public class Infinity3dArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public Infinity3dArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (InfinityArmorItem.hasFullSuitOfArmorOn(player)) {

                //Ad player effects
                player.getAbilities().mayfly = true;
                player.getFoodData().setSaturation(5);
                player.getFoodData().setFoodLevel(19);
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, ModCommonConfigs.I_A_ABSORPTION.get(), false, false));
                player.onUpdateAbilities();
            }else{
                //Remove Player Effects
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
                player.onUpdateAbilities();
            }
        }
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<Infinity3dArmorItem>(this, "controller",
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