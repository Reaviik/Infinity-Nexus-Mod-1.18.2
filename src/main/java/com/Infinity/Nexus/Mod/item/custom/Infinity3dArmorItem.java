package com.Infinity.Nexus.Mod.item.custom;

import com.Infinity.Nexus.Mod.config.ModCommonConfigs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
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


public class Infinity3dArmorItem extends GeoArmorItem implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public Infinity3dArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (InfinityArmorItem.hasFullSuitOfArmorOn(player)) {
                player.getAbilities().mayfly = true;
                //Ad player effects
                player.getFoodData().setSaturation(5);
                player.getFoodData().setFoodLevel(19);
                player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, ModCommonConfigs.I_A_ABSORPTION.get(), false, false));
                player.onUpdateAbilities();
            }else{
                player.getAbilities().mayfly = false;
                //Remove Player Effects
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