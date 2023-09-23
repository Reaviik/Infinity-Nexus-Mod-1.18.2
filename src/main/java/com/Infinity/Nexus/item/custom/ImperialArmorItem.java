package com.Infinity.Nexus.item.custom;

import com.Infinity.Nexus.config.ModCommonConfigs;
import com.Infinity.Nexus.item.ModArmorMaterials;
import com.Infinity.Nexus.utils.ModTags;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
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

    boolean life = true;
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>()).build();

    public ImperialArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (hasFullSuitOfArmorOn(player)) {
                player.getAbilities().mayfly = true;
                player.getAbilities().invulnerable = true;
                player.getFoodData().setFoodLevel(20);
                MobEffectInstance effectInstance = new MobEffectInstance(MobEffects.NIGHT_VISION, Integer.MAX_VALUE, 1, false, false);
                effectInstance.setNoCounter(true);
                player.addEffect(effectInstance);
                if(life) {
                    player.setHealth(player.getMaxHealth() + 20);
                }
                life = false;
                player.onUpdateAbilities();
               //Magnetism TODO /mag
                if(!Screen.hasShiftDown() && ModCommonConfigs.I_I_T_E_MAGNETISM.get()) {
                    int range = 5;
                    BlockPos pos = new BlockPos(player.getX(), player.getY(), player.getZ());
                    List<ItemEntity> entities = player.level.getEntitiesOfClass(ItemEntity.class, new AABB(pos.getX() + range, pos.getY() + range, pos.getZ() + range, pos.getX() - range, pos.getY() - range, pos.getZ() - range));
                    for (ItemEntity item : entities) {
                        if (item.isAlive() && !item.hasPickUpDelay() && (item.getItem().is(ModTags.Items.PICKUP))) {
                            item.playerTouch((Player) player);
                        }
                    }
                }
            }else{
                boolean life = true;
                player.getAbilities().flying = false;
                player.getAbilities().mayfly = false;
                player.getAbilities().invulnerable = false;
                player.onUpdateAbilities();
            }
        }
    }
    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}